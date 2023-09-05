/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * This class contains all the items for the Menu
 * @author Sara9
 */
public class Menu {
    private JMenuBar menuBar = new JMenuBar();
    
    private JMenu file = new JMenu("File");
    private JMenuItem load = new JMenuItem("Load");
    private JMenuItem quit = new JMenuItem("Quit");
    private JMenuItem save = new JMenuItem("Save");
    
    private JMenu edit = new JMenu("Edit");
    private JMenuItem add = new JMenuItem("Add");
    private JMenuItem edit2 = new JMenuItem("Edit");
    private JMenuItem delete = new JMenuItem("Delete");
    
    private JPanel panel = new JPanel();
    
    /**
     *
     */
    public Menu()
    {
        menuBar.add(file);
        menuBar.add(edit);
        
        
        file.add(load);
        file.add(quit);
        file.add(save);
        
        edit.add(add);
        edit.add(edit2);
        edit.add(delete);
        
        panel.setLayout(new GridLayout(1,1));
        panel.add(menuBar);
        
    }

    /**
     * MenuBar attribute getter
     * @return The JMenuBar of the Menu
     */
    public JMenuBar getMenuBar() {
        return menuBar;
    }

    /**
     * MenuBar attribute setter
     * @param menuBar The JMenuBar of the Menu
     */
    public void setMenuBar(JMenuBar menuBar) {
        this.menuBar = menuBar;
    }

    /**
     * File attribute getter
     * @return The JMenu of the Menu
     */
    public JMenu getFile() {
        return file;
    }

    /**
     * File attribute setter
     * @param file The JMenu of the Menu
     */
    public void setFile(JMenu file) {
        this.file = file;
    }

    /**
     * Load attribute getter
     * @return The Load MenuItem
     */
    public JMenuItem getLoad() {
        return load;
    }

    /**
     * Load attribute setter
     * @param load The Load MenuItem
     */
    public void setLoad(JMenuItem load) {
        this.load = load;
    }

    /**
     * Quit attribute getter
     * @return The Quit MenuItem
     */
    public JMenuItem getQuit() {
        return quit;
    }

    /**
     * Quit attribute setter
     * @param quit The Quit MenuItem
     */
    public void setQuit(JMenuItem quit) {
        this.quit = quit;
    }

    /**
     * Save attribute getter
     * @return The Save MenuItem
     */
    public JMenuItem getSave() {
        return save;
    }

    /**
     * Save attribute setter
     * @param save The Save MenuItem
     */
    public void setSave(JMenuItem save) {
        this.save = save;
    }

    /**
     * Edit attribute getter
     * @return The Edit MenuItem
     */
    public JMenu getEdit() {
        return edit;
    }

    /**
     * Edit attribute setter
     * @param edit The Edit MenuItem
     */
    public void setEdit(JMenu edit) {
        this.edit = edit;
    }

    /**
     * Add attribute getter
     * @return The Add MenuItem
     */
    public JMenuItem getAdd() {
        return add;
    }

    /**
     * Add attribute getter
     * @param add The Add MenuItem
     */
    public void setAdd(JMenuItem add) {
        this.add = add;
    }

    /**
     * Edit2 attribute getter
     * @return The Edit MenuItem
     */
    public JMenuItem getEdit2() {
        return edit2;
    }

    /**
     * Edit2 attribute setter
     * @param edit2 The Edit MenuItem
     */
    public void setEdit2(JMenuItem edit2) {
        this.edit2 = edit2;
    }

    /**
     * Delete attribute getter
     * @return The Delete MenuItem
     */
    public JMenuItem getDelete() {
        return delete;
    }

    /**
     * Delete attribute getter
     * @param delete The Delete MenuItem
     */
    public void setDelete(JMenuItem delete) {
        this.delete = delete;
    }

    /**
     * Panel attribute setter
     * @return The Panel JPanel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * Panel attribute getter
     * @param panel The Panel JPanel
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    
    

 
    
    
}


