package EmployeeManagementSystem;
import java.util.Arrays;
public class employeemanagementsystem {
	private Employee[] employees;
	private int count;
	
	public  employeemanagementsystem(int capacity) {
		employees=new Employee[capacity];
		count=0;
	}
	public void addemployee(Employee employee) {
		if(count<employees.length) {
			employees[count]=employee;
			count++;
		}
		else {
			System.out.println("cannot add more employees");
		}
	}
	public Employee search(int employeeid) {
		for(int i=0;i<count;i++) {
			if(employees[i].getemployeeid()==employeeid) {
				return employees[i];
			}
		}
		return null;
	}
	public void traverse() {
		for(int i=0;i<count;i++) {
			System.out.println(employees[i]);
		}
	}
	public void delete(int employeeid) {
		int index=-1;
		for(int i=0;i<count;i++) {
			if(employees[i].getemployeeid()==employeeid) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			for(int i=index;i<count-1;i++) {
				employees[i]=employees[i+1];
			}
			employees[count-1]=null;
			count--;
		}
		else {
			System.out.println("not found!");
		}
	}
	public static void main(String[] args) {
		employeemanagementsystem system=new employeemanagementsystem(5);
		system.addemployee(new Employee(1,"Rahul","Manager",800000));
		system.addemployee(new Employee(2,"Karan","Developer",78000));
		system.addemployee(new Employee(3,"Charmy","Analyst",67000));
		
		System.out.println("All employee:");
		system.traverse();
		
		System.out.println("Searching employee Id: 2");
		System.out.println(system.search(2));
		
		System.out.println("Deleteing employee 3");
		system.delete(3);
		
		System.out.println("After deletion");
		system.traverse();
	}

}
