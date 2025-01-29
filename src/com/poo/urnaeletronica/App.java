package com.poo.urnaeletronica;

import com.poo.urnaeletronica.view.Menu;

// import com.poo.urnaeletronica.view.Login;

public class App {
    public static void main(String[] args) throws Exception {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new Login().setVisible(true);
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }
}
