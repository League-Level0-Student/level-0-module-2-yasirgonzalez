import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age= JOptionPane.showInputDialog(null,"How old are you");
		int num = Integer.parseInt(age);
		if(num>17){
       	JOptionPane.showInputDialog(null,"Who would you vote for president");
		}else {
			JOptionPane.showMessageDialog(null, "Not Allowed, I am calling 911!!");
		}

}
}
