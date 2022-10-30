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
 * This class is the blueprint for an Event
 * @author Sara9
 */
public class EventPanel extends JPanel{
    
    private JPanel eventTitle = new JPanel();
    private JPanel colour = new JPanel();
    private JLabel title = new JLabel();
    private JCheckBox checkBox = new JCheckBox();
    
    /**
     *
     * @param c
     */
    public EventPanel(String c)
    {
        colour.setBackground(new Color(255-51-51));
       // colour.setBackground(new Color(204-0-0));
        colour.add(checkBox);
        checkBox.setBackground(new Color(255-51-51));
      //  checkBox.setBackground(new Color(204-0-0));
       
        title.setText(c);
        eventTitle.add(title);
        
        this.setLayout(new BorderLayout());
        
        this.add(eventTitle);
        this.add(colour, BorderLayout.WEST);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        this.setBorder(blackline);
        
        this.setPreferredSize(new Dimension(120, 35));
    }

    /**
     * EventTitle attribute getter
     * @return The JPanel with the Event's title
     */

    public JPanel getEventTitle() {
        return eventTitle;
    }

    /**
     * EventTitle attribute setter
     * @param eventTitle The JPanel with the Event's title
     */
    public void setEventTitle(JPanel eventTitle) {
        this.eventTitle = eventTitle;
    }

    /**
     * Colour attribute getter
     * @return The JPanel with a colour
     */
    public JPanel getColour() {
        return colour;
    }

    /**
     * Colour attribute setter
     * @param colour The JPanel with a colour
     */
    public void setColour(JPanel colour) {
        this.colour = colour;
    }

    /**
     * Title attribute getter
     * @return JLabel with the title
     */
    public JLabel getTitle() {
        return title;
    }

    /**
     * Title attribute setter
     * @param title JLabel with the title
     */
    public void setTitle(JLabel title) {
        this.title = title;
    }

    /**
     * CheckBox attribute getter
     * @return The CheckBox for an EventPanel
     */
    public JCheckBox getCheckBox() {
        return checkBox;
    }

    /**
     * CheckBox attribute getter
     * @param checkBox he CheckBox for an EventPanel
     */
    public void setCheckBox(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }
    
    
    
}
