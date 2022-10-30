package com.mycompany.eventmanager;


import com.mycompany.eventmanager.Agenda;
import com.mycompany.eventmanager.Event;
import com.mycompany.eventmanager.User;
import java.io.*;
import java.time.*;
import java.util.*;



/**
 * EventManager class that deals with Event and AgendaItem objects and has methods to manipulate Events/AgendaItems
 * @author Sara9
 */
public class EventManager {
    private ArrayList<Event> events;	  
    private ArrayList<User> users;
    private ArrayList<Agenda> items;
    private static EventManager instance;
    
    /**
     * This is a singleton method to create a single EventManager instance
     * @return instance a single instance created of EventMananger, no exceptions handled
     */
    public static EventManager getInstnace()
    {
        if (instance == null)
        {
            instance = new EventManager();
        }
        return instance;
    }
	  			        	      	  		
    /**
     *
     */
    public EventManager()	  			        	      	  		
    {	  			        	      	  		
      events = new ArrayList<Event>();	
      users = new ArrayList<User>();
      items = new ArrayList<Agenda>();
    }
    
    /**
     * Events attribute getter 
     * @return list of Events 
     */
    public ArrayList<Event> getEvents() {	  			        	      	  		
        return events;	  			        	      	  		
    }	  			        	      	  		
	  			        	      	  		
    /**
     * Events attribute setter
     * @param events list of Events
     */
    public void setEvents(ArrayList<Event> events) {	  			        	      	  		
        this.events = events;	  			        	      	  		
    }

    /**
     * User attribute getter
     * @return list of Users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * User attribute setter
     * @param users list of Users 
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    /**
     * Items attribute getter
     * @return the list of Items
     */
    public ArrayList<Agenda> getItems() {
        return items;
    }

    /**
     * Items attribute setter
     * @param items the list of Items
     */
    public void setItems(ArrayList<Agenda> items) {
        this.items = items;
    }
    
    /**
     * This method adds an Event to the EventMananger's list of Events
     * @param event the Event instance
     */
    public void addEvent(Event event)	  			        	      	  		
    {	 
        boolean check = false;        
        if (event != null) 			        	      	  		
        {	  			        	      	  			  			        	      	  			  			        	      	  		
          if (!(this.events.contains(event)))			        	      	  		
          {	
            check = true;
          }	 
        }
        
        if (check == true)
        {
            if (this.events.size() == 0)
            {
                this.events.add(event);
            }
            else
            {
                for (int i = 0; i< this.events.size(); i++)
                {
                    if ((!(this.events.get(i).getTitle().equals(event.getTitle()))) || (!(this.events.get(i).getTime().equals(event.getTime()))) || (!(this.events.get(i).getOrganiser().equals(event.getOrganiser()))))
                    {
                        this.events.add(event);
                        break;
                    }
                }
            }
        }
       	  			        	      	  		
    }			        	      	  		
	  			        	      	  		
    /**
     * This method deletes an Event from EventMananger's list of Events
     * @param event the Event instance
     */
    public void deleteEvent(Event event)	  			        	      	  		
    {	
        for (Agenda a: event.getAgenda())
        {
            this.items.remove(a);
        }
        this.events.remove(event);
    }
    
    /**
     * This method adds an AgendaItem to EventManager's list
     * @param A the Agenda instance
     */
    public void addItem(Agenda A)
    {
        boolean check = false;
        if (A != null) 			        	      	  		
        {	  			        	      	  			  			        	      	  			  			        	      	  		
          if (!(this.items.contains(A))) 			        	      	  		
          {	  			        	      	  		
            this.items.add(A);
          }	  			        	      	  		
        }
        
    }
	  			        	      	  		
    
    /**
     * This method deletes an AgendaItem from a specified Event 
     * @param event the Event instance
     * @param A the Agenda instance
     */
    public void deleteAgendaItem(Event event, Agenda A)
    {
        if ((event.getAgenda().contains(A)) && (this.items.contains(A)))
        {
            event.getAgenda().remove(A);
            this.items.remove(A);
        }
    }
    
