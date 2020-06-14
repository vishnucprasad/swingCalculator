package calculatorJava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displayLabel;
	
	public Calculator( ) {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(500, 125);
		jf.getContentPane().setBackground(Color.black);
		
		
		displayLabel=new JLabel("0");
		displayLabel.setBounds(20, 30, 545, 60);
		displayLabel.setBackground(Color.darkGray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arual", Font.PLAIN, 50));
		jf.add(displayLabel);
		
		/*numeric buttons*/
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(20, 140, 80, 80);
		sevenButton.setFont(new Font("Arual", Font.PLAIN, 30));
		sevenButton.setBackground(Color.white);
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(120, 140, 80, 80);
		eightButton.setFont(new Font("Arual", Font.PLAIN, 30));
		eightButton.setBackground(Color.white);
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(220, 140, 80, 80);
		nineButton.setFont(new Font("Arual", Font.PLAIN, 30));
		nineButton.setBackground(Color.white);
		jf.add(nineButton);
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(20, 240, 80, 80);
		fourButton.setFont(new Font("Arual", Font.PLAIN, 30));
		fourButton.setBackground(Color.white);
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(120, 240, 80, 80);
		fiveButton.setFont(new Font("Arual", Font.PLAIN, 30));
		fiveButton.setBackground(Color.white);
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(220, 240, 80, 80);
		sixButton.setFont(new Font("Arual", Font.PLAIN, 30));
		sixButton.setBackground(Color.white);
		jf.add(sixButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(20, 340, 80, 80);
		oneButton.setFont(new Font("Arual", Font.PLAIN, 30));
		oneButton.setBackground(Color.white);
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(120, 340, 80, 80);
		twoButton.setFont(new Font("Arual", Font.PLAIN, 30));
		twoButton.setBackground(Color.white);
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(220, 340, 80, 80);
		threeButton.setFont(new Font("Arual", Font.PLAIN, 30));
		threeButton.setBackground(Color.white);
		jf.add(threeButton);
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(20, 440, 80, 80);
		dotButton.setFont(new Font("Arual", Font.PLAIN, 30));
		dotButton.setBackground(Color.darkGray);
		dotButton.setForeground(Color.white);
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(120, 440, 80, 80);
		zeroButton.setFont(new Font("Arual", Font.PLAIN, 30));
		zeroButton.setBackground(Color.white);
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(220, 440, 80, 80);
		equalButton.setFont(new Font("Arual", Font.PLAIN, 30));
		equalButton.setBackground(Color.orange);
		equalButton.setForeground(Color.white);
		jf.add(equalButton);
		
		/*numeric buttons*/
		
		/*operator buttons*/
		
		JButton clearButton=new JButton("C");
		clearButton.setBounds(385, 140, 80, 80);
		clearButton.setFont(new Font("Arual", Font.PLAIN, 30));
		clearButton.setBackground(Color.red);
		clearButton.setForeground(Color.white);
		jf.add(clearButton);
		
		JButton acButton=new JButton("AC");
		acButton.setBounds(485, 140, 80, 80);
		acButton.setFont(new Font("Arual", Font.PLAIN, 30));
		acButton.setBackground(Color.red);
		acButton.setForeground(Color.white);
		jf.add(acButton);
		
		JButton plusMinusButton=new JButton("+/-");
		plusMinusButton.setBounds(385, 240, 80, 80);
		plusMinusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		plusMinusButton.setBackground(Color.black);
		plusMinusButton.setForeground(Color.white);
		jf.add(plusMinusButton);
		
		JButton divideButton=new JButton("/");
		divideButton.setBounds(485, 240, 80, 80);
		divideButton.setFont(new Font("Arual", Font.PLAIN, 30));
		divideButton.setBackground(Color.black);
		divideButton.setForeground(Color.white);
		jf.add(divideButton);
		
		JButton plusButton=new JButton("+");
		plusButton.setBounds(385, 340, 80, 180);
		plusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		plusButton.setBackground(Color.black);
		plusButton.setForeground(Color.white);
		jf.add(plusButton);
		
		JButton multipleButton=new JButton("x");
		multipleButton.setBounds(485, 340, 80, 80);
		multipleButton.setFont(new Font("Arual", Font.PLAIN, 30));
		multipleButton.setBackground(Color.black);
		multipleButton.setForeground(Color.white);
		jf.add(multipleButton);
		
		JButton minusButton=new JButton("-");
		minusButton.setBounds(485, 440, 80, 80);
		minusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		minusButton.setBackground(Color.black);
		minusButton.setForeground(Color.white);
		jf.add(minusButton);
		
		/*operator buttons*/
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
}
