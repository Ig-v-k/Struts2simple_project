/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-10 21:33:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webtemplate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class implLogin_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/tags/template/implMain.tag", Long.valueOf(1586553837000L));
    _jspx_dependants.put("/WEB-INF/tld/iw.tld", Long.valueOf(1584829765000L));
    _jspx_dependants.put("/WEB-INF/tags/template/maiN.tag", Long.valueOf(1585262237000L));
    _jspx_dependants.put("/WEB-INF/base.jspf", Long.valueOf(1584900645000L));
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String htmlTitle;
  private java.lang.String bodyTitle;

  public java.lang.String getHtmlTitle() {
    return this.htmlTitle;
  }

  public void setHtmlTitle(java.lang.String htmlTitle) {
    this.htmlTitle = htmlTitle;
    jspContext.setAttribute("htmlTitle", htmlTitle);
  }

  public java.lang.String getBodyTitle() {
    return this.bodyTitle;
  }

  public void setBodyTitle(java.lang.String bodyTitle) {
    this.bodyTitle = bodyTitle;
    jspContext.setAttribute("bodyTitle", bodyTitle);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getHtmlTitle() != null ) 
      _jspx_page_context.setAttribute("htmlTitle", getHtmlTitle());
    if( getBodyTitle() != null ) 
      _jspx_page_context.setAttribute("bodyTitle", getBodyTitle());

    try {
      if (_jspx_meth_fmt_005fsetBundle_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_template_005fimplMain_005f0(_jspx_page_context))
        return;
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_fmt_005fsetBundle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_005fsetBundle_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_005fsetBundle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fsetBundle_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/base.jspf(6,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetBundle_005f0.setBasename("ApplicationResources");
    int _jspx_eval_fmt_005fsetBundle_005f0 = _jspx_th_fmt_005fsetBundle_005f0.doStartTag();
    if (_jspx_th_fmt_005fsetBundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.reuse(_jspx_th_fmt_005fsetBundle_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005ffmt_005fsetBundle_0026_005fbasename_005fnobody.reuse(_jspx_th_fmt_005fsetBundle_005f0);
    return false;
  }

  private boolean _jspx_meth_template_005fimplMain_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  template:implMain
    org.apache.jsp.tag.webtemplate.implMain_tag _jspx_th_template_005fimplMain_005f0 = (new org.apache.jsp.tag.webtemplate.implMain_tag());
    _jsp_instancemanager.newInstance(_jspx_th_template_005fimplMain_005f0);
    _jspx_th_template_005fimplMain_005f0.setJspContext(_jspx_page_context);
    _jspx_th_template_005fimplMain_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/template/implLogin.tag(7,0) name = bodyTitle type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fimplMain_005f0.setBodyTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${htmlTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    // /WEB-INF/tags/template/implLogin.tag(7,0) name = htmlTitle type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_template_005fimplMain_005f0.setHtmlTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bodyTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new Helper( 0, _jspx_page_context, _jspx_th_template_005fimplMain_005f0, null);
    // /WEB-INF/tags/template/implLogin.tag(7,0) null
    _jspx_th_template_005fimplMain_005f0.setHeadLoginContent(_jspx_temp0);
    _jspx_th_template_005fimplMain_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_template_005fimplMain_005f0, null));
    _jspx_th_template_005fimplMain_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_template_005fimplMain_005f0);
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
      out.write("<style>\n");
      out.write("\t\t\t#parent {\n");
      out.write("\t\t\t   display: table;\n");
      out.write("\t\t\t   width: 100%;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#form_login {\n");
      out.write("\t\t\t   display: table-cell;\n");
      out.write("\t\t\t   text-align: center;\n");
      out.write("\t\t\t   vertical-align: middle;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ta {\n");
      out.write("\t\t\t  display: block;\n");
      out.write("\t\t\t  padding: 10px;\n");
      out.write("\t\t\t  position: absolute;\n");
      out.write("\t\t\t  z-index: -1;\n");
      out.write("\t\t\t  top: 1rem;\n");
      out.write("\t\t\t  left: 100%;\n");
      out.write("\t\t\t  margin-left: -62px;\n");
      out.write("\t\t\t  transition: all .2s;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ta:hover {\n");
      out.write("\t\t\t  margin-left: 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
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
          case 1:
            invoke1( out );
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
