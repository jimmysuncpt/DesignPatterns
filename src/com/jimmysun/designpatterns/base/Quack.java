package com.jimmysun.designpatterns.base;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}
