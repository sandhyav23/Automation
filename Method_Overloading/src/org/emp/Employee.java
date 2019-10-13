package org.emp;

public class Employee {
	public void empId(int i, String Name )
{
		System.out.println("employe id is"+i+"employee name is"+Name);
		
	}
	
	public void empId( String Address,int x) {
		System.out.println("employee Address"+x+"employee id"+Address);
		
	}
	public static void main(String[] args) {
		Employee E=new Employee();
		E.empId(1,"sandy");
		E.empId("XXXX",2);
		
	}
		
	}

