package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("<title>TestJSONForSpringMVC</title>\n");
      out.write("    <script type=\"text/javascript\" src=\"http://ajax.microsoft.com/ajax/jquery/jquery-1.4.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $(\"#login\").click(function () {\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"test/testJSON.do\",\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    dataType: \"json\",\n");
      out.write("                    contentType: \"application/json;charset=UTF-8\",\n");
      out.write("                    data: JSON.stringify({\n");
      out.write("                        userName: $(\"#userName\").val(),\n");
      out.write("                        userPassword: $(\"#userPassword\").val()\n");
      out.write("                    }),\n");
      out.write("                    success: function (result) {\n");
      out.write("                        alert(\"新增成功！\");\n");
      out.write("\n");
      out.write("                    },\n");
      out.write("                    error: function (result) {\n");
      out.write("                        alert(\"发生错误！\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    用户名:\n");
      out.write("    <input id=\"userName\" type=\"text\" style=\"width:150px\" />\n");
      out.write("    <br /> \n");
      out.write("    <br />\n");
      out.write("    密&nbsp;&nbsp;&nbsp;&nbsp;码:\n");
      out.write("    <input id=\"userPassword\" type=\"password\" style=\"width:150px\" />\n");
      out.write("    <br />\n");
      out.write("    <br />\n");
      out.write("    <input id=\"login\" type=\"button\" value=\"登录\" />\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
