package com.WeatherGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.WeatherModel.Sensor;
import com.weatherController.addMonitorController;

public class Displayer extends JFrame{
	
	private JLabel temperature , humidity , pressure ;
	private JButton remove = new JButton(" Remove ");
	
	public Displayer() {


		temperature = new JLabel(Sensor.sensor.getTemperature() + " ");
		temperature.setPreferredSize(new Dimension(150, 30));
		humidity = new JLabel(Sensor.sensor.getHumidity() + "");
		humidity.setPreferredSize(new Dimension(150, 30));
		pressure = new JLabel(Sensor.sensor.getPressure() + " ");
		pressure.setPreferredSize(new Dimension(150, 30));
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		panel.add(new JLabel(" Temperature :"));
		panel.add(temperature);
		panel.add(new JLabel(" numidity : "));
		panel.add(humidity);
		panel.add(new JLabel(" Pressure : "));
		panel.add(pressure);
		
		getContentPane().add(panel);
		getContentPane().add(remove, BorderLayout.SOUTH);
		setSize(250, 80);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
		remove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Displayer.this.dispose();
				addMonitorController.display.remove(Displayer.this);
				
				
			}
		});
	}
	
	public void setTemperature (double temp){
		temperature.setText(temp + " ");
	}
	public void setHumidity (double temp){
		humidity.setText(temp + " " );
	}
	public void setPressure (double temp ){
		pressure.setText(temp+ " ");
	}

}
