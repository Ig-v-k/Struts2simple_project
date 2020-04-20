package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomLoginTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.impl.ImplMethodsLogin;
import com.struts2_iw.todo.LoginAttributeLoginedUser;
import com.struts2_iw.todo.decorators.LoginDecorator;

/**
 * @author iw
 *
 */
public class LoginPostAction extends ActionSupport implements CustomServletActionContext, CustomActionsTexts, CustomLoginTexts{
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginPostAction.class.getName());
	private String username = "", password = "" /* role = "" */;
	private boolean fgt_password = false;
    
	@Override
	public void validate() {
		LOGGER.info("--- LOGGER: method() ");
		if(this.username.isEmpty() && this.password.isEmpty()) {
			addFieldError(getText("field.login.error"), getText("error.login.empty.usernameANDpassword"));
		}
	}
	
    public String l_post() {
    	LOGGER.info("--- LOGGER: method() ");
    	LOGGER.info("--- LOGGER: logined_registeredUSER ---> " + my_session.getAttribute("logined_registeredUSER"));    	
		if (new LoginAttributeLoginedUser(
					new LoginDecorator(
							new ImplMethodsLogin()),
				my_session.getAttribute("logined_registeredUSER") == null ? true : false).descent(this.username, this.password)) {				
			my_session.setAttribute("labelLogin_Register", true);
			my_session.setAttribute("logined_registeredUSER", true);
			return CustomActionsTexts.SUCCESS;
		}
    	addFieldError(getText("field.login.error"), getText("error.login.incorrect.usernameANDpassword"));
    	return CustomActionsTexts.MAIN_ERROR;
    }
    
        
    public void setFgt_password(boolean fgt_password) {
    	LOGGER.info("--- LOGGER: fgt_password -> " + fgt_password);
		this.fgt_password = fgt_password;
	}

	public void setUsername(String username) {
    	LOGGER.info("--- LOGGER: username -> " + username);
    	this.username = username;
    }

    public void setPassword(String password) {
    	LOGGER.info("--- LOGGER: password -> " + password);
        this.password = password;
    }
}