import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListDataListener;

public class Relatorio extends JFrame {

	private JPanel contentPane;
	String [] sCurrentLineVetor = new String[10];
	int indexVetor = 0;
	 JList<String> myList = new JList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio frame = new Relatorio();
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
	public Relatorio() throws IOException {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BufferedReader br = null;
		 try {
			    String sCurrentLine;
				br = new BufferedReader(new FileReader("d:\\history.txt"));
				while ((sCurrentLine = br.readLine()) != null) {
					
					String [] ArrayInfos = sCurrentLine.split(",");
					sCurrentLineVetor[indexVetor] = "Nome: " + ArrayInfos[0] + "| Faltas: " + ArrayInfos[1]+ "| Nota1: " + ArrayInfos[2] + "| Nota2: " + ArrayInfos[3];
					indexVetor++;
				}

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 br.close();


	
		JList list = new JList(sCurrentLineVetor);
		
		list.setBounds(55, 32, 328, 170);
		contentPane.add(list);
	}

}
