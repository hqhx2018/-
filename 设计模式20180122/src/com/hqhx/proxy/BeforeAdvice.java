package com.hqhx.proxy;

public class BeforeAdvice implements Iadvice{

	@Override
	public void exec() {
		System.out.println("����ǰ��֪ͨ���ұ�ִ����");
	}

}
