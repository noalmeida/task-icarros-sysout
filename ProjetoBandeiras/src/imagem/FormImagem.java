package imagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormImagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormImagem frame = new FormImagem();
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
	public FormImagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema de gerenciamento de Bandeira");
		lblNewLabel.setBounds(217, 44, 235, 30);
		contentPane.add(lblNewLabel);
		
		String[] paises = {"Brasil", "Italia", "Mexico","Alemanha" };
		
		JLabel bandeira = new JLabel("bandeira");
		bandeira.setBounds(295, 98, 303, 265);
		contentPane.add(bandeira);
		
		JList list = new JList(paises);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		list.setBounds(45, 97, 187, 281);
		contentPane.add(list);
		
	
	}
}