    /**
     * This method associates a User to an Event
     * @param event the Event instance
     * @param user the user instance
     */
    public void associateUserToEvent(Event event, User user)	  			        	      	  		
    {	  
        if ((this.events.contains(event)) && (this.users.contains(user)))
        {
            event.setOrganiser(user); 
        }
    }	  			        	      	  		
	
    /**
     * This method loads all Events from a file 
     */
    public void loadEvents()	  			        	      	  		
    {	      
        
        try
        {          
            BufferedReader fileRead = new BufferedReader(new FileReader("User.csv"));     
            String line = fileRead.readLine(); 
            int s = 0;
            while (line  != null)
            {	     
                String[] hi = line.split(",");
                boolean bo = false;
                int lines = (hi.length-6);
                Event ps = new Event();
                if (this.events.size() > 0)
                {
                    for (int i = 0; i<this.events.size(); i++)
                    {
                        if ((this.events.get(i).getTitle().equals(hi[0])) && (this.events.get(i).getOrganiser().getName().equals(hi[1])) && (this.events.get(i).getDate().equals(LocalDate.parse(hi[2]))))
                        {                        
                               bo = true;
                               ps = this.events.get(i);
                               break;
     
                        }
                    }

                }
                
                if (bo == false)
                {

                   Event newEvent = new Event();
                   newEvent.setTitle(hi[0]);
                   boolean f = false;
                   for (User u: this.users)
                   {
                      if (u.toString().equals(hi[1]))
                      {
                          f = true;                          
                          newEvent.setOrganiser(u);
                          break;
                      }
                   }
                   if (f == false)
                   {
                        User us = new User (hi[1]);
                         newEvent.setOrganiser(us);
                         this.users.add(us);
                   }
                    
                   newEvent.setDate(LocalDate.parse(hi[2]));
                   newEvent.setTime(LocalTime.parse(hi[3]));
                   newEvent.setLocation(hi[4]);
                   newEvent.setCapacity(Integer.parseInt(hi[5]));
                 if (lines > 0)
                    {
                        for (int i = 6; i<hi.length; i++)
                        {  
                            if (!(hi[i].equals("[]")))
                            {
                            Agenda a = new Agenda();
    
                             String[] lp = hi[i].split("");
                            String lp2 = "";
                            for(int lp3 = 1; lp3<lp.length; lp3++)
                            {
                                lp2 += lp[lp3];
                            }
                            a.setTitle(lp2);
                            
                           
                            String[] p = hi[i+1].split("");
                            String y = "";
                            for(int g = 0; g<5; g++)
                            {
                                y += p[g];  

                            }
                            a.setTime(LocalTime.parse(y));

                           this.addItem(a); 
                         
                          this.addAgendaItem(newEvent, a);
                            i++;
                            }

                        }
                        
                    }
                    this.addEvent(newEvent);
                 
                }
                else if (bo == true)
                {
                    try
                    {
                       
                        if (ps.getAgenda().size() != (lines/2))
                        {
                            for (int h = 6; h<hi.length; h++)
                              {  
                                  Agenda a = new Agenda();

                                    String[] lp = hi[h].split("");
                                    String lp2 = "";
                                    for(int lp3 = 1; lp3<lp.length; lp3++)
                                    {
                                        lp2 += lp[lp3];
                                    }
                                    a.setTitle(lp2);
                                
                                      String[] p = hi[h+1].split("");
                                      String y = "";
                                      for(int g = 0; g<5; g++)
                                      {
                                          y += p[g];  

                                      }
                                      a.setTime(LocalTime.parse(y));
                                 
                                  this.addItem(a);   
                                 this.addAgendaItem(ps, a);
                                   h++;

                                  }
                        }

                    }
                    catch(Exception p)
                    {
                       // System.out.println("HERE9");
                    }
                }
               
                line = fileRead.readLine();

            }
            
            fileRead.close();
        }
        catch(Exception e)
        {
            System.out.println("HELP");
        }


    }
    
