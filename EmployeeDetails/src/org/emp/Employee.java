package org.emp;

public class Employee {
public void empid(int i)
{
	System.out.println("name is"+i);
}
	public void empid(int x,String name) {
		System.out.println("x is:" +x+ "name is:" + name);
		
}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empid(10);
		emp.empid(11,"sandy");
	}
}