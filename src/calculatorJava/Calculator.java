package calculatorJava;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	
	public Calculator( ) {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(500, 125);
		
		
		JLabel displayLabel=new JLabel("0");
		displayLabel.setBounds(20, 30, 545, 60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arual", Font.PLAIN, 50));
		jf.add(displayLabel);
		
		/*numeric buttons*/
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(20, 140, 80, 80);
		sevenButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(120, 140, 80, 80);
		eightButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(220, 140, 80, 80);
		nineButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(nineButton);
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(20, 240, 80, 80);
		fourButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(120, 240, 80, 80);
		fiveButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(fiveButton);
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(220, 240, 80, 80);
		sixButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(sixButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(20, 340, 80, 80);
		oneButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(120, 340, 80, 80);
		twoButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(220, 340, 80, 80);
		threeButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(threeButton);
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(20, 440, 80, 80);
		dotButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(120, 440, 80, 80);
		zeroButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(220, 440, 80, 80);
		equalButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(equalButton);
		
		/*numeric buttons*/
		
		/*operator buttons*/
		
		JButton clearButton=new JButton("C");
		clearButton.setBounds(385, 140, 80, 80);
		clearButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(clearButton);
		
		JButton acButton=new JButton("AC");
		acButton.setBounds(485, 140, 80, 80);
		acButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(acButton);
		
		JButton plusMinusButton=new JButton("+/-");
		plusMinusButton.setBounds(385, 240, 80, 80);
		plusMinusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(plusMinusButton);
		
		JButton divideButton=new JButton("/");
		divideButton.setBounds(485, 240, 80, 80);
		divideButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(divideButton);
		
		JButton plusButton=new JButton("+");
		plusButton.setBounds(385, 340, 80, 180);
		plusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(plusButton);
		
		JButton multipleButton=new JButton("x");
		multipleButton.setBounds(485, 340, 80, 80);
		multipleButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(multipleButton);
		
		JButton minusButton=new JButton("-");
		minusButton.setBounds(485, 440, 80, 80);
		minusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		jf.add(minusButton);
		
		/*operator buttons*/
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}
