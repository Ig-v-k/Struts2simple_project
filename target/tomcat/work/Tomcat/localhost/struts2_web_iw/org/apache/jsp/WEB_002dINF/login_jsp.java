/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-09 21:29:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tags/template/implMain.tag", Long.valueOf(1586043429000L));
    _jspx_dependants.put("/WEB-INF/tags/template/implLogin.tag", Long.valueOf(1586040424000L));
    _jspx_dependants.put("/WEB-INF/tld/iw.tld", Long.valueOf(1584829765000L));
    _jspx_dependants.put("/WEB-INF/tags/template/maiN.tag", Long.valueOf(1585262237000L));
    _jspx_dependants.put("/WEB-INF/base.jspf", Long.valueOf(1584900645000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      if (_jspx_meth_fmt_005fsetBundle_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_template_005fimplLogin_005f0(_jspx_page_context))
        return;
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fsetBundle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_005fsetBundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_005fsetBundle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fsetBundle_005f0.setParent(null);
    // /WEB-INF/base.jspf(6,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetBundle_005f0.setBasename("ApplicationResources");
    int _jspx_eval_fmt_005fsetBundle_005f0 = _jspx_th_fmt_005fsetBundle_005f0.doStartTag();
    if (_jspx_th_fmt_005fsetBundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.reuse(_jspx_th_fmt_005fsetBundle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.reuse(_jspx_th_fmt_005fsetBundle_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fimplLogin_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  template:implLogin
    org.apache.jsp.tag.webtemplate.implLogin_tag _jspx_th_template_005fimplLogin_005f0 = (new org.apache.jsp.tag.webtemplate.implLogin_tag());
    _jsp_instancemanager.newInstance(_jspx_th_template_005fimplLogin_005f0);
    _jspx_th_template_005fimplLogin_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/login.jsp(3,0) name = htmlTitle type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fimplLogin_005f0.setHtmlTitle("Login");
    // /WEB-INF/login.jsp(3,0) name = bodyTitle type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fimplLogin_005f0.setBodyTitle("Login");
    _jspx_th_template_005fimplLogin_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_template_005fimplLogin_005f0, null));
    _jspx_th_template_005fimplLogin_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_template_005fimplLogin_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionerror_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("<div align=\"center\">\n");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<hr>\n");
      out.write("<form id=\"form_login\" class=\"card card-block bg-faded\" action=\"login_POST\" method=\"post\">\n");
      out.write("\t\t\t  <legend class=\"m-b-1 text-xs-center\">Sign up</legend>\n");
      out.write("\t\t\t  <div class=\"form-group input-group\" align=\"center\">\n");
      out.write("\t\t\t    <label class=\"has-float-label\">\n");
      out.write("\t\t\t    \t<span>User Name</span>\n");
      out.write("\t\t\t    \t<input name=\"username\" class=\"form-control\" placeholder=\"email@example.com\"/>\n");
      out.write("\t\t\t    </label>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <div class=\"form-group has-float-label\" align=\"center\">\n");
      out.write("\t\t\t\t  \t<label for=\"password\">Password</label>\n");
      out.write("\t\t\t\t    <input name=\"password\" class=\"form-control\" id=\"password\" type=\"password\" placeholder=\"••••••••\"/>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div>\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"role\" value=\"admin\">\n");
      out.write("\t\t\t\t\t<label for=\"male\">Admin</label><br>\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"role\" value=\"employee\">\n");
      out.write("\t\t\t\t\t<label for=\"female\">Employee</label><br>\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"role\" value=\"user\">\n");
      out.write("\t\t\t\t\t<label for=\"other\">User</label>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <button class=\"btn btn-block btn-primary\" type=\"submit\" >Sign up</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t    \n");
      out.write("\t\t<!---->\n");
      out.write("\t\t\n");
      out.write("\t\t<a href=\"https://github.com/tonystar/bootstrap-float-label\" target=\"_blank\">\n");
      out.write("\t\t  <img src=\"https://img.shields.io/github/stars/tonystar/bootstrap-float-label.svg?style=social&label=Star\"/>\n");
      out.write("\t\t</a>\n");
      out.write("\t    \n");
      out.write("\t    <hr>\n");
      out.write("\t    <br>\n");
      out.write("</div>\n");
      out.write("\t    \n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
