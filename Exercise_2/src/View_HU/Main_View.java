package View_HU;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Main_View extends JFrame{
	public Main_View() {
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		tabbedPane.addTab("New tab", null,new View_Registeratino(), null);
		
		setSize(501, 506);
	}
	
	
	
public static void main(String[] args) {
	Main_View ob=new Main_View();
	ob.setVisible(true);
}
}
