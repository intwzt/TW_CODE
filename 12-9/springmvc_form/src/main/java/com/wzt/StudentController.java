package com.wzt;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
@Controller
public class StudentController {
   private static ApplicationContext context;
   //RequestMapping.value表示请求的路径
   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
   //RequestMapping.value表示请求的路径,在jsp中声明谁来访问这个方法，访问的方式需要和方法参数相对应
   //和传参数一样
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   //ModelMap是一个和模板文件进行沟通的参数，可以理解成是一个封装好的数据包
   //输入：转换成command对象(command对象是从视图传过来的)的student对象，带着被spring打包的网页数据
   //输出，将这属性值处理之后加入到模型和视图之间传递ModelMap，让它返回给视图，这里的视图就是最后返回的reslut.jsp,前缀和后缀都已经配置好
   public String addStudent(@ModelAttribute("command")Student student, 
   ModelMap model) {
	  //将参数打包成model，传给result页面
	  //添加参数，前面是key，后面是value
      model.addAttribute("username", student.getUsername());
      model.addAttribute("userpassword", student.getUserpassword());
      model.addAttribute("sex", student.getSex());
      model.addAttribute("birthday", student.getBirthday());
      model.addAttribute("email", student.getEmail());
      model.addAttribute("address", student.getAddress());
      
      //添加用户操作
      context = new ClassPathXmlApplicationContext("Beans.xml");
      StudentJDBCTemplate studentJDBCTemplate = 
      (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
      studentJDBCTemplate.create(student.getUsername(), student.getUserpassword(), student.getSex(),
    		  student.getBirthday(), student.getEmail(), student.getAddress());
      
      //与HelloWeb-servlet中定义的bean中前缀后缀合并，生成一个完整的带路径的文件名
      return "result";
   }
}
