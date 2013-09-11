package Model_RegiserationFaculty;

import View_HU.View_Registeratino;

public class Faculty_R {
	
	private String name;
	private String lastName;
	private String fatherName;
	private String address;
	private double phone;
	private String field;
	private double id;
	private String uncleName;
	private int age;
	private String fatherJob;
	private String job;
	private String borderName;
	View_Registeratino view;
	public Faculty_R(){
//		view=new View_Registeratino();
//		setName(view.textName.getText());
//		setFatherName(view.textFName.getText());
//		setAddress(view.textAdress.getText());
//		setAge(Integer.parseInt(view.textAge.getText()));
//		setFatherJob(view.textFjob.getText());
//		setBorderName(view.textBname.getText());
//		setId(Integer.parseInt(view.textId.getText()));
//		setJob(view.textJob.getText());
//		setPhone(Double.parseDouble(view.textPhone.getText()));
//		setUncleName(view.textUname.getText());
//		//setField(view.textf);
//		setName(view.textPhone.getText());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getUncleName() {
		return uncleName;
	}
	public void setUncleName(String uncleName) {
		this.uncleName = uncleName;
	}
	public String getFatherJob() {
		return fatherJob;
	}
	public void setFatherJob(String fatherJob) {
		this.fatherJob = fatherJob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getBorderName() {
		return borderName;
	}

	public void setBorderName(String borderName) {
		this.borderName = borderName;
	}
	
	

}
