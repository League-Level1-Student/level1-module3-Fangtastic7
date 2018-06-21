import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		panel.add(Trick);
		panel.add(Treat);
		frame.pack();
		frame.setTitle("Trick or Treat");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if(buttonPressed==Trick) {
			showPictureFromTheInternet("https://pbs.twimg.com/profile_images/878962163737665537/OLAUQNQe_400x400.jpg");
		}
		if(buttonPressed==Treat) {
			showPictureFromTheInternet("https://pbs.twimg.com/profile_images/813197973836337152/XZllOyx3_400x400.jpg");
		}
	}
	

private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}