import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class resourceStudent extends JFrame {

	private JPanel contentPane;
	private JTextField text_nomeAluno;
	private JTextField text_faltas;
	private JTextField text_nota1;
	private JTextField text_nota2;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resourceStudent frame = new resourceStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public resourceStudent() throws UnsupportedEncodingException, FileNotFoundException {
		
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("d:\\history.txt"), "UTF-8");
		BufferedWriter bufWriter = new BufferedWriter(writer);
		ArrayList<String> historyArr = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 735, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(36, 36, 46, 14);
		contentPane.add(lblNewLabel);
		
		text_nomeAluno = new JTextField();
		text_nomeAluno.setBounds(108, 33, 288, 20);
		contentPane.add(text_nomeAluno);
		text_nomeAluno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Disciplina");
		lblNewLabel_1.setBounds(36, 73, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Faltas");
		lblNewLabel_2.setBounds(36, 150, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		text_faltas = new JTextField();
		text_faltas.setBounds(105, 147, 86, 20);
		contentPane.add(text_faltas);
		text_faltas.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nota1");
		lblNewLabel_3.setBounds(36, 186, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		text_nota1 = new JTextField();
		text_nota1.setBounds(105, 183, 86, 20);
		contentPane.add(text_nota1);
		text_nota1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nota2");
		lblNewLabel_4.setBounds(36, 222, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		text_nota2 = new JTextField();
		text_nota2.setBounds(106, 219, 86, 20);
		contentPane.add(text_nota2);
		text_nota2.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.setBounds(129, 297, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.removeAll();

				if (model.getRowCount() > 0) {
					int contador = table.getSelectedRow();
					if (table.getSelectedRow() == -1) {
						table.requestFocus();
					}
	
					historyArr.remove(contador);
					model.removeRow(contador);
					

				} else {
					JOptionPane.showInternalMessageDialog(null, "Nao tem linhas para serem deletadas");
				}
			}
		});
		btnNewButton_2.setBounds(227, 297, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, 36, 266, 288);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		Object[] column = {"Nome", "Disciplina", "Faltas", "Nota1", "Nota2"};
		Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (text_nomeAluno.getText().equals("") || text_faltas.getText().equals("") || text_nota1.getText().equals("")
						|| text_nota2.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Insira todos os campos");

				} else {
					
					row[0] = text_nomeAluno.getText();
					row[2] = text_faltas.getText();
					row[3] = text_nota1.getText();
					row[4] = text_nota2.getText();
					model.addRow(row);
					historyArr.addAll(Arrays.asList(text_nomeAluno.getText() + text_faltas.getText() + text_nota1.getText() + text_nota2.getText()));
					text_nomeAluno.setText("");
					text_faltas.setText("");
					text_nota1.setText("");
					text_nota2.setText("");
					

				}
				

			
				
			}
		});
		btnNewButton.setBounds(29, 297, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_3 = new JButton("Relat\u00F3rio");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Relatorio relatorio =  new Relatorio();
				relatorio.setVisible(rootPaneCheckingEnabled);
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
		btnNewButton_3.setBounds(129, 335, 89, 23);
		contentPane.add(btnNewButton_3);
		
		String[] discp = {"Português", "Matemática", "Geografia", "Filosofia"};
		JList list = new JList(discp);
		
		JComboBox comboBox = new JComboBox(discp);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				row[1] = (String) comboBox.getModel().getSelectedItem();
			}
		});
		comboBox.setBounds(110, 71, 132, 19);
		contentPane.add(comboBox);
		
	}
}
