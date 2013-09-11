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
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;

public class Science_CridetSheet extends JDialog implements Field
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public Science_CridetSheet() {
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
		
		JLabel lblName = new JLabel("Name :");
		panel.add(lblName, "2, 4, right, default");
		
		textField = new JTextField();
		panel.add(textField, "4, 4, 5, 1, fill, default");
		textField.setColumns(10);
		
		JLabel lblFname = new JLabel("F/Name :");
		panel.add(lblFname, "10, 4, right, default");
		
		textField_1 = new JTextField();
		panel.add(textField_1, "12, 4, 5, 1, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblId = new JLabel("ID :");
		panel.add(lblId, "20, 4, right, default");
		
		textField_2 = new JTextField();
		panel.add(textField_2, "22, 4, 3, 1, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department :");
		panel.add(lblDepartment, "26, 4, right, default");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "28, 4, 3, 1, fill, default");
		
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblIslamic = new JLabel("Islamic :");
		panel_1.add(lblIslamic, "2, 2");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panel_1.add(spinner, "4, 2");
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(255, 255, 0));
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
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 8, 1));
		panel_1.add(spinner_1, "4, 4");
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(2);
		progressBar_1.setMaximum(8);
		panel_1.add(progressBar_1, "6, 4");
		
		JLabel lblJava = new JLabel("phisice");
		panel_1.add(lblJava, "2, 6");
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		panel_1.add(spinner_2, "4, 6");
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(4);
		progressBar_2.setMaximum(10);
		panel_1.add(progressBar_2, "6, 6");
		
		JButton btnSave = new JButton("Save");
		panel_1.add(btnSave, "10, 6");
		
		JLabel lblSintific = new JLabel("Pahshto");
		panel_1.add(lblSintific, "2, 8");
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panel_1.add(spinner_3, "4, 8");
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setMaximum(4);
		panel_1.add(progressBar_3, "6, 8");
		
		JButton btnCancel = new JButton("Cancel");
		panel_1.add(btnCancel, "10, 8");
		
		JLabel lblMannagment = new JLabel("Darai");
		panel_1.add(lblMannagment, "2, 10");
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		panel_1.add(spinner_4, "4, 10");
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setMaximum(2);
		panel_1.add(progressBar_4, "6, 10");
		
		JLabel lblEnginnering = new JLabel("Gami");
		panel_1.add(lblEnginnering, "2, 12");
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		panel_1.add(spinner_5, "4, 12");
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setValue(2);
		progressBar_5.setMaximum(6);
		panel_1.add(progressBar_5, "6, 12");
		
		JLabel lblLitaral = new JLabel("Litaral");
		panel_1.add(lblLitaral, "2, 14");
		
		JSpinner spinner_7 = new JSpinner();
		spinner_7.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		panel_1.add(spinner_7, "4, 14");
		
		JProgressBar progressBar_6 = new JProgressBar();
		progressBar_6.setValue(8);
		progressBar_6.setMaximum(12);
		panel_1.add(progressBar_6, "6, 14");
		
		JLabel lblBilogie = new JLabel("Bilogie :");
		panel_1.add(lblBilogie, "2, 16");
		
		JSpinner spinner_8 = new JSpinner();
		spinner_8.setModel(new SpinnerNumberModel(0, 0, 14, 1));
		panel_1.add(spinner_8, "4, 16");
		
		JProgressBar progressBar_7 = new JProgressBar();
		progressBar_7.setMaximum(14);
		panel_1.add(progressBar_7, "6, 16");
		setSize(504, 382);
		
		setVisible(true);
	}
	@Override
	public String getField() {
		// TODO Auto-generated method stub
		return "Science";
	}
	
//	public static void main(String[] args) {
//		new Science_CridetSheet();
//	}

}
