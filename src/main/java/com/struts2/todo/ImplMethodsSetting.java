package com.struts2.todo;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserSettings;

public class ImplMethodsSetting implements MethodsToDoUserSettings, CustomServletActionContext{
	@Override
	public void methodToDoSetting() {
		my_request.setAttribute("settingsContent", true);
	}
}
