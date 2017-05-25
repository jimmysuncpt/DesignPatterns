package com.jimmysun.designpatterns.factory.Abstract;

import com.jimmysun.designpatterns.factory.Abstract.ingredients.Cheese;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Clams;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Dough;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Pepperoni;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Sauce;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
