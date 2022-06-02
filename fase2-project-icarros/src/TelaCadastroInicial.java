import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseMotionAdapter;

public class TelaCadastroInicial extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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

		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				botao_salvar.setBorderPainted(isDefaultLookAndFeelDecorated());
			}
		});
		botao_salvar.setBounds(58, 11, 22, 22);
		contentPane.add(botao_salvar);
		
		JButton botao_deletar = new JButton("");
		botao_deletar.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\Close-2-icon.png"));
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
		
		JButton botao_new_project = new JButton("");
		botao_new_project.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		botao_new_project.setSelectedIcon(null);
		botao_new_project.setFocusTraversalPolicyProvider(true);
		botao_new_project.setFocusCycleRoot(true);
		botao_new_project.setSelected(true);
		botao_new_project.setContentAreaFilled(false);
		botao_new_project.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao_new_project.setBorderPainted(getFocusTraversalKeysEnabled());
			}
		});
		botao_new_project.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\fase2-project-icarros\\img\\new-file-icon (1).png"));
		botao_new_project.setBounds(26, 11, 22, 22);
		contentPane.add(botao_new_project);
	}
}
