package com.hqhx.model;

//����ģʽ
public class Student2 {

	private static Student2 s;
	
	//����˽�л�
	private Student2(){
		
	}
	
	public static synchronized Student2 newInstance(){
		if(s==null){
			s=new Student2();
		}
		return s;
	}
	
}
