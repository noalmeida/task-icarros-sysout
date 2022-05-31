package formIfram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControleCampos extends JFrame {

	private JPanel contentPane;
	private JTextField text_id;
	private JTextField text_nome;
	private JTextField text_pais;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleCampos frame = new ControleCampos();
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
	public ControleCampos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] paises = {"Brasil", "Mexico", "Itália", "Argentina"};
		JList list = new JList(paises);
		list.setBounds(369, 45, 89, 134);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox(paises);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text_pais.setText((String) comboBox.getModel().getSelectedItem());
			}
		});
	
			
			
				
				
			
	
		comboBox.setBounds(281, 45, 68, 24);
		contentPane.add(comboBox);
		
		JLabel Label_ID = new JLabel("ID");
		Label_ID.setBounds(26, 45, 46, 14);
		contentPane.add(Label_ID);
		
		text_id = new JTextField();
		text_id.setBounds(82, 43, 86, 20);
		contentPane.add(text_id);
		text_id.setColumns(10);
		
		JLabel Label_Nome = new JLabel("Nome");
		Label_Nome.setBounds(26, 80, 46, 14);
		contentPane.add(Label_Nome);
		
		text_nome = new JTextField();
		text_nome.setBounds(82, 77, 86, 20);
		contentPane.add(text_nome);
		text_nome.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text_id.setText("");
				text_pais.setText("");
				text_nome.setText("");
			
			}
		});
		btnNewButton.setBounds(26, 190, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel Label_Pais = new JLabel("Pa\u00EDs");
		Label_Pais.setBounds(26, 122, 46, 14);
		contentPane.add(Label_Pais);
		
		text_pais = new JTextField();
		text_pais.setBounds(82, 119, 86, 20);
		contentPane.add(text_pais);
		text_pais.setColumns(10);
	}
}
