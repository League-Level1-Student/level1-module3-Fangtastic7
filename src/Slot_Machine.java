import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame frame = new JFrame("Slot Machine");
	JButton spin = new JButton("Spin");
	JLabel image1 = new JLabel();
	JLabel image2 = new JLabel();
	JLabel image3 = new JLabel();
	String cherry = "cherry.jpg";
	String orange = "orangev2.png";
	String lime = "lime.png";
	String start = "start.jpeg";
	int number1;
	int number2;
	int number3;
	int wins=0;
	int counter=0;
	GridBagConstraints constraints2 = new GridBagConstraints();
	GridBagConstraints constraints1 = new GridBagConstraints();
	JPanel panel = new JPanel();
	Random random1 = new Random();
	
public static void main(String[] args) {
	Slot_Machine machine = new Slot_Machine();
	machine.createUI();
	//machine.start();
	
	
	
}

private void start() {
	// TODO Auto-generated method stub
//	image1 = createLabelImage(start);
//	image2 = createLabelImage(start);
	//image3 = createLabelImage(start);
	panel.add(image1, constraints1);
	panel.add(image2, constraints1);
	panel.add(image3, constraints1);
	
}

private void createUI() {
	// TODO Auto-generated method stub
	frame = new JFrame("Slot Machine");
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	panel = new JPanel();
	frame.add(panel);
	
	constraints1.gridwidth = 1;
	constraints1.gridy = 5;
	constraints1.fill = GridBagConstraints.VERTICAL;
	
	constraints2.gridy = 15;
	constraints2.gridx = 5;
	
	
	//makeimage();
	
	panel.add(spin, constraints2);
	spin.addActionListener(this);
	
	frame.setSize(1500, 700);
	
}
private void makeimage() {
	// TODO Auto-generated method stub
	if(counter==1) {
	image1 = createLabelImage(lime);
	image2  = createLabelImage(lime);
	image3 = createLabelImage(lime);
	panel.add(image1, constraints1);
	panel.add(image2, constraints1);
	panel.add(image3, constraints1);
	counter = counter +1;
	}
	else { 
		System.out.println("aeiou");
	}
}

private JLabel createLabelImage(String fileName)
		
{
	URL imageURL = getClass().getResource(fileName);
	if (imageURL == null)
	{
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	number1 = random1.nextInt(3);
	
	number2 = random1.nextInt(3);
	
	number3 = random1.nextInt(3);
	
	
	 frame.dispose();
	 
	
	// frame.repaint();
	//String answer =  JOptionPane.showInputDialog("See results?");
//	if(answer.equalsIgnoreCase("yes")) {
		
	
	// createUI();
	//}
	//else {
	//	System.exit(0);
	//}
	 JOptionPane.showMessageDialog(null, "Continue");
	 System.out.println("#");
	 createUI();
	number1(number1);
	number2(number2);
	number3(number3);
	
	check(number1, number2, number3);
	 
	
	 
	 
	
	
	
	 
}

private void number3(int number3) {
	// TODO Auto-generated method stub
	 if(number3==0) {
		 image3 = createLabelImage(cherry);
		
	 }
	 else if(number3==1) {
		 image3 = createLabelImage(orange);
	 }
	 else if(number3==2){
		 image3 = createLabelImage(lime);
	 }
	 
		
		panel.add(image3, constraints1);
}

private void number2(int number2) {
	// TODO Auto-generated method stub
	if(number2==0) {
		 image2 = createLabelImage(cherry);
	 }
	 else if(number2==1) {
		 image2 = createLabelImage(orange);
	 }
	 else if(number2==2){
		 image2 = createLabelImage(lime);
	 }
	panel.add(image2, constraints1);
}

private void number1(int number1) {
	// TODO Auto-generated method stub
	 if(number1==0) {
		 image1 = createLabelImage(cherry);
		 
	 }
	 else if(number1==1) {
		 image1 = createLabelImage(orange);
	 }
	 else if(number1==2){
		 image1 = createLabelImage(lime);
	 }
	 panel.add(image1, constraints1);
}

public void check(int number1, int number2, int number3) {
	// TODO Auto-generated method stub
	 if(number1==number2 && number2==number3) {
		 
		 wins = wins+1;
		 JOptionPane.showMessageDialog(null, "You win! Number of wins: " + wins);
		 
	 }
	 else {
		 System.out.println("Try Again!");
	 }
	
}
}
