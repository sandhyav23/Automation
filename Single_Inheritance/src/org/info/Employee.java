package org.info;

import org.in.Student;

public class Employee extends Student
{

public void name_em()
	{
System.out.println("employee name is A");
	}
public void id_em() 
    {
	System.out.println("employee id is 1");
    }
public static void main(String[] args) {
	Employee e=new Employee();
	e.id_em();
	e.name_em();
	e.name_st();
	e.id_st();

}
}
