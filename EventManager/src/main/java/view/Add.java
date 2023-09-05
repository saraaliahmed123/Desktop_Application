/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mycompany.eventmanager.EventManager;
import com.mycompany.eventmanager.User;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 * This class is the popup to add an Event
 * @author Sara9
 */
public class Add extends JFrame{
    
    private JPanel form = new JPanel();
    private JPanel buttons = new JPanel();
    
    private JButton addWindow = new JButton("Add");
    private JButton clear = new JButton("Clear");
    private JButton newUser = new JButton("+");
    
    private JLabel titlee = new JLabel("Title: ");
    private JLabel organiser = new JLabel("Organiser: ");
    private JLabel date = new JLabel("Date: ");
    private JLabel time = new JLabel("Time: ");
    private JLabel locationn = new JLabel("Location: ");
    private JLabel capacity = new JLabel("Capacity: ");
    
    private JTextField field = new JTextField(20);
    private JTextField field2 = new JTextField(20);
    private JTextField field3= new JTextField(20);  
    private JTextField field4= new JTextField(20);
    private JTextField field5= new JTextField(20);
    private JTextField field6= new JTextField(20);
    
    private JComboBox list = new JComboBox();

    /**
     * This is the constructor that created the popup JFrame
     */
    public Add()
    {
        for (User a: EventManager.getInstnace().getUsers())
       {
         if (!(list.getItemCount() == (EventManager.getInstnace().getUsers().size())))
         {
         list.addItem(a.getName());
         } 
       }
        
        list.setPreferredSize(new Dimension(160,30));
        newUser.setPreferredSize(new Dimension(30,30));
        newUser.setMargin(new Insets(1,1,1,1));
        Font newButtonFont=new Font(newUser.getFont().getName(),newUser.getFont().getStyle(),12);
        newUser.setFont(newButtonFont);
        
        this.setBounds(500,200,240,370);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        
        this.add(form);
        this.add(buttons, BorderLayout.SOUTH);
        
        buttons.add(addWindow);
        buttons.add(clear);
        
        form.add(titlee);
        form.add(field);
        
        form.add(organiser);
        form.add(list);
        form.add(newUser);
        
        form.add(date);
        form.add(field3);
        field3.setText("YYYY-MM-DD");
        form.add(time);
        form.add(field4);
        field4.setText("HH:MM");
        form.add(locationn);
        form.add(field5);
        form.add(capacity);
        form.add(field6);
    }
    
    /**
     * newUser attribute getter
     * @return the JButton to add a new user 
     */
    public JButton getNewUser() {
        return newUser;
    }

    /**
     * newUser attribute setter
     * @param newUser newUser JButton created
     */
    public void setNewUser(JButton newUser) {
        this.newUser = newUser;
    }

    /**
     * List attribute getter
     * @return the JComboBox that contains the list of Users
     */
    public JComboBox getList() {
        return list;
    }

    /**
     * List attribute setter
     * @param list the JComboBox that contains the list of Users
     */
    public void setList(JComboBox list) {
        this.list = list;
    }
    
    /**
     * Form attribute getter
     * @return the main JPanel within the JFrame
     */
    public JPanel getForm() {
        return form;
    }

    /**
     * Form attribute setter
     * @param form the main JPanel within the JFrame
     */
    public void setForm(JPanel form) {
        this.form = form;
    }

    /**
     * Buttons attribute getter
     * @return all the buttons within the JFrame
     */
    public JPanel getButtons() {
        return buttons;
    }

    /**
     * Buttons attribute setter
     * @param buttons all the buttons within the JFrame
     */
    public void setButtons(JPanel buttons) {
        this.buttons = buttons;
    }

    /**
     * addWindow attribute getter
     * @return JButton that adds an Event
     */
    public JButton getAddWindow() {
        return addWindow;
    }

    /**
     * addWindow attribute setter
     * @param addWindow JButton to add an Event to a JPanel
     */
    public void setAddWindow(JButton addWindow) {
        this.addWindow = addWindow;
    }

