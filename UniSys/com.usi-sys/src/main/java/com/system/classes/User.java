package com.system.classes;

public class User {

	public String username;
    public String password;
    
    /**
     * Default constructor
     */
    public User() {
    }

    public String getUsername() {
       return username;
    }
    
    public String getPassword() {
        return password;
     }

    public void setUsername(String username) {
       this.username=username;
    }

    public void setPassword(String password) {
        this.password=password;
     }
}