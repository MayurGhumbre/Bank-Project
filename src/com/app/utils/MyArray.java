package com.app.utils;

public class MyArray {

	Object [] arr;
	int index;
	
	public MyArray(int size) {
		arr=new Object[size];
	}
	
	public void add (Object obj) {
		arr[index]=obj;
		index++;
	}
	
//	public Object get(int index) {
//		return arr[index];
//	}
	
	public Object [] getArray() {
		return arr;
	}
}
