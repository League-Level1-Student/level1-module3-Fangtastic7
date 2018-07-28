import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
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
	start();
	
	frame.setSize(300,300);
}


private void start() {
	// TODO Auto-generated method stub
	Random number = new Random();
	int number1 = number.nextInt(8);
	int number2 = number.nextInt(3);
	drawButtons(number1, number2);
}


void drawButtons(int number1, int number2) {
	for(int i=0; i<8; i++) {
		for(int a =0; a<3; a++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i==number1 && a==number2) {
				
			  button.setText("mole!");
			  
			}
		}
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed.getText().equals("mole!")) {
		System.out.println("yas");
	}
		
	


	else {	
		speak("nope");
	}
start();
frame.dispose();
createUI();

}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
