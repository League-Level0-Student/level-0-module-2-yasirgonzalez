package random;
import java.util.Random;

import javax.swing.JOptionPane;
public class LotteryNumbers {
	public static void main(String[] args) {
	int lottery = new Random().nextInt(5);
	JOptionPane.showMessageDialog(null, lottery);
	}
}
