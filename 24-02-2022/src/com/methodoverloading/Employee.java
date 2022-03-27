package com.methodoverloading;

public class Employee {
	//variables
	int id;
	String name;
	double salary;
	static String deptName;
	//default constructor
	public Employee()
	{
		id=6784;
		name="viji";
		salary=50000.89;

	}
	//blocks
	static
	{
		deptName="Engineering";

	}
	//methods without parameters
	public void getInformation()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);


	}
	//method with parameters
	public void getInformation(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
	}//main
	public static void main(String[] args) {
		//objects
		Employee employee=new Employee();
		employee.getInformation();

		System.out.println("=========================");
		employee.getInformation(7654, "kavi", 65000.98);









		

	}

}
