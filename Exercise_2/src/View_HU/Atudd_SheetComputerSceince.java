package View_HU;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Atudd_SheetComputerSceince extends JFrame {
	private JTable table;

	public Atudd_SheetComputerSceince() {
		getContentPane().setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		
		
		
				table = new JTable();
				
				table.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
					},
					new String[] {
						"Name", "str", "Sun", "Mon", "Tus", "wen", "Th", "str", "Sun", "Mon", "Tus", "wen", "Th", "str", "Sun", "Mon", "Tus", "wen", "Th", "str", "Sun", "Mon", "Tus", "wen", "Th"
					}
				));
				table.getColumnModel().getColumn(0).setPreferredWidth(77);
				table.getColumnModel().getColumn(1).setPreferredWidth(28);
				table.getColumnModel().getColumn(2).setPreferredWidth(30);
				table.getColumnModel().getColumn(2).setMinWidth(3);
				table.getColumnModel().getColumn(3).setPreferredWidth(30);
				table.getColumnModel().getColumn(4).setPreferredWidth(30);
				table.getColumnModel().getColumn(5).setPreferredWidth(31);
				table.getColumnModel().getColumn(6).setPreferredWidth(26);
				table.getColumnModel().getColumn(7).setPreferredWidth(28);
				table.getColumnModel().getColumn(8).setPreferredWidth(30);
				table.getColumnModel().getColumn(9).setPreferredWidth(30);
				table.getColumnModel().getColumn(9).setMinWidth(3);
				table.getColumnModel().getColumn(10).setPreferredWidth(27);
				table.getColumnModel().getColumn(11).setPreferredWidth(30);
				table.getColumnModel().getColumn(12).setPreferredWidth(27);
				table.getColumnModel().getColumn(13).setPreferredWidth(25);
				table.getColumnModel().getColumn(14).setPreferredWidth(30);
				table.getColumnModel().getColumn(15).setPreferredWidth(31);
				table.getColumnModel().getColumn(16).setPreferredWidth(30);
				table.getColumnModel().getColumn(17).setPreferredWidth(33);
				table.getColumnModel().getColumn(18).setPreferredWidth(25);
				table.getColumnModel().getColumn(19).setPreferredWidth(25);
				table.getColumnModel().getColumn(20).setPreferredWidth(30);
				table.getColumnModel().getColumn(21).setPreferredWidth(33);
				table.getColumnModel().getColumn(22).setPreferredWidth(29);
				table.getColumnModel().getColumn(23).setPreferredWidth(30);
				table.getColumnModel().getColumn(24).setPreferredWidth(26);
				panel.add(new JScrollPane(table));
		setSize(663, 390);
		setVisible(true);
	}
public static void main(String[] args) {
	new Atudd_SheetComputerSceince();
}
}
