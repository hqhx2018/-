package com.hqhx.model;

//����ģʽ
public class Student {

	private static final Student s=new Student();
	
	//����˽�л�
	private Student(){
		
	}
	
	public static Student newInstance(){
		return s;
	}
	
}
