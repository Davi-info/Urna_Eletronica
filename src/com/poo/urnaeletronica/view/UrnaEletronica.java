package com.poo.urnaeletronica.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class UrnaEletronica extends JFrame {

    private JTextField textField;

    public UrnaEletronica() {
        initialize();
    }

    private void initialize() {
        setTitle("Urna Eletronica");
        setBounds(100, 100, 1080, 576);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.control);
        panel.setBounds(0, 0, 1064, 537);
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(60, 35, 516, 431);
        panel_1.setBorder(new LineBorder(Color.BLACK, 1));
        panel.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(Color.WHITE);
        panel_4.setBounds(0, 315, 516, 116);
        panel_4.setBorder(new LineBorder(Color.BLACK, 1));
        panel_1.add(panel_4);
        panel_4.setLayout(null);

        JLabel lblAperteTecla = new JLabel("APERTE A TECLA");
        lblAperteTecla.setBounds(10, 11, 123, 19);
        lblAperteTecla.setFont(new Font("Tahoma", Font.PLAIN, 15));
        panel_4.add(lblAperteTecla);

        JLabel lblVerde = new JLabel("VERDE");
        lblVerde.setForeground(new Color(50, 205, 50));
        lblVerde.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblVerde.setBounds(39, 49, 46, 14);
        panel_4.add(lblVerde);

        JLabel lblLaranja = new JLabel("LARANJA");
        lblLaranja.setForeground(new Color(255, 140, 0));
        lblLaranja.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblLaranja.setBounds(39, 74, 65, 14);
        panel_4.add(lblLaranja);

        JLabel lblpara = new JLabel("para");
        lblpara.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblpara.setBounds(88, 49, 46, 14);
        panel_4.add(lblpara);

        JLabel lblConfirmar = new JLabel("CONFIRMAR");
        lblConfirmar.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblConfirmar.setBounds(123, 49, 110, 14);
        panel_4.add(lblConfirmar);

        JLabel lblpara2 = new JLabel("para");
        lblpara2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblpara2.setBounds(108, 74, 46, 14);
        panel_4.add(lblpara2);

        JLabel lblCorrigir = new JLabel("CORRIGIR");
        lblCorrigir.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCorrigir.setBounds(143, 74, 110, 14);
        panel_4.add(lblCorrigir);

        JLabel lblEleicao = new JLabel("ELEIÇÃO GERAL");
        lblEleicao.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblEleicao.setBounds(34, 24, 244, 25);
        panel_1.add(lblEleicao);

        JLabel lblNumero = new JLabel("NÚMERO");
        lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNumero.setBounds(21, 122, 77, 14);
        panel_1.add(lblNumero);

        JLabel lblNome = new JLabel("NOME");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNome.setBounds(21, 180, 77, 14);
        panel_1.add(lblNome);

        JLabel lblPartido = new JLabel("PARTIDO");
        lblPartido.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPartido.setBounds(21, 241, 110, 14);
        panel_1.add(lblPartido);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 20));
        textField.setBounds(90, 96, 77, 57);
        panel_1.add(textField);
        textField.setColumns(10);

        JPanel panel_5 = new JPanel();
        panel_5.setBackground(Color.WHITE);
        panel_5.setBounds(298, 69, 182, 186);
        panel_5.setBorder(new LineBorder(Color.BLACK, 1));
        panel_1.add(panel_5);
        panel_5.setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(20, 21, 152, 175);
        lblNewLabel.setIcon(new ImageIcon(UrnaEletronica.class.getResource("/com/poo/urnaeletronica/view/candidate.jpg")));
        panel_5.add(lblNewLabel);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.BLACK);
        panel_2.setBounds(654, 161, 385, 346);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JButton btnUm = new JButton("1");
        btnUm.setBackground(Color.DARK_GRAY);
        btnUm.setForeground(Color.WHITE);
        btnUm.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnUm.setBounds(53, 40, 66, 39);
        panel_2.add(btnUm);

        JButton btnDois = new JButton("2");
        btnDois.setForeground(Color.WHITE);
        btnDois.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDois.setBackground(Color.DARK_GRAY);
        btnDois.setBounds(153, 40, 66, 39);
        panel_2.add(btnDois);

        JButton btnTres = new JButton("3");
        btnTres.setForeground(Color.WHITE);
        btnTres.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnTres.setBackground(Color.DARK_GRAY);
        btnTres.setBounds(250, 40, 66, 39);
        panel_2.add(btnTres);

        JButton btnQuatro = new JButton("4");
        btnQuatro.setForeground(Color.WHITE);
        btnQuatro.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnQuatro.setBackground(Color.DARK_GRAY);
        btnQuatro.setBounds(53, 91, 66, 39);
        panel_2.add(btnQuatro);

        JButton btnCinco = new JButton("5");
        btnCinco.setForeground(Color.WHITE);
        btnCinco.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnCinco.setBackground(Color.DARK_GRAY);
        btnCinco.setBounds(153, 91, 66, 39);
        panel_2.add(btnCinco);

        JButton btnSeis = new JButton("6");
        btnSeis.setForeground(Color.WHITE);
        btnSeis.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSeis.setBackground(Color.DARK_GRAY);
        btnSeis.setBounds(250, 91, 66, 39);
        panel_2.add(btnSeis);

        JButton btnSete = new JButton("7");
        btnSete.setForeground(Color.WHITE);
        btnSete.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSete.setBackground(Color.DARK_GRAY);
        btnSete.setBounds(53, 141, 66, 39);
        panel_2.add(btnSete);

        JButton btnOito = new JButton("8");
        btnOito.setForeground(Color.WHITE);
        btnOito.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnOito.setBackground(Color.DARK_GRAY);
        btnOito.setBounds(153, 141, 66, 39);
        panel_2.add(btnOito);

        JButton btnNove = new JButton("9");
        btnNove.setForeground(Color.WHITE);
        btnNove.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNove.setBackground(Color.DARK_GRAY);
        btnNove.setBounds(250, 141, 66, 39);
        panel_2.add(btnNove);

        JButton btnZero = new JButton("0");
        btnZero.setForeground(Color.WHITE);
        btnZero.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnZero.setBackground(Color.DARK_GRAY);
        btnZero.setBounds(153, 191, 66, 39);
        panel_2.add(btnZero);

        JButton btnBranco = new JButton("BRANCO");
        btnBranco.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnBranco.setBackground(Color.WHITE);
        btnBranco.setBounds(32, 279, 89, 39);
        panel_2.add(btnBranco);

        JButton btnCorrige = new JButton("CORRIGE");
        btnCorrige.setBackground(new Color(255, 140, 0));
        btnCorrige.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnCorrige.setBounds(142, 279, 89, 39);
        panel_2.add(btnCorrige);

        JButton btnConfirma = new JButton("CONFIRMA");
        btnConfirma.setBackground(new Color(50, 205, 50));
        btnConfirma.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnConfirma.setBounds(247, 241, 105, 77);
        panel_2.add(btnConfirma);

        JLabel lblIfpiLogo = new JLabel("New label");
        lblIfpiLogo.setIcon(new ImageIcon(UrnaEletronica.class.getResource("IFPILogo.jpg")));
        lblIfpiLogo.setBounds(654, 35, 385, 115);
        panel.add(lblIfpiLogo);

        // Adicionando ActionListener aos botões numéricos
        btnUm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });

        btnDois.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });

        btnTres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });

        btnQuatro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });

        btnCinco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });

        btnSeis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });

        btnSete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });

        btnOito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });

        btnNove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });

        btnZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "0");
            }
        });
    }

    public void start() {
        setVisible(true);
    }
}
