package EmployeeManagementSystem;

public class Employee {
	private int employeeid;
	private String name;
	private String position;
	private double salary;
	public Employee(int employeeid,String name,String position, double salary) {
		this.employeeid=employeeid;
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	public int getemployeeid() {
		return employeeid;
	}
	public String getname() {
		return name;
	}
	public String getposition() {
		return position;
	}
	public double getsalary() {
		return salary;
	}
	public String toString() {
		return "Employee{"+" employeeid :"+employeeid+", name : "+name+", position : "+position+", salary"+salary+'}';
	}

}
