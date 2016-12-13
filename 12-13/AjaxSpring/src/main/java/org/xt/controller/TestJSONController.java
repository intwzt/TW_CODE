package org.xt.controller;

import org.xt.service.StudentJDBCTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xt.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



@Controller
@RequestMapping("/test")
public class TestJSONController {
    private static ApplicationContext context;
    @RequestMapping(value = "/testJSON.do",method={RequestMethod.POST})
    @ResponseBody
    public void testJSON(@RequestBody User user) {

        //添加用户操作
        context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        studentJDBCTemplate.create(user.getUserName(), user.getUserPassword());
    }

    @RequestMapping("/search.do"  )
    public void resolveJson(HttpServletRequest request,HttpServletResponse response) throws IOException {

        List m = (List) new  ArrayList();
        JSONArray jsons = new JSONArray();
        for(int i=0;i<10;i++){
            User user = new User();
            user.setUserName("name_" + i);
            m.add(user);
        }

        for(int j=0;j<m.size();j++){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("user", m.get(j));
            jsons.add(jsonObject);
        }
        response.getWriter().print(jsons.toString()) ;
    }

}
