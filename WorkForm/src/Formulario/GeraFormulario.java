package Formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GeraFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField nome;
	private JTextField email;
	private JTextField idade;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	DefaultTableModel model = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeraFormulario frame = new GeraFormulario();
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
	public GeraFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(29, 11, 68, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(29, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(29, 67, 54, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idade");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(29, 92, 54, 14);
		contentPane.add(lblNewLabel_3);
		
		id = new JTextField();
		id.setBounds(107, 18, 46, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		nome = new JTextField();
		nome.setBounds(107, 41, 302, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		email = new JTextField();
		email.setBounds(107, 66, 302, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(107, 91, 54, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
		
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		scrollPane.setBounds(107, 122, 398, 193);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = table.getSelectedRow();
				id.setText(model.getValueAt(contador, 0).toString());
				nome.setText(model.getValueAt(contador, 1).toString());
				email.setText(model.getValueAt(contador, 2).toString());
				idade.setText(model.getValueAt(contador, 3).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		Object[] column = {"ID", "Nome", "Email", "Idade"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if(id.getText().equals("") || nome.getText().equals("") || email.getText().equals("") || idade.getText().equals("")) {
					 JOptionPane.showMessageDialog(null, "insira todos os campos");
				 }
				 else {
					    row[0]	= id.getText();
						row[1] = nome.getText();
						row[2] = email.getText();
						row[3] = idade.getText();
						model.addRow(row);
						 id.setText("");
						 nome.setText("");
						 email.setText("");
						 idade.setText("");
				 }
			}
		});
		btnNewButton.setBounds(8, 135, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Atualizar");
		btnNewButton_1.setBounds(8, 170, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Deletar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.requestFocus();
				if(model.getRowCount() > 0) {
					int contador = table.getSelectedRow();
	                System.out.println(contador);
	                model.removeRow(contador);
					
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Nao tem linhas para serem deletadas");
				}
			}
		});
		btnNewButton_2.setBounds(8, 204, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Limpar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				nome.setText("");
				email.setText("");
				idade.setText("");
			}
		});
		btnNewButton_3.setBounds(8, 238, 89, 23);
		contentPane.add(btnNewButton_3);
}
	}
