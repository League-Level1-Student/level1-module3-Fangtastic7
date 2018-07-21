import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Get_Latest_Tweet implements ActionListener {
	JButton button = new JButton("Search the Twitterverse");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20);
	JLabel label = new JLabel();
	String search = "null";
	String answer = "blank";
public static void main(String[] args) {
	new Get_Latest_Tweet().createUI();
}

private void createUI() {
	// TODO Auto-generated method stub
	
	
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setTitle("The Amazing Tweet Retriever");
	
	frame.add(panel);
	

	panel.add(text);
	text.setText(search);
	
	label.setText(answer);
	panel.add(button);
	panel.add(label);
	button.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Tweet, Tweet");
	label.setText(getLatestTweet(text.getText()));
	frame.pack();
	panel.repaint();
	
	
}
private String getLatestTweet(String searchingFor) {

    Twitter twitter = new TwitterFactory().getInstance();

    AccessToken accessToken = new AccessToken(
          "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
          "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
          "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

    twitter.setOAuthAccessToken(accessToken);

    Query query = new Query(searchingFor);
    try {
          QueryResult result = twitter.search(query);
          return result.getTweets().get(0).getText();
    } catch (Exception e) {
          System.err.print(e.getMessage());
          return "What the heck is that?";
    }
}


}
