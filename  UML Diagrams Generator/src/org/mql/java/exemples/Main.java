package org.mql.java.exemples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.mql.java.reflection.ClassParser;



public class Main extends JFrame {
 
	private static final long serialVersionUID = 1L;
	
	JButton button = new JButton();
	JTextField jtf = new JTextField() ;
	private JPanel screen ;
	
	public Main() {
		exp02();
	}
	
	void exp01() {
		screen = new JPanel();
		screen.setBackground(Color.pink);
		setLayout(new BorderLayout());
		
		setBackground(Color.red);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	
	public void exp02() {
		ClassParser cp = new ClassParser("org.mql.java.models.Document");
		
	}

	public static void main(String[] args) {
		new Main() ;

	}

}
