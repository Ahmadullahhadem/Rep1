package View_HU;

import javax.swing.JOptionPane;

public class Faculty_Factory {

	public Field creatFieldTable(String type) {
		Field field = null;

		if (type.equalsIgnoreCase("ComputerSience")) {

			field = new ComputerSinceTable();
			int value=JOptionPane.showConfirmDialog(null, "Do you want fill credit form???");
			
			if(value==JOptionPane.OK_OPTION){
				new ComputerScience_CridetSheet();
			}
		
		} else if (type.equalsIgnoreCase("Science")) {

			field = new ScienceTable();
int value=JOptionPane.showConfirmDialog(null, "Do you want fill credit form???");
			
			if(value==JOptionPane.OK_OPTION){
				new Science_CridetSheet();
			}
			
		}
		return field;
	}

}
