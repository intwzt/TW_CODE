package com.wzt;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJDBCTemplate{
   private JdbcTemplate jdbcTemplateObject; 
   public void setDataSource(DataSource dataSource) {
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   public void create(String username, String userpassword, String sex,
		   String birthday, String email, String address) {
      String SQL = "insert into User (username, userpassword, sex, birthday, email, address)"
      		+ " values (?, ?, ?, ?, ?, ?)";     
      jdbcTemplateObject.update( SQL, username, userpassword, sex, birthday, email, address);
      System.out.println("Created Record: " + username);
      return;
   }
}
