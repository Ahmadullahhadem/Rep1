package View_HU;

import javax.swing.JFrame;

import Controller_View.Registeration_Controller;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;

public class View_Registeratino extends JFrame {
	Faculty_Factory factory;

	Boolean cheakingType;

	public JTextField textName;
	public JTextField textFName;
	public JTextField textLname;
	public JTextField textPhone;
	public JTextField textAge;
	public JTextField textId;

	final JComboBox comboBoxField;
	static JLabel lblPicture;
	
	
	JComboBox<String> comboBox_Depa ;
	JLabel lblDepartment ;

	@SuppressWarnings("unchecked")
	public View_Registeratino() {
		
		final String[] computer_De={"NetWorke","DataBase","Software"};
		final String[] science_De={"Phisic","Math","Biologie"};
		
		comboBox_Depa= new JComboBox(computer_De);
		//comboBox_Depa.setVisible(false);
		lblDepartment = new JLabel("Department :");
		//lblDepartment.setVisible(false);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		factory = new Faculty_Factory();

		getContentPane().setLayout(
				new FormLayout(new ColumnSpec[] {
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(51dlu;default):grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(44dlu;default)"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("max(45dlu;default):grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						FormFactory.DEFAULT_COLSPEC,
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblRegisterNewStudent = new JLabel("Department Registeration");
		lblRegisterNewStudent
				.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		getContentPane().add(lblRegisterNewStudent,
				"2, 2, 12, 1, center, default");

		JSeparator separator = new JSeparator();
		getContentPane().add(separator, "2, 4, 19, 1");

		JLabel lblName = new JLabel("Name :");
		getContentPane().add(lblName, "2, 6, left, default");

		textName = new JTextField();
		getContentPane().add(textName, "4, 6, 4, 1, fill, default");
		textName.setColumns(10);

		JLabel lblFname = new JLabel("F /Name :");
		getContentPane().add(lblFname, "2, 8, left, default");

		textFName = new JTextField();
		getContentPane().add(textFName, "4, 8, 4, 1, fill, default");
		textFName.setColumns(10);

		lblPicture = new JLabel("Picture");
		lblPicture.setForeground(Color.WHITE);
		lblPicture.setBackground(Color.WHITE);
		getContentPane().add(lblPicture, "11, 6, 3, 5");

		JLabel lblLname = new JLabel("L/Name :");
		getContentPane().add(lblLname, "2, 10, left, default");

		textLname = new JTextField();
		getContentPane().add(textLname, "4, 10, 4, 1, fill, default");
		textLname.setColumns(10);

		JButton btnLoadPicture = new JButton("Load Picture");
		btnLoadPicture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				loadinginer op = new loadinginer();
				op.loading();

			}
		});

		JLabel lblPhone = new JLabel("Phone :");
		getContentPane().add(lblPhone, "2, 12, left, default");

		textPhone = new JTextField();
		getContentPane().add(textPhone, "4, 12, 3, 1, fill, default");
		textPhone.setColumns(10);
		getContentPane().add(btnLoadPicture, "10, 12, 4, 1");

		JLabel lblAge = new JLabel("Age :");
		getContentPane().add(lblAge, "2, 14, left, default");

		textAge = new JTextField();
		getContentPane().add(textAge, "4, 14, 3, 1, fill, default");
		textAge.setColumns(10);

		JLabel lblId = new JLabel("Id :");
		getContentPane().add(lblId, "2, 16, left, default");

		textId = new JTextField();
		getContentPane().add(textId, "4, 16, 3, 1, fill, default");
		textId.setColumns(10);

		JLabel lblField = new JLabel("Field");
		getContentPane().add(lblField, "2, 18, left, default");

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		comboBoxField = new JComboBox(new String[] { "ComputerSience",
				"Science" });
		
		comboBoxField.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				comboBox_Depa.removeAllItems();
				if(comboBoxField.getSelectedItem().equals("Science")){
					
					comboBox_Depa.addItem("Phisic");
					comboBox_Depa.addItem("Math");
					comboBox_Depa.addItem("Biologies");
					
				}
				
			}
		});
		

		getContentPane().add(comboBoxField, "6, 18, fill, default");
		getContentPane().add(btnCancel, "12, 18");

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String marraied;

				if (textName.getText().equals("")
						& textFName.getText().equals("")
						& textLname.getText().equals("")
						& textAge.getText().equals("")
						& textId.getText().equals("")

				) {

					JOptionPane.showMessageDialog(null,
							"Please Fill the Form Correctly!!!");

				}

				String line = textId.getText() + "," + textName.getText() + ","
						+ textFName.getText() + "," + textLname.getText() + ","
						+ textAge.getText() + "," + textPhone.getText() + ","
						+ comboBoxField.getSelectedItem() + "\n";
				File file;
				if (comboBoxField.getSelectedItem().toString()
						.equalsIgnoreCase("ComputerSience")) {
					file = new File("DataBase\\ComputerScience.txt");
				} else {
					file = new File("DataBase\\ScienceDataBase.txt");
				}
				if (file.exists()) {
					String path = file.getAbsolutePath();
					System.out.println(path);

					try {

						FileWriter write = new FileWriter(file, true);

						write.append(line);

						write.close();

					} catch (FileNotFoundException ex) {

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("File is not exist!!!");
				}

				textName.setText("");
				textFName.setText("");

				textAge.setText("");

				textId.setText("");

				textLname.setText("");
				textPhone.setText("");

				Field field = factory.creatFieldTable(comboBoxField
						.getSelectedItem().toString());
				
				

			}

		});

		 
		getContentPane().add(lblDepartment, "2, 20");

		
		getContentPane().add(comboBox_Depa, "6, 20, fill, default");
		getContentPane().add(btnSave, "12, 20");

		setSize(342, 312);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public Field orderFaculty(String type) {

		Field fieldin;
		fieldin = factory.creatFieldTable(type);

		return fieldin;

	}

	public static class loadinginer {
		static File picFile;
		static String path = "";

		public void loading() {
			JFileChooser fileChosser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"JPG or GIF", "gif");

			fileChosser.setFileFilter(filter);

			fileChosser.setMultiSelectionEnabled(false);

			int rvalue = fileChosser.showOpenDialog(null);

			if (rvalue == JFileChooser.APPROVE_OPTION) {
				picFile = fileChosser.getSelectedFile();
				lblPicture.setIcon(new ImageIcon(picFile.getAbsolutePath()));
				path = picFile.getAbsolutePath();
				lblPicture.setSize(new Dimension(20, 20));

			}
		}

	}

	public ActionListener ShowMassage() {

		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int value = JOptionPane.showConfirmDialog(null,
						"Do you want to get your credit???");

				if (value == JOptionPane.OK_OPTION) {
					cheakingType = true;
				} else {
					cheakingType = false;
				}
			}
		};
		return action;

	}

}
