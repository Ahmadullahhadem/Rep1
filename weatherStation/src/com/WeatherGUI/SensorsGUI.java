package com.WeatherGUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.weatherController.addMonitorController;
import com.weatherController.sensorController;

public class SensorsGUI extends JFrame{
	
	
	private JTextField pressure , humidity , temperature ;
	
	private JButton update ;
	
	public SensorsGUI() {
		
		pressure = new JTextField(25);
		humidity = new JTextField(25);
		temperature = new JTextField(25);
		update = new JButton(" update ");
		JButton addDisplayer = new JButton(" addMonitor ");
		
		
		
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();
		
		centerPanel.setLayout(new GridLayout(3, 2));
		
		JLabel lbl_pressure = new JLabel(" Pressure : ");
		JLabel lbl_humidity = new JLabel(" Humidity : ");
		JLabel lbl_temperature = new JLabel(" Temperature : ");
		
		centerPanel.add(lbl_temperature);
		centerPanel.add(temperature);
		centerPanel.add(lbl_humidity);
		centerPanel.add(humidity);
		centerPanel.add(lbl_pressure);
		centerPanel.add(pressure);
		
		southPanel.add(update);
		southPanel.add(addDisplayer);
		
		getContentPane().add(centerPanel);
		getContentPane().add(southPanel, BorderLayout.SOUTH);
		
		
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		update.addActionListener(new sensorController(pressure , humidity , temperature));
		addDisplayer.addActionListener(new addMonitorController());
	}
	

}
