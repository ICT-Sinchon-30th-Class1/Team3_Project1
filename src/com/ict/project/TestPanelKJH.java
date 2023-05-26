package com.ict.project;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPanelKJH extends JPanel {
	public TestPanelKJH() {
		// TODO Auto-generated constructor stub
		super(new BorderLayout());
		setBackground(Color.DARK_GRAY);
		JLabel jlabel =new JLabel("KJH",JLabel.CENTER);
		add(jlabel,BorderLayout.CENTER);
	}

}
