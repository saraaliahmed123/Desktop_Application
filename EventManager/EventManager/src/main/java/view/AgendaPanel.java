/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * This class is the blueprint for an AgendaPanel
 * @author Sara9
 */
public class AgendaPanel extends JPanel{
    
    private JPanel eventTitle = new JPanel();
    private JPanel colour = new JPanel();
    private JLabel title = new JLabel("Title: ");
    private JLabel time = new JLabel("Time: ");
    private JCheckBox checkBox2 = new JCheckBox();
    
    /**
     * Constructor for creating an Agenda Panel
     * @param c Title for an Agenda
     * @param d Time for an Agenda
     */
    public AgendaPanel(String c, String d)
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        colour.setBackground(new Color(204-0-0));
        colour.add(checkBox2);
        checkBox2.setBackground(new Color(204-0-0));
        
        title.setText(title.getText()+c+System.lineSeparator());
        time.setText(time.getText()+d);
        
        title.setPreferredSize(new Dimension(290, 20));
        time.setPreferredSize(new Dimension(290, 20));
        eventTitle.add(title);
        eventTitle.add(time);
        
        this.setLayout(new BorderLayout());
        
        this.add(eventTitle);
        this.add(colour, BorderLayout.WEST);
        
        this.setBorder(blackline);
        
        this.setPreferredSize(new Dimension(330, 60));
    }

    /**
     * EventTitle attribute getter
     * @return the JPanel with all the content
     */
    public JPanel getEventTitle() {
        return eventTitle;
    }

    /**
     * EventTitle attribute setter
     * @param eventTitle the JPanel with all the content
     */
    public void setEventTitle(JPanel eventTitle) {
        this.eventTitle = eventTitle;
    }

    /**
     * Colour attribute getter
     * @return JPanel with a coloured background
     */
    public JPanel getColour() {
        return colour;
    }

    /**
     * Colour attribute setter
     * @param colour JPanel with a coloured background
     */
    public void setColour(JPanel colour) {
        this.colour = colour;
    }

    /**
     * Title attribute getter
     * @return The JLabel with title
     */
    public JLabel getTitle() {
        return title;
    }

    /**
     * Title attribute getter
     * @param title The JLabel with title
     */
    public void setTitle(JLabel title) {
        this.title = title;
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
     * CheckBox2 attribute getter
     * @return The CheckBox for an AgendaPanel
     */
    public JCheckBox getCheckBox2() {
        return checkBox2;
    }

    /**
     * CheckBox2 attribute setter
     * @param checkBox2 The CheckBox for an AgendaPanel
     */
    public void setCheckBox2(JCheckBox checkBox2) {
        this.checkBox2 = checkBox2;
    }
    
    
    
}


