/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * This class is the footer of my JPanel and contains all the buttons
 * @author Sara9
 */
public class Footer extends JPanel{
    private Buttons footer = new Buttons();
    
    /**
     * 
     */
    public Footer()
    {
        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackline);
        this.add(footer.getAdd());
        this.add(footer.getEdit());
        this.add(footer.getSave());
        this.add(footer.getDelete());
        this.add(footer.getOrder());
    }

    /**
     * Footer attribute getter
     * @return The buttons that are contained within the footer
     */
    public Buttons getFooter() {
        return footer;
    }

    /**
     * Footer attribute setter
     * @param footer The buttons that are contained within the footer
     */
    public void setFooter(Buttons footer) {
        this.footer = footer;
    }
    
    
    
}
