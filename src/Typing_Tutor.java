import java.awt.Color;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Typing_Tutor implements KeyListener {
JFrame frame = new JFrame();
JLabel label = new JLabel();
char currentLetter;
int counter = 0;
int counterright =0;
public static void main(String[] args) {
	new Typing_Tutor().start();
	



}

private void start() {
	
	currentLetter = generateRandomLetter();
	frame.setVisible(true);
	frame.setTitle("Type or Die");
	label.setText("" + currentLetter);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	frame.add(label);
	
	frame.pack();
	frame.setSize(500, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');

}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
		counter = counter +1;
		if(counter==50) {
			showTypingSpeed(numberOfCorrectCharactersTyped);
		}
		System.out.println(e.getKeyChar());
		if(currentLetter==e.getKeyChar()) {
			System.out.println(" (Correct!)");
			frame.setBackground(Color.GREEN);
		}
		else if(currentLetter!=(e.getKeyChar())){
			System.out.println(" (Incorrect!)");
			frame.setBackground(Color.RED);
		}
	}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);;
	}

private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date();
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();

}