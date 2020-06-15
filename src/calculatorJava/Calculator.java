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
	
	boolean isOperatorClicked=false, isPositive=true, isCalculateInitialized=false;
	
	String isOperator, oldValue, newValue, negativeValue;
	
	float result;
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton, dotButton, zeroButton, equalButton, clearButton, acButton, plusMinusButton, divideButton, plusButton, multipleButton, minusButton;
	
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
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(20, 140, 80, 80);
		sevenButton.setFont(new Font("Arual", Font.PLAIN, 30));
		sevenButton.setBackground(Color.white);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(120, 140, 80, 80);
		eightButton.setFont(new Font("Arual", Font.PLAIN, 30));
		eightButton.setBackground(Color.white);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(220, 140, 80, 80);
		nineButton.setFont(new Font("Arual", Font.PLAIN, 30));
		nineButton.setBackground(Color.white);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(20, 240, 80, 80);
		fourButton.setFont(new Font("Arual", Font.PLAIN, 30));
		fourButton.setBackground(Color.white);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(120, 240, 80, 80);
		fiveButton.setFont(new Font("Arual", Font.PLAIN, 30));
		fiveButton.setBackground(Color.white);
		fiveButton.addActionListener(this);                                                                                                                                           
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(220, 240, 80, 80);
		sixButton.setFont(new Font("Arual", Font.PLAIN, 30));
		sixButton.setBackground(Color.white);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(20, 340, 80, 80);
		oneButton.setFont(new Font("Arual", Font.PLAIN, 30));
		oneButton.setBackground(Color.white);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(120, 340, 80, 80);
		twoButton.setFont(new Font("Arual", Font.PLAIN, 30));
		twoButton.setBackground(Color.white);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(220, 340, 80, 80);
		threeButton.setFont(new Font("Arual", Font.PLAIN, 30));
		threeButton.setBackground(Color.white);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(20, 440, 80, 80);
		dotButton.setFont(new Font("Arual", Font.PLAIN, 30));
		dotButton.setBackground(Color.darkGray);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(120, 440, 80, 80);
		zeroButton.setFont(new Font("Arual", Font.PLAIN, 30));
		zeroButton.setBackground(Color.white);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(220, 440, 80, 80);
		equalButton.setFont(new Font("Arual", Font.PLAIN, 30));
		equalButton.setBackground(Color.orange);
		equalButton.setForeground(Color.white);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		/*numeric buttons*/
		
		/*operator buttons*/
		
		clearButton=new JButton("C");
		clearButton.setBounds(385, 140, 80, 80);
		clearButton.setFont(new Font("Arual", Font.PLAIN, 30));
		clearButton.setBackground(Color.red);
		clearButton.setForeground(Color.white);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		acButton=new JButton("AC");
		acButton.setBounds(485, 140, 80, 80);
		acButton.setFont(new Font("Arual", Font.PLAIN, 30));
		acButton.setBackground(Color.red);
		acButton.setForeground(Color.white);
		acButton.addActionListener(this);
		jf.add(acButton);
		
		plusMinusButton=new JButton("+/-");
		plusMinusButton.setBounds(385, 240, 80, 80);
		plusMinusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		plusMinusButton.setBackground(Color.black);
		plusMinusButton.setForeground(Color.white);
		plusMinusButton.addActionListener(this);
		jf.add(plusMinusButton);
		
		divideButton=new JButton("/");
		divideButton.setBounds(485, 240, 80, 80);
		divideButton.setFont(new Font("Arual", Font.PLAIN, 30));
		divideButton.setBackground(Color.black);
		divideButton.setForeground(Color.white);
		divideButton.addActionListener(this);
		jf.add(divideButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(385, 340, 80, 180);
		plusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		plusButton.setBackground(Color.black);
		plusButton.setForeground(Color.white);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		multipleButton=new JButton("x");
		multipleButton.setBounds(485, 340, 80, 80);
		multipleButton.setFont(new Font("Arual", Font.PLAIN, 30));
		multipleButton.setBackground(Color.black);
		multipleButton.setForeground(Color.white);
		multipleButton.addActionListener(this);
		jf.add(multipleButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(485, 440, 80, 80);
		minusButton.setFont(new Font("Arual", Font.PLAIN, 30));
		minusButton.setBackground(Color.black);
		minusButton.setForeground(Color.white);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		/*operator buttons*/
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("7");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("7");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"7");
				}	
			}
		}else if(e.getSource()==eightButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("8");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("8");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"8");
				}
			}
		}else if(e.getSource()==nineButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("9");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("9");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"9");
				}
			}
		}else if(e.getSource()==fourButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("4");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("4");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"4");
				}
			}
		}else if(e.getSource()==fiveButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("5");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("5");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"5");
				}
			}
		}else if(e.getSource()==sixButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("6");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("6");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"6");
				}
			}
		}else if(e.getSource()==oneButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("1");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("1");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"1");
				}
			}
		}else if(e.getSource()==twoButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("2");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("2");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"2");
				}
			}
		}else if(e.getSource()==threeButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("3");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("3");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"3");
				}
			}
		}else if(e.getSource()==zeroButton) {
			if(displayLabel.getText()=="0") {
				displayLabel.setText("0");
			}else {
				if(isOperatorClicked) {
					displayLabel.setText("0");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"0");
				}
			}
		}else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0.");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource()==equalButton) {

			newValue=displayLabel.getText();
			
			result=Calculate(newValue);
			
			displayLabel.setText(result+""); 
			
			isCalculateInitialized=false;
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("0");
		}else if(e.getSource()==acButton) {
			displayLabel.setText("0");
			isCalculateInitialized=false;
		}else if(e.getSource()==plusMinusButton) {
			if(isPositive) {
				displayLabel.setText("-"+displayLabel.getText());
				isPositive=false;
			}else {
				negativeValue=displayLabel.getText();
				displayLabel.setText(negativeValue.substring(1));
				isPositive=true;
			}
		}else if(e.getSource()==divideButton) {
			if(isCalculateInitialized) {
				newValue=displayLabel.getText();
				
				result=Calculate(newValue);
				
				displayLabel.setText(result+"");
				
				isOperatorClicked=true;
				oldValue=result+"";
				isOperator="/";
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				isOperator="/";
				oldValue=displayLabel.getText();
			}
		}else if(e.getSource()==plusButton) {
			if(isCalculateInitialized) {
				newValue=displayLabel.getText();
				
				result=Calculate(newValue);
				
				displayLabel.setText(result+"");
				
				isOperatorClicked=true;
				oldValue=result+"";
				isOperator="+";
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				isOperator="+";
				oldValue=displayLabel.getText();
			}
		}else if(e.getSource()==multipleButton) {
			if(isCalculateInitialized) {
				newValue=displayLabel.getText();
				
				result=Calculate(newValue);
				
				displayLabel.setText(result+"");
				
				isOperatorClicked=true;
				oldValue=result+"";
				isOperator="*";
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				isOperator="*";
				oldValue=displayLabel.getText();
			}
		}else if(e.getSource()==minusButton) {
			if(isCalculateInitialized) {
				newValue=displayLabel.getText();
				
				result=Calculate(newValue);
				
				displayLabel.setText(result+"");
				
				isOperatorClicked=true;
				oldValue=result+"";
				isOperator="-";
			}else {
				isOperatorClicked=true;
				isCalculateInitialized=true;
				isOperator="-";
				oldValue=displayLabel.getText();
			}
		}
		
	}
	
	public float Calculate(String value) {
		
		float firstValue=Float.parseFloat(oldValue);
		float secondValue=Float.parseFloat(value);
		
		if(isOperator=="+") {
			result=firstValue+secondValue;
		}else if(isOperator=="-") {
			result=firstValue-secondValue;
		}else if(isOperator=="*") {
			result=firstValue*secondValue;
		}else if(isOperator=="/") {
			result=firstValue/secondValue;
		}
		
		return result;
	}
	
}
