package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Urna {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Urna Eletrônica");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Painel painel = new Painel();
        janela.getContentPane().add(painel);

        janela.pack();
        janela.setVisible(true);
    }
}

class Painel extends JPanel {

    private StringBuilder displayText = new StringBuilder(); // Texto do display

    public Painel() {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        // Criação dos botões numéricos
        int startX = 200, startY = 400, width = 60, height = 60;
        for (int i = 1; i <= 9; i++) {
            int x = startX + ((i - 1) % 3) * (width + 10);
            int y = startY + ((i - 1) / 3) * (height + 10);
            criarBotao(String.valueOf(i), x, y, width, height, Color.BLACK, Color.WHITE);
        }

        // Botão 0
        int x0 = startX + width + 10;
        int y0 = startY + 3 * (height + 10);
        criarBotao("0", x0, y0, width, height, Color.BLACK, Color.WHITE);

        // Botão Branco
        int brancoX = startX + 3 * (width + 10);
        int brancoY = startY + 4 * (height - 60);
        criarBotao("BRANCO", brancoX, brancoY, 3 * width, height, Color.WHITE, Color.BLACK);

        // Botão Corrige
        int corrigeX = startX + 3 * (width + 10);
        int corrigeY = startY + 4 * (height - 40);
        criarBotao("CORRIGE", corrigeX, corrigeY, 3 * width, height, Color.ORANGE, Color.BLACK);

        // Botão Confirma
        int confirmaX = startX + 3 * (width + 10);
        int confirmaY = startY + 4 * (height - 20);
        criarBotao("CONFIRMA", confirmaX, confirmaY, 3 * width, 2 * height, Color.GREEN, Color.BLACK);
    }

    private void criarBotao(String texto, int x, int y, int width, int height, Color background, Color foreground) {
        JButton botao = new JButton(texto);
        botao.setBounds(x, y, width, height);
        botao.setFont(new Font("Arial", Font.BOLD, 16));
        botao.setFocusPainted(false);
        botao.setBackground(background);
        botao.setForeground(foreground);

        // Adiciona funcionalidade ao botão
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("CORRIGE".equals(texto)) {
                    // Limpa o display
                    displayText.setLength(0);
                } else if ("BRANCO".equals(texto)) {
                    // Exibe "BRANCO" no display
                    displayText.setLength(0);
                    displayText.append("BRANCO");
                } else if ("CONFIRMA".equals(texto)) {
                    // Exibe mensagem de confirmação no console
                    System.out.println("Voto confirmado: " + displayText.toString());
                } else {
                    // Adiciona o número ao display; if (displayText.length() < 2) { // Limite de 2 dígitos
                    
                        displayText.append(texto);
                    }
                
                repaint(); // Atualiza o painel
            }
        });

        add(botao);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(700, 700);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Display
        g.setColor(Color.BLACK);
        g.fillRect(50, 0, 600, 380);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString(displayText.toString(), 70, 200); // Exibe o texto no display

        // Título
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.setColor(Color.BLACK);
        g.drawString("Urna Eletrônica", 200, 50);
    }
}

