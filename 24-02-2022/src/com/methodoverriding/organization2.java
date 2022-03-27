package com.methodoverriding;
//super/base/parent class
public class organization2
		
		{
			int id;
			String name;
			
			public organization2() 
			{	
				id = 5643;
				name = "CTS";
			}
			
			public organization2 getInformation()//method return type is void
			{
				System.out.println(id);
				System.out.println(name);
				
				return null;
			}
			
	

	}
