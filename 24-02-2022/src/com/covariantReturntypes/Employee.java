package com.covariantReturntypes;


//sub/derived/child class
public class Employee extends organization
{
	
	//variables(state)
	double salary;
	
	static String deptName;

	//constructors
	public Employee() 
	{
	    id = 4321;
		name = "Gopi";
		salary = 78654.98;
	}

	//blocks
	static
	{
		deptName = "Research";
	}
	
	//methods(behavior)
	//public int getInformation()//method return type is void
	public Employee getInformation()
	{
		
		//The return type is incompatible with Organization.getInformation()
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(deptName);
		
		return null;
	}
	
	//main
	public static void main(String[] args) 
	{ 
		//objects
		Employee employee = new Employee();
		employee.getInformation();
		
		System.out.println("==============");
		
		organization organization = new organization();
		organization.getInformation();
	}	
	

}
