package org.module.client.presentation.userui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.module.client.presentation.logisticsui.LogisticsPanel;

public class CustomerFrame extends FatherFrame {

	
	private static final long serialVersionUID = -1452749767128951688L;
	private JPanel contentPane;

	
	public CustomerFrame() {
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(new LogisticsPanel());
		contentPane.setOpaque(false);
		setContentPane(contentPane);
	}

}
