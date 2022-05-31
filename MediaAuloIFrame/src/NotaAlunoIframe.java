import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class NotaAlunoIframe extends JFrame {

	private JPanel contentPane;
	private JTextField id_aluno;
	private JTextField nota_1;
	private JTextField nome_aluno;
	private JTextField nota_2;
	private JTable table;
	String condicao = "";

	DefaultTableModel model = new DefaultTableModel();
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotaAlunoIframe frame = new NotaAlunoIframe();
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
	public NotaAlunoIframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("nome");
		lblNewLabel.setBounds(435, 78, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(435, 26, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota 1");
		lblNewLabel_2.setBounds(435, 53, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota 2");
		lblNewLabel_3.setBounds(435, 103, 46, 14);
		contentPane.add(lblNewLabel_3);

		id_aluno = new JTextField();
		id_aluno.setBounds(489, 23, 86, 20);
		contentPane.add(id_aluno);
		id_aluno.setColumns(10);

		nota_1 = new JTextField();
		nota_1.setBounds(491, 50, 86, 20);
		contentPane.add(nota_1);
		nota_1.setColumns(10);

		nome_aluno = new JTextField();
		nome_aluno.setBounds(491, 75, 132, 20);
		contentPane.add(nome_aluno);
		nome_aluno.setColumns(10);

		nota_2 = new JTextField();
		nota_2.setBounds(491, 100, 86, 20);
		contentPane.add(nota_2);
		nota_2.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 37, 316, 299);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				table.getCursor();
				table.getSelectedRows();
			}
		});
		scrollPane.setViewportView(table);

		Object[] column = { "ID_Aluno", "Nome_Aluno", "Nota1_Aluno", "Nota2_Aluno", "Média", "Condição" };
		Object[] row = new Object[6];
		model.setColumnIdentifiers(column);
		table.setModel(model);

		btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (id_aluno.getText().equals("") || nome_aluno.getText().equals("") || nota_1.getText().equals("")
						|| nota_2.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Insira todos os campos");

				} else {
					double nota1 = Double.parseDouble(nota_1.getText());
					double nota2 = Double.parseDouble(nota_2.getText());
					double sumResultMedia = ((nota1 + nota2) / 2);
					String returnMedia = String.valueOf(sumResultMedia);
					if (sumResultMedia > 7) {
						condicao = "Aprovado";
					} else if (sumResultMedia < 7 && sumResultMedia >= 5) {
						condicao = "Recuperação";
					} else {
						condicao = "Reprovado";
					}
					row[0] = id_aluno.getText();
					row[1] = nome_aluno.getText();
					row[2] = nota_1.getText();
					row[3] = nota_2.getText();
					row[5] = condicao;

					row[4] = returnMedia;
					row[5] = condicao;
					model.addRow(row);
					id_aluno.setText("");
					nome_aluno.setText("");
					nota_1.setText("");
					nota_2.setText("");

				}

			}
		});
		btnNewButton.setBounds(486, 131, 89, 23);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.removeAll();
				
				if(model.getRowCount() > 0) {
					int contador = table.getSelectedRow();
					if(table.getSelectedRow() == -1) {
						table.requestFocus();
					}
					
	                model.removeRow(contador);
					
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Nao tem linhas para serem deletadas");
				}
			}
			
		});
		btnNewButton_1.setBounds(585, 131, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
