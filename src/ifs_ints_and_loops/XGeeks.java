package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

	String question=JOptionPane.showInputDialog("whos superpower do you want to know? here is a list:   june , john , bob , jack , tom , jim , back , trunk , Jean Francois Grenouillie , Sir Lexington Egor the fiftieth ,  ");
	
	if(question.equals("june")) {
	
	JOptionPane.showMessageDialog(null, "june's superpower is WRITING RECIPES");
		
	}
	
	if(question.equals("john")) {
		
		JOptionPane.showMessageDialog(null, "june's superpower is SUPER STRENGTH");
			
		}
	
	
	
	
}


}


// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 
