package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/WEB-INF/../views/Header.jsp");
    _jspx_dependants.add("/WEB-INF/../views/Menu.jsp");
    _jspx_dependants.add("/WEB-INF/../views/UsersView.jsp");
    _jspx_dependants.add("/WEB-INF/../views/ModifyPasswordView.jsp");
    _jspx_dependants.add("/WEB-INF/../views/UserRegiterView.jsp");
    _jspx_dependants.add("/WEB-INF/../views/MessageModal.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatDate_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatDate_value_type_nobody.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  

      out.write("\n");
      out.write("<!DOCTYPE>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("<title>定时管理系统</title>\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css.map\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.css.map\"/>\n");
      out.write("<script  src=\"js/jquery-1.12.0.js\"></script>\n");
      out.write("<script  src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script  src=\"js/bootstrap-paginator.js\"></script>\n");
      out.write("<script  src=\"js/common.js\"></script>\n");
      out.write("<script  src=\"js/user-operate.js\"></script>\n");
      out.write("<script  src=\"js/user-register.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("\tvar element = $(\"#paginator\");//获得数据装配的位置\n");
      out.write("\t//初始化所需数据\n");
      out.write("\tvar options = {\n");
      out.write("\t    bootstrapMajorVersion:3,//版本号。3代表的是第三版本\n");
      out.write("\t    currentPage: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", //当前页数\n");
      out.write("\t    numberOfPages: 5, //显示页码数标个数\n");
      out.write("\t    totalPages:Math.ceil(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sumNum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("), //总共的数据所需要的总页数\n");
      out.write("\t    itemTexts: function (type, page, current) {  \n");
      out.write("\t    \t\t//图标的更改显示可以在这里修改。\n");
      out.write("\t    switch (type) {  \n");
      out.write("\t            case \"first\":  \n");
      out.write("\t                return \"首页\";  \n");
      out.write("\t            case \"prev\":  \n");
      out.write("\t                return \"上一页\";  \n");
      out.write("\t            case \"next\":  \n");
      out.write("\t                return \"下一页\";  \n");
      out.write("\t            case \"last\":  \n");
      out.write("\t                return \"末页\";  \n");
      out.write("\t            case \"page\":  \n");
      out.write("\t                return  page;  \n");
      out.write("\t        }                 \n");
      out.write("\t    }, \n");
      out.write("    tooltipTitles: function (type, page, current) {\n");
      out.write("\t\t//如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。\n");
      out.write("        switch (type) {\n");
      out.write("            case \"first\":\n");
      out.write("                return \"Go to first page\";\n");
      out.write("            case \"prev\":\n");
      out.write("                return \"Go to previous page\";\n");
      out.write("            case \"next\":\n");
      out.write("                return \"Go to next page\";\n");
      out.write("            case \"last\":\n");
      out.write("                return \"Go to last page\";\n");
      out.write("            case \"page\":\n");
      out.write("                return (page === current) ? \"Current page is \" + page : \"Go to page \" + page;\n");
      out.write("        }\n");
      out.write("    },\n");
      out.write("    onPageClicked: function (e, originalEvent, type, page) {  \n");
      out.write("         //单击当前页码触发的事件。若需要与后台发生交互事件可在此通过ajax操作。page为目标页数。\n");
      out.write("         location.href = '/timer/user/main?currentPage='+page;\n");
      out.write("         //console.log(e);\n");
      out.write("         //console.log(originalEvent);\n");
      out.write("        // console.log(type);\n");
      out.write("    }\n");
      out.write("};\n");
      out.write("element.bootstrapPaginator(options);\t//进行初始化\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"container\" class=\"container-fluid\">\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("\t<div id=\"presentuser\" class=\"dropdown col-xs-2 col-md-offset-10 \">\n");
      out.write("\t\t\t<strong> 当前用户:</strong><a class=\"btn dropdown-toggle glyphicon glyphicon-user\" type=\"button\" id=\"dropdownMenu1\"\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" aria-expanded=\"true\"><strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong><span\n");
      out.write("\t\t\t\tclass=\"caret\"></span>\n");
      out.write("\t\t\t\t<input id=\"presentUserId\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t<input id=\"userOrgName\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.organization}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t<input id=\"userOrgCode\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.organizationCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul class=\"dropdown-menu\" role=\"menu\"\n");
      out.write("\t\t\t\taria-labelledby=\"dropdownMenu1\">\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#modifyModal\"\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0);\">修改密码</a></li>\n");
      out.write("\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a id=\"logout\" role=\"menuitem\"\n");
      out.write("\t\t\t\t\ttabindex=\"-1\" href=\"javascript:void(0);\">退出</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"page-header\">\n");
      out.write("\t\t<h1>\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>&nbsp;定时服务管理系统\n");
      out.write("\t\t</h1>\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("<div class=\"row garybgcolor\">\n");
      out.write("\t<div id=\"menu\" class=\"col-xs-2 text-center\">\n");
      out.write("\t<h3>功能列表</h3>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<div class=\"list-group\">\n");
      out.write("\t\t  <a href=\"/timer/task/main\" class=\"list-group-item task\">\n");
      out.write("\t\t    定时任务管理\n");
      out.write("\t\t  </a>\n");
      out.write("\t  \t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t  \t");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"data\" class=\"col-xs-10 table-responsive\">\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<table class=\"table table-striped table-bordered table-hover table-condensed text-center\">\n");
      out.write("\t\t\t<tr><td>组织</td><td>姓名</td><td class=\"td-nowrap\">用户名</td><td class=\"td-nowrap\">用户角色</td><td class=\"td-nowrap\">联系方式</td><td class=\"td-nowrap\">邮箱</td><td class=\"td-nowrap\">注册时间</td><td class=\"td-nowrap\">用户状态</td>\n");
      out.write("\t\t\t<td>操作\n");
      out.write("\t\t\t<a id=\"addUserModal\" class=\"btn btn-default btn-sm\" href=\"javascript:void(0);\" role=\"button\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\" ></span>新增用户</a></td></tr>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div class=\"row text-center\">\n");
      out.write("\t\t <ul id='paginator' \tstyle=\"cursor:hand;\"></ul>\n");
      out.write("\t\t</div>");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t<!-- 修改密码弹出框 -->\n");
      out.write("\t<div class=\"modal fade\" id=\"modifyModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close close-btn\" \n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">修改用户密码</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">原密码*</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control inputArea\" id=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"oldPassword\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">新密码*</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control inputArea\" id=\"newPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"newPassword\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">确认新密码*</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"repeatNewPassword\" placeholder=\"repeatNewPassword\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default close-btn\">取消</button>\n");
      out.write("\t\t\t\t\t<button id=\"modifySubmit\" type=\"button\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- 修改密码弹出框end -->");
      out.write('\n');
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
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t\n");
      out.write("\t$(\".user\").addClass(\"active\");\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\"#registerSubmit\",function(){\n");
      out.write("\t\tvar username= $(\"#username.register\").val();\n");
      out.write("\t\tvar password= $(\"#password.register\").val();\n");
      out.write("\t\tvar name= $(\"#name\").val();\n");
      out.write("\t\tvar organization = $(\"#organization.organization\").val();\n");
      out.write("\t\tvar organizationCode= $(\"#organizationCode.organizationCode\").val();\n");
      out.write("\t\tvar phone= $(\"#phone\").val();\n");
      out.write("\t\tvar email = $(\"#email\").val();\n");
      out.write("\t\tif(isEmpty(username) || \n");
      out.write("\t\t\t\tisEmpty(password) || \n");
      out.write("\t\t\t\tisEmpty(name) || \n");
      out.write("\t\t\t\tisEmpty(organization) || \n");
      out.write("\t\t\t\tisEmpty(organizationCode) || \n");
      out.write("\t\t\t\tisEmpty(phone)){\n");
      out.write("\t\t\talertModalMessage(\"必填项不能为空，请检查\");\n");
      out.write("\t\t} else{\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t    \t\turl:\"/timer/user/add\",\n");
      out.write("\t    \t\tdata:{\n");
      out.write("\t    \t\t\tusername:username,\n");
      out.write("\t    \t\t\tpassword:password,\n");
      out.write("\t    \t\t\tname:name,\n");
      out.write("\t    \t\t\torganization:organization,\n");
      out.write("\t    \t\t\torganizationCode:organizationCode,\n");
      out.write("\t    \t\t\tphone:phone,\n");
      out.write("\t    \t\t\temail:email\n");
      out.write("\t    \t\t},\n");
      out.write("\t    \t\ttype:'get',\n");
      out.write("\t    \t\tdataType:'json',\n");
      out.write("\t    \t\tsuccess:function(data){\n");
      out.write("\t    \t\t\tif(data.code ==99999){\n");
      out.write("\t    \t\t\t\talertModalMessage(\"添加用户成功\");\n");
      out.write("\t    \t\t\t\t$(\".closeMessage\").addClass(\"refresh-btn\");\n");
      out.write("\t    \t\t\t} else if(data.code == 505) {\n");
      out.write("\t    \t\t\t\talertModalMessage(\"服务器发生异常，添加用户失败\");\n");
      out.write("\t    \t\t\t} else {\n");
      out.write("\t    \t\t\t\talertModalMessage(\"添加用户失败\");\n");
      out.write("\t    \t\t\t}\n");
      out.write("\t    \t\t}\n");
      out.write("\t    \t\t});\n");
      out.write("\t\t\t// ajax end;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("    });\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\"#addUserModal\",function(){\n");
      out.write("\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\tvar orgName = null;\n");
      out.write("\t\t//alert(orgName);\n");
      out.write("\t\tvar orgCode = null;\n");
      out.write("\t\t//var status= mythis.parents('td').prev().find('input.status').val();\n");
      out.write("\t\t\n");
      out.write("\t\tif(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userRole==1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("){\n");
      out.write("\t\t\torgName = null;\n");
      out.write("\t\t\torgCode = null;\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\torgName = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.organization}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\t\t\torgCode = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.organizationCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("\t\t\t$(\"#organization.organization\").attr(\"readonly\",\"readonly\");\n");
      out.write("\t\t\t$(\"#organizationCode.organizationCode\").attr(\"readonly\",\"readonly\");\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#registerModal\").modal('show');\n");
      out.write("\t\t$(\"#myModalLabel.userRegTitle\").html(\"新增用户\");\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#organization.organization\").val(orgName);\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#organizationCode.organizationCode\").val(orgCode);\n");
      out.write("\t\t//alert($(this).parents('td').find('input.id').val());\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\".disableUser\",function(){\n");
      out.write("\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t//alert($(this).parents('td').find('input.id').val());\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/user/disable\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\tid:$(this).parents('td').find('input.id').val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"封禁成功\");\n");
      out.write("    \t\t\t\tmythis.parents('td').prev().html(\"<small>封禁</small>\");\n");
      out.write("    \t\t\t\tmythis.parents('td').prev().find('input.status').val(4);\n");
      out.write("    \t\t\t\t//mythis.parents('td').html('<a class=\"taskStop\" href=\"javascript:void(0);\">终止</a>');\n");
      out.write("    \t\t\t\tmythis.html(\"解禁\");\n");
      out.write("    \t\t\t\tmythis.addClass(\"enableUser\");\n");
      out.write("    \t\t\t\tmythis.removeClass(\"disableUser\");\n");
      out.write("    \t\t\t\t//alert(mythis.hasClass(\"disableOrg\"));\n");
      out.write("    \t\t\t} else if(data.code==505){\n");
      out.write("    \t\t\t\talertModalMessage(\"封禁失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"封禁失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t\t//ajax end;\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(document).on(\"click\",\".enableUser\",function(){\n");
      out.write("\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t//alert($(this).parents('td').find('input.id').val());\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/user/enable\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\tid:$(this).parents('td').find('input.id').val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"解禁成功\");\n");
      out.write("    \t\t\t\tmythis.parents('td').prev().html(\"<small>正常</small>\");\n");
      out.write("    \t\t\t\tmythis.parents('td').prev().find('input.status').val(1);\n");
      out.write("    \t\t\t\t//mythis.parents('td').html('<a class=\"taskStop\" href=\"javascript:void(0);\">终止</a>');\n");
      out.write("    \t\t\t\tmythis.html(\"封禁\");\n");
      out.write("    \t\t\t\tmythis.addClass(\"disableUser\");\n");
      out.write("    \t\t\t\tmythis.removeClass(\"enableUser\");\n");
      out.write("    \t\t\t} else if(data.code==505){\n");
      out.write("    \t\t\t\talertModalMessage(\"解禁失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"解禁失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t\t//ajax end;\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\".deleteUser\",function(){\n");
      out.write("\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t//alert($(this).parents('td').find('input.id').val());\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/user/delete\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\tid:$(this).parents('td').find('input.id').val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"删除成功\");\n");
      out.write("    \t\t\t\tmythis.parents(\"tr\").remove();\n");
      out.write("     \t\t\t} else if(data.code==505){\n");
      out.write("     \t\t\t\talertModalMessage(\"删除失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"删除失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t\t//ajax end;\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\".setAdminRole\",function(){\n");
      out.write("\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t//alert($(this).parents('td').find('input.id').val());\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/user/setAdmin\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\tid:$(this).parents('td').find('input.id').val(),\n");
      out.write("    \t\t\torganizationCode:$(this).parents('td').find('input.organizationCode').val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"设置成功\");\n");
      out.write("    \t\t\t\t$(\".closeMessage\").addClass(\"refresh-btn\");\n");
      out.write("     \t\t\t} else if(data.code==505){\n");
      out.write("     \t\t\t\talertModalMessage(\"设置失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"设置失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t\t//ajax end;\n");
      out.write("\t});\n");
      out.write("\t$(\"#addUserButton\").click(function(){\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/user/add\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\torganization:$(\"#organization\").val(),\n");
      out.write("    \t\t\torganizationCode:$(\"#organizationCode\").val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"新增组织成功\");\n");
      out.write("    \t\t\t\tlocation.reload();\n");
      out.write("     \t\t\t} else if(data.code==505){\n");
      out.write("     \t\t\t\talertModalMessage(\"新增组织失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else if(data.code==505){\n");
      out.write("    \t\t\t\talertModalMessage(\"新增组织失败,组织名或组织代码已存在\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"新增组织失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t});\n");
      out.write("});\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userRole==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t    \t<a href=\"/timer/org/main\" class=\"list-group-item org\">组织管理</a>\n");
        out.write("\t\t    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t       ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userRole==2 || sessionScope.userRole==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t              <a href=\"/timer/user/main\" class=\"list-group-item user\">用户管理</a>\n");
        out.write("\t       ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userModels}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("user");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td class=\"orgName\">\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.organization}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t             ");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<input class = \"status\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<input class=\"id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<input class=\"role\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<input class=\"organizationCode\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.organizationCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              普通用户\n");
        out.write("\t\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              组织管理员\n");
        out.write("\t\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              系统管理员\n");
        out.write("\t\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.createTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("both");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.status==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       \t\t封禁\n");
        out.write("\t\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.status==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       \t\t正常\n");
        out.write("\t\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              \n");
        out.write("\t\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_4.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
    if (_jspx_eval_c_choose_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t    ");
        int evalDoAfterBody = _jspx_th_c_choose_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id!=sessionScope.userId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_choose_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_choose_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_choose_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_choose_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_5.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    int _jspx_eval_c_choose_5 = _jspx_th_c_choose_5.doStartTag();
    if (_jspx_eval_c_choose_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_5);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==4 && sessionScope.organizationCode != user.organizationCode && sessionScope.userRole == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-xs setAdminRole\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0);\">设为管理员</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_choose_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_6.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    int _jspx_eval_c_choose_6 = _jspx_th_c_choose_6.doStartTag();
    if (_jspx_eval_c_choose_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_6);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.status==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default btn-xs enableUser\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0);\">解禁</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default btn-xs disableUser\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0);\">封禁</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_choose_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_7.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    int _jspx_eval_c_choose_7 = _jspx_th_c_choose_7.doStartTag();
    if (_jspx_eval_c_choose_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_7);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_7);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.role==4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-danger btn-xs deleteUser\"\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0);\">删除</button>\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }
}
