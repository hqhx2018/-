package com.hqhx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{

	//��������
	Class cls=null;
	//�������ʵ��
	Object obj=null;
	
	public GamePlayIH(Object _obj) {
		// TODO Auto-generated constructor stub
		this.obj=_obj;
	}
	
	//���ñ�����ķ���
	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2)
			throws Throwable {
		Object o=method.invoke(this.obj, arg2);
		if(method.getName().equals("login")){
			System.out.println("�����˺���XXX�ص�¼");
		}
		return o;
	}

}
