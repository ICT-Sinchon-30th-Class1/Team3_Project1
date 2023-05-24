package com.ict.project;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPanelLHJ extends JPanel {
	public TestPanelLHJ() {
		super(new BorderLayout());
		setBackground(Color.DARK_GRAY);
		
		JLabel jLabel = new JLabel("LHJ", JLabel.CENTER);
		
		add(jLabel, BorderLayout.CENTER);
	}
}
