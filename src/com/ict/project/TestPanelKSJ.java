package com.ict.project;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TestPanelKSJ extends JPanel{
	public TestPanelKSJ() {
		super(new BorderLayout());
		setBackground(Color.PINK);
		
		JPanel jp1 = new JPanel();
		JButton jb1 = new JButton("H");
		JButton jb2 = new JButton("ELL");
		JButton jb3 = new JButton("O");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);

		add(jp1, BorderLayout.SOUTH);
	
		
	}

}
