package armazenaCal;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField textResult;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	Double value1, value2;
	String sinal = "";

	
	public Calc() throws IOException {
		setTitle("Calculadora");
		setBounds(100, 100, 450, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		History hist = new History();
		ArrayList<String> historyArr = new ArrayList<>();
		
		
		
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("d:\\calc.txt"), "UTF-8");

		BufferedWriter bufWriter = new BufferedWriter(writer);
		
		
		
		JLabel lblNewLabel = new JLabel("Calculadora Padr\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(108, 11, 202, 14);
		contentPane.add(lblNewLabel);
		
		textResult = new JTextField();
		textResult.setBounds(25, 42, 369, 62);
		contentPane.add(textResult);
		textResult.setColumns(10);
		textResult.setText("0");
	
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "7");
			}
		});
		btnNewButton.setBounds(25, 115, 57, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "8");
			}
		});
		btnNewButton_1.setBounds(92, 115, 57, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "9");
			}
		});
		btnNewButton_2.setBounds(159, 115, 57, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "4");
			}
		});
		btnNewButton_3.setBounds(25, 158, 57, 32);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "5");
			}
		});
		btnNewButton_4.setBounds(92, 158, 57, 32);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "6");
			}
		});
		btnNewButton_5.setBounds(159, 158, 57, 32);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "1");
			}
		});
		btnNewButton_6.setBounds(25, 201, 57, 32);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "2");
			}
		});
		btnNewButton_7.setBounds(92, 201, 57, 32);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "3");
			}
		});
		btnNewButton_8.setBounds(159, 201, 57, 32);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText("");
				textResult.setText(textResult.getText() + "0");
			}
		});
		btnNewButton_9.setBounds(25, 244, 124, 32);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(",");
		btnNewButton_10.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+",");
				
				if(textResult.getText().contains(",")) {
					btnNewButton_10.setEnabled(false);
				}
				if(textResult.getText().isEmpty()
						|| textResult.getText().contains(",") ) {
						btnNewButton_10.setEnabled(false);
				}
				
		
				
			}
	
		});
		btnNewButton_10.setBounds(159, 244, 57, 32);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("CE");
		btnNewButton_11.setBounds(226, 115, 50, 32);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("C");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				textResult.setText("");
				btnNewButton_10.setEnabled(true);
			
			
			}
		});
		btnNewButton_12.setBounds(226, 158, 52, 32);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 = Double.parseDouble(textResult.getText().replace(",", "."));
				switch (sinal) {

				case "+":
					
					double sumResult = value1 + value2;
					textResult.setText(String.valueOf(sumResult));		
					historyArr.addAll(Arrays.asList(value1 +" "+ sinal +" "+ value2 +" = "+ textResult.getText()));
					
					
				


				break;

				case "*":
					double mult = (value1 * value2);
					textResult.setText(String.valueOf(mult));	
					historyArr.addAll(Arrays.asList(value1 +" "+ sinal +" "+ value2 +" = "+ textResult.getText()));
				

				break;

				case "/":
					double div = (value1 / value2);
					textResult.setText(String.valueOf(div));
					historyArr.addAll(Arrays.asList(value1 +" "+ sinal +" "+ value2 +" = "+ textResult.getText()));

				

				break;
				case "-":
					double sub = value1 - value2;
					textResult.setText(String.valueOf(sub));
					historyArr.addAll(Arrays.asList(value1 +" "+ sinal +" "+ value2 +" = "+ textResult.getText()));


				break;

				default:
                    
				}
			

			}
		});
		btnNewButton_13.setBounds(226, 201, 52, 75);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("X");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = Double.parseDouble(textResult.getText().replace(",", "."));
				sinal ="*";
				textResult.setText("");
			}
		});
		btnNewButton_14.setBounds(307, 115, 50, 32);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1 = Double.parseDouble(textResult.getText().replace(",", "."));
				sinal ="+";
				textResult.setText("");
				
			}
		});
		btnNewButton_15.setBounds(307, 158, 50, 32);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("/");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = Double.parseDouble(textResult.getText().replace(",", "."));
				sinal ="/";
				textResult.setText("");
			}
		});
		btnNewButton_16.setBounds(307, 201, 50, 32);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("-");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 = Double.parseDouble(textResult.getText().replace(",", "."));
				sinal ="-";
				textResult.setText("");
			}
		});
		btnNewButton_17.setBounds(307, 244, 50, 32);
		contentPane.add(btnNewButton_17);

		JButton btnNewButton_18 = new JButton("Hist\u00F3rico de Opera\u00E7\u00F5es");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hist.setVisible(rootPaneCheckingEnabled);
				for (int i = 0; i < historyArr.size(); i++) {
					try {
						bufWriter.write(historyArr.get(i).toString());
						bufWriter.newLine();
					} catch (IOException e1) {

						e1.printStackTrace();
					}

				}
				try {
					bufWriter.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}

			}
		});
		
		btnNewButton_18.setBounds(25, 286, 251, 34);
		contentPane.add(btnNewButton_18);
	
   }
	
}
