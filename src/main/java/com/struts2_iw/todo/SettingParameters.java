package com.struts2_iw.todo;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserSettings;
import com.struts2_iw.todo.decorators.SettingDecorator;

public class SettingParameters extends SettingDecorator implements CustomServletActionContext{
	
	public SettingParameters(MethodsToDoUserSettings methodsToDoUserSettings) {
		super(methodsToDoUserSettings);
	}
	
	@Override
	public void methodToDoSetting() {
		try {
			if(my_request.getParameter("actionSetting") != null)
				if(my_request.getAttribute("actionSetting").equals("add"))
					my_request.setAttribute("settingsContent", true);
		}
		finally {
			super.methodToDoSetting();
		}
	}
}
