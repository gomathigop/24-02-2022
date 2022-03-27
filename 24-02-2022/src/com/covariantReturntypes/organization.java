package com.covariantReturntypes;
//super/base/parent class
public class organization
		
		{
			int id;
			String name;
			
			public organization() 
			{	
				id = 5643;
				name = "CTS";
			}
			
			public organization getInformation()//method return type is void
			{
				System.out.println(id);
				System.out.println(name);
				
				return null;
			}
			
	

	}
