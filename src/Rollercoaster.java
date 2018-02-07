import java.util.Random;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	{	String size= JOptionPane.showInputDialog(null,"How tall are you in inches");
		int num = Integer.parseInt(size);	
		
	if(num >48){
		JOptionPane.showMessageDialog(null,"you are tall enuogh come in :)");
	}else{
	 JOptionPane.showMessageDialog(null,"You are TOO Small, plant yourself so you can grow:(");
	}
	
}	
} 
}
