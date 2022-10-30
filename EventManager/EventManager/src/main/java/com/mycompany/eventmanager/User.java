/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanager;

/**
 * This class is a blueprint for a User
 * @author Sara9
 */
public class User {	  			        	      	  		
	  			        	      	  		
    private String name;

    /**
     * Constructor takes in a String when instantiating a User
     * @param name Users name
     */
    public User(String name) 
    {
        this.name = name;
    }
    
    /**
     *
     */
    public User()
    {
        
    }
	  			        	      	  		
    /**
     * Name attribute getter
     * @return name of User
     */
    public String getName() {	  			        	      	  		
        return name;	  			        	      	  		
    }	  			        	      	  		
	  			        	      	  		
    /**
     * Name attribute setter
     * @param name name of User
     */
    public void setName(String name) {	  			        	      	  		
        this.name = name;	  			        	      	  		
    }	  			        	      	  		
	  			        	      	  		
    /**
     * This method is a toString method that returns a Users name
     * @return Users name as a String
     */
    @Override	  			        	      	  		
    public String toString() {	  			        	      	  		
        return name;	  			        	      	  		
    }	  			        	      	  		
	  			        	      	  		
	  			        	      	  		
}
