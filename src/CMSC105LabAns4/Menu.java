package CMSC105LabAns4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame{
	JRadioButton lab1;
	JRadioButton lab2;
	JRadioButton lab3;
	JRadioButton quit;
	JFrame menu;
	JLabel label;

	public Menu(){
		
	}
	public void displayMenu() {
		menu = new JFrame("Measure of Central Tendency and Dispersion");
		label = new JLabel("MENU");
		lab1 = new JRadioButton("Basic Sampling Methods");
		lab2 = new JRadioButton("Summarizing and Presenting Data");
		lab3 = new JRadioButton("Descriptive Statistics");
		quit = new JRadioButton("Quit");
		ButtonGroup bg = new ButtonGroup();
		bg.add(lab1);
		bg.add(lab2);
		bg.add(lab3);
		bg.add(quit);
	    Box box = Box.createVerticalBox();
	    box.add(label);
	    box.add(lab1);
	    box.add(lab2);
	    box.add(lab3);
	    box.add(quit);


	    
	    menu.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	    menu.add(box);
	    menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    menu.setPreferredSize(new Dimension(400, 200));
	    menu.pack();
	    menu.setLocationRelativeTo(null);
	    menu.setVisible(true);
	    
	    lab1.addActionListener(e -> {
          BasicSamplingMethods firstChoice = new BasicSamplingMethods();
          firstChoice.display();
        });
	    
	    lab2.addActionListener(e -> {
          SummarizingAndPresentingData secondChoice = new SummarizingAndPresentingData();
          secondChoice.display();
        });
	    
	    lab3.addActionListener(e -> {
          DescriptiveStatistics thirdChoice = new DescriptiveStatistics();
          thirdChoice.display();
        });
	    
	    quit.addActionListener(e -> System.exit(0));
	}
	
	public static void main(String[] args) {
		 Menu show  = new Menu();
		 show.displayMenu();
	  }
	
}
