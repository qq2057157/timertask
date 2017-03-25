package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TimerTaskManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/WEB-INF/../views/Header.jsp");
    _jspx_dependants.add("/WEB-INF/../views/Menu.jsp");
    _jspx_dependants.add("/WEB-INF/../views/TimerTaskView.jsp");
    _jspx_dependants.add("/WEB-INF/../views/ModifyPasswordView.jsp");
    _jspx_dependants.add("/WEB-INF/../views/AddTimerTaskView.jsp");
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
      out.write("<link rel=\"stylesheet\" href=\"css/task-manager.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-datetimepicker.min.css\"/>\n");
      out.write("<script  src=\"js/jquery-1.12.0.min.js\"></script>\n");
      out.write("<script  src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script  src=\"js/common.js\"></script>\n");
      out.write("<script  src=\"js/user-operate.js\"></script>\n");
      out.write("<script  src=\"js/bootstrap-paginator.js\"></script>\n");
      out.write("<script  src=\"js/bootstrap-datetimepicker.js\"></script>\n");
      out.write("<script  src=\"js/locales/bootstrap-datetimepicker.zh-CN.js\"></script>\n");
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
      out.write("<div class=\"row\">\n");
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
      out.write("\t\t<table class=\"table table-striped table-bordered table-hover table-condensed text-center\">\n");
      out.write("\t\t\t<tr><td>任务名称</td><td class=\"td-nowrap\">触发器<br>类型</td><td class=\"td-nowrap\">创建<br>时间</td><td class=\"td-nowrap\">开始<br>时间</td><td class=\"td-nowrap\">结束<br>时间</td><td class=\"td-nowrap\">重复<br>次数</td><td class=\"td-nowrap\">间隔<br>时间</td><td class=\"td-nowrap\">cron表达式</td><td class=\"td-nowrap\">创建人</td><td>目标URL</td><td class=\"td-nowrap\">任务状态</td><td>操作\n");
      out.write("\t\t\t<a id=\"publishTask\" class=\"btn btn-default btn-sm\" data-toggle=\"modal\" data-target=\"#addTaskModal\" role=\"button\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\" ></span>创建任务</a></td></tr>\n");
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
      out.write("\t<!-- 添加定时任务弹出框start -->\n");
      out.write("\t<div class=\"modal fade\" id=\"addTaskModal\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\taria-labelledby=\"myModalLabel\">\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close close-btn\" \n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">添加定时任务</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<!-- Nav tabs -->\n");
      out.write("\t\t\t\t\t\t<ul id=\"myTabs\" class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\" class=\"active\"><a href=\"#simple\"\n");
      out.write("\t\t\t\t\t\t\t\trole=\"tab\" data-toggle=\"tab\">simple类型任务</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li role=\"presentation\"><a href=\"#cron\" role=\"tab\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"tab\">cron类型任务</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-xs-5 control-label text-right\">任务名称</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"jobName\" placeholder=\"jobName\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">触发器名称</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"triggerName\" placeholder=\"triggerName\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">任务目标URL</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"targetUrl\" placeholder=\"http://www.hust.edu.cn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"urldisable-icon\" class=\"glyphicon glyphicon-remove alert-icon\" style=\"color:red;display:none;\">URL格式不正确</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span id=\"urlok-icon\" class=\"text-center glyphicon glyphicon-ok alert-icon\" style=\"color:green;display:none;\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">目标URL参数列表</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"parameters\" placeholder='{\"key\":\"value\",\"key\":\"value\"}'>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Tab panes -->\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane active\" id=\"simple\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">开始时间</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4 \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"startTime\" placeholder=\"yyyy-MM-dd hh:mm:ss\" data-date-format=\"yyyy-mm-dd hh:ii:ss\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">结束时间</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"endTime\" placeholder=\"yyyy-MM-dd hh:mm:ss\" data-date-format=\"yyyy-mm-dd hh:ii:ss\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-center endTimeWarn glyphicon glyphicon-alert alert-icon\" style=\"color:red;display:none\"><small>若设置开始时间，<br>则执行次数的设置无效！</small></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">执行次数</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"repeatCount\" placeholder=\"repeatCount\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmaxlength=\"5\" onpaste=\"return false;\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonkeyup=\"value=value.replace(/[^\\d]/g,'') \"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-center repeatCountWarn glyphicon glyphicon-alert alert-icon\" style=\"color:red;display:none\"><small>若已设置开始时间，<br>执行次数的设置无效！</small></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">执行间隔(s)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"repeatInterval\" placeholder=\"repeatInterval\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tmaxlength=\"10\" onpaste=\"return false;\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonkeyup=\"value=value.replace(/[^\\d]/g,'') \"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonbeforepaste=\"clipboardData.setData('text',clipboardData.getData('text').replace(/[^\\d]/g,''))\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 简单类型定时任务end -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<div role=\"tabpanel\" class=\"tab-pane\" id=\"cron\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label for=\"inputPassword\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"col-xs-5 control-label text-right\">cron表达式</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control inputArea\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"cronExpress\" placeholder=\"cronExpress\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"text-center\" style=\"color:red;\">*</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12 text-center\">点击了解：<a href=\"CronHelp.jsp\" target=\"_Blank\"><small>Cron表达式详解</small></a>，<small>在线生成cron表达式:<a href=\"http://www.cronmaker.com/\" target=\"_Blank\">CronMaker</a> or <a href=\"http://cron.qqe2.com/\" target=\"_Blank\">cron.qqe2</a></small></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- cron类型定时任务end -->\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"triggerType\" class=\"form-control inputArea\" value=\"0\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- modalbody end -->\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default close-btn\">取消</button>\n");
      out.write("\t\t\t\t\t<button id=\"addTaskButton\" type=\"button\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- 添加定时任务弹出框end -->");
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
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(\".task\").addClass(\"active\");\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('#startTime').datetimepicker({\n");
      out.write("\t\tlanguage:  'zh-CN',                                     \n");
      out.write("        weekStart: 1,\n");
      out.write("        todayBtn:  1,\n");
      out.write("        todayHighlight: 1,\n");
      out.write("        autoclose:1,\n");
      out.write("        pickerPosition:\"top-left\",\n");
      out.write("        startDate:new Date(),\n");
      out.write("        maxView:3\n");
      out.write("\t}).on(\"click\",function(ev){\n");
      out.write("\t    $(\"#startTime\").datetimepicker(\"setEndDate\", $(\"#endTime\").val())});\n");
      out.write("\t    \n");
      out.write("\t$('#endTime').datetimepicker({\n");
      out.write("\t\tlanguage:  'zh-CN',                                     \n");
      out.write("        weekStart: 1,\n");
      out.write("        todayBtn:  1,\n");
      out.write("        todayHighlight: 1,\n");
      out.write("        autoclose:1,\n");
      out.write("        pickerPosition:\"top-left\",\n");
      out.write("        startDate:new Date(),\n");
      out.write("        maxView:3\n");
      out.write("\t}).on(\"click\",function(ev){\n");
      out.write("\t    $(\"#endTime\").datetimepicker(\"setStartDate\", $(\"#startTime\").val());\n");
      out.write("\t    show(\".endTimeWarn\");\n");
      out.write("\t});\n");
      out.write("\t$(document).on(\"blur\",\"#endTime\",function(){\n");
      out.write("\t\thide(\".endTimeWarn\");\n");
      out.write("\t});\n");
      out.write("\t$(document).on(\"click\",\"#repeatCount\",function(){\n");
      out.write("\t\tshow(\".repeatCountWarn\");\n");
      out.write("\t});\n");
      out.write("\t$(document).on(\"blur\",\"#repeatCount\",function(){\n");
      out.write("\t\thide(\".repeatCountWarn\");\n");
      out.write("\t\t});\n");
      out.write("\t$(document).on(\"click\",\"#cronExpress\",function(){\n");
      out.write("\t\tshow(\".cronWarn\");\n");
      out.write("\t});\n");
      out.write("\t$(document).on(\"change\",\"#cronExpress\",function(){\n");
      out.write("\t\thide(\".cronWarn\");\n");
      out.write("\t});\n");
      out.write("\t$('#myTabs a[href=\"#simple\"]').click(function (e) {\n");
      out.write("\t\t  $(\"#triggerType\").val(0);\n");
      out.write("\t\t});\n");
      out.write("\t$('#myTabs a[href=\"#cron\"]').click(function (e) {\n");
      out.write("\t\t  $(\"#triggerType\").val(1);\n");
      out.write("\t\t});\n");
      out.write("\t$(\"#jobName\").keyup(function(){\n");
      out.write("\t\t $(\"#triggerName\").val($(this).val());\n");
      out.write("\t\t});\n");
      out.write("\t$(\"#targetUrl\").one(\"click\",function(){\n");
      out.write("\t\talertModalMessage(\"目标URL必须以http://或https://开头\");\n");
      out.write("\t\t});\n");
      out.write("\t$(document).on(\"change\",\"#targetUrl\",function(){\n");
      out.write("\t\tvar patt=new RegExp(/http(s)?:\\/\\/([\\w-]+\\.)+[\\w-]+(\\/[\\w- .\\/?%&=]*)?/);\n");
      out.write("\t\tif(patt.test($(this).val())){\n");
      out.write("\t\t\tshow(\"#urlok-icon\");\n");
      out.write("\t\t\thide(\"#urldisable-icon\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tshow(\"#urldisable-icon\");\n");
      out.write("\t\t\thide(\"#urlok-icon\");\n");
      out.write("\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t$(\"#parameters\").one(\"click\",function(){\n");
      out.write("\t\talertModalMessage('参数列表格式为JSON，例如:{\"key\":\"value\",\"key\":\"value\"}');\n");
      out.write("\t\t});\n");
      out.write("\t$(\"#parameters\").change(function(){\n");
      out.write("\t\t// todo\n");
      out.write("\t\t});\n");
      out.write("\t$(\"#addTaskButton\").click(function(){\n");
      out.write("\t\tvar jobName = $(\"#jobName\").val();\n");
      out.write("\t\tvar triggerName = $(\"#triggerName\").val();\n");
      out.write("\t\tvar targetUrl = $(\"#targetUrl\").val();\n");
      out.write("\t\tvar repeatInterval = $(\"#repeatInterval\").val();\n");
      out.write("\t\tvar repeatCount = $(\"#repeatCount\").val();\n");
      out.write("\t\tvar triggerType = $(\"#triggerType\").val();\n");
      out.write("\t\tvar startTime = $(\"#startTime\").val();\n");
      out.write("\t\tvar endTime = $(\"#endTime\").val();\n");
      out.write("\t\tvar cronExpress = $(\"#cronExpress\").val();\n");
      out.write("\t\t// 触发器类型为简单类型\n");
      out.write("\t\tif(triggerType==0){\n");
      out.write("\t\t\tif(isEmpty(jobName) ||\n");
      out.write("\t\t\t\t\tisEmpty(triggerName) ||\n");
      out.write("\t\t\t\t\tisEmpty(targetUrl) ||\n");
      out.write("\t\t\t\t\tisEmpty(startTime) ||\n");
      out.write("\t\t\t\t\tisEmpty(repeatInterval) ||\n");
      out.write("\t\t\t\t\t(isEmpty(endTime) && isEmpty(repeatCount))){\n");
      out.write("\t\t\t\talertModalMessage(\"添加的simple类型任务中有必填参数为空，请检查\");\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t    \t\turl:\"/timer/task/add\",\n");
      out.write("\t\t    \t\tdata:{\n");
      out.write("\t\t    \t\t\tjobName:jobName,\n");
      out.write("\t\t    \t\t\ttriggerName:triggerName,\n");
      out.write("\t\t    \t\t\ttargetUrl:targetUrl,\n");
      out.write("\t\t    \t\t\tparameters:$(\"#parameters\").val(),\n");
      out.write("\t\t    \t\t\tstartTime:startTime,\n");
      out.write("\t\t    \t\t\tendTime:endTime,\n");
      out.write("\t\t    \t\t\trepeatCount:repeatCount,\n");
      out.write("\t\t    \t\t\trepeatInterval:repeatInterval,\n");
      out.write("\t\t    \t\t\ttriggerType:triggerType\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttype:'get',\n");
      out.write("\t\t    \t\tdataType:'json',\n");
      out.write("\t\t    \t\tsuccess:function(data){\n");
      out.write("\t\t    \t\t\tif(data.code==99999){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加simple任务成功\");\n");
      out.write("\t\t    \t\t\t\tlocation.reload();\n");
      out.write("\t\t    \t\t\t} else if(data.code==10008){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加任务失败,数据库中未查到此任务的信息，请重试\");\n");
      out.write("\t\t    \t\t\t} else if(data.code==505){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加任务失败,服务器异常\");\t\t\n");
      out.write("\t\t    \t\t\t} else {\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加任务失败\");\n");
      out.write("\t\t    \t\t\t}\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t\t});\n");
      out.write("\t\t\t\t// ajax end;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}else {// 触发器类型为cron类型\n");
      out.write("\t\t\tif(isEmpty(jobName) ||\n");
      out.write("\t\t\t\t\tisEmpty(triggerName) ||\n");
      out.write("\t\t\t\t\tisEmpty(targetUrl) ||\n");
      out.write("\t\t\t\t\tisEmpty(cronExpress)){\n");
      out.write("\t\t\t\talertModalMessage(\"添加cron类型任务中有必填参数为空，请检查\");\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t    \t\turl:\"/timer/task/add\",\n");
      out.write("\t\t    \t\tdata:{\n");
      out.write("\t\t    \t\t\tjobName:jobName,\n");
      out.write("\t\t    \t\t\ttriggerName:triggerName,\n");
      out.write("\t\t    \t\t\ttargetUrl:targetUrl,\n");
      out.write("\t\t    \t\t\tparameters:$(\"#parameters\").val(),\n");
      out.write("\t\t    \t\t\ttriggerType:triggerType,\n");
      out.write("\t\t    \t\t\tcronExpress:cronExpress\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttype:'get',\n");
      out.write("\t\t    \t\tdataType:'json',\n");
      out.write("\t\t    \t\tsuccess:function(data){\n");
      out.write("\t\t    \t\t\tif(data.code==99999){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加cron类型任务成功\");\n");
      out.write("\t\t    \t\t\t\tlocation.reload();\n");
      out.write("\t\t    \t\t\t} else if(data.code==10008){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加任务失败,数据库中未查到此任务的信息，请重试\");\n");
      out.write("\t\t    \t\t\t} else if(data.code==505){\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加任务失败,服务器异常\");\t\t\n");
      out.write("\t\t    \t\t\t} else {\n");
      out.write("\t\t    \t\t\t\talertModalMessage(\"添加任务失败\");\n");
      out.write("\t\t    \t\t\t}\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t\t});\n");
      out.write("\t\t\t\t// ajax end;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t} \n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\".taskStart\",function(){\n");
      out.write("\t\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\t\tvar mythis = $(this);\n");
      out.write("\t\t\t//alert($(this).parents('td').find('input.id').val());\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t    \t\turl:\"/timer/task/start\",\n");
      out.write("\t    \t\tdata:{\n");
      out.write("\t    \t\t\tid:$(this).parents('td').find('input.id').val()\n");
      out.write("\t    \t\t},\n");
      out.write("\t    \t\ttype:'get',\n");
      out.write("\t    \t\tdataType:'json',\n");
      out.write("\t    \t\tsuccess:function(data){\n");
      out.write("\t    \t\t\tif(data.code==99999){\n");
      out.write("\t    \t\t\t\talertModalMessage(\"启动成功\");\n");
      out.write("\t    \t\t\t\tmythis.parents('td').prev().html(\"<small>运行中</small>\");\n");
      out.write("\t    \t\t\t\tmythis.parents('td').prev().find('input.status').val(1);\n");
      out.write("\t    \t\t\t\t//mythis.parents('td').html('<a class=\"taskStop\" href=\"javascript:void(0);\">终止</a>');\n");
      out.write("\t    \t\t\t\tmythis.html(\"终止\");\n");
      out.write("\t    \t\t\t\tmythis.removeClass(\"taskStart\");\n");
      out.write("\t    \t\t\t\tmythis.addClass(\"taskStop\");\n");
      out.write("\t    \t\t\t} else if(data.code==10008){\n");
      out.write("\t    \t\t\t\talertModalMessage(\"启动失败,数据库中未查到此任务的信息，请重试\");\n");
      out.write("\t    \t\t\t} else if(data.code==505){\n");
      out.write("\t    \t\t\t\talertModalMessage(\"启动失败,服务器异常\");\t\t\n");
      out.write("\t    \t\t\t} else {\n");
      out.write("\t    \t\t\t\talertModalMessage(\"启动失败\");\n");
      out.write("\t    \t\t\t}\n");
      out.write("\t    \t\t}\n");
      out.write("\t    \t\t});\n");
      out.write("\t\t\t//ajax end;\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t$(document).on(\"click\",\".taskStop\",function(){\n");
      out.write("\t\t//alert($(this).parents('td').prev().find('input.status').val());\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/task/stop\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\tid:$(this).parents('td').find('input.id').val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"终止成功\");\n");
      out.write("    \t\t\t\tmythis.parents('td').prev().html(\"<small>已终止</small>\");\n");
      out.write("    \t\t\t\tmythis.parents('td').prev().find('input.status').val(4);\n");
      out.write("    \t\t\t\tmythis.css(\"display\",\"none\");\n");
      out.write("    \t\t\t\t//mythis.removeClass(\"taskStop\");\n");
      out.write("    \t\t\t\t//mythis.addClass(\"taskDelete\");\n");
      out.write("   \t\t\t\t} else if(data.code==505){\n");
      out.write("   \t\t\t\t\talertModalMessage(\"终止失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"终止失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(\".taskDelete\").click(function(){\n");
      out.write("\t\tvar mythis = $(this);\n");
      out.write("\t\t$.ajax({\n");
      out.write("    \t\turl:\"/timer/task/delete\",\n");
      out.write("    \t\tdata:{\n");
      out.write("    \t\t\tid:$(this).parents('td').find('input.id').val()\n");
      out.write("    \t\t},\n");
      out.write("    \t\ttype:'get',\n");
      out.write("    \t\tdataType:'json',\n");
      out.write("    \t\tsuccess:function(data){\n");
      out.write("    \t\t\tif(data.code==99999){\n");
      out.write("    \t\t\t\talertModalMessage(\"删除成功\");\n");
      out.write("    \t\t\t\tmythis.parents('td').parents(\"tr\").remove();\n");
      out.write("     \t\t\t} else if(data.code==505){\n");
      out.write("     \t\t\t\talertModalMessage(\"删除失败,服务器异常\");\t\t\n");
      out.write("    \t\t\t} else {\n");
      out.write("    \t\t\t\talertModalMessage(\"删除失败\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t}\n");
      out.write("    \t\t});\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
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
      out.write("         location.href = '/timer/task/main?currentPage='+page;\n");
      out.write("         //console.log(e);\n");
      out.write("         //console.log(originalEvent);\n");
      out.write("        // console.log(type);\n");
      out.write("    }\n");
      out.write("};\n");
      out.write("element.bootstrapPaginator(options);\t//进行初始化\n");
      out.write("});\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${timerTasks}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("task");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.jobName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.cronExpress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<small>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.targetUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<input class = \"status\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t<small>\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t</small>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<input class=\"id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_choose_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t      ");
          if (_jspx_meth_c_choose_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
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
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
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
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.triggerType==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              simple\n");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              cron\n");
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

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.createTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
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
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
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

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.triggerType==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t             ");
        if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
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

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.startTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setType("both");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_1);
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
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.triggerType==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              ");
        if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
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

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.endTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setType("both");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_5.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_5 = _jspx_th_c_choose_5.doStartTag();
    if (_jspx_eval_c_choose_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_5, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_5);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.triggerType==0 && task.endTime==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              <small>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.repeatCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
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

  private boolean _jspx_meth_c_choose_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_6 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_6.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_6 = _jspx_th_c_choose_6.doStartTag();
    if (_jspx_eval_c_choose_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_6);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.triggerType==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.repeatInterval}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("s\n");
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

  private boolean _jspx_meth_c_choose_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_7 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_7.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_7 = _jspx_th_c_choose_7.doStartTag();
    if (_jspx_eval_c_choose_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t       ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_7, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.status==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              未发布\n");
        out.write("\t\t\t\t\t\t       ");
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

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.status==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              运行中\n");
        out.write("\t\t\t\t\t\t       ");
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

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_7);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t              已终止\n");
        out.write("\t\t\t\t\t\t       ");
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

  private boolean _jspx_meth_c_choose_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_8 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_8.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_8 = _jspx_th_c_choose_8.doStartTag();
    if (_jspx_eval_c_choose_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t       ");
        if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t       ");
        if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_8, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t      ");
        int evalDoAfterBody = _jspx_th_c_choose_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_8);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_8);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.status==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default btn-xs taskStart\" href=\"javascript:void(0);\">启动</button>\n");
        out.write("\t\t\t\t\t       ");
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

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_8);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.status==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t            <button type=\"button\" class=\"btn btn-default btn-xs taskStop\" href=\"javascript:void(0);\">终止</button>\n");
        out.write("\t\t\t\t\t       ");
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

  private boolean _jspx_meth_c_choose_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_9 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_9.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_9 = _jspx_th_c_choose_9.doStartTag();
    if (_jspx_eval_c_choose_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t       ");
        if (_jspx_meth_c_when_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_9, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t      ");
        int evalDoAfterBody = _jspx_th_c_choose_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_9);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_9);
    return false;
  }

  private boolean _jspx_meth_c_when_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_11.setPageContext(_jspx_page_context);
    _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_9);
    _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task.status!=1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" \t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-danger btn-xs taskDelete\" href=\"javascript:void(0);\">删除</button>\n");
        out.write("\t\t\t\t\t       ");
        int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
    return false;
  }
}
