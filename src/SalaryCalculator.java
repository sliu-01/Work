import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300, 200, 500, 250);
		myFrame.setLayout(null);

		JLabel salary = new JLabel();
		salary.setSize(150, 20);
		salary.setLocation(new Point(80, 135));
		myFrame.add(salary);

		
		JLabel rateLabel = new JLabel("Hourly Rate:");
		rateLabel.setSize(100, 30);
		rateLabel.setLocation(new Point(10, 35));
		myFrame.add(rateLabel);
		
		JTextField rate = new JTextField();
		rate.setSize(200,30);
		rate.setLocation(new Point(120, 35));
		myFrame.add(rate);
		
		JLabel hoursLabel = new JLabel("Hours/Week");
		hoursLabel.setSize(100, 30);
		hoursLabel.setLocation(new Point(10, 75));
		myFrame.add(hoursLabel);
		
		JTextField hours = new JTextField();
		hours.setSize(200,30);
		hours.setLocation(new Point(120, 75));
		myFrame.add(hours);
		
		JCheckBox

		JButton calculate = new JButton("Calculate");
		calculate.setSize(100, 20);
		calculate.setLocation(new Point(10, 135));
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) 
					{
						salary.setText("" + Double.parseDouble(rate.getText())*Double.parseDouble(hours.getText()));
					}
			
				});
		myFrame.add(calculate);
		
		myFrame.setVisible((true));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
