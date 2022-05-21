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

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 289, 212);
		contentPane.add(textArea);
	
		
	
		  File fp = new File("d:\\calc.txt");
		  FileReader fr = new FileReader(fp);
		  BufferedReader br = new BufferedReader(fr);
		  
		  ArrayList<String> lines = new ArrayList<>();
		  
		  String line;
		  
		  while((line = br.readLine()) != null) { 
			  lines.add(line + "\n");
			  textArea.setText(String.join(",", lines));
			  
		  }

		  fr.close();
		 
		
		
		
		
		
	       
	    }

	

	
}
