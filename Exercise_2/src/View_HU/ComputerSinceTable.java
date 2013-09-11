package View_HU;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComputerSinceTable extends JFrame implements Field {
	private JTable table;
	JPanel buttonPanel;
	private JButton btnNewButton;
	private JButton btnDelete;

	public ComputerSinceTable() {

		buttonPanel = new JPanel();

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout());

		table = new JTable();

		final DefaultTableModel model = new DefaultTableModel(new String[] {
				"Id", "Name", "F/Name", "L/Name", "phone", "Age", "Field",
				"Department", "Picture" }, 3);

		Vector<String> buffer;
		int index = 0;

		// FileReader reader = null;

		try {

			// reader = new FileReader(new File("D:\\hadisa.txt"));
			Scanner read = new Scanner(
					new File("DataBase\\ComputerScience.txt"));

			// BufferedReader read = new BufferedReader(reader);

			String str = null;
			while (read.hasNextLine()) {
				buffer = new Vector<String>();
				str = read.nextLine();
				String[] line = str.split(",");
				for (int i = 0; i < line.length; i++) {
					buffer.add(line[i]);
				}
				model.insertRow(index, buffer);
				index++;
				str = read.nextLine();
				// buffer.removeAllElements();
			}
			// reader.close();
			read.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		table.setModel(model);

		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		FlowLayout fl_buttonPanel = new FlowLayout();
		fl_buttonPanel.setAlignment(FlowLayout.RIGHT);
		buttonPanel.setLayout(fl_buttonPanel);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (table.getSelectedRow() >= 0) {
					model.removeRow(table.getSelectedRow());
				}

			}
		});
		buttonPanel.add(btnDelete);

		btnNewButton = new JButton("Edite");
		buttonPanel.add(btnNewButton);

		setSize(836, 420);
		setVisible(true);
	}

	// public static void main(String[] args) {
	// new ComputerSinceTable();
	// }

	@Override
	public String getField() {
		// TODO Auto-generated method stub
		return null;
	}
}