    /**
     * This method adds an AgendaItem to a specified Event if it exists inside the EventManangers list of items
     * @param event the Event instance
     * @param A the Agenda instance
     */
    public void addAgendaItem(Event event, Agenda A)	  			        	      	  		
    {
        boolean check = false;
        if (A != null) 			        	      	  		
        {
          if (this.items.contains(A))		        	      	  		
          {
              check = true;
 			        	      	  		
          }	  			        	      	  		
        }
        
        if (check == true)
        {
            if (event.getAgenda().size() == 0)
            {
                event.getAgenda().add(A);
            }
            else
            {
                boolean bo = false;
                for (int i = 0; i< event.getAgenda().size(); i++)
                {
                    if ((event.getAgenda().get(i).getTitle().equals(A.getTitle())) && (event.getAgenda().get(i).getTime().equals(A.getTime())))
                    {
                        bo = true;
                        break;
                    }
                   
                }
                if (bo == false)
                {
                    event.getAgenda().add(A);
                }
            }
        }
    }
    
    /**
     * This method updates an existing event objects attributes
     * @param event the Event instance
     * @param title the title of an Event
     * @param organiser the Organiser/User of an Event
     * @param date the date of an Event
     * @param time the time of an Event
     * @param location the location of an Event
     * @param capacity the capacity of an Event
     */
    public void updateEvent(Event event, String title, User organiser, String date, String time, String location, int capacity)	  			        	      	  		
    {	     
        event.setTitle(title);	  			        	      	  		
        event.setOrganiser(organiser);	  			        	      	  		
        event.setDate(LocalDate.parse(date));	  			        	      	  		
        event.setTime(LocalTime.parse(time));	  			        	      	  		
        event.setLocation(location);	  			        	      	  		
        event.setCapacity(capacity);
    }	
	  			        	      	  		
    /**
     * This method saves a specified Event onto a file 
     * @param event the Event instance wanting to be saved 
     */
    public void saveEvent(Event event)	  			        	      	  		
    {	     
        try	  			        	      	  		
        {  
            BufferedReader file = new BufferedReader(new FileReader("User.csv"));
            BufferedWriter fileWrite = new BufferedWriter(new FileWriter("User.csv", true));
            
            boolean bo = false;
            String l = file.readLine(); 
            while (l  != null)
            {	  			        	      	  			  			        	      	  		  			        	      	  		   
                String[] hi = l.split(",");
                int lines = (hi.length-6);
                if (((event.getTitle().equals(hi[0])) && (event.getTime().equals(LocalTime.parse(hi[3])))) && (event.getAgenda().size() == (lines/2)))
                {
                    bo = true;                    
                } 
                l = file.readLine();
            }
            
            if ((bo == false) && (event != null))
            {      
                fileWrite.write(event.getTitle()+","+event.getOrganiser().getName()+","+event.getDate().toString()+","+event.getTime().toString()+","+event.getLocation()+","+Integer.toString(event.getCapacity())+","+event.getAgenda().toString()+System.lineSeparator());     
            }
            fileWrite.close(); 	
            file.close();	
        }	  			        	      	  		
        catch(Exception e1)	  			        	      	  		
        {	  			        	      	  		
            System.out.println("save event doesnt work");	  			        	      	  		
        }	  			        	      	  		
	  			        	      	  		
    } 
    
    
    //BONUS 

    
    //order event by date 

    /**
     * This method orders all the events inside the EventManager's list by date
     */
    public void orderByDate()
    {
        Collections.sort(this.events, (a, b) -> a.getDate().compareTo(b.getDate()));
    }
    
    //take in string - find event 

    /**
     * This method will take a string and search through all the events in EventManager for the same title name
     * @param event the event instance
     * @return this.events.get(location) the event a user is looking for
     */
    public Event findEvent(String event)
    {
        int location = 0;
        for (int i = 0; i< this.events.size(); i++)
        {
            if ((this.events.get(i).getTitle().equals(event)) && (event != null))
            {
                location = i;
                break;
            }
        }
        return this.events.get(location);
    }
	  			        	      	  		
	  			        	      	  		
}
   		        	      	  		
	  			        	      	  	
