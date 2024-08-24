package com.Durga;


class Student{
	int rollNo = 123;
	double marks = 78.9;
	String name = "abcd";
}

public class Java12 {
	
	void display(Student stu) {
		System.out.println(stu.rollNo);
		System.out.println(stu.marks);
		System.out.println(stu.name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		Java12 jv = new Java12();
		jv.display(st);

	}

}
