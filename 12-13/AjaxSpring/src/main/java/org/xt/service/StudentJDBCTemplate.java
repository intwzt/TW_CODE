package org.xt.service;
import javax.sql.DataSource;
import org.xt.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentJDBCTemplate{
   private JdbcTemplate jdbcTemplateObject; 
   public void setDataSource(DataSource dataSource) {
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   public void create(String username, String userpassword)
   {
      String SQL = "insert into Auser(username, userpassword)"
      		+ " values (?, ?)";
      jdbcTemplateObject.update( SQL, username, userpassword);
   }
   public User getUesr(String name) {
        String SQL = "select * from Student where username = ?";
        User student = jdbcTemplateObject.queryForObject(SQL, new Object[]{name}, new StudentMapper());
        return student;
    }
}
