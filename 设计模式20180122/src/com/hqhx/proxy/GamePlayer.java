package com.hqhx.proxy;

public class GamePlayer implements IGamePlayer{

	private String name;
	
	public GamePlayer(String name){
		this.name=name;
	}
	
	@Override
	public void login(String username, String password) {
		System.out.println(this.name+"��¼"+username+" "+password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"���");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"����");
	}

}
