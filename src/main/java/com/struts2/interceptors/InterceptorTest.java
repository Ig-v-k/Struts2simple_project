package com.struts2.interceptors;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.struts2.interfaces.UserAware;

public class InterceptorTest extends AbstractInterceptor{
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(CheckLogInUserInterceptor.class.getName());
    
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = (HttpServletRequest) invocation.getInvocationContext().get(StrutsStatics.HTTP_REQUEST);
		String url = request.getRequestURI();
		
        request.getServletContext().getClassLoader();
		LOGGER.info("\t********* Request START *********"
        		+ "\n\nrequest.toString() -> " + request.toString()
//        		+ "\nrequest.changeSessionId() -> " + request.changeSessionId()
        		+ "\nrequest.getAuthType() -> " + request.getAuthType()
        		+ "\nrequest.getCharacterEncoding() -> " + request.getCharacterEncoding()
        		+ "\nrequest.getContentLength() -> " + request.getContentLength()
//        		+ "\nrequest.getContentLengthLong() -> " + request.getContentLengthLong()
        		+ "\nrequest.getContentType() -> " + request.getContentType()
        		+ "\nrequest.getContextPath() -> " + request.getContextPath()
        		+ "\nrequest.getLocalAddr() -> " + request.getLocalAddr()
        		+ "\nrequest.getLocalName() -> " + request.getLocalName()
        		+ "\nrequest.getLocalPort() -> " + request.getLocalPort()
        		+ "\nrequest.getMethod() -> " + request.getMethod()
        		+ "\nrequest.getPathInfo() -> " + request.getPathInfo()
        		+ "\nrequest.getPathTranslated() -> " + request.getPathTranslated()
        		+ "\nrequest.getProtocol() -> " + request.getProtocol()
        		+ "\nrequest.getQueryString() -> " + request.getQueryString()
        		+ "\nrequest.getRemoteAddr() -> " + request.getRemoteAddr()
        		+ "\nrequest.getRemoteHost() -> " + request.getRemoteHost()
        		+ "\nrequest.getRemotePort() -> " + request.getRemotePort()
        		+ "\nrequest.getRemoteUser() -> " + request.getRemoteUser()
        		+ "\nrequest.getRequestedSessionId() -> " + request.getRequestedSessionId()
        		+ "\nrequest.getRequestURI() -> " + request.getRequestURI()
        		+ "\nrequest.getScheme() -> " + request.getScheme()
        		+ "\nrequest.getServerName() -> " + request.getServerName()
        		+ "\nrequest.getServerPort() -> " + request.getServerPort()
        		+ "\nrequest.getServerPath() -> " + request.getServletPath()
//        		+ "\nrequest.getAsyncContext().toString() -> " + request.getAsyncContext().toString()
//        		+ "\nrequest.getAsyncContext().getTimeout() -> " + request.getAsyncContext().getTimeout()
//        		+ "\nrequest.getAsyncContext().getRequest().toString() -> " + request.getAsyncContext().getRequest().toString()
//        		+ "\nrequest.getAsyncContext().getResponse().toString() -> " + request.getAsyncContext().getResponse().toString()
//        		+ "\nrequest.getAsyncContext().hasOriginalRequestAndResponse() -> " + request.getAsyncContext().hasOriginalRequestAndResponse()
        		+ "\nrequest.getAttributeNames() -> " + request.getAttributeNames()
        		+ "\nrequest.getCookies() -> " + request.getCookies()
        		+ "\nrequest.getDispatcherType().name() -> " + request.getDispatcherType().name()
        		+ "\nrequest.getDispatcherType().ordinal() -> " + request.getDispatcherType().ordinal()
        		+ "\nrequest.getDispatcherType().toString() -> " + request.getDispatcherType().toString()
        		+ "\nrequest.getDispatcherType().getDeclaringClass() -> " + request.getDispatcherType().getDeclaringClass()
        		+ "\nrequest.getHeaderNames() -> " + request.getHeaderNames()
//        		+ "\nrequest.getInputStream().toString() -> " + request.getInputStream().toString()
//        		+ "\nrequest.getInputStream().available() -> " + request.getInputStream().available()
//        		+ "\nrequest.getInputStream().isFinished() -> " + request.getInputStream().isFinished()
//        		+ "\nrequest.getInputStream().isReady() -> " + request.getInputStream().isReady()
//        		+ "\nrequest.getInputStream().markSupported() -> " + request.getInputStream().markSupported()
        		+ "\nrequest.getLocale() -> " + request.getLocale()
        		+ "\nrequest.getLocales() -> " + request.getLocales()
        		+ "\nrequest.getParameterMap() -> " + request.getParameterMap()
        		+ "\nrequest.getParameterNames() -> " + request.getParameterNames()
        		+ "\nrequest.getParts() -> " + request.getParts()
        		+ "\nrequest.getReader().toString() -> " + request.getReader().toString()
        		+ "\nrequest.getRequestURL().length() -> " + request.getRequestURL().length()
        		+ "\nrequest.getRequestURL().codePoints() -> " + request.getRequestURL().codePoints()
        		+ "\nrequest.getServletContext().toString() -> " + request.getServletContext().toString()
        		+ "\nrequest.getServletContext().getContextPath() -> " + request.getServletContext().getContextPath()
        		+ "\nrequest.getServletContext().getEffectiveMajorVersion() -> " + request.getServletContext().getEffectiveMajorVersion()
        		+ "\nrequest.getServletContext().getEffectiveMinorVersion() -> " + request.getServletContext().getEffectiveMinorVersion()
        		+ "\nrequest.getServletContext().getMajorVersion() -> " + request.getServletContext().getMajorVersion()
        		+ "\nrequest.getServletContext().getMinorVersion() -> " + request.getServletContext().getMinorVersion()
        		+ "\nrequest.getServletContext().getServerInfo() -> " + request.getServletContext().getServerInfo()
        		+ "\nrequest.getServletContext().getServletContextName() -> " + request.getServletContext().getServletContextName()
//        		+ "\nrequest.getServletContext().getVirtualServerName() -> " + request.getServletContext().getVirtualServerName()
        		+ "\nrequest.getServletContext().getClassLoader().toString() -> " + request.getServletContext().getClassLoader().toString()
        		+ "\nClassLoader.getSystemClassLoader() -> " + ClassLoader.getSystemClassLoader()
        		+ "\nrequest.getServletContext().getClassLoader().getParent().toString() -> " + request.getServletContext().getClassLoader().getParent().toString()
        		+ "\nrequest.getServletContext().getDefaultSessionTrackingModes() -> " + request.getServletContext().getDefaultSessionTrackingModes()
        		+ "\nrequest.getServletContext().getEffectiveSessionTrackingModes() -> " + request.getServletContext().getEffectiveSessionTrackingModes()
        		+ "\nrequest.getServletContext().getFilterRegistrations() -> " + request.getServletContext().getFilterRegistrations()
        		+ "\nrequest.getServletContext().getInitParameterNames() -> " + request.getServletContext().getInitParameterNames()
        		+ "\nrequest.getServletContext().getJspConfigDescriptor() -> " + request.getServletContext().getJspConfigDescriptor()
        		+ "\nrequest.getServletContext().getServletRegistrations() -> " + request.getServletContext().getServletRegistrations()
        		+ "\nrequest.getServletContext().getSessionCookieConfig() -> " + request.getServletContext().getSessionCookieConfig()
        		+ "\nrequest.getSession().toString() -> " + request.getSession().toString()
        		+ "\nrequest.getSession().getCreationTime() -> " + request.getSession().getCreationTime()
        		+ "\nrequest.getSession().getId() -> " + request.getSession().getId()
        		+ "\nrequest.getSession().getLastAccessedTime() -> " + request.getSession().getLastAccessedTime()
        		+ "\nrequest.getSession().getMaxInactiveInterval() -> " + request.getSession().getMaxInactiveInterval()
        		+ "\nrequest.getSession().isNew() -> " + request.getSession().isNew()
//        		+ "\nrequest.getUserPrincipal().getName() -> " + request.getUserPrincipal().getName()
//        		+ "\nrequest.getUserPrincipal().toString() -> " + request.getUserPrincipal().toString()
        		+ "\nrequest.isAsyncStarted() -> " + request.isAsyncStarted()
        		+ "\nrequest.isAsyncSupported() -> " + request.isAsyncSupported()
        		+ "\nrequest.isRequestedSessionIdFromCookie() -> " + request.isRequestedSessionIdFromCookie()
        		+ "\nrequest.isRequestedSessionIdFromURL() -> " + request.isRequestedSessionIdFromURL()
        		+ "\nrequest.isRequestedSessionIdValid() -> " + request.isRequestedSessionIdValid()
        		+ "\nrequest.isSecure() -> " + request.isSecure()
        		+ "\n\ngetInvocationContext().getLocale().toString() -> " + invocation.getInvocationContext().getLocale().toString()
        		+ "\ngetInvocationContext().getLocale().getCountry() -> " + invocation.getInvocationContext().getLocale().getCountry()
        		+ "\ngetInvocationContext().getLocale().getDisplayCountry() -> " + invocation.getInvocationContext().getLocale().getDisplayCountry()
        		+ "\ngetInvocationContext().getLocale().getDisplayLanguage() -> " + invocation.getInvocationContext().getLocale().getDisplayLanguage()
        		+ "\ngetInvocationContext().getLocale().getDisplayName() -> " + invocation.getInvocationContext().getLocale().getDisplayName()
        		+ "\ngetInvocationContext().getLocale().getDisplayScript() -> " + invocation.getInvocationContext().getLocale().getDisplayScript()
        		+ "\ngetInvocationContext().getLocale().getDisplayVariant() -> " + invocation.getInvocationContext().getLocale().getDisplayVariant()
        		+ "\ngetInvocationContext().getLocale().getDisplayVariant() -> " + invocation.getInvocationContext().getLocale().getDisplayVariant()
        		+ "\ngetInvocationContext().getLocale().getISO3Country() -> " + invocation.getInvocationContext().getLocale().getISO3Country()
        		+ "\ngetInvocationContext().getLocale().getISO3Language() -> " + invocation.getInvocationContext().getLocale().getISO3Language()
        		+ "\ngetInvocationContext().getLocale().getLanguage() -> " + invocation.getInvocationContext().getLocale().getLanguage()
        		+ "\ngetInvocationContext().getLocale().getScript() -> " + invocation.getInvocationContext().getLocale().getScript()
        		+ "\ngetInvocationContext().getLocale().getVariant() -> " + invocation.getInvocationContext().getLocale().getVariant()
        		+ "\ngetInvocationContext().getLocale().toLanguageTag() -> " + invocation.getInvocationContext().getLocale().toLanguageTag()
        		+ "\ngetInvocationContext().getLocale().getExtensionKeys() -> " + invocation.getInvocationContext().getLocale().getExtensionKeys()
        		+ "\ngetInvocationContext().getLocale().getUnicodeLocaleAttributes() -> " + invocation.getInvocationContext().getLocale().getUnicodeLocaleAttributes()
        		+ "\ngetInvocationContext().getLocale().getUnicodeLocaleKeys() -> " + invocation.getInvocationContext().getLocale().getUnicodeLocaleKeys()
        		+ "\ngetInvocationContext().getLocale().hasExtensions() -> " + invocation.getInvocationContext().getLocale().hasExtensions()
        		+ "\ngetInvocationContext().getLocale().stripExtensions() -> " + invocation.getInvocationContext().getLocale().stripExtensions()
        		+ "\n\ngetInvocationContext().getContainer().toString() -> " + invocation.getInvocationContext().getContainer().toString()
        		+ "\n\ngetInvocationContext().getContextMap() -> " + invocation.getInvocationContext().getContextMap()
        		+ "\ngetInvocationContext().getConversionErrors() -> " + invocation.getInvocationContext().getConversionErrors()
        		+ "\ngetInvocationContext().getName() -> " + invocation.getInvocationContext().getName()
        		+ "\n\ngetProxy().getConfig().getLocation().getURI() -> " + invocation.getProxy().getConfig().getLocation().getURI()
        		+ "\ngetProxy().getConfig().getLocation().getLineNumber() -> " + invocation.getProxy().getConfig().getLocation().getLineNumber()
        		+ "\ngetProxy().getConfig().getLocation().getDescription() -> " + invocation.getProxy().getConfig().getLocation().getDescription()
        		+ "\ngetProxy().getConfig().getLocation().getColumnNumber() -> " + invocation.getProxy().getConfig().getLocation().getColumnNumber()
        		+ "\n\ngetProxy().getConfig().getInterceptors() -> " + invocation.getProxy().getConfig().getInterceptors()
        		+ "\n\ngetProxy().getConfig().getParams() -> " + invocation.getProxy().getConfig().getParams()
        		+ "\ngetProxy().getConfig().getResults() -> " + invocation.getProxy().getConfig().getResults()
        		+ "\ngetProxy().getConfig().getPackageName() -> " + invocation.getProxy().getConfig().getPackageName()
        		+ "\ngetProxy().getConfig().getName() -> " + invocation.getProxy().getConfig().getName()
        		+ "\ngetProxy().getConfig().getMethodName() -> " + invocation.getProxy().getConfig().getMethodName()
        		+ "\ngetProxy().getConfig().getClassName() -> " + invocation.getProxy().getConfig().getClassName()
        		+ "\n\ngetProxy().isMethodSpecified() -> " + invocation.getProxy().isMethodSpecified()
        		+ "\ngetProxy().getExecuteResult() -> " + invocation.getProxy().getExecuteResult()
        		+ "\ngetProxy().getAction() -> " + invocation.getProxy().getAction()
        		+ "\ngetProxy().getNamespace() -> " + invocation.getProxy().getNamespace()
        		+ "\ngetProxy().getMethod() -> " + invocation.getProxy().getMethod()
        		+ "\ngetProxy().getActionName() -> " + invocation.getProxy().getActionName()
        		+ "\n\ngetStack().toString() -> " + invocation.getStack().toString()
        		+ "\ngetStack().pop() -> " + invocation.getStack().pop()
        		+ "\ngetStack().peek() -> " + invocation.getStack().peek()
        		+ "\ngetStack().getRoot() -> " + invocation.getStack().getRoot()
        		+ "\ngetStack().getExprOverrides() -> " + invocation.getStack().getExprOverrides()
        		+ "\ngetStack().getContext() -> " + invocation.getStack().getContext()
        		+ "\ngetStack().size() -> " + invocation.getStack().size()
        		+ "\ngetStack().hashCode() -> " + invocation.getStack().hashCode()
        		+ "\n\ngetAction() -> " + invocation.getAction()
        		+ "\nisExecuted() -> " + invocation.isExecuted()
        		+ "\ninvokeActionOnly() -> " + invocation.invokeActionOnly()
        		+ "\nHttpRequestInterceptor URL -> " + url
        		+ "\ngetResultCode() -> " + invocation.getResultCode()
        		+ "\ntoString() -> " + invocation.toString()
        		+ "\ninvoke() -> " + invocation.invoke()
        		+ "\ngetResult().toString() -> " + invocation.getResult().toString()
        		+ "\n((Action) invocation.getAction() instanceof UserAware) -> " + ((Action) invocation.getAction() instanceof UserAware)
        		+ "\n\n\t*********************************");
		
		return invocation.invoke();
	}
}
