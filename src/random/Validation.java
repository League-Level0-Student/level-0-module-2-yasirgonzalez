//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		int randomNumber = new Random().nextInt(5)+1;
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		//1,2,1,3,2,0,0,2,0,4
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		for(int i=0; i<10; i++) {
		if (randomNumber == 1) {
		JOptionPane.showMessageDialog(null, "You're a hero");
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You seem smart, I bet you are");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Nice hair");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "Have A good day");
		}else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "Nice Shoes");
 
		}};}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}

