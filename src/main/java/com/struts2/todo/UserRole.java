package com.struts2.todo;

public enum UserRole {
//	ADMIN,
//	EMPLOYEE,
//	USER;
	
	ADMIN("admin") {
		public String setAdminRole(String role) {
			return role;
		}
	},
	EMPLOYEE("employee") {
		public String setAdminRole(String role) {
			return role;
		}
	},
	USER("user") {
		public String setAdminRole(String role) {
			return role;
		}
	};
	
	private final String userRole;
	
	private UserRole(String userRole) {
		this.userRole = userRole;
	}
	
//	@Override 
//	public String toString(){ 
//		return userRole;
//	}
	
	public abstract String setAdminRole(String role);
}
