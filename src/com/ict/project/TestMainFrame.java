package com.ict.project;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestMainFrame extends JFrame implements ActionListener {
	static final int NUMBER_OF_PEOPLE = 6;
	CardLayout cardLayout;
	JPanel pg, jpSouth;
	JPanel[] jpArr;
	JButton[] jbArr;
	
	public TestMainFrame() {
		cardLayout = new CardLayout();
		pg = new JPanel(cardLayout);
		jpSouth = new JPanel();
		jpArr = new JPanel[NUMBER_OF_PEOPLE];
		jbArr = new JButton[NUMBER_OF_PEOPLE];
		
		jpArr[0] = new TestPanelLHJ();
		jpArr[1] = new JPanel(); 
		jpArr[2] = new JPanel(); 
		jpArr[3] = new JPanel(); 
		jpArr[4] = new JPanel(); 
		jpArr[5] = new JPanel(); 
		
		for (int i = 0; i < jbArr.length; i++) {
			String tmp = Integer.toString(i);
			
			jpArr[i].setBorder(BorderFactory.createTitledBorder(tmp));
			pg.add(tmp, jpArr[i]);
			
			jbArr[i] = new JButton(tmp);
			jbArr[i].setName(tmp);
			jbArr[i].addActionListener(this);
			jpSouth.add(jbArr[i]);
		}
		
		add(pg, BorderLayout.CENTER);
		add(jpSouth, BorderLayout.SOUTH);
		
		setLocationRelativeTo(null);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton obj = (JButton)e.getSource();
		String name = obj.getName();
		cardLayout.show(pg, name);
	}
	
	public static void main(String[] args) {
		new TestMainFrame();
	}
}
