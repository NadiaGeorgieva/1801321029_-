package com.system.classes;

import java.util.List;

public class Inspector extends User {

   public List<Profile> profile;
   
   /**
    * Default constructor
    */
    public Inspector() {
    }

    public List<Profile> getProfile() {
	return profile;
}

public void setProfile(List<Profile> profile) {
	this.profile = profile;
}

	
   

}