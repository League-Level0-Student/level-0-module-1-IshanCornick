package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Birth {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your birthday");
	if (input.equals("06/23")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
		JOptionPane.showMessageDialog(null, "Loser");
	}
			
}
}
