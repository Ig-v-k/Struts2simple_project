package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUserSettings;

public class SettingDecorator implements MethodsToDoUserSettings{
	private MethodsToDoUserSettings methodsToDoUserSettings;

	public SettingDecorator(MethodsToDoUserSettings methodsToDoUserSettings) {
		this.methodsToDoUserSettings = methodsToDoUserSettings;
	}

	@Override
	public void methodToDoSetting() {
		this.methodsToDoUserSettings.methodToDoSetting();
	}
}
