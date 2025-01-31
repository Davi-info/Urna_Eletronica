package com.poo.urnaeletronica.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class UrnaEletronica {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public UrnaEletronica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1080, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBounds(0, 0, 1064, 537);
		frame.getContentPane().add(panel);
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
		
		JLabel lblNewLabel = new JLabel("APERTE A TECLA");
		lblNewLabel.setBounds(10, 11, 123, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VERDE");
		lblNewLabel_1.setForeground(new Color(50, 205, 50));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(39, 49, 46, 14);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("LARANJA");
		lblNewLabel_1_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(39, 74, 65, 14);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("para");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(88, 49, 46, 14);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONFIRMAR");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(123, 49, 110, 14);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("para");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(108, 74, 46, 14);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("CORRIGIR");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(143, 74, 110, 14);
		panel_4.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("ELEIÇÃO GERAL");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(34, 24, 244, 25);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NÚMERO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(21, 122, 77, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("NOME");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(21, 180, 77, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("PARTIDO");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(21, 241, 110, 14);
		panel_1.add(lblNewLabel_5_2);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(654, 161, 385, 346);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(53, 40, 66, 39);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(153, 40, 66, 39);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(250, 40, 66, 39);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(53, 91, 66, 39);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_1.setBounds(153, 91, 66, 39);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("6");
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_1.setBackground(Color.DARK_GRAY);
		btnNewButton_2_1.setBounds(250, 91, 66, 39);
		panel_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setBounds(53, 141, 66, 39);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_2.setBounds(153, 141, 66, 39);
		panel_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2_2.setBounds(250, 141, 66, 39);
		panel_2.add(btnNewButton_2_2);
		
		JButton btnNewButton_1_2_1 = new JButton("0");
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_2_1.setBounds(153, 191, 66, 39);
		panel_2.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_5 = new JButton("BRANCO");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(32, 279, 89, 39);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("CORRIGE");
		btnNewButton_5_1.setBackground(new Color(255, 140, 0));
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5_1.setBounds(142, 279, 89, 39);
		panel_2.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("CONFIRMA");
		btnNewButton_5_1_1.setBackground(new Color(50, 205, 50));
		btnNewButton_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_5_1_1.setBounds(247, 241, 105, 77);
		panel_2.add(btnNewButton_5_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(UrnaEletronica.class.getResource("IFPILogo.jpg")));
		lblNewLabel_6.setBounds(654, 35, 385, 115);
		panel.add(lblNewLabel_6);
	}
	
	public void start() {
		frame.setVisible(true);
	}
}
