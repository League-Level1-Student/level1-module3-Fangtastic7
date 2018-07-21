import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole {
public static void main(String[] args) {
	new WhackaMole().createUI();
}
JFrame frame = new JFrame("Whack a Button for Fame and Glory");
JPanel panel = new JPanel();
private void createUI() {
	// TODO Auto-generated method stub
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(400,400);
}
void drawButtons() {
	
}
}
