package com.ict.project;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TestPanelTYS extends JPanel {

	public TestPanelTYS() {
		super();
		
		JPanel jp1 = new JPanel();
		JLabel jbl1 = new JLabel("안녕하세요");
		
		jp1.add(jbl1);
		
		add(jp1, BorderLayout.CENTER);
		
		
		
	}

}
