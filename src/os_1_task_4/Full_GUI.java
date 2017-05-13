/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os_1_task_4;

import java.awt.CardLayout;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class Full_GUI extends JFrame {
    
    public CardLayout cardLayout = new CardLayout();
    public JPanel container = new JPanel();
    public Choose_directory_panel choose_directory;
    public Menu_panel menu_panel;
    public change_permission_panel change_permission;
    public list_panel list_panel;
    public make_directory_panel make_directory_panel;
    public make_file_panel make_file_panel;
    public create_shortcut_panel create_shortcut;
    public delete_directory_panel delete_directory;
    public delete_file_panel delete_file;
    
    public Full_GUI() throws InterruptedException, IOException {
        setTitle("Terminal Visualization");
        setResizable(false);
        getContentPane();
        setSize(600, 500);
        this.choose_directory = new Choose_directory_panel(this);
        this.menu_panel = new Menu_panel(this);
        this.change_permission = new change_permission_panel(this);
        this.list_panel = new list_panel(this);
        this.make_directory_panel = new make_directory_panel(this);
        this.make_file_panel = new make_file_panel(this);
        this.create_shortcut = new create_shortcut_panel(this);
        this.delete_directory = new delete_directory_panel(this);
        this.delete_file = new delete_file_panel(this);
        container.setLayout(cardLayout);
        container.add(choose_directory, "CHOOSE_DIRECTORY");
        container.add(menu_panel, "MENU_PANEL");
        container.add(change_permission, "CHANGE_PERMISSION");
        container.add(list_panel, "LIST_PANEL");
        container.add(make_directory_panel, "MAKE_DIRECTORY");
        container.add(make_file_panel, "MAKE_FILE");
        container.add(create_shortcut, "CREATE_SHORTCUT");
        container.add(delete_directory, "DELETE_DIRECTORY");
        container.add(delete_file, "DELETE_FILE");
        this.add(container);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
