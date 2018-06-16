import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Nasty_Suprise implements ActionListener {
	public static void main(String[] args) {
		new Nasty_Suprise().createUI();
	}
	JButton Trick = new JButton();
	JButton Treat = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	private void createUI() {
		// TODO Auto-generated method stub
		frame.add(panel);
		frame.setVisible(true);
		Trick.setText("Trick");
		Trick.addActionListener(this);
		Treat.setText("Treat");
		Treat.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(Trick==buttonPressed) {
			
		}
	}
}
