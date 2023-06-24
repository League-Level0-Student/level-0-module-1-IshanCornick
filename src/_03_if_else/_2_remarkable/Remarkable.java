package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String kid1 = "big legs";
		String kid2 = "bigger legs";
		String kid3 = "legs";
		String kid4 = "biggest legs";
		String input = JOptionPane.showInputDialog("Who you wanna learn about?");
		if (input.equals("kid1")) {
			JOptionPane.showMessageDialog(null, kid1);
		}
		if (input.equals("kid2")) {
			JOptionPane.showMessageDialog(null, kid2);
		}
		if (input.equals("kid3")) {
			JOptionPane.showMessageDialog(null, kid3);
		}
		else {
			JOptionPane.showMessageDialog(null, kid4);
		}
		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

