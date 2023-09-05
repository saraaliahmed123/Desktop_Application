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
 * This class is the popup to add a new User
 * @author Sara9
 */
public class addUser extends JFrame{
    
    private JPanel form = new JPanel();
    private JPanel buttons = new JPanel();
    
    private JButton addWindowUser = new JButton("Add");
    
    private JLabel nameuser = new JLabel("Name: ");

    private JTextField fielduser = new JTextField(20);
   
    /**
     *
     */
    public addUser()
    {
        this.setBounds(500,200,240,130);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        
        this.add(form);
        this.add(buttons, BorderLayout.SOUTH);
        
        buttons.add(addWindowUser);
        
        form.add(nameuser);
        form.add(fielduser);
       
    }

    /**
     * Form attribute getter
     * @return JPanel containing content
     */
    public JPanel getForm() {
        return form;
    }

    /**
     * Form attribute setter
     * @param form JPanel containing content
     */
    public void setForm(JPanel form) {
        this.form = form;
    }

    /**
     * Buttons attribute getter
     * @return JPanel containing the buttons
     */
    public JPanel getButtons() {
        return buttons;
    }

    /**
     * Buttons attribute setter
     * @param buttons JPanel containing the buttons
     */
    public void setButtons(JPanel buttons) {
        this.buttons = buttons;
    }

    /**
     * AddWindowUser attribute getter
     * @return The JButton to add a user
     */
    public JButton getAddWindowUser() {
        return addWindowUser;
    }

    /**
     * AddWindowUser attribute setter
     * @param addWindowUser The JButton to add a user
     */
    public void setAddWindowUser(JButton addWindowUser) {
        this.addWindowUser = addWindowUser;
    }

    /**
     * NameUser attribute getter
     * @return The JLabel with name
     */
    public JLabel getNameuser() {
        return nameuser;
    }

    /**
     * NameUser attribute setter
     * @param nameuser The JLabel with name
     */
    public void setNameuser(JLabel nameuser) {
        this.nameuser = nameuser;
    }

    /**
     * FieldUser attribute getter
     * @return The JTextField for a user to enter text
     */
    public JTextField getFielduser() {
        return fielduser;
    }

    /**
     * FieldUser attribute setter
     * @param fielduser The JTextField for a user to enter text
     */
    public void setFielduser(JTextField fielduser) {
        this.fielduser = fielduser;
    }

    
    
    
    
}
