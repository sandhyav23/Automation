package org.pk;

public class State_Bank extends Axis_Bank {
	public void state_Car() {
		System.out.println("car laon is 40%");
	}

	public static void main(String[] args) {
		State_Bank s = new State_Bank();
		Hdfc_Bank h = new Hdfc_Bank();
		Icici_Bank i = new Icici_Bank();
		s.axis_Personal();
		h.hdfc_home();
		i.icic_Edu();
		s.state_Car();
	}
}
