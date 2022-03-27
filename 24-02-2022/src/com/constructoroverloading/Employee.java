package com.constructoroverloading;
//Constructor overloading

public class Employee {
	//variables
	int id;
	String name;
	double salary;
	static String deptName;
	//default constructor(without parameters)
	
	public Employee()
	{
		id=6784;
		name="viji";
		salary=50000.89;

	}
	

	
	// parameterized constructor( with parameters)
	public Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	//blocks
	static
	{
		deptName="Software";
	}
	//methods without parameters
	public void getInformation()
	{
				
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
		Employee employee1=new Employee(7654, "kavi", 65000.98);
		employee1.getInformation();









		

	}

}
