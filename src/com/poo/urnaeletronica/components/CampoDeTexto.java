package com.poo.urnaeletronica.components;

import javax.swing.JTextField;

public class CampoDeTexto extends JTextField {
    public CampoDeTexto(int columns, int x, int y, int width, int height) {
        super(columns);
        setBounds(x, y, width, height);
    }
}
