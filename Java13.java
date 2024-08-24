package com.Durga;


class Studenty{
	int rollNo = 123, m1=60,m2=70,m3=80;
}
public class Java13 {
	
	void calculate(Studenty stu) {
		System.out.println(stu.rollNo);
		int sum = stu.m1+stu.m2+stu.m3;
		System.out.println(sum);
		int avg = sum/3;
		System.out.println(avg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studenty stu = new Studenty();
		Java13 jv = new Java13();
		jv.calculate(stu);

	}

}
