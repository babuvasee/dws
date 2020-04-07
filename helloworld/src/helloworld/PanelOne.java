package helloworld;

//java Program to create a simple JPanel add components to it 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 


public class PanelOne extends JFrame { 

	// JFrame 
	static JFrame f; 

	// JButton 
	static JButton b, b1, b2; 

	// label to diaplay text 
	static JLabel l; 
	
	public void paintComponent(Graphics g) {
	        super.paintComponents(g);  
	         g.drawRect(230,80,10,10);  
	         g.setColor(Color.RED);  
	         g.fillRect(230,80,10,10);  
	}

	// main class 
	public static void main(String[] args) 
	{ 
		// create a new frame to store text field and button 
		f = new JFrame("panel"); 

		// create a label to display text 
		l = new JLabel("panel label"); 

		// create a new buttons 
		b = new JButton("button1"); 
		b1 = new JButton("button2"); 
		b2 = new JButton("button3"); 

		// create a panel to add buttons 
		JPanel p = new JPanel(); 

		// add buttons and textfield to panel 
		p.add(b); 
		p.add(b1); 
		p.add(b2); 
		p.add(l); 
		
		
		
		// setbackground of panel 
		p.setBackground(Color.red); 

		// add panel to frame 
		f.add(p);
		
	

		// set the size of frame 
		f.setSize(300, 300); 

		f.setVisible(true); 
	} 
} 
