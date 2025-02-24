package com.poo.urnaeletronica.components;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Button extends JButton {
    public Button(String text, int x, int y, int width, int height, ActionListener actionListener) {
        super(text);
        setFont(new Font("Tahoma", Font.BOLD, 12));
        setBounds(x, y, width, height);
        addActionListener(actionListener);
    }
}
