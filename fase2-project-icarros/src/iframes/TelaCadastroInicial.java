package iframes;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField text_id;
	private JTextField text_nome;
	private JTextField text_endereco;
	private JTextField text_cep;
	private JTextField text_bairro;
	private JTextField text_cidade;
	private JTextField text_uf;
	private JTextField text_telefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroInicial frame = new TelaCadastroInicial();
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
	public TelaCadastroInicial() {
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 300);
		contentPane = new JPanel();

	
		contentPane.setFocusCycleRoot(true);
		contentPane.setForeground(UIManager.getColor("Button.background"));
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botao_salvar = new JButton("");
		botao_salvar.setFocusTraversalPolicyProvider(true);
		botao_salvar.setFocusCycleRoot(true);
		botao_salvar.setSelected(true);
		botao_salvar.setContentAreaFilled(false);
		botao_salvar.setSelectedIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\floppy-icon.png"));
		botao_salvar.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\floppy-icon.png"));
		botao_salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao_salvar.setBorderPainted(getFocusTraversalKeysEnabled());
				
			}
		});

	
		botao_salvar.setBounds(58, 11, 22, 22);
		contentPane.add(botao_salvar);
		
		JButton botao_deletar = new JButton("");
		botao_deletar.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\delete.png"));
		botao_deletar.setBorderPainted(false);
		botao_deletar.setSelectedIcon(null);
		botao_deletar.setFocusTraversalPolicyProvider(true);
		botao_deletar.setFocusCycleRoot(true);
		botao_deletar.setSelected(true);
		botao_deletar.setContentAreaFilled(false);
		botao_deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao_deletar.setBorderPainted(getFocusTraversalKeysEnabled());
			}
		});
		botao_deletar.setBounds(90, 11, 22, 22);
		contentPane.add(botao_deletar);
		
		JButton botao_lixeira = new JButton("");
		botao_lixeira.setBorderPainted(false);
		botao_lixeira.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\trash-icon.png"));
		botao_lixeira.setSelectedIcon(null);
		botao_lixeira.setFocusTraversalPolicyProvider(true);
		botao_lixeira.setFocusCycleRoot(true);
		botao_lixeira.setSelected(true);
		botao_lixeira.setContentAreaFilled(false);
		botao_lixeira.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao_lixeira.setBorderPainted(getFocusTraversalKeysEnabled());
			}
		});
		botao_lixeira.setBounds(122, 11, 22, 22);
		contentPane.add(botao_lixeira);
		
		JButton botao_editar = new JButton("");
		botao_editar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		botao_editar.setBorderPainted(false);
		botao_editar.setSelectedIcon(null);
		botao_editar.setFocusTraversalPolicyProvider(true);
		botao_editar.setFocusCycleRoot(true);
		botao_editar.setSelected(true);
		botao_editar.setContentAreaFilled(false);
		botao_editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao_editar.setBorderPainted(getFocusTraversalKeysEnabled());
			}
		});
		botao_editar.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\edit-file-icon24.png"));
		botao_editar.setBounds(26, 11, 22, 22);
		contentPane.add(botao_editar);
		
		JLabel lblNewLabel = new JLabel("| Buscar por Id:");
		lblNewLabel.setBounds(180, 11, 109, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(272, 13, 137, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton pesquisa_id = new JButton("");
		pesquisa_id.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\search-icon16.png"));
		pesquisa_id.setBorderPainted(false);
		pesquisa_id.setSelectedIcon(null);
		pesquisa_id.setFocusTraversalPolicyProvider(true);
		pesquisa_id.setFocusCycleRoot(true);
		pesquisa_id.setSelected(true);
		pesquisa_id.setContentAreaFilled(false);
		pesquisa_id.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisa_id.setBorderPainted(getFocusTraversalKeysEnabled());
			}
		});
		pesquisa_id.setBounds(419, 11, 22, 22);
		contentPane.add(pesquisa_id);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(26, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setBounds(82, 69, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edere\u00E7o");
		lblNewLabel_3.setBounds(26, 111, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CEP");
		lblNewLabel_4.setBounds(26, 156, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bairro");
		lblNewLabel_5.setBounds(122, 156, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade");
		lblNewLabel_6.setBounds(225, 156, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("UF");
		lblNewLabel_7.setBounds(389, 156, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Telefone");
		lblNewLabel_8.setBounds(26, 199, 86, 14);
		contentPane.add(lblNewLabel_8);
		
		text_id = new JTextField();
		text_id.setBounds(26, 83, 46, 17);
		contentPane.add(text_id);
		text_id.setColumns(10);
		
		text_nome = new JTextField();
		text_nome.setBounds(82, 83, 359, 17);
		contentPane.add(text_nome);
		text_nome.setColumns(10);
		
		text_endereco = new JTextField();
		text_endereco.setBounds(26, 128, 415, 17);
		contentPane.add(text_endereco);
		text_endereco.setColumns(10);
		
		text_cep = new JTextField();
		text_cep.setBounds(26, 171, 86, 17);
		contentPane.add(text_cep);
		text_cep.setColumns(10);
		
		text_bairro = new JTextField();
		text_bairro.setBounds(122, 171, 86, 17);
		contentPane.add(text_bairro);
		text_bairro.setColumns(10);
		
		text_cidade = new JTextField();
		text_cidade.setBounds(225, 171, 128, 17);
		contentPane.add(text_cidade);
		text_cidade.setColumns(10);
		
		text_uf = new JTextField();
		text_uf.setBounds(389, 171, 52, 17);
		contentPane.add(text_uf);
		text_uf.setColumns(10);
		
		text_telefone = new JTextField();
		text_telefone.setBounds(26, 219, 86, 17);
		contentPane.add(text_telefone);
		text_telefone.setColumns(10);
		
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				botao_salvar.setBorderPainted(isDefaultLookAndFeelDecorated());
				botao_deletar.setBorderPainted(isDefaultLookAndFeelDecorated());
				botao_editar.setBorderPainted(isDefaultLookAndFeelDecorated());
				botao_lixeira.setBorderPainted(isDefaultLookAndFeelDecorated());
				pesquisa_id.setBorderPainted(isDefaultLookAndFeelDecorated());
			}
		});
	}
}
