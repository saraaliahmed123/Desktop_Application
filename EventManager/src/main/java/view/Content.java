/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mycompany.eventmanager.Event;
import com.mycompany.eventmanager.EventManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.border.*;

/**
 * This class is the main content JPanel containing all the information
 * @author Sara9
 */
public class Content extends JPanel{
    
    //2 main panels
    private JPanel eventsPanel = new JPanel();
    private JPanel otherPanel = new JPanel();

    private JPanel eventsPanel2 = new JPanel();
    
    //panels inside otherpanel
    private JPanel search = new JPanel();
    private JPanel moreInfo = new JPanel();
    private JPanel agendainfo = new JPanel();
    
    //search panel
    private JLabel ep = new JLabel("My Event Planner ");
    private JTextField field5= new JTextField(10);
    private JButton searchbut = new JButton("");
    
    //moreinfo panel 
    private JTextArea event = new JTextArea(5,35);
    
    //add agenda item
    private JPanel agendabutton = new JPanel();
    private JButton agenda = new JButton("Add AgendaItem");
    
    /**
     *
     */
    public Content()
    {

        Border blackline = BorderFactory.createLineBorder(Color.black);
        Border red = BorderFactory.createLineBorder(Color.red);
        Border empty = BorderFactory.createEmptyBorder();
        
        eventsPanel2.setPreferredSize( new Dimension( 170, 390 ) );
        
        eventsPanel2.setBorder(blackline); 
        
        eventsPanel.setPreferredSize( new Dimension( 130, 1000 ) );
        
        eventsPanel2.setBorder(empty); 
        
        otherPanel.setPreferredSize( new Dimension( 375, 390 ) );

        this.add(eventsPanel2);
        this.add(otherPanel);
        
       eventsPanel2.add(eventsPanel);
        
      JScrollPane scroll = new JScrollPane(eventsPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scroll.setPreferredSize( new Dimension(170,385));
      

        eventsPanel2.add(scroll);
                
        agendainfo.setPreferredSize( new Dimension( 360, 1000 ) );
        moreInfo.setPreferredSize( new Dimension( 375, 140 ) );

        otherPanel.add(search);
        otherPanel.add(moreInfo);
        otherPanel.add(agendainfo);
        
        
        JScrollPane scroll2 = new JScrollPane(agendainfo, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll2.setPreferredSize( new Dimension(375,203));
        otherPanel.add(scroll2);
        
        
        search.setBorder(blackline);
        moreInfo.setBorder(blackline);
        agendainfo.setBorder(blackline);
        
        search.add(ep);
        search.add(field5);
        
        searchbut.setPreferredSize(new Dimension(15, 15));
        
        search.add(searchbut);
        
        moreInfo.add(event);
        
        agendabutton.setLayout(new BorderLayout());
        agendabutton.add(agenda, BorderLayout.EAST);
        
        moreInfo.add(agendabutton);
         
        
    }

    /**
     * EventPanel attribute getter
     * @return the JPanel that displays all the EventPanels
     */
    public JPanel getEventsPanel() {
        return eventsPanel;
    }

    /**
     * EventPanel attribute setter
     * @param eventsPanel the JPanel that displays all the EventPanels
     */
    public void setEventsPanel(JPanel eventsPanel) {
        this.eventsPanel = eventsPanel;
    }

    /**
     * OtherPanel attribute getter
     * @return The JPanel that contains more information and agendaitem info
     */
    public JPanel getOtherPanel() {
        return otherPanel;
    }

    /**
     * OtherPanel attribute setter
     * @param otherPanel The JPanel that contains more information and agendaitem info
     */
    public void setOtherPanel(JPanel otherPanel) {
        this.otherPanel = otherPanel;
    }

    /**
     * Search attribute getter
     * @return The JPanel that allows for user to search an event
     */
    public JPanel getSearch() {
        return search;
    }

    /**
     * Search attribute setter
     * @param search The JPanel that allows for user to search an event
     */
    public void setSearch(JPanel search) {
        this.search = search;
    }

    /**
     * MoreInfo attribute getter
     * @return JPanel that contains a TextArea with more info on an Event
     */
    public JPanel getMoreInfo() {
        return moreInfo;
    }

    /**
     * MoreInfo attribute setter
     * @param moreInfo JPanel that contains a TextArea with more info on an Event
     */
    public void setMoreInfo(JPanel moreInfo) {
        this.moreInfo = moreInfo;
    }

    /**
     * AgendaInfo attribute getter
     * @return The JPanel that contains all the AgendaPanels
     */
    public JPanel getAgendainfo() {
        return agendainfo;
    }

    /**
     * AgendaInfo attribute setter
     * @param agendainfo The JPanel that contains all the AgendaPanels
     */
    public void setAgendainfo(JPanel agendainfo) {
        this.agendainfo = agendainfo;
    }

    /**
     * Ep attribute getter
     * @return the JLabel containing a title
     */
    public JLabel getEp() {
        return ep;
    }

    /**
     * Ep attribute setter
     * @param ep the JLabel containing a title
     */
    public void setEp(JLabel ep) {
        this.ep = ep;
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
     * Searchbut attribute getter
     * @return The JButton to allow a user to input a string and search for an Event
     */
    public JButton getSearchbut() {
        return searchbut;
    }

    /**
     * Searchbut attribute setter
     * @param searchbut The JButton to allow a user to input a string and search for an Event
     */
    public void setSearchbut(JButton searchbut) {
        this.searchbut = searchbut;
    }

    /**
     * Event attribute getter
     * @return The JTextArea with more information about an Event
     */
    public JTextArea getEvent() {
        return event;
    }

    /**
     * Event attribute setter
     * @param event The JTextArea with more information about an Event
     */
    public void setEvent(JTextArea event) {
        this.event = event;
    }

    /**
     * Agendabutton attribute getter
     * @return JPanel with the button to add an AgendaItem
     */
    public JPanel getAgendabutton() {
        return agendabutton;
    }

    /**
     * Agendabutton attribute getter
     * @param agendabutton JPanel with the button to add an AgendaItem
     */
    public void setAgendabutton(JPanel agendabutton) {
        this.agendabutton = agendabutton;
    }

    /**
     * Agenda attribute getter
     * @return The JButton to allow a user to add an AgendaItem
     */
    public JButton getAgenda() {
        return agenda;
    }

    /**
     * Agenda attribute setter
     * @param agenda The JButton to allow a user to add an AgendaItem
     */
    public void setAgenda(JButton agenda) {
        this.agenda = agenda;
    }
    


    
    
    
    
    
    
    
    
}
