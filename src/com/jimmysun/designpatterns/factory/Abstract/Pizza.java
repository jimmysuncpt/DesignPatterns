package com.jimmysun.designpatterns.factory.Abstract;

import com.jimmysun.designpatterns.factory.Abstract.ingredients.Cheese;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Clams;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Dough;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Pepperoni;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Sauce;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
