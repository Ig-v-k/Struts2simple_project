package com.struts2_iw.interfaces.impl;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserSettings;

public class ImplMethodsSetting implements MethodsToDoUserSettings, CustomServletActionContext{
	@Override
	public void methodToDoSetting() {
		my_request.setAttribute("settingsContent", true);
	}
}
