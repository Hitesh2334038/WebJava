package com.model;

public class User {
	  int id;
	    String name;
	    String email;
	    String password;
	    String role;
		public User() {
			super();
		}
		public User(String name, String email, String password, String role) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.role = role;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	    
//	    public String getRole() {
//			return role;
//		}
//
//		public void setRole(String role) {
//			this.role = role;
//		}
//
//		String role;
//
//	    public User() {
//	    }
//
//	    public User(int id, String name, String email, String password) {
//	        this.id = id;
//	        this.name = name;
//	        this.email = email;
//	        this.password = password;
//	    }
//
//	    public User(String name, String email, String password ) {
//	        this.name = name;
//	        this.email = email;
//	        this.password = password;
//	        
//	    }
//
//	    public User(String email, String password,String role) {
//	        this.email = email;
//	        this.password = password;
//	        this.role=role;
//	    }
//
//	    public int getId() {
//	        return id;
//	    }
//
//	    public void setId(int id) {
//	        this.id = id;
//	    }
//
//	    public String getName() {
//	        return name;
//	    }
//
//	    public void setName(String name) {
//	        this.name = name;
//	    }
//
//	    public String getEmail() {
//	        return email;
//	    }
//
//	    public void setEmail(String email) {
//	        this.email = email;
//	    }
//
//	    public String getPassword() {
//	        return password;
//	    }
//
//	    public void setPassword(String password) {
//	        this.password = password;
//	    }
//	    
}
