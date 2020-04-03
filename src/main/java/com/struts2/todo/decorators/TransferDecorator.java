package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUserTransfer;

public class TransferDecorator implements MethodsToDoUserTransfer{
	private MethodsToDoUserTransfer methodsToDoUserTransfer;
	
	public TransferDecorator(MethodsToDoUserTransfer methodsToDoUserTransfer) {
		this.methodsToDoUserTransfer = methodsToDoUserTransfer;
	}
	
	@Override
	public void methodToDoTransfer() {
		this.methodsToDoUserTransfer.methodToDoTransfer();	
	}
}
