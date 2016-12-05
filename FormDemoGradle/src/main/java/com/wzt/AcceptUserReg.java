package com.wzt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AcceptUserReg extends HttpServlet {

    private User user;

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        user = new User();

        out.println("<html><head><title>接收新用户注册</title></head> <body>");
        out.println("这是新用户注册所提交的数据:<br>");

        String username = request.getParameter("username");
        out.println("用户名: " + username + "<br>");

        String userpassword = request.getParameter("userpassword");
        out.println("密码: " + userpassword + "<br>");

        String sex = request.getParameter("sex");
        out.println("性别: " + sex + "<br>");

        String birthday = request.getParameter("year") + request.getParameter("month") + request.getParameter("day");
        out.println("出生年月: " + birthday + "<br>");


        String email = request.getParameter("E-mail");
        out.println("电子邮箱: " + email + "<br>");

        String address = request.getParameter("address");
        out.println("家庭住址: " + address + "<br>");

        out.print("</body> </html>");
        System.out.println("Writing to database...");

        this.user.setUsername(username);
        this.user.setUserpassword(userpassword);
        this.user.setSex(sex);
        this.user.setBirthday(birthday);
        this.user.setEmail(email);
        this.user.setAddress(address);
        this.writeToMysql();
    }

    public void writeToMysql(){

        Connection con = null;

        Statement sta = null;

        String sql = null;

        String url = "jdbc:mysql://localhost:3306/Test?characterEncoding=utf8&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "123456");
            sta = con.createStatement();
            sql = new String("insert into User values("+"'"+this.user.getUsername()+"'"+","+"'"+
                    this.user.getUserpassword()+"'"+","+"'"+
                    this.user.getSex()+"'"+","+"'"+
                    this.user.getBirthday()+"'"+","+"'"+
                    this.user.getEmail()+"'"+","+"'"+
                    this.user.getAddress()+"')");
            System.out.println(sql);
            sta.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ClassNotFoundException");

        } catch (SQLException a) {
            a.printStackTrace();
            System.out.println("SQLException");
        } catch (Exception b) {

        } finally {
            try {
                if (con != null)
                    con.close();
                if (sta != null)
                    sta.close();
            } catch (Exception e) {

            }
        }
    }

}