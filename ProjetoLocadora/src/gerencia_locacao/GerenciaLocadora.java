package gerencia_locacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;

public class GerenciaLocadora extends JFrame {
	DefaultTableModel model = new DefaultTableModel();

	private JPanel contentPane;
	private JTable tabela;
	private JTextField nome_filme;
	private JTextField duracao_filme;
	private JTextField data_lancamento;
	private JTextField sinopse;
	private JTextField textField_4;
	String [] genero = new String[5];
	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciaLocadora frame = new GerenciaLocadora();
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
	public GerenciaLocadora() {
	
		setTitle("Sistema de Locadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Imagens
		String PathImagens = "C:\\Users\\noan\\workspace-icarr\\ProjetoLocadora\\src\\filmes";
		ArrayList<String> imagensPath = new ArrayList<>();
		
		//banco de dados
		BancoDeDados bancoMySql = new BancoDeDados();
		bancoMySql.conectar();
		// Chamando o select para retorno dos generos do combobox;
		if (bancoMySql.isConnected()) {

			genero = bancoMySql.retornaGeneros();
	        System.out.println("conexão do Banco realizada com sucesso");

		}
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(345, 38, 372, 184);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		Object[] row = new Object[8];
		Object[] column = {"id_filme", "nome_filme", "duracao_filme", "genero_filme", "data_lancamento_filme", "sinopse_filme", "imagem_filme", "data_modificacao_filme"};
		model.setColumnIdentifiers(column);
		tabela.setModel(model);
	
		
		
		JLabel lblNewLabel =  new JLabel("Sistema Loca\u00E7\u00E3o de filmes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(46, 22, 236, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sess\u00E3o de Filmes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(473, 13, 139, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("nome_filme");
		lblNewLabel_2.setBounds(10, 100, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		nome_filme = new JTextField();
		nome_filme.setBounds(114, 97, 139, 20);
		contentPane.add(nome_filme);
		nome_filme.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("duracao_filme");
		lblNewLabel_3.setBounds(10, 131, 70, 14);
		contentPane.add(lblNewLabel_3);
		
		duracao_filme = new JTextField();
		duracao_filme.setBounds(114, 128, 139, 20);
		contentPane.add(duracao_filme);
		duracao_filme.setColumns(10);
		
		data_lancamento = new JTextField();
		data_lancamento.setBounds(114, 191, 107, 20);
		contentPane.add(data_lancamento);
		data_lancamento.setColumns(10);
		
		Pattern DATE_PATTERN = Pattern.compile("^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((19|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((19|[2-9]\\d)\\d{2}))|(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$\r\n"
				+ "");
		
		if(!DATE_PATTERN.matcher(data_lancamento.getText()).matches()) {
			JOptionPane.showMessageDialog(null, "Digite uma data valida DD/MM/YYYY");
		}
		
		JLabel lblNewLabel_4 = new JLabel("genero_filme");
		lblNewLabel_4.setBounds(10, 163, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		
		JComboBox genero_filme = new JComboBox(genero);
		genero_filme.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			
			}
		});
		genero_filme.setBounds(114, 160, 124, 20);
		contentPane.add(genero_filme);
		
		JLabel lblNewLabel_5 = new JLabel("data_lancamento");
		lblNewLabel_5.setBounds(10, 194, 85, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("sinopse");
		lblNewLabel_6.setBounds(10, 219, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		sinopse = new JTextField();
		sinopse.setBounds(113, 222, 169, 67);
		contentPane.add(sinopse);
		sinopse.setColumns(10);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nome_filme.getText().equals("") || duracao_filme.getText().equals("") || data_lancamento.getText().equals("") || sinopse.getText().equals("")
						|| genero_filme.getItemCount() == 0) {

					JOptionPane.showMessageDialog(null, "Insira todos os campos");

				} else {
					if (bancoMySql.isConnected()) {

						  String Resultadoinsert  = bancoMySql.insertDadosInDatabase(nome_filme.getText(), duracao_filme.getText(), genero_filme.getSelectedItem(), data_lancamento.getText(), sinopse.getText());
						  
						System.out.println("inserindo dados no banco de dados");
						System.out.println(Resultadoinsert);
				        System.out.println("conexão do Banco realizada com sucesso");

					}
					if(bancoMySql.isConnected()) {
						// select na tabela
						
						
						row[0] = "null";
						row[1] = nome_filme.getText();
						row[2] = duracao_filme.getText();
						row[3] = genero_filme.getSelectedItem();
						row[4] = data_lancamento.getText();
						row[5] = sinopse.getText();
						row[6] = "";
						row[7] = "";
						model.addRow(row);
						
					}
				
					
					
					

				}
			}
		});
		btnNewButton.setBounds(10, 326, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deletar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (model.getRowCount() > 0) {
					int contador = tabela.getSelectedRow();
					if (tabela.getSelectedRow() == -1) {
						tabela.requestFocus();
					}
	
					tabela.remove(contador);
					model.removeRow(contador);
					

				} else {
					JOptionPane.showInternalMessageDialog(null, "Nao tem linhas para serem deletadas");
				}
			}
		});
		btnNewButton_1.setBounds(109, 326, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

           nome_filme.setText("");
           duracao_filme.setText("");
           data_lancamento.setText("");
           sinopse.setText("");
           genero_filme.setSelectedIndex(0);
				
			}
		});
		btnNewButton_2.setBounds(208, 326, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Modificar");
		btnNewButton_3.setBounds(114, 363, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Imagem Encarte");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(503, 233, 124, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(488, 253, 139, 133);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("sinopse");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(536, 385, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(438, 405, 277, 55);
		contentPane.add(textArea);
	}
}
