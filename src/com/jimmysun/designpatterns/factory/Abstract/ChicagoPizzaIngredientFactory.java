package com.jimmysun.designpatterns.factory.Abstract;

import com.jimmysun.designpatterns.factory.Abstract.ingredients.BlackOlives;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Cheese;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Clams;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Dough;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Eggplant;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.FrozenClams;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.MozzarellaCheese;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Pepperoni;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.PlumTomatoSauce;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Sauce;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.SlicedPepperoni;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Spinach;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.ThickCrustDough;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
}
