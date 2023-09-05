/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTest;

import com.mycompany.eventmanager.Agenda;
import com.mycompany.eventmanager.Event;
import com.mycompany.eventmanager.EventManager;
import com.mycompany.eventmanager.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collections;

/**
 *
 * @author Sara9
 */
public class MainTest {
    
    public static void main(String[] args) {
        
        // P2R1 EventMananger instance
        System.out.println(testEventManangerExists());
        
        System.out.println(testEventsCanBeAddedToEventMananger());
        
        
        //P2R2 add event to eventmanager list of events
        System.out.println(testAddEventToEventMananger());
        
        System.out.println(testCantAddRepeatedEventToEventMananger());
        
        System.out.println(testNullCantAddedEventToEventMananger());
        
        
        //P2R3 delete event from eventmanager
        System.out.println(testEventDeletedFromEventManager());
        
        System.out.println(testEventDeletedFromEventManagerNullNotPassed());
        
        
        //P2R4 add agendaitem to arraylist in EventMananger
        System.out.println(testAddAgendaItemToEventMananger());
        
        System.out.println(testAgendaItemAddedToEventManangerNotRepeated());
        
        System.out.println(testNullNotAddedToAgendaItemList());
        
        
        //P2R5 delete agenda item from eventmanager and event
        System.out.println(testIfAgendaItemsDeleteFromEventMananger());
        
        System.out.println(testAgendaItemExistsInEventManager());
        
        System.out.println(testIfAgendaItemsDeleteFromEventManangerNullNotPassed());
        
        
        //P2R6 add User to single event 
        System.out.println(testUserAssociatedWithEvent());
        
        System.out.println(testUserAssociatedWithEventNotNull());

        System.out.println(testEventHasUser());
        
        
        //P2R7 load events from file
        System.out.println(testCanReadFile());
        
        System.out.println(testNewEventsCreatedLoadFile());
                
        System.out.println(testLoadExistingEvents());
        
        
        //P2R8 add agendaitem to single event
        System.out.println(testAddAgendaItemToEvent());
        
        System.out.println(testAddAgendaItemToEventNoNull());
        
        System.out.println(testAgendaItemOnlyAddedOnce());
         
        
        //P2R9 edit details of event 
        System.out.println(testEventDetailsHaveUpdated());
        
        System.out.println(testEventDetailsHaveUpdatedwithSame());
        
        
        //P2R10 save events to file
        System.out.println(testEventSavedOnCSVFile());
        
        System.out.println(testEventSavedOnCSVFileOnce());
        
        
        //P2B3: Filter or Sort a User’s Events and Items (e.g. by person, speaker, due date etc.)
        System.out.println(testSortEventsByDate());
        
        
        //P2B4: Find User’s Events and Items by word in the GUI. 
        System.out.println(testFindEventByWord());
                
        System.out.println(testFindEventByWordEmpty());
        
        
        
        
}   
    
    // P2R1 EventMananger instance
    public static boolean testEventManangerExists()
    {
        EventManager em = EventManager.getInstnace();
        boolean check = false;
        if (em.getEvents().size() == 0)
        {
            check = true;
        }
        System.out.println("1.1 Check if EventMananger exists: ");
        return (check);
    }
    
