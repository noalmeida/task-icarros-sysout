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

public class iconss extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iconss frame = new iconss();
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
	public iconss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

	
		contentPane.setFocusCycleRoot(true);
		contentPane.setForeground(UIManager.getColor("Button.background"));
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusTraversalPolicyProvider(true);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setSelected(true);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\TESSSSSTTTT\\img\\floppy-icon.png"));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\noan\\workspace-icarr\\TESSSSSTTTT\\img\\floppy-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setBorderPainted(getFocusTraversalKeysEnabled());
				
			}
		});

		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				btnNewButton.setBorderPainted(isDefaultLookAndFeelDecorated());
			}
		});
		btnNewButton.setBounds(30, 11, 22, 22);
		contentPane.add(btnNewButton);
	}
}
