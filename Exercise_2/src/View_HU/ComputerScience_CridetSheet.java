package View_HU;

import javax.swing.JDialog;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerScience_CridetSheet extends JDialog implements Field
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	JProgressBar progressBar_3 ;
	JProgressBar progressBar_2 ;
	JProgressBar progressBar_4 ;
	JProgressBar progressBar_1 ;
	JProgressBar progressBar_5 ;
	JProgressBar progressBar;
	public ComputerScience_CridetSheet() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(21dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblComputerScince = new JLabel("Computer Scince");
		lblComputerScince.setFont(new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblComputerScince, "10, 2, 18, 1, center, default");
		
		JLabel lblName = new JLabel("Name :");
		panel.add(lblName, "2, 4, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 4, 8, 1, fill, default");
		textField.setColumns(10);
		
		JLabel lblFname = new JLabel("F/Name :");
		panel.add(lblFname, "12, 4, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "13, 4, 8, 1, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblId = new JLabel("ID :");
		panel.add(lblId, "22, 4, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "24, 4, 3, 1, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department :");
		panel.add(lblDepartment, "28, 4, right, default");
		
		JComboBox comboBox = new JComboBox(new String[]{"NetWork","DataBase","SoftWear"});
		comboBox.setBackground(SystemColor.text);
		
		
		
		panel.add(comboBox, "30, 4, 3, 1, fill, default");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Choose Subject with Credit", TitledBorder.LEADING, TitledBorder.TOP, null, UIManager.getColor("CheckBoxMenuItem.acceleratorSelectionForeground")));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblIslamic = new JLabel("Islamic :");
		panel_1.add(lblIslamic, "2, 2");
		
		final JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
			
				progressBar.setValue((Integer)spinner.getValue());
			}
		});
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panel_1.add(spinner, "4, 2");
		
		progressBar= new JProgressBar();
		progressBar.setForeground(new Color(154, 205, 50));
		progressBar.setBackground(UIManager.getColor("Button.highlight"));
		progressBar.setMaximum(4);
		progressBar.setValue(2);
		panel_1.add(progressBar, "6, 2");
		
		JLabel lblSemmaster = new JLabel("Semmaster :");
		panel_1.add(lblSemmaster, "10, 2");
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panel_1.add(spinner_6, "12, 2");
		
		JLabel lblMath = new JLabel("Math :");
		panel_1.add(lblMath, "2, 4");
		
		final JSpinner spinner_1 = new JSpinner();
		spinner_1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
				progressBar_1.setValue((Integer) spinner_1.getValue());
				
			}
		});
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 8, 1));
		panel_1.add(spinner_1, "4, 4");
		
		 progressBar_1 = new JProgressBar();
		progressBar_1.setBackground(SystemColor.window);
		progressBar_1.setValue(2);
		progressBar_1.setMaximum(8);
		panel_1.add(progressBar_1, "6, 4");
		
		JLabel lblJava = new JLabel("Java :");
		panel_1.add(lblJava, "2, 6");
		
		final JSpinner spinner_2 = new JSpinner();
		spinner_2.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				progressBar_2.setValue((Integer) spinner_2.getValue());
				
			}
		});
		
		
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		panel_1.add(spinner_2, "4, 6");
		
		 progressBar_2 = new JProgressBar();
		progressBar_2.setBackground(new Color(255, 255, 255));
		progressBar_2.setForeground(UIManager.getColor("EditorPane.inactiveBackground"));
		progressBar_2.setValue((Integer) spinner_2.getValue());
		progressBar_2.setMaximum(10);
		panel_1.add(progressBar_2, "6, 6");
		
		JButton btnSave = new JButton("Save");
		
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				
			}
		});
		
		
		
		
		
		panel_1.add(btnSave, "10, 6");
		
		JLabel lblSintific = new JLabel("Sintific :");
		panel_1.add(lblSintific, "2, 8");
		
		final JSpinner spinner_3 = new JSpinner();
		spinner_3.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				
				progressBar_3.setValue((Integer)spinner_3.getValue());
			}
		});
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panel_1.add(spinner_3, "4, 8");
		
		progressBar_3= new JProgressBar();
	
		progressBar_3.setMaximum(4);
		panel_1.add(progressBar_3, "6, 8");
		
		JButton btnCancel = new JButton("Cancel");
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
				
			}
		});
		
		panel_1.add(btnCancel, "10, 8");
		
		JLabel lblMannagment = new JLabel("Mannagment :");
		panel_1.add(lblMannagment, "2, 10");
		
		final JSpinner spinner_4 = new JSpinner();
		spinner_4.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				progressBar_4.setValue((Integer) spinner_4.getValue());
				
			}
		});
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		panel_1.add(spinner_4, "4, 10");
		
		 progressBar_4 = new JProgressBar();
		progressBar_4.setMaximum(2);
		panel_1.add(progressBar_4, "6, 10");
		
		JLabel lblEnginnering = new JLabel("Enginnering :");
		panel_1.add(lblEnginnering, "2, 12");
		
		final JSpinner spinner_5 = new JSpinner();
		spinner_5.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				progressBar_5.setValue((Integer)spinner_5.getValue());
				
			}
		});
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		panel_1.add(spinner_5, "4, 12");
		
		 progressBar_5 = new JProgressBar();
		progressBar_5.setValue(2);
		progressBar_5.setMaximum(6);
		panel_1.add(progressBar_5, "6, 12");
		setSize(504, 352);
		setVisible(true);
	//	setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public String getField() {
	
		return "Computer Scince";
	}
	
	
//	public static void main(String[] args) {
//		new ComputerScience_CridetSheet();
//	}

}
