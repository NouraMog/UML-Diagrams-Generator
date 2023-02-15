package org.mql.java.exemples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.mql.java.reflection.ClassParser;

public class ClassParserInterface extends JFrame {
	private static final long serialVersionUID = 1L;
	
    private String className ;
	private JLabel labelConstructor;
	private JLabel labelPropriete;
	private JLabel labelMethod;
	private JLabel labelInnerClass;
	private JLabel labelName ;
	private JTextField text1 ;
	private JButton b1 ;
	private JPanel panelG ;
	private JPanel panel ;
	
	public ClassParserInterface() {
		exp01();
	}
	
	public void exp01() {
		JPanel panelG=new JPanel();
		JPanel panel=new JPanel();
		panel.setBounds(40,80,600,250) ;
		panel.setBackground(Color.white) ;
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		JButton b1=new JButton("Parser");
		b1.setBounds(400,25,100,30);
		b1.setBackground(Color.orange);
		JTextField text1 = new JTextField();
		text1.setBounds(40,25,350,30);
		
		className = text1.getText();
		labelName = new JLabel("") ;
		labelPropriete = new JLabel("");
		labelConstructor = new JLabel("");
		labelMethod = new JLabel("");
		labelInnerClass = new JLabel("");
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				
				ClassParser classe = new ClassParser(text1.getText());
				labelName.setText("Le nom qualifié de la classe : "+ text1.getText() + "   |  ");
				labelPropriete.setText("Nombre total des propriétés : "+ String.valueOf(classe.getPropreteCounter()) + "   |  ");
				labelConstructor.setText("Nombre total des constructeurs : "+ String.valueOf(classe.getConstructCounter()) + "   |  ");
				labelMethod.setText("Nombre total des methodes : "+ String.valueOf(classe.getMethodsCounter()) + "   |  ");
				labelInnerClass.setText("Nombre total des classes internes : "+ String.valueOf(classe.getInnerClassCounter()) + "   |  ");
					
				} catch (Exception exc) {
					System.out.println("Class not fond");
				} 
			}
		});
		
		
		panelG.setBackground(Color.LIGHT_GRAY);
		setContentPane(panelG);
		panelG.add(panel);
		panelG.add(text1);
		panelG.add(b1);
		panel.add(labelName);
		panel.add(labelPropriete);
		panel.add(labelConstructor);
		panel.add(labelMethod);
		panel.add(labelInnerClass);
		setSize(700,400); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
       new ClassParserInterface();
	}

}
