package com.poo.urnaeletronica.components;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Label extends JLabel {
    public Label(String text, int x, int y, int width, int height) {
        super(text);
        setFont(new Font("Tahoma", Font.BOLD, 15));
        setForeground(Color.WHITE);
        setBounds(x, y, width, height);
    }
}