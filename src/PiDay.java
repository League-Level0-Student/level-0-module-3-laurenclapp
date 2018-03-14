import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String pi = "3.141592653";
		for (int i=0; i<4; i++) {
			System.out.print(pi.charAt(i));
		}
		for (int i=4; i<pi.length(); i++) {
String answer = JOptionPane.showInputDialog("What is the next digit of Pi?");
			String digit=Character.toString(pi.charAt(4));
			System.out.print(digit);
			if(answer.equals(digit)) {
	System.out.print(digit);
			}
			else { JOptionPane.showMessageDialog(null, "NO PIE FOR YOU!!!");
			System.exit(0);
			}
		}
		
			
			

}} 
