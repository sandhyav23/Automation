package org.transport;
import org.road.*;
import org.air.*;
import org.water.*;
public class Transport {
public void TransportForm()
{
	System.out.println("name is transport");
}
public static void main(String[] args) {
	Transport T=new Transport();
	Road R=new Road();
	Air A=new Air();
	Air A1=new Air();
	Water W=new Water();

	T.TransportForm();
	R.bike();
	A.aeroplane();
	A1.heliCopter();
	W.boat();
	
	
}
}
