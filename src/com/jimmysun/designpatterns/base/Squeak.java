package com.jimmysun.designpatterns.base;

public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}
