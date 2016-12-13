package org.xt.service;

import org.xt.pojo.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class StudentMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User student = new User();
        student.setUserName(rs.getString("userName"));
        student.setUserPassword(rs.getString("userPassword"));
        return student;
    }
}
