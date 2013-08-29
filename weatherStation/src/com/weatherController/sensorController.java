package com.weatherController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.WeatherGUI.Displayer;
import com.WeatherModel.Sensor;

public class sensorController implements ActionListener {

	JTextField field1 = new JTextField(), field2 = new JTextField(),
			field3 = new JTextField();

	public sensorController(JTextField field1, JTextField field2,
			JTextField field3) {
		// TODO Auto-generated method stub

		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		for (int i = 0; i < addMonitorController.display.size(); i++) {
			addMonitorController.display.get(i).setPressure(
					Sensor.sensor.getPressure());
			addMonitorController.display.get(i).setTemperature(
					Sensor.sensor.getTemperature());
			addMonitorController.display.get(i).setHumidity(
					Sensor.sensor.getHumidity());
		}

		Sensor.sensor.setPressure(Double.parseDouble(field1.getText()));
		Sensor.sensor.setHumidity(Double.parseDouble(field2.getText()));
		Sensor.sensor.setTemperature(Double.parseDouble(field3.getText()));

		field1.setText(Sensor.sensor.getPressure() + " ");
		field2.setText(Sensor.sensor.getHumidity() + " ");
		field3.setText(Sensor.sensor.getTemperature() + " ");

	}

}
