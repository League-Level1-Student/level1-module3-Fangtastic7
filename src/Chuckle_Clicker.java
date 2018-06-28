import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	 JButton buttonjoke = new JButton();
	 JButton buttonpunch = new JButton();
	 JFrame frame = new JFrame();
public static void main(String[] args) {
	new Chuckle_Clicker().makeButtons();
} 
	private void makeButtons(){
	//JOptionPane.showMessageDialog(null, "Make Buttons");
	 
	 frame.setVisible(true);
	 frame.setTitle("ChuckleClicker");
	 JPanel panel = new JPanel();
	 frame.add(panel);
	 
	 panel.add(buttonjoke);
	 buttonjoke.setSize(200,200);
	 buttonjoke.setText("Joke");
	
	 panel.add(buttonpunch);
	 buttonpunch.setText("Punchline");
	 buttonjoke.addActionListener(this);
	 buttonpunch.addActionListener(this);
	 frame.pack();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		JOptionPane.showMessageDialog(null, "Hi!");
		if(buttonjoke==buttonPressed) {
			JOptionPane.showMessageDialog(null, "What do you call a sick eagle? A: Illegal");
		}
		else {
			JOptionPane.showMessageDialog(null, "I never typed never.");
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
