package com.struts2.todo;

import com.struts2.abstractClasses.ClassRegisterUserInMethods;

public class ClassRegisterUserIn extends ClassRegisterUserInMethods {
	@Override
	public String registerUserAddIn(String username, String password) {
		return super.registerUserAddIn(username, password);
	}
//    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
	
//	@Override
//	public String registerUserAddIn(String username, String password) {
//		LOGGER.info("action -> ClassRegisterUserIn -> registerUserAddIn - method()");
//		if(username.length() == 0 && password.length() == 0)
//			throw new NullPointerException("username or password is = null");
//		
//		repository.returnAllUsers().get(UserRole.USER.toString().toLowerCase()).add(new Users(username, password, UserRole.USER));
//		return ActionsTexts.SUCCESS;
//	}
}