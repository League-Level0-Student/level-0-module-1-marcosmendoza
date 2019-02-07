package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
	String answer=JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die. what am i");
	
          if(answer.equals("fire")) { 
        	  JOptionPane.showMessageDialog(null, "yes");
        	score++;
        	  JOptionPane.showMessageDialog(null, "your score ="+score);
		
          }
        	  else {
        		  JOptionPane.showMessageDialog(null, "no");
        	  }
  		int scor2e = 0;
  		String answe2r=JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
  		
  	          if(answe2r.equals("a candle")) { 
  	        	  JOptionPane.showMessageDialog(null, "yes");
  	        	score++;
  	        	  JOptionPane.showMessageDialog(null, "your score ="+score);
  	        	  if(score==2) {
  	        		  JOptionPane.showMessageDialog(null, "you got all the answers correct");
  	        		
  	          }
  	        	  else {
  	        		  JOptionPane.showMessageDialog(null, "no");
  	        	  }
  	          
		
		
	}
	}
}


// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.