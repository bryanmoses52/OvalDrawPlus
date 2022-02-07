import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class panel extends JPanel{
	
	
		
	public panel() {
	
	
	
		setBounds(250, 150, 400, 500);
		setBackground(Color.black);
		setLayout(null);
		setVisible(true);
	}
		public void paint(Graphics g) {
			
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.blue);
		g.drawRect(0, 0, width, height);
		g.fillRect(0, 0, width, height);
		g.setColor(Color.pink);
		g.drawOval(0, 0, width, height);
		g.fillOval(0, 0, width, height);
	}
}

	class window extends JFrame{
			window(){
			setTitle("OvalDrawPlus");
			setBounds(250,150,400,500);
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			addWindowListener(new WindowAdapter() {
				
				@Override
				public void windowClosing(WindowEvent e) {
					int x = JOptionPane.showConfirmDialog(null, "Do you really want to close OvalDrawPlus?", 
							"close", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
					
					if(x==JOptionPane.YES_OPTION) {
						e.getWindow().dispose();
						System.out.println("Closing OvalDrawPlus...");
					}
					else {
						System.out.println("Failed confirmation to close OvalDrawPlus");
					}
				}
			
				});
			
			panel myPanel = new panel();
			Container contentPane = getContentPane();
			contentPane.add(myPanel);
			}
	}
				
	
		
	

		public class OvalDrawPlus {
			public static void main(String[] args) {
				System.out.println("Starting OvalDrawPlus...");
				window myWindow = new window();
				myWindow.setVisible(true);
				
				
			}
		}


