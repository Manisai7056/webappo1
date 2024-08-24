package com.Durga;

class Customer{
	int custid = 1234;
	String name = "pqrs";
}

public class Java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java14 jv = new Java14();
		Customer c2 = jv.getObject();
		System.out.println(c2.custid);
		System.out.println(c2.name);
	}

	Customer getObject() {
		Customer c1 = new Customer();
		return c1;
		
	}
}
