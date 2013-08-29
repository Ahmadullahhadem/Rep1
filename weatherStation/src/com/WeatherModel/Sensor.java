package com.WeatherModel;

public class Sensor {
	
	private double pressure , humidity , temperature ;
	public static Sensor sensor = new Sensor();
	
	public Sensor() {
		// TODO Auto-generated constructor stub
		
	}
	public Sensor(double pressure, double humidity , double temperature){
		this.humidity = humidity ;
		this.pressure = pressure ;
		this.temperature = temperature ;
		
	}
	public double getPressure (){
		return pressure;
	}
	public double getHumidity (){
		return humidity;
	}
	public double getTemperature (){
		return temperature;
	}
	public double[] getHTP(){
		double [] htp =  { pressure , humidity, temperature };
		return htp ;
	}
	
	public void setPressure (double pressure ){
		this.pressure= pressure;
	}
	public void setHumidity (double humidity){
		this.humidity = humidity ;
	}
	public void setTemperature (double temperature ){
		this.temperature = temperature ;
	}

}
