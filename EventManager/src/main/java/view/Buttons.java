/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This class contains all the main JFrames buttons
 * @author Sara9
 */
public class Buttons {
    
    private JButton add = new JButton("Add");
    private JButton edit = new JButton("Edit");
    private JButton save = new JButton("Save");
    private JButton delete = new JButton("Delete");
    private JButton order = new JButton("Order");

    /**
     * Order attribute getter
     * @return the Order button
     */
    public JButton getOrder() {
        return order;
    }

    /**
     * Order attribute setter
     * @param order the Order button
     */
    public void setOrder(JButton order) {
        this.order = order;
    }
    
    /**
     * Add attribute getter
     * @return the add button
     */
    public JButton getAdd() {
        return add;
    }

    /**
     * Add attribute setter
     * @param add the add button
     */
    public void setAdd(JButton add) {
        this.add = add;
    }

    /**
     * Edit attribute getter
     * @return the edit button
     */
    public JButton getEdit() {
        return edit;
    }

    /**
     * Edit attribute setter
     * @param edit the edit button
     */
    public void setEdit(JButton edit) {
        this.edit = edit;
    }

    /**
     * Save attribute getter
     * @return the save button
     */
    public JButton getSave() {
        return save;
    }

    /**
     * Save attribute setter
     * @param save the save button
     */
    public void setSave(JButton save) {
        this.save = save;
    }

    /**
     * Delete attribute getter
     * @return the delete button
     */
    public JButton getDelete() {
        return delete;
    }

    /**
     * Delete attribute setter
     * @param delete
     */
    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    
   
    
    
    
}
