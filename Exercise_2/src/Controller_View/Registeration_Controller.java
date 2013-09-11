package Controller_View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Model_RegiserationFaculty.Faculty_R;
import View_HU.View_Registeratino;

public class Registeration_Controller {

	 View_Registeratino view;
	 Faculty_R model;

	public Registeration_Controller() {
		view = new View_Registeratino();
		model = new Faculty_R();
	}

	public void Saving() {

		System.out.println(view.textName.getText());

		// --------------------------------
		// view=new View_Registeratino();

		model.setName(view.textName.getText());
		model.setFatherName(view.textFName.getText());
		model.setAddress(view.textAdress.getText());
	//	model.setAge(Integer.parseInt(view.textAge.getText()));
		model.setFatherJob(view.textFjob.getText());
		model.setBorderName(view.textBname.getText());
	//	model.setId(Integer.parseInt(view.textId.getText()));
		model.setJob(view.textJob.getText());
		//model.setPhone(Double.parseDouble(view.textPhone.getText()));
		model.setUncleName(view.textUname.getText());
		// setField(view.textf);
		model.setName(view.textPhone.getText());

		// ------------------------------

		if ("main".equals("maining")) {
			JOptionPane.showMessageDialog(null,
					"Please Fill the form correctly !!!");

		} else {
			// view.textName.getText();

			String line = model.getName() + "," + model.getLastName() + ","
					+ model.getFatherName() + "," + model.getAddress() + ","
					+ model.getAge() + "," + model.getFatherJob() + ","
					+ model.getJob() + "," + model.getPhone() + ","
					+ model.getId() + "," + model.getUncleName() + ","
					+ model.getField();

			File file = new File("D:\\hadisa.txt");

			try {

				FileWriter write = new FileWriter(file, true);

				write.append(line);

				write.close();

			} catch (FileNotFoundException ex) {

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
