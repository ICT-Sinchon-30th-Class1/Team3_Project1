package com.ict.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPanelPCL extends JPanel{
public TestPanelPCL() {

	super(new BorderLayout());
	setBackground(new Color(211, 195, 243));
	
	JButton jb1 = new JButton("안녕하세용");
	
	add(jb1, BorderLayout.EAST);
	
	jb1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
			
		}
	});
}
}
