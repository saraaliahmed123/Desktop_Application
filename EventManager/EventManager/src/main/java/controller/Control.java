/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mycompany.eventmanager.Agenda;
import com.mycompany.eventmanager.Event;
import com.mycompany.eventmanager.EventManager;
import com.mycompany.eventmanager.User;
import view.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import javax.swing.JOptionPane;
import view.Add;
import view.AddAgenda;
import view.AgendaPanel;
import view.EventPanel;
import view.addUser;

/**
 * This is a class that acts as part of the controller for an MVC approach
 * @author Sara9
 */
public class Control implements ActionListener{
    
    private Window win = new Window();
    private EventManager eventManager = EventManager.getInstnace();
    
    private HashMap<Event, EventPanel> ep = new HashMap<Event, EventPanel>();
    
    private HashMap<Agenda, AgendaPanel> ap = new HashMap<Agenda, AgendaPanel>();
    
    /**
     * 
     */
    public Control()
    {
        win.getMenus().getQuit().addActionListener(this);
        win.getMenus().getQuit().setActionCommand("quit");
        
        win.getMenus().getAdd().addActionListener(this);
        win.getMenus().getAdd().setActionCommand("add");
        
        win.getMenus().getSave().addActionListener(this);
        win.getMenus().getSave().setActionCommand("save");
        
        win.getMenus().getEdit2().addActionListener(this);
        win.getMenus().getEdit2().setActionCommand("edit");
        
        win.getMenus().getDelete().addActionListener(this);
        win.getMenus().getDelete().setActionCommand("delete");
        
        win.getMenus().getLoad().addActionListener(this);
        win.getMenus().getLoad().setActionCommand("load");
        
        win.getFoo().getFooter().getAdd().addActionListener(this);
        win.getFoo().getFooter().getAdd().setActionCommand("add");
        
        win.getFoo().getFooter().getEdit().addActionListener(this);
        win.getFoo().getFooter().getEdit().setActionCommand("edit");
        
        win.getFoo().getFooter().getSave().addActionListener(this);
        win.getFoo().getFooter().getSave().setActionCommand("save");
        
        win.getFoo().getFooter().getDelete().addActionListener(this);
        win.getFoo().getFooter().getDelete().setActionCommand("delete");
        
        win.getFoo().getFooter().getOrder().addActionListener(this);
        win.getFoo().getFooter().getOrder().setActionCommand("order");
        
        win.getCon().getAgenda().addActionListener(this);
        win.getCon().getAgenda().setActionCommand("addAgenda");
        
        win.getCon().getSearchbut().addActionListener(this);
        win.getCon().getSearchbut().setActionCommand("searhBox");

    }
    
