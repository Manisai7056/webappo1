package com.Durga;

public class Java09 {
	
  String[] getArray() {
	String[] name= {"aaa","bbb","ccc","ddd"};
	  return name;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Java09 jv = new Java09();
       String[] str = jv.getArray();
       for(String x: str) {
    	   System.out.println(x);
       }
	}

}
