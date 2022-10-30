/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanager;

import java.time.LocalTime;

/**
 * This class is the blueprint for an AgendaItem 
 * @author Sara9
 */
public class Agenda {
    private String title;
    private LocalTime time;

    /**
     * 
     * @param title 
     * @param time
     */
    public Agenda(String title, LocalTime time) {
        this.title = title;
        this.time = time;
    }
    
    /**
     *
     */
    public Agenda()
    {
        
    }

    /**
     * Title attribute getter
     * @return the title of an AgendaItem 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Title attribute setter
     * @param title the title of an AgendaItem
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Time attribute getter
     * @return the time of an AgendaItem
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * Time attribute setter
     * @param time the time of an AgendaItem
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }
    
    /**
     * This method is a toString method that combines both attributes into one String
     * @return String of title and time
     */
    @Override	  			        	      	  		
    public String toString() {	  			        	      	  		
        return title+","+time.toString();	  			        	      	  		
    }	  			        	      	  		
	

    
}
