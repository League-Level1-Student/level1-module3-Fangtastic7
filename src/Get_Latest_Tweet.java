import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Get_Latest_Tweet {
	JButton button = new JButton();
	JTextField text = new JTextField();
public static void main(String[] args) {
	new Get_Latest_Tweet().createUI();
}

private void createUI() {
	// TODO Auto-generated method stub
	
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setTitle("The Amazing Tweet Retriever");
	JPanel panel = new JPanel();
	frame.add(panel);
	
}
}
