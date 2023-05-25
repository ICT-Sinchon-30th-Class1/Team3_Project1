package com.ict.project;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPanelPCL extends JPanel{
public TestPanelPCL() {

	super(new BorderLayout());
	setBackground(Color.pink);
	
	JLabel jl1 = new JLabel("안녕하세용");
	
	add(jl1, BorderLayout.EAST);
	
}
}
