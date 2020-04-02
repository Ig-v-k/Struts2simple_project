package com.struts2.todo.decorators;

import java.util.Map;

import com.struts2.DB.TransferDB;
import com.struts2.beans.Transfer;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserTransfer;

public class TransferAttributes extends TransferDecorator implements CustomServletActionContext{
	private static final Map<String, Transfer> _transferMap = new TransferDB().returnMapTransfer();
	
	public TransferAttributes(MethodsToDoUserTransfer methodsToDoUserTransfer) {
		super(methodsToDoUserTransfer);
	}
	
	@Override
	public void methodToDo() {
		this.MaptoAttribute();
		super.methodToDo();
	}
	
	private void MaptoAttribute() {
		my_request.setAttribute("_transferMap", this._transferMap);
	}
}