    public static boolean testEventsCanBeAddedToEventMananger()
    {
        EventManager em = EventManager.getInstnace();
        boolean check = false;
        User tt = new User("4398");
        Event e1 = new Event("Huehfw", tt, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
        em.addEvent(e1);
        if (em.getEvents().size() == 1)
        {
            check = true;
        }
        System.out.println("1.2 Check you are able to add Events to EventMananger: ");
        return (check);
    }
    
    //P2R2 add event to eventmanager list of events	
    public static boolean testAddEventToEventMananger()
    {
        EventManager em = EventManager.getInstnace();
        User Sara = new User("Sara");
        User Tim = new User("Tim");
        Event sup = new Event("g", Tim, LocalDate.parse("2020-10-10"), LocalTime.parse("10:50:02"), "hi", 20);
        Event sup2 = new Event("H7", Sara, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
        em.addEvent(sup);
        em.addEvent(sup2);
        boolean check = false;
        if (em.getEvents().size() > 0)
        {
            check = true;
        }
        System.out.println("2.1 Check can add Events to EventMananger list: ");
        return check;
    }
    
    public static boolean testCantAddRepeatedEventToEventMananger()
    {
        EventManager em = EventManager.getInstnace();
        User Sara2 = new User("Sara");
        Event sup23 = new Event("H6", Sara2, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
        int c = em.getEvents().size();
        em.addEvent(sup23);
        em.addEvent(sup23);
        boolean check = true;
        if (em.getEvents().size() != (c+1))
        {
            check = false;
        }
        System.out.println("2.2 Check can't add existing Events to EventMananger list: ");
        return check;
    }
    
    public static boolean testNullCantAddedEventToEventMananger()
    {
        EventManager em = EventManager.getInstnace();
        em.addEvent(null);
        boolean check = true;
        for (Event e: em.getEvents())
        {
            if (e == null)
            {
                check = false;
            }
        }
        System.out.println("2.3 Check can't add null Events to EventMananger list: ");
        return check;
    }
    
    //P2R3 delete event from eventmanager
    public static boolean testEventDeletedFromEventManager()
    {
        EventManager em = EventManager.getInstnace();
        boolean check = false; 
        Event del = new Event();
        int size = em.getEvents().size();
        em.addEvent(del);
        em.deleteEvent(del);
        if (size == em.getEvents().size())
        {
            check = true;
        }
        System.out.println("3.1 Check can delete Event from EventMananger: ");
        return check;
    }
    
    public static boolean testEventDeletedFromEventManagerNullNotPassed()
    {
        EventManager em = EventManager.getInstnace();
        boolean check = false; 
        try
        {
            em.deleteEvent(null);
            System.out.println("DELETE NULL?");
        }
        catch(Exception e)
        {
            check = true;
        }
        System.out.println("3.2 Check delete Event from EventMananger cant pass null: ");
        return check; 
    }
    
    //P2R4 add agendaitem to arraylist in EventMananger
    public static boolean testAddAgendaItemToEventMananger()
    {
        EventManager em = EventManager.getInstnace();
        Agenda a3 = new Agenda("83", LocalTime.parse("10:50:02"));
        Agenda b3 = new Agenda("83", LocalTime.parse("10:50:02"));
        em.addItem(a3);
        em.addItem(b3);
        boolean check = false;
        if (em.getItems().size() > 0)
        {
            check = true;
        }
        System.out.println("4.1 Check you can add AgendaItems to list in EventManager: ");
        return check;
    }
    
    public static boolean testAgendaItemAddedToEventManangerNotRepeated()
    {
        EventManager em = EventManager.getInstnace();
        Agenda a4 = new Agenda("83", LocalTime.parse("10:50:02"));
        int a = em.getItems().size();
        em.addItem(a4);
        em.addItem(a4);
        boolean check = true;
        if (em.getItems().size() != (a+1))
        {
            check = false;
        }
        System.out.println("4.2 Check you can't add repeated AgendaItems to list in EventManager: ");
        return check;
    }
    
    public static boolean testNullNotAddedToAgendaItemList()
    {
        EventManager em = EventManager.getInstnace();
        em.addItem(null);
        boolean check = true;
        for (Agenda A: em.getItems())
        {
            if (A == null)
            {
               check = false; 
            }
        }
        System.out.println("4.3 Check you dont add null to list in EventManager: ");
        return check;
    }
    
    //P2R5 delete agenda item from eventmanager and event
    public static boolean testIfAgendaItemsDeleteFromEventMananger() 
    {
        EventManager em = EventManager.getInstnace();
        Agenda a5 = new Agenda("83", LocalTime.parse("10:50:02"));
        em.addItem(a5);
        User Sara6 = new User("Sara");
        Event su6 = new Event("H5", Sara6, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
        su6.getAgenda().add(a5);
        int b = em.getItems().size();
        em.deleteAgendaItem(su6, a5);
        boolean check = false;
        if (em.getItems().size() == (b-1))
        {
            check = true;
        }
        System.out.println("5.1 Check AgendaItem deleted from list in EventMananger and Event: "); 
        return check;
    }
    
    public static boolean testAgendaItemExistsInEventManager()
    {
      EventManager em = EventManager.getInstnace();
      Agenda a8 = new Agenda("83", LocalTime.parse("10:50:02"));
      em.addItem(a8); 
      boolean check = false;
        if (em.getItems().size() > 0)
        {
            check = true;
        }
        System.out.println("5.2 Check AgendaItems exists in EventMananger: ");
        return check;
    }
    
    public static boolean testIfAgendaItemsDeleteFromEventManangerNullNotPassed()
    {
      EventManager em = EventManager.getInstnace();
      boolean check = false; 
      int size = em.getItems().size();
      Event delagenda = new Event();
      Agenda hey = new Agenda();
      em.addItem(hey);
      em.addAgendaItem(delagenda, hey);
      em.deleteAgendaItem(delagenda, null);
      if (delagenda.getAgenda().size() == 1)
      {
          check = true;
      }
      System.out.println("5.3 Check delete Event from EventMananger cant pass null: ");
      return check;   
    }
    
    //P2R6 add User to single event
    public static boolean testUserAssociatedWithEvent()
    {
      EventManager em = EventManager.getInstnace();
      User Sara9 = new User("Sara");
      Event su9 = new Event("56", Sara9, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
      em.associateUserToEvent(su9, Sara9);
      boolean check = false;
      if (su9.getOrganiser().equals(Sara9))
      {
          check = true;
      }
      System.out.println("6.1 Check User is associated with Event: ");
      return check;
     }
    
    public static boolean testUserAssociatedWithEventNotNull()
    {
      EventManager em = EventManager.getInstnace();
      User Sara9 = new User("Sara");
      Event su9 = new Event("56", Sara9, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
      em.associateUserToEvent(su9, null);
      boolean check = false;
      if (!(su9.getOrganiser().equals(null)))
      {
          check = true;
      }
      System.out.println("6.2 Check User is associated with Event: ");
      return check;
     }
    
    public static boolean testEventHasUser()
    {
      EventManager em = EventManager.getInstnace();
      User Sar = new User("Sara");
      Event su22 = new Event("90", Sar, LocalDate.parse("2120-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
      boolean check = false;
      if (su22.getOrganiser().equals(Sar))
      {
          check = true;
      }
      System.out.println("6.3 Check Event has single User");
      return check;
    }
    
    //P2R7 load events from file
    public static boolean testCanReadFile()
    {
        boolean check = false;
        try
        {
            BufferedReader f = new BufferedReader(new FileReader("User.csv"));
            check = true;
        }
        catch(Exception ex)
        {
            check = false;
        }
        System.out.println("7.1 Check can read file: ");
        return check;
    }
    
    public static boolean testNewEventsCreatedLoadFile()
    {
        boolean check = false;
        EventManager em = EventManager.getInstnace();
        User Sammy = new User("Sammy");
        Event eve = new Event("Hthr", Sammy, LocalDate.parse("2021-10-10"),LocalTime.parse("11:50:02"),  "london", 20);
        em.addEvent(eve);
        int val = em.getEvents().size();

        em.saveEvent(eve);
        em.deleteEvent(eve);
        
        em.loadEvents();

        if (em.getEvents().size() > val)
        {
            check = true;
        }
        System.out.println("7.2 Check can will instantiate Event if not found from file: ");
        return check;
        
    }
    
    public static boolean testLoadExistingEvents()
    {
        boolean check = false;
        EventManager em = EventManager.getInstnace(); 
        User Sam = new User("Sam");
        Event eve2 = new Event("986", Sam, LocalDate.parse("2020-10-10"),LocalTime.parse("10:50:02"),  "london", 20);
        em.addEvent(eve2);
        int val = em.getEvents().size();
        em.saveEvent(eve2);
        em.loadEvents();
        if (val == em.getEvents().size())
        {
            check = true;
        }
        //check no insance of event has been created 
        System.out.println("7.3 Check can load existing events from file: ");
        return check; 
        
    } 
    
    //P2R8 add agendaitem to single event
    public static boolean testAddAgendaItemToEvent()
    {
       boolean check = false;
       EventManager em = EventManager.getInstnace(); 
       Agenda ss = new Agenda("83", LocalTime.parse("10:50:02"));
       Event tt = new Event();
       em.addItem(ss);
       em.addAgendaItem(tt, ss);
       if (tt.getAgenda().size() == 1)
       {
           check = true;
       }
       
       System.out.println("8.1 Check can add AgendaItem to list in Event: ");
       return check;    
    }
    
    public static boolean testAddAgendaItemToEventNoNull()
    {
       boolean check = false;
       EventManager em = EventManager.getInstnace(); 
       Event tt = new Event();
       em.addAgendaItem(tt, null);
       if (tt.getAgenda().size() == 0)
       {
           check = true;
       }
       
       System.out.println("8.2 Check no null added as AgendaItem to list in Event: ");
       return check;    
    }
    
    public static boolean testAgendaItemOnlyAddedOnce()
    {
       boolean check = false;
       EventManager em = EventManager.getInstnace(); 
       Agenda ss = new Agenda("83", LocalTime.parse("10:50:02"));
       Event tt = new Event();
       em.addItem(ss);
       em.addAgendaItem(tt, ss);
       if (tt.getAgenda().size() == 1)
       {
           check = true;
       }
       
       System.out.println("8.3 Check can add AgendaItem to list in Event: ");
       return check; 
        
    }
    
    //P2R9 edit details of event 
    public static boolean testEventDetailsHaveUpdated()
    {
        boolean check = false;
        EventManager em = EventManager.getInstnace(); 
        Event tt = new Event();
        User Dave = new User("Dave");
        em.updateEvent(tt, "updated", Dave, "2020-10-10", "10:50:02", "kingston", 30);
        if (tt.getTitle().equals("updated"))
        {
            check = true;
        }
        System.out.println("9.1 Check Event details have been updated: ");
        return check;
    }
    
    public static boolean testEventDetailsHaveUpdatedwithSame()
    {
        boolean check = false;
        EventManager em = EventManager.getInstnace(); 
        User Dave = new User("Dave");
        Event tt = new Event("updated", Dave, LocalDate.parse("2020-10-10"), LocalTime.parse("10:50:02"), "kingston", 30);  
        em.updateEvent(tt, "updated", Dave, "2020-10-10", "10:50:02", "kingston", 30);
        if (tt.getTitle().equals("updated"))
        {
            check = true;
        }
        System.out.println("9.2 Check Event details have stayed the same: ");
        return check;
    }
    
    //P2R10 save events to file
    public static boolean testEventSavedOnCSVFile()
    {
        boolean check = false;
        EventManager ep = new EventManager();
        User James = new User("James");
        Event sam = new Event("sam", James, LocalDate.parse("2020-10-10"), LocalTime.parse("10:50:02"), "kingston", 30);
        ep.saveEvent(sam);
        try
        {
            BufferedReader newFile = new BufferedReader(new FileReader("User.csv"));
            String line = newFile.readLine();   
            while (line != null)
            {
                if (line.equals(sam.getTitle()+","+sam.getOrganiser().getName()+","+sam.getDate().toString()+","+sam.getTime().toString()+","+sam.getLocation()+","+Integer.toString(sam.getCapacity())+","+sam.getAgenda().toString()))
                {
                    check = true;
                }
                line = newFile.readLine();  
                
            }
        }
        catch(Exception ex)
        {
            
        }
        
        System.out.println("10.1 Check Event saved on csv: ");
        return check;  
    }
    
    
    public static boolean testEventSavedOnCSVFileOnce()
    {
        boolean check = false;
        EventManager em = EventManager.getInstnace();
        User James = new User("James");
        Event wow = new Event("wow", James, LocalDate.parse("2023-10-10"), LocalTime.parse("18:50:02"), "kgston", 30);
        em.saveEvent(wow);
        em.saveEvent(wow);
        int p = 0;
        try
        {
            BufferedReader newFile = new BufferedReader(new FileReader("User.csv"));
            String line = newFile.readLine();   
            while (line != null)
            {
                if (line.equals(wow.getTitle()+","+wow.getOrganiser().getName()+","+wow.getDate().toString()+","+wow.getTime().toString()+","+wow.getLocation()+","+Integer.toString(wow.getCapacity())+","+wow.getAgenda().toString()))
                {
                    p++;
                }
                line = newFile.readLine();  
            }
        }
        catch(Exception ex)
        {
            
        }
        
        if (p == 1)
        {
            check = true;
        }
        
        System.out.println("10.2 Check Event saved on csv only once: ");
        return check;  
    }
    
    //BONUS 
    
    //P2B3: Filter or Sort a User’s Events and Items (e.g. by person, speaker, due date etc.)
    public static boolean testSortEventsByDate()
    {
        EventManager em = EventManager.getInstnace();
        boolean check = false;
        em.orderByDate();
        for (int i = 0; i<em.getEvents().size();i++)
        {
            for (int j=0; j<em.getEvents().size();j++)
            {
                int p = em.getEvents().get(i).getDate().compareTo(em.getEvents().get(j).getDate());
                if (p == 0)
                {
                    check = true;
                }
            }
        }
        System.out.println("B3.1 Check Events sorted by Date: ");
        return check;
        
    }
            
    //P2B4: Find User’s Events and Items by word in the GUI. 
    public static boolean testFindEventByWord()
    {
       EventManager em = EventManager.getInstnace();
       boolean check = false;
       User James = new User("James");
       Event wow = new Event("wofwe", James, LocalDate.parse("2023-10-10"), LocalTime.parse("18:50:02"), "kgston", 30);
       em.addEvent(wow); 
       Event location = em.findEvent("wofwe");
       if (location.equals(wow))
       {
           check = true;
       }
       System.out.println("B4.1 Check can find Event by word: ");
       return check;
    }
    
    public static boolean testFindEventByWordEmpty()
    {
       EventManager em = EventManager.getInstnace();
       boolean check = false;
       Event wow = new Event();
       em.addEvent(wow); 
       try
       {
           em.findEvent("wofe");
       }
       catch(Exception e)
       {
           check = true;
       }
       System.out.println("B4.2 Check can't find Event with no title: ");
       return check;
    }
    

}


   