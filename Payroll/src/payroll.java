//Christopher Miller
//Intro to Java


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class payroll {
	
	private String fullName;
	private double hourlyRatePay;
	private int numberOfHoursWorked;
	private double totalPayForTheWeek;


	//constructor
	public payroll() {
	fullName = "";
	hourlyRatePay = 0;
	numberOfHoursWorked = 0;
	totalPayForTheWeek = 0;
	}

	// parameterized constructor 1
	public payroll(String fullName,double hourlyRatePay,int numberOfHoursWorked) {
	this.fullName = fullName;
	this.hourlyRatePay = hourlyRatePay;
	this.numberOfHoursWorked = numberOfHoursWorked;
	}
	// parameterized constructor 2
	public void computePay(){
	this.totalPayForTheWeek = this.hourlyRatePay*this.numberOfHoursWorked;
	}

	// setters

	public payroll(String fullName) {
	this.fullName = fullName;
	}
	public String getFullName() {
	return fullName;
	}

	public void setFullName(String fullName) {
	this.fullName = fullName;
	}


	// getters
	public double getHourlyRatePay() {
	return hourlyRatePay;
	}

	public void setHourlyRatePay(double hourlyRatePay) {
	this.hourlyRatePay = hourlyRatePay;
	}

	public int getNumberOfHoursWorked() {
	return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
	this.numberOfHoursWorked = numberOfHoursWorked;
	}

	// to string method

	@Override
	public String toString() {
	DecimalFormat format = new DecimalFormat("#.00");
	return "\n[fullName=" + fullName + ", hourlyRatePay="
	+ hourlyRatePay + ", numberOfHoursWorked="
	+ numberOfHoursWorked + ", totalPayForTheWeek="
	+ format.format(totalPayForTheWeek) + "]";
	}


	public static void main(String[] args) {

	payroll [] employee = new payroll[5];

	employee[0] = new payroll ("Christohper Miller", 45.95, 80);
	employee[1] = new payroll ("Jimmy John", 15.5, 35);
	employee[2] = new payroll ("Jason Tyler", 30.2, 25);

	employee[3] = new payroll ("Jacob Jim");
	employee[3].setHourlyRatePay(20.5);
	employee[3].setNumberOfHoursWorked(40);

	employee[4] = new payroll();
	employee[4].setFullName("Johnny Jacobs");
	employee[4].setHourlyRatePay(15.2);
	employee[4].setNumberOfHoursWorked(20);

	employee[0].computePay();
	employee[1].computePay();
	employee[2].computePay();
	employee[3].computePay();
	employee[4].computePay();

	
	System.out.println(employee[0].toString());
	System.out.println(employee[1].toString());
	System.out.println(employee[2].toString());
	System.out.println(employee[3].toString());
	System.out.println(employee[4].toString());
	JOptionPane.showMessageDialog(null,employee[0].toString()+employee[1].toString()+employee[2].toString()+employee[3].toString()+employee[4].toString());

	}	

}
