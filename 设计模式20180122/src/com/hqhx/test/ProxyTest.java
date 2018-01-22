package com.hqhx.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

import com.hqhx.proxy.DynamicProxy;
import com.hqhx.proxy.GamePlayIH;
import com.hqhx.proxy.GamePlayer;
import com.hqhx.proxy.GamePlayerPorxy;
import com.hqhx.proxy.IGamePlayer;

public class ProxyTest {

	public static void main(String[] args) {
//		//����һ��������
//		IGamePlayer porxy=new GamePlayerPorxy("����");
//		porxy.login("admin", "123456");
//		porxy.killBoss();
//		porxy.upgrade();
		
		//����һ�����
		IGamePlayer gamePlary=new GamePlayer("����");
		InvocationHandler i=new GamePlayIH(gamePlary);
		System.out.println(new Date());
		//��ȡ�������
		ClassLoader classLoader=gamePlary.getClass().getClassLoader();
		IGamePlayer proxy=(IGamePlayer) DynamicProxy.getPorxy(classLoader, new Class[]{IGamePlayer.class}, i);
		proxy.login("admin", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}
}
