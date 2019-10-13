package org.pc;

public class Entrepreneur extends Employee
{
	public void ent_Name() {
		System.out.println("Entreprenueur name is X");
		
		}
	public static void main(String[] args) {
		Entrepreneur  e= new Entrepreneur();
		e.emp_Id();
		e.emp_Name();
		e.student_Id();
		e.student_Name();
		e.ent_Name();
	}
}
