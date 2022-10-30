/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class is the popup to add an Agenda
 * @author Sara9
 */
public class AddAgenda extends JFrame{
    
    private JPanel form = new JPanel();
    private JPanel buttons = new JPanel();
    
    private JButton addWindowAgenda = new JButton("Add");
    private JButton clear = new JButton("Clear");
    
    private JLabel title2 = new JLabel("Title: ");

    private JLabel time = new JLabel("Time: ");
 
    private JTextField field = new JTextField(20);
    private JTextField field2 = new JTextField(20);
   
    /**
     *
     */
    public AddAgenda()
    {
        this.setBounds(500,200,240,180);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        
        this.add(form);
        this.add(buttons, BorderLayout.SOUTH);
        
        buttons.add(addWindowAgenda);
        buttons.add(clear);
        
        form.add(title2);
        form.add(field);
       
        form.add(time);
        form.add(field2);
       
    }

    /**
     * Form attribute getter
     * @return the JPanel containing all the elements
     */
    public JPanel getForm() {
        return form;
    }

    /**
     * Form attribute setter
     * @param form the JPanel containing all the elements
     */
    public void setForm(JPanel form) {
        this.form = form;
    }

    /**
     * Buttons attribute getter
     * @return the JPanel with all the buttons
     */
    public JPanel getButtons() {
        return buttons;
    }

    /**
     * Buttons attribute setter
     * @param buttons the JPanel with all the buttons
     */
    public void setButtons(JPanel buttons) {
        this.buttons = buttons;
    }

    /**
     * AddWindowAgenda attribute getter
     * @return the JButton that adds an Agenda
     */
    public JButton getAddWindowAgenda() {
        return addWindowAgenda;
    }

    /**
     * AddWindowAgenda attribute setter
     * @param addWindowAgenda the JButton that adds an Agenda
     */
    public void setAddWindowAgenda(JButton addWindowAgenda) {
        this.addWindowAgenda = addWindowAgenda;
    }

    /**
     * Clear attribute getter
     * @return the JButton that clears the text fields
     */
    public JButton getClear() {
        return clear;
    }

    /**
     * Clear attribute setter
     * @param clear the JButton that clears the text fields
     */
    public void setClear(JButton clear) {
        this.clear = clear;
    }

    /**
     * Title2 attribute getter
     * @return The JLabel with title
     */
    public JLabel getTitle2() {
        return title2;
    }

    /**
     * Title2 attribute setter
     * @param title2 The JLabel with title
     */
    public void setTitle2(JLabel title2) {
        this.title2 = title2;
    }

    /**
     * Time attribute getter
     * @return The JLabel with time
     */
    public JLabel getTime() {
        return time;
    }

    /**
     * Time attribute setter
     * @param time The JLabel with time
     */
    public void setTime(JLabel time) {
        this.time = time;
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
    
    
    
}