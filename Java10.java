package com.Durga;

public class Java10 {
	
	int[] getArray() {
		int arr[] = {10,20,30,40,50};
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java10 jv = new Java10();
		int[] abc = jv.getArray();
		for(int x:abc) {
			System.out.println(x);
		}

	}

}
