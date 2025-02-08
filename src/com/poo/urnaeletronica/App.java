package com.poo.urnaeletronica;

import com.poo.urnaeletronica.view.LoginView;



public class App {
    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new LoginView();
            }
        });
   }
}
