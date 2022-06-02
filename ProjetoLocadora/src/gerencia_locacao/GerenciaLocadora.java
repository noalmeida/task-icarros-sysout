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

public class GerenciaLocadora extends JFrame {

	private JPanel contentPane;
	private JTable tabela;

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
		setBounds(100, 100, 743, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(326, 38, 391, 331);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		tabela.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"data_modificacao_filme", "imagem_filme", "sinopse_filme", "data_lancamento_filme", "genero_filme", "duracao_filme", "nome_filme", "id_filme"
			}
		));
		
		JLabel lblNewLabel = ceinew JLabel("Sistema Loca\u00E7\u00E3o de filmes");
		lblNewLabel.setBounds(68, 22, 175, 14);
		contentPane.add(lblNewLabel);
	}
}
