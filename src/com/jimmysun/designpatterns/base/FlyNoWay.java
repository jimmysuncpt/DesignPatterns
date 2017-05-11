package com.jimmysun.designpatterns.base;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}
