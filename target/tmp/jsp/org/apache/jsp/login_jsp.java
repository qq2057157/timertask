package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/views/UserRegiterView.jsp");
    _jspx_dependants.add("/views/MessageModal.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>定时服务管理系统登陆系统</title>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css.map\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.css.map\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("<script  src=\"js/jquery-1.12.0.min.js\"></script>\n");
      out.write("<script  src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script  src=\"js/common.js\"></script>\n");
      out.write("<script  src=\"js/user-register.js\"></script>\n");
      out.write("<script  src=\"js/user-operate.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"container\" class=\"container-fluid \">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\" col-xs-1 col-md-offset-11 \">\n");
      out.write("\t\t\t<a role=\"menuitem\" tabindex=\"-1\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#registerModal\"\n");
      out.write("\t\t\t\t\t\thref=\"javascript:void(0);\">用户注册</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"page-header\">\n");
      out.write("\t\t<h1>\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>&nbsp;定时服务管理系统\n");
      out.write("\t\t</h1>\n");
      out.write("\t</div>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label class=\"col-xs-2 col-md-offset-3 control-label text-right\">用户名：</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"username\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Username\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\tclass=\"col-xs-2 col-md-offset-3 control-label text-right\">密码：</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Password\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-md-offset-3\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-1 text-right\">\n");
      out.write("\t\t\t\t\t\t<input id=\"reset\" type=\"button\" name=\"重置\" value=\"重置\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-info btn-lg\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-1 text-left\">\n");
      out.write("\t\t\t\t\t\t<input id=\"submit\" type=\"button\" value=\"登录\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-primary btn-lg\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 col-md-offset-3\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2 text-center\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\">忘记密码？</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\" class=\"container text-center footer\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("\t\t\t\t<small><strong>Copyright hust.edu.com </strong>Design by huwentao All Rights Reserved</small>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t<!-- 用户注册弹出框 -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-header text-center\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"close close-btn\"\n");
      out.write("\t\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<h4 class=\"modal-title userRegTitle\" id=\"myModalLabel\">用户注册</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">用户名</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea register\" id=\"username\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"用户名\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"disable-icon\" class=\"glyphicon glyphicon-remove alert-icon\" style=\"color:red;display:none;\">用户名已存在</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"ok-icon\" class=\"text-center glyphicon glyphicon-ok alert-icon\" style=\"color:green;display:none;\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"alert-icon\" class=\"text-center glyphicon glyphicon-alert alert-icon\" style=\"color:red;display:none;\">用户名为字母数字的组合</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">密码</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control inputArea register\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"6位数以上密码\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">确认密码</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"repeatPassword\" placeholder=\"确认密码\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"repw-icon\" class=\"text-center glyphicon glyphicon-alert alert-icon\" style=\"color:red;display:none;\">两次输入的密<br>码不一致</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">姓名</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"name\" placeholder=\"姓名\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">组织名称</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea organization orgCheck\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"organization\" placeholder=\"组织名称\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"org-warn-icon\" class=\"glyphicon glyphicon-remove alert-icon\" style=\"color:red;display:none;\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"org-ok-icon\" class=\"text-center glyphicon glyphicon-ok alert-icon\" style=\"color:green;display:none;\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">组织代码</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea organizationCode orgCheck\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"organizationCode\" placeholder=\"组织代码\" maxlength=\"10\" onpaste=\"return false;\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\tonkeyup=\"value=value.replace(/[^\\d]/g,'') \"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">手机号</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"phone\" placeholder=\"手机号\" maxlength=\"11\" onpaste=\"return false;\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\tonkeyup=\"value=value.replace(/[^\\d]/g,'') \"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"phone-icon\" class=\"text-center glyphicon glyphicon-alert alert-icon\" style=\"color:red;display:none;\">手机号格式错误</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">邮箱</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"email\" placeholder=\"example@163.com\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default close-btn\">取消</button>\n");
      out.write("\t\t\t\t\t<button id=\"registerSubmit\" type=\"button\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t<!-- 提示框 -->\n");
      out.write("\t<div class=\"modal fade bs-example-modal-sm closeMessage\" id=\"dialogModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close closeMessage\" data-dismiss=\"modal\"\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">提示</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t<strong><span id=\"message\"></span></strong>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" data-dismiss=\"modal\" class=\"closeMessage btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t\n");
      out.write("\t\t$(document).keyup(function(event){\n");
      out.write("\t\t\t  if(event.keyCode ==13){\n");
      out.write("\t\t\t    $(\"#submit\").trigger(\"click\");\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t// 重置按钮\n");
      out.write("\t\t$(\"#reset\").click(function(){\n");
      out.write("\t\t\t$(\"#username\").val(null);\n");
      out.write("\t\t\t$(\"#password\").val(null);\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t// 登录提交按钮\n");
      out.write("\t\t$(\"#submit\").click(function()\n");
      out.write("\t\t\t{\t\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t    \t\turl:\"/passport/login\",\n");
      out.write("\t\t    \t\tdata:{\n");
      out.write("\t\t    \t\t\tusername:$(\"#username\").val(),\n");
      out.write("\t\t    \t\t\tpassword:$(\"#password\").val()\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttype:'get',\n");
      out.write("\t\t    \t\tdataType:'json',\n");
      out.write("\t\t    \t\tsuccess:function(data){\n");
      out.write("\t\t    \t\t\tif(data.code ==99999){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"登录成功\");\n");
      out.write("\t\t    \t\t\t\tlocation.href = '/timer/task/main';\n");
      out.write("\t\t    \t\t\t} else if(data.code == 20001){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"登录失败，您已被禁止登录，请联系管理员\");\n");
      out.write("\t\t    \t\t\t} else if(data.code == 30001){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"登录失败，您所属组织已被封禁，请联系系统管理员\");\n");
      out.write("\t\t    \t\t\t} else if(data.code == 505){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"服务器异常，登录失败，请联系管理员\");\n");
      out.write("\t\t    \t\t\t} else {\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"登录失败\");\n");
      out.write("\t\t    \t\t\t}\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t\t});\n");
      out.write("\t\t\t\t// ajax end;\n");
      out.write("\t\t    });\n");
      out.write("\n");
      out.write("\t\t// 注册提交按钮\n");
      out.write("\t\t$(\"#registerSubmit\").click(function()\n");
      out.write("\t\t\t{\t\t\t\t\t\n");
      out.write("\t\t\t\tvar username= $(\"#username.register\").val();\n");
      out.write("\t\t\t\tvar password= $(\"#password.register\").val();\n");
      out.write("\t\t\t\tvar name= $(\"#name\").val();\n");
      out.write("\t\t\t\tvar organization = $(\"#organization\").val();\n");
      out.write("\t\t\t\tvar organizationCode= $(\"#organizationCode\").val();\n");
      out.write("\t\t\t\tvar phone= $(\"#phone\").val();\n");
      out.write("\t\t\t\tvar email = $(\"#email\").val();\n");
      out.write("\n");
      out.write("\t\t\t\tif(isEmpty(username) || \n");
      out.write("\t\t\t\t\t\tisEmpty(password) || \n");
      out.write("\t\t\t\t\t\tisEmpty(name) || \n");
      out.write("\t\t\t\t\t\tisEmpty(organization) || \n");
      out.write("\t\t\t\t\t\tisEmpty(organizationCode) || \n");
      out.write("\t\t\t\t\t\tisEmpty(phone)){\n");
      out.write("\t\t\t\t\talertModalMessage(\"必填项不能为空，请检查\");\n");
      out.write("\t\t\t\t} else if(validateExist()&& checkOrgExist() && valideRepeatPassword() && validePhone()){\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t    \t\turl:\"/passport/register\",\n");
      out.write("\t\t\t    \t\tdata:{\n");
      out.write("\t\t\t    \t\t\tusername:username,\n");
      out.write("\t\t\t    \t\t\tpassword:password,\n");
      out.write("\t\t\t    \t\t\tname:name,\n");
      out.write("\t\t\t    \t\t\torganization:organization,\n");
      out.write("\t\t\t    \t\t\torganizationCode:organizationCode,\n");
      out.write("\t\t\t    \t\t\tphone:phone,\n");
      out.write("\t\t\t    \t\t\temail:email\n");
      out.write("\t\t\t    \t\t},\n");
      out.write("\t\t\t    \t\ttype:'get',\n");
      out.write("\t\t\t    \t\tdataType:'json',\n");
      out.write("\t\t\t    \t\tsuccess:function(data){\n");
      out.write("\t\t\t    \t\t\tif(data.code ==99999){\n");
      out.write("\t\t\t    \t\t\t\talertModalMessage(\"注册成功\");\n");
      out.write("\t\t\t    \t\t\t\tdismiss();\n");
      out.write("\t\t\t    \t\t\t} else if(data.code == 505) {\n");
      out.write("\t\t\t    \t\t\t\talertModalMessage(\"服务器发生异常，注册失败\");\n");
      out.write("\t\t\t    \t\t\t} else {\n");
      out.write("\t\t\t    \t\t\t\talertModalMessage(\"注册失败\");\n");
      out.write("\t\t\t    \t\t\t}\n");
      out.write("\t\t\t    \t\t}\n");
      out.write("\t\t\t    \t\t});\n");
      out.write("\t\t\t\t\t// ajax end;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t    });\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</html>");
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
