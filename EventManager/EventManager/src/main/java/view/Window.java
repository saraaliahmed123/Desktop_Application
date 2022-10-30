/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;




import com.mycompany.eventmanager.Agenda;
import com.mycompany.eventmanager.EventManager;
import controller.Main;
import com.mycompany.eventmanager.User;
import com.mycompany.eventmanager.Event;
import view.Menu;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import view.Menu;

/**
 *
 * @author Sara9
 */
public class Window
{
    
    private JFrame frame = new JFrame();
    
    private Menu menus = new Menu();
    private Content con = new Content();  
    private Footer foo = new Footer();
    
    private Add addEvent;
    private Add editEvent;
    private AddAgenda addAgenda;
    private AddAgenda editAgenda;
    private addUser newUser;
    
    /**
     *
     */
    public Window() 
    {
        
        frame.setTitle("Window");
        frame.setBounds(500,200,580,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(menus.getPanel(), BorderLayout.NORTH);
        
        
        frame.add(con);
        frame.add(foo, BorderLayout.SOUTH);     
        
    }

    /**
     * Frame attribute getter
     * @return The main JFrame
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Frame attribute setter
     * @param frame The main JFrame
     */
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    /**
     * Menu attribute getter
     * @return the main Menu
     */
    public Menu getMenus() {
        return menus;
    }

    /**
     * Menu attribute setter
     * @param menus the main Menu
     */
    public void setMenus(Menu menus) {
        this.menus = menus;
    }

    /**
     * Con attribute getter
     * @return the main Content
     */
    public Content getCon() {
        return con;
    }

    /**
     * Con attribute setter
     * @param con the main Content
     */
    public void setCon(Content con) {
        this.con = con;
    }

    /**
     * Foo attribute getter
     * @return The main Footer
     */
    public Footer getFoo() {
        return foo;
    }

    /**
     * Foo attribute setter
     * @param foo The main Footer
     */
    public void setFoo(Footer foo) {
        this.foo = foo;
    }

    /**
     * AddEvent attribute getter
     * @return The AddEvent popup
     */
    public Add getAddEvent() {
        return addEvent;
    }

    /**
     * AddEvent attribute setter
     * @param addEvent The AddEvent popup
     */
    public void setAddEvent(Add addEvent) {
        this.addEvent = addEvent;
    }

    /**
     * EditEvent attribute getter
     * @return The EditEvent popup
     */
    public Add getEditEvent() {
        return editEvent;
    }

    /**
     * EditEvent attribute setter
     * @param editEvent The EditEvent popup
     */
    public void setEditEvent(Add editEvent) {
        this.editEvent = editEvent;
    }

    /**
     * AddAgenda attribute getter
     * @return The AddAgenda popup
     */
    public AddAgenda getAddAgenda() {
        return addAgenda;
    }

    /**
     * AddAgenda attribute setter
     * @param addAgenda The AddAgenda popup
     */
    public void setAddAgenda(AddAgenda addAgenda) {
        this.addAgenda = addAgenda;
    }

    /**
     * EditAgenda attribute getter
     * @return The EditAgenda popup
     */
    public AddAgenda getEditAgenda() {
        return editAgenda;
    }

    /**
     * EditAgenda attribute setter
     * @param editAgenda The EditAgenda popup
     */
    public void setEditAgenda(AddAgenda editAgenda) {
        this.editAgenda = editAgenda;
    }

    /**
     * NewUser attribute getter
     * @return The NewUser popup
     */
    public addUser getNewUser() {
        return newUser;
    }

    /**
     * NewUser attribute getter
     * @param newUser The NewUser popup
     */
    public void setNewUser(addUser newUser) {
        this.newUser = newUser;
    }

   


    
    
    
    
        
    
     			        	      	  	
    
    
    
    
     
}
