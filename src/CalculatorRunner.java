import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JButton buttonadd = new JButton("Add");
	JButton buttonsubtract = new JButton("Subtract");
	JButton buttonmultiply = new JButton("Multiply");
	JButton buttondivide = new JButton("Divide");
	JLabel label = new JLabel();
	String answer = "0";
	double outcome;
	public static void main(String[] args) {
		new CalculatorRunner().CalculatorUI();
	}

	void CalculatorUI() {
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Simple Calculator");
		label.setText(answer);
		frame.add(panel);
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		GridBagConstraints constraints2 = new GridBagConstraints();
		GridBagConstraints constraints3 = new GridBagConstraints(); 
		text1.setText("0");
		text2.setText("0");
		constraints.gridy = 5;
		constraints.fill = GridBagConstraints.VERTICAL;
		constraints2.gridwidth = 2;
		constraints.gridwidth = 1;
		constraints3.gridy = 15;
		constraints3.gridx = 1;
		panel.add(text1, constraints2);
		panel.add(text2, constraints2);
		panel.add(buttonadd, constraints);
		panel.add(buttonsubtract, constraints);
		panel.add(buttonmultiply, constraints);
		panel.add(buttondivide, constraints);
		panel.add(label, constraints3);
		buttonadd.addActionListener(this);
		buttonsubtract.addActionListener(this);
		buttonmultiply.addActionListener(this);
		buttondivide.addActionListener(this);
		
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		boolean error = false;
		Calculator methods = new Calculator();
		double num1=0, num2=0;
		try {
		 num1 = Double.parseDouble(text1.getText());
		} catch(Exception b) {
			text1.setText("error");
			error=true;
		}
		try {
		 num2 = Double.parseDouble(text2.getText());
		} catch(Exception b) {
			text2.setText("error");
			error=true;
		}
		if(!error) {
			
		
		if (buttonPressed == buttonadd) {
			 outcome =  methods.add(num1, num2);
			
		} else if (buttonPressed == buttonsubtract) {
			outcome = methods.subtract(num1, num2);
			
		} else if (buttonPressed == buttonmultiply) {
			outcome = methods.multiply(num1, num2);
			
		} else {
			outcome = methods.divide(num1, num2);
			
		}
		answer = String.valueOf(outcome);
		label.setText(answer);
		}
		else {
			label.setText("error");

		}
	}
}