    /**
     * Clear attribute getter
     * @return JButton that clears the text fields
     */
    public JButton getClear() {
        return clear;
    }

    /**
     * Clear attribute setter
     * @param clear JButton that clears the text fields
     */
    public void setClear(JButton clear) {
        this.clear = clear;
    }

    /**
     * Title attribute getter
     * @return return the title JLabel
     */
    public JLabel getTitlee() {
        return titlee;
    }

    /**
     * Title attribute setter
     * @param titlee the title JLabel
     */
    public void setTitlee(JLabel titlee) {
        this.titlee = titlee;
    }

    /**
     * Organiser attribute getter 
     * @return the JLabel with organiser
     */
    public JLabel getOrganiser() {
        return organiser;
    }

    /**
     * Organiser attribute getter 
     * @param organiser the JLabel with organiser
     */
    public void setOrganiser(JLabel organiser) {
        this.organiser = organiser;
    }

    /**
     * Date attribute setter
     * @return The JLabel with date 
     */
    public JLabel getDate() {
        return date;
    }

    /**
     * Date attribute setter
     * @param date The JLabel with date 
     */
    public void setDate(JLabel date) {
        this.date = date;
    }

    /**
     * Time attribute getter
     * @return the JLabel with time
     */
    public JLabel getTime() {
        return time;
    }

    /**
     * Time attribute setter
     * @param time the JLabel with time
     */
    public void setTime(JLabel time) {
        this.time = time;
    }

    /**
     * Location attribute getter
     * @return the JLabel with location
     */
    public JLabel getLocationn() {
        return locationn;
    }

    /**
     * Location attribute setter
     * @param locationn the JLabel with location
     */
    public void setLocationn(JLabel locationn) {
        this.locationn = locationn;
    }

    /**
     * Capacity attribute getter
     * @return the JLabel with capacity
     */
    public JLabel getCapacity() {
        return capacity;
    }

    /**
     * Capacity attribute setter
     * @param capacity the JLabel with capacity
     */
    public void setCapacity(JLabel capacity) {
        this.capacity = capacity;
    }

    /**
     * Field attribute getter
     * @return the JTextField that will take input from the user
     */
    public JTextField getField() {
        return field;
    }

    /**
     * Field attribute setter
     * @param field the JTextField that will take input from the user
     */
    public void setField(JTextField field) {
        this.field = field;
    }

    /**
     * Field2 attribute getter
     * @return the JTextField that will take input from the user
     */
    public JTextField getField2() {
        return field2;
    }

    /**
     * Field2 attribute setter
     * @param field2 the JTextField that will take input from the user
     */
    public void setField2(JTextField field2) {
        this.field2 = field2;
    }

    /**
     * Field3 attribute getter
     * @return the JTextField that will take input from the user
     */
    public JTextField getField3() {
        return field3;
    }

    /**
     * Field3 attribute setter
     * @param field3 the JTextField that will take input from the user
     */
    public void setField3(JTextField field3) {
        this.field3 = field3;
    }

    /**
     * Field4 attribute getter
     * @return the JTextField that will take input from the user
     */
    public JTextField getField4() {
        return field4;
    }

    /**
     * Field4 attribute setter
     * @param field4 the JTextField that will take input from the user
     */
    public void setField4(JTextField field4) {
        this.field4 = field4;
    }

    /**
     * Field5 attribute getter
     * @return the JTextField that will take input from the user
     */
    public JTextField getField5() {
        return field5;
    }

    /**
     * Field5 attribute setter
     * @param field5 the JTextField that will take input from the user
     */
    public void setField5(JTextField field5) {
        this.field5 = field5;
    }

    /**
     * Field6 attribute getter
     * @return the JTextField that will take input from the user
     */
    public JTextField getField6() {
        return field6;
    }

    /**
     * Field6 attribute setter
     * @param field6 the JTextField that will take input from the user
     */
    public void setField6(JTextField field6) {
        this.field6 = field6;
    }

    
    
    
}
