package armazenaCal;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class History extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History frame = new History();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public History() throws IOException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setTitle("Historico");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String[] vt = new String[6];
		
		
		
	
		
	
		
	
		  File fp = new File("d:\\history.txt");
		  FileReader fr = new FileReader(fp);
		  BufferedReader br = new BufferedReader(fr);
		  
		  ArrayList<String> lines = new ArrayList<>();
		  
		  
		  String line;
		  
		  while((line = br.readLine()) != null) { 
			  System.out.println("entrei aqui1");
			  lines.add(line + "\n");
			  int count = 0;
			  for (int i1 = 0; i1 < lines.size(); i1++ ) {
				  count++;
				  vt[count] = lines.get(i1);
				  System.out.println("entrei aqui");
				  System.out.println(i1);
			  }
			 
			  
		  }
		    JList list = new JList(vt);
			list.setBounds(69, 46, 232, 159);
			contentPane.add(list);
			System.out.println(vt);

		  fr.close();
		 
		
		
		
		
		
	       
	    }

	

	
}