    /**
     * This method deals with all the ActionCommands and allows for interactivity between the view and the model
     * @param e
     */
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("quit"))
        {
            System.exit(0);
        }
        else if (e.getActionCommand().equals("add"))
        {
            win.setAddEvent(new Add());
            
            win.getAddEvent().getNewUser().addActionListener(this);
            win.getAddEvent().getNewUser().setActionCommand("newUser");
            
            win.getAddEvent().getAddWindow().addActionListener(this);
            win.getAddEvent().getAddWindow().setActionCommand("addEvent");
            
            win.getAddEvent().getClear().addActionListener(this);
            win.getAddEvent().getClear().setActionCommand("clear");
        }
        else if (e.getActionCommand().equals("addAgenda"))
        {
            win.setAddAgenda(new AddAgenda());
            
            win.getAddAgenda().getAddWindowAgenda().addActionListener(this);
            win.getAddAgenda().getAddWindowAgenda().setActionCommand("addAgendapop");
            
            win.getAddAgenda().getClear().addActionListener(this);
            win.getAddAgenda().getClear().setActionCommand("clear");
        }
        else if (e.getActionCommand().equals("addEvent"))
        { 
            
            try 
            {
                Event a = new Event(win.getAddEvent().getField().getText(), getUser() , LocalDate.parse(win.getAddEvent().getField3().getText()), LocalTime.parse(win.getAddEvent().getField4().getText()), win.getAddEvent().getField5().getText(), Integer. parseInt(win.getAddEvent().getField6().getText()));
                eventManager.addEvent(a);
            }
            catch(Exception ev)
            {
                JOptionPane.showMessageDialog(win.getFrame(), "One of the fields has not been entered correctly", "Error", JOptionPane.ERROR_MESSAGE);
                Event a = new Event(win.getAddEvent().getField().getText(), getUser() , LocalDate.parse(win.getAddEvent().getField3().getText()), LocalTime.parse(win.getAddEvent().getField4().getText()), win.getAddEvent().getField5().getText(), Integer. parseInt(win.getAddEvent().getField6().getText()));
                eventManager.addEvent(a);
            }

           win.getCon().getEventsPanel().removeAll();
            win.getAddEvent().dispose();
            JOptionPane.showMessageDialog(win.getFrame(), "loading...", "Please wait", JOptionPane.PLAIN_MESSAGE);
            updateEventPanel();
            
        }
        else if (e.getActionCommand().equals("addAgendapop"))
        {
            
            for (Event et : ep.keySet())
            { 
                if (ep.get(et).getCheckBox().isSelected())
                {
                    
                    try 
                    {
                        Agenda ag = new Agenda(win.getAddAgenda().getField().getText(), LocalTime.parse(win.getAddAgenda().getField2().getText()));
                        eventManager.addItem(ag);
                        eventManager.addAgendaItem(et, ag);
                        
                    }
                    catch(Exception ev)
                    {
                        JOptionPane.showMessageDialog(win.getFrame(), "One of the fields has not been entered correctly", "Error", JOptionPane.ERROR_MESSAGE);
                        Agenda ag = new Agenda(win.getAddAgenda().getField().getText(), LocalTime.parse(win.getAddAgenda().getField2().getText()));
                        eventManager.addItem(ag);
                        eventManager.addAgendaItem(et, ag);
                        
                    }
                    break;
                

                }
            }
            win.getAddAgenda().dispose();
            JOptionPane.showMessageDialog(win.getFrame(), "loading...", "Please wait", JOptionPane.PLAIN_MESSAGE);
            updateAgendaPanel();
        }
        else if (e.getActionCommand().equals("moreinfoevent"))
        {  
            
            for (Event et : ep.keySet())
            {
                if (ep.get(et).getCheckBox().isSelected())
                {
                    win.getCon().getEvent().setText("Title: "+et.getTitle()+System.lineSeparator()+"Oragniser: "+et.getOrganiser().toString()+System.lineSeparator()+"Date: "+et.getDate()+System.lineSeparator()+"Time: "+et.getTime()+System.lineSeparator()+"Location: "+et.getLocation()+System.lineSeparator()+"Capacity: "+et.getCapacity());
                    
                    updateAgendaPanel();
                    break;
                }
            }
        }
        else if (e.getActionCommand().equals("newUser"))
        {
            win.setNewUser(new addUser());
            
            win.getNewUser().getAddWindowUser().addActionListener(this);
            win.getNewUser().getAddWindowUser().setActionCommand("newUseradd");

        }
        else if (e.getActionCommand().equals("newUseradd"))
        {
            if (eventManager.getUsers().size() > 0)
            {
                User c = null;
                
                for (User et : eventManager.getUsers())
                {   
                    if (!(et.getName().equals(win.getNewUser().getFielduser().getText())))
                    {
                        c = new User(win.getNewUser().getFielduser().getText());
                        break;
                    }
                    
                }
                eventManager.getUsers().add(c);
                win.getAddEvent().getList().addItem(c.getName());
                if (win.getEditEvent() != null)
                {
                    win.getEditEvent().getList().addItem(c.getName());
                }

            }
            else
            {
                User u = new User(win.getNewUser().getFielduser().getText());
                eventManager.getUsers().add(u);
                win.getAddEvent().getList().addItem(u.getName());
            }

         win.getNewUser().dispose();

        }
        else if (e.getActionCommand().equals("edit"))
        {
         
            boolean agenda = false;
            for (Agenda ag: ap.keySet())
            {
                if (ap.get(ag).getCheckBox2().isSelected()) 
                {
                    agenda = true;
                    break;
                }
            }
            outer:
            for (Event et : ep.keySet())
            {
                if ((ep.get(et).getCheckBox().isSelected()) && (agenda == false))
                {
                    win.setEditEvent(new Add());
                    win.getEditEvent().getField().setText(et.getTitle());
                    win.getEditEvent().getField2().setText(et.getOrganiser().toString());
                    win.getEditEvent().getField3().setText(et.getDate().toString());
                    win.getEditEvent().getField4().setText(et.getTime().toString());
                    win.getEditEvent().getField5().setText(et.getLocation());
                    win.getEditEvent().getField6().setText(String.valueOf(et.getCapacity()));
                    break outer;

                }
                else if ((ep.get(et).getCheckBox().isSelected()) && (agenda == true))
                {
                    for (Agenda ag: ap.keySet())
                    {
                        if (ap.get(ag).getCheckBox2().isSelected()) 
                        {
                            win.setEditAgenda(new AddAgenda());
                            win.getEditAgenda().getField().setText(ag.getTitle());
                            win.getEditAgenda().getField2().setText(ag.getTime().toString());

                            win.getEditAgenda().getAddWindowAgenda().addActionListener(this);
                            win.getEditAgenda().getAddWindowAgenda().setActionCommand("update");
                            
                            win.getEditAgenda().getClear().addActionListener(this);
                            win.getEditAgenda().getClear().setActionCommand("clear");
                            break outer;
 
                        }
                    }
                }
                
            }
            if (win.getEditEvent() != null)
            {
                win.getEditEvent().getNewUser().addActionListener(this);
                win.getEditEvent().getNewUser().setActionCommand("newUser");

                win.getEditEvent().getAddWindow().addActionListener(this);
                win.getEditEvent().getAddWindow().setActionCommand("update");
                
                win.getEditEvent().getClear().addActionListener(this);
                win.getEditEvent().getClear().setActionCommand("clear");
            }
            
        }
        else if (e.getActionCommand().equals("update"))
        {
            
            boolean agenda = false;

            for (Agenda ag: ap.keySet())
            {
                if (ap.get(ag).getCheckBox2().isSelected()) 
                {
                    agenda = true;
                    break;    
                    
                }
            }
            outer:
            for (Event et : ep.keySet())
            {
                if ((ep.get(et).getCheckBox().isSelected()) && (agenda == false))
                {
                    eventManager.updateEvent(et, win.getEditEvent().getField().getText(), getUser(), win.getEditEvent().getField3().getText(), win.getEditEvent().getField4().getText(), win.getEditEvent().getField5().getText(), Integer.parseInt(win.getEditEvent().getField6().getText())); 
            
                    ep.put(et, ep.get(et));    
                    break outer;

                }
                else if ((ep.get(et).getCheckBox().isSelected()) && (agenda == true))
                {
                    for (Agenda ag: ap.keySet())
                    {
                        if (ap.get(ag).getCheckBox2().isSelected()) 
                        {
                            ag.setTitle(win.getEditAgenda().getField().getText());
                            ag.setTime(LocalTime.parse(win.getEditAgenda().getField2().getText()));
                            ap.put(ag, ap.get(ag));
                            break outer;
                        }
                    }
                    
                }
            }
            
           if (win.getEditAgenda() != null)
            { 
                updateAgendaPanel();
                win.getEditAgenda().dispose();
            }
            if (win.getEditEvent() != null)
            {
                updateEventPanel();
                win.getEditEvent().dispose();
            }
     
        }
        else if (e.getActionCommand().equals("save"))
        {
            for (Event et : ep.keySet())
            {
                if (ep.get(et).getCheckBox().isSelected()) 
                {
                    eventManager.saveEvent(et);
                    break;
                }
            }
            JOptionPane.showMessageDialog(win.getFrame(), "loading...", "Please wait", JOptionPane.PLAIN_MESSAGE);
        }
        else if (e.getActionCommand().equals("delete"))
        {
            boolean agenda = false;
            for (Agenda ag: ap.keySet())
            {
                if (ap.get(ag).getCheckBox2().isSelected()) 
                {
                    agenda = true;
                    break;
                }
            }
           outer:
           for (Event et : ep.keySet())
            {
                if ((ep.get(et).getCheckBox().isSelected()) && (agenda == false))
                {
                    eventManager.deleteEvent(et);
                    
                    ep.remove(et);
                
                    for (Agenda as: et.getAgenda())
                    {   
                        ap.remove(as);
                    }
                
                    updateEventPanel();
                    win.getCon().getEvent().setText("");
                    win.getCon().getAgendainfo().removeAll();
                    break outer;
                } 
                else if ((ep.get(et).getCheckBox().isSelected()) && (agenda == true))
                {
                    for (Agenda ag: ap.keySet())
                    {
                        if (ap.get(ag).getCheckBox2().isSelected()) 
                        {
                            et.getAgenda().remove(ag);
              
                            ap.remove(ag);
                  
                            updateAgendaPanel();
                            break outer;
                        } 
                    }
                }
            }
           win.getFrame().repaint();
           win.getFrame().revalidate();
        }
        else if (e.getActionCommand().equals("load"))
        {
            eventManager.loadEvents();
            JOptionPane.showMessageDialog(win.getFrame(), "loading...", "Please wait", JOptionPane.PLAIN_MESSAGE);
            updateEventPanel();
            updateAgendaPanel();

        }
        else if (e.getActionCommand().equals("searhBox"))
        {
            if (!(win.getCon().getField5().getText().equals("")))
            {
                win.getCon().getEventsPanel().removeAll();
                win.getCon().getEventsPanel().add(ep.get(eventManager.findEvent(win.getCon().getField5().getText())));
                updateAgendaPanel();
            }
            else
            {
                updateEventPanel();
            }
        }
        else if (e.getActionCommand().equals("order"))
        {
            eventManager.orderByDate();
            JOptionPane.showMessageDialog(win.getFrame(), "loading...", "Please wait", JOptionPane.PLAIN_MESSAGE);
            updateEventPanel();
            
        }
        else if (e.getActionCommand().equals("clear"))
        {
            if (win.getEditEvent() != null)
            {
                win.getEditEvent().getField().setText("");
                win.getEditEvent().getField3().setText("");
                win.getEditEvent().getField4().setText(""); 
                win.getEditEvent().getField5().setText(""); 
                win.getEditEvent().getField6().setText("");
            }
            if (win.getAddEvent() != null)
            {
                win.getAddEvent().getField().setText("");
                win.getAddEvent().getField3().setText("");
                win.getAddEvent().getField4().setText(""); 
                win.getAddEvent().getField5().setText(""); 
                win.getAddEvent().getField6().setText("");
            }
            if (win.getEditAgenda() != null)
            {
              win.getEditAgenda().getField().setText("");
              win.getEditAgenda().getField2().setText("");
            }
            if (win.getAddAgenda() != null)
            {
              win.getAddAgenda().getField().setText("");
              win.getAddAgenda().getField2().setText("");
            }
        }
        
    }
    
    /**
     * This method updates the JPanel that showcases all the Events as JPanels
     */
    public void updateEventPanel()
    {
        win.getCon().getEventsPanel().removeAll();
          
            for (Event et3 : eventManager.getEvents())
            {
                EventPanel epinstance = new EventPanel(et3.getTitle());
                ep.put(et3, epinstance);

                win.getCon().getEventsPanel().add(epinstance);  
                epinstance.getCheckBox().addActionListener(this);
                epinstance.getCheckBox().setActionCommand("moreinfoevent");
              
            }
        win.getFrame().repaint();
        win.getFrame().revalidate();
    }
    
    /**
     * This method updates the JPanel that showcases all the AgendaItems as JPanels
     */
    public void updateAgendaPanel()
    {
        win.getCon().getAgendainfo().removeAll();
        for (Event et : ep.keySet())
            { 
                if (ep.get(et).getCheckBox().isSelected())
                {
                    if (et.getAgenda().size() > 0)
                    {
                        
                        for (int i = 0; i< et.getAgenda().size(); i++)
                        {
                            AgendaPanel apinstance = new AgendaPanel(et.getAgenda().get(i).getTitle(), et.getAgenda().get(i).getTime().toString());
                       
                            ap.put(et.getAgenda().get(i), apinstance);
                            win.getCon().getAgendainfo().add(apinstance);
                       
                        }
                    }
                    else
                    {
                       win.getCon().getAgendainfo().removeAll(); 
                    }
                }
            }
       win.getFrame().repaint();
       win.getFrame().revalidate();
    }
    
    public User getUser()
    {
        User au = null;
        for (User et2 : eventManager.getUsers())
            { 
                if (et2.getName().equals(win.getAddEvent().getList().getSelectedItem()))
                {
                    au = et2;
                    break;
                }
            }
        return au;
    }
}
