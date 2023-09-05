/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eventmanager;

import com.mycompany.eventmanager.Agenda;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * This class is a blueprint for an Event
 * 
 * @author Sara9
 */
public class Event {
    private String title;
    private User organiser;
    private LocalDate date;
    private LocalTime time;
    private String location;
    private int capacity;
    private ArrayList<Agenda> Agenda = new ArrayList<Agenda>();

    /**
     * This constructor takes in parameters when instantiating an Event
     * 
     * @param title     the title of an Event
     * @param organiser the organiser of an Event
     * @param date      the date of an Event
     * @param time      the time of an Event
     * @param location  the location of an Event
     * @param capacity  the capacity of an event
     */
    public Event(String title, User organiser, LocalDate date, LocalTime time, String location, int capacity) {
        this.title = title;
        this.organiser = organiser;
        this.date = date;
        this.time = time;
        this.location = location;
        this.capacity = capacity;
    }

    /**
     *
     */
    public Event() {

    }

    /**
     * Title attribute getter
     * 
     * @return title of an Event
     */
    public String getTitle() {
        return title;
    }

    /**
     * Title attribute setter
     * 
     * @param title title of an Event
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Organiser attribute getter
     * 
     * @return organiser of an Event
     */
    public User getOrganiser() {
        return organiser;
    }

    /**
     * Organiser attribute setter
     * 
     * @param organiser organiser of an Event
     */
    public void setOrganiser(User organiser) {
        this.organiser = organiser;
    }

    /**
     * Date attribute getter
     * 
     * @return date of an Event
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Date attribute setter
     * 
     * @param date date of an Event
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Time attribute getter
     * 
     * @return time of an Event
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * Time attribute setter
     * 
     * @param time time of an Event
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * Location attribute getter
     * 
     * @return location of an Event
     */
    public String getLocation() {
        return location;
    }

    /**
     * Location attribute setter
     * 
     * @param location location of an Event
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Capacity attribute getter
     * 
     * @return capacity of Event
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Capacity attribute setter
     * 
     * @param capacity capacity of Event
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Agenda attribute getter
     * 
     * @return AgendaItem list of Event
     */
    public ArrayList<Agenda> getAgenda() {
        return Agenda;
    }

    /**
     * Agenda attribute setter
     * 
     * @param Agenda AgendaItem list of Event
     */
    public void setAgenda(ArrayList<Agenda> Agenda) {
        this.Agenda = Agenda;
    }

}
