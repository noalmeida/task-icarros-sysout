package Rotinas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textEmail;
	private JTextField textCareer;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroUsuario frame = new CadastroUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(184, 11, 63, 21);
		contentPane.add(lblNewLabel);
		if(lblNewLabel.getText() == null || lblNewLabel.getText() == " ") {
			Validator validatorRequiredFilds = new Validator();
			validatorRequiredFilds.messageReturnForRequired();
			
		}
		
		textName = new JTextField();
		textName.setBounds(103, 36, 183, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(179, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		if(lblNewLabel_1.getText() == null || lblNewLabel_1.getText() == " ") {
			Validator validatorRequiredFilds = new Validator();
			validatorRequiredFilds.messageReturnForRequired();
			
		}
		
		textAge = new JTextField();
		textAge.setBounds(103, 92, 183, 20);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(179, 123, 46, 14);
		contentPane.add(lblNewLabel_2);
		if(lblNewLabel_2.getText() == null || lblNewLabel_2.getText() == " ") {
			Validator validatorRequiredFilds = new Validator();
			validatorRequiredFilds.messageReturnForRequired();
			
		}
		
		textEmail = new JTextField();
		textEmail.setBounds(103, 148, 183, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Profiss\u00E3o");
		lblNewLabel_3.setBounds(170, 179, 55, 14);
		contentPane.add(lblNewLabel_3);
		if(lblNewLabel_3.getText() == null || lblNewLabel_3.getText() == " ") {
			Validator validatorRequiredFilds = new Validator();
			validatorRequiredFilds.messageReturnForRequired();
			
		}
		
		textCareer = new JTextField();
		textCareer.setBounds(103, 204, 183, 20);
		contentPane.add(textCareer);
		textCareer.setColumns(10);
		
		btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblNewLabel.getText() == null || lblNewLabel.getText() == " ") {
					Validator validatorRequiredFilds = new Validator();
					validatorRequiredFilds.messageReturnForRequired();
					
				}
			}
		});
		btnNewButton.setBounds(158, 227, 89, 23);
		contentPane.add(btnNewButton);
	}

}
