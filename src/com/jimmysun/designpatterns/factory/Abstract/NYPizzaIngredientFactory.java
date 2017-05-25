package com.jimmysun.designpatterns.factory.Abstract;

import com.jimmysun.designpatterns.factory.Abstract.ingredients.Cheese;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Clams;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Dough;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.FreshClams;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Garlic;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.MarinaraSauce;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Mushroom;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Onion;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Pepperoni;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.RedPepper;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.ReggianoCheese;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Sauce;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.SlicedPepperoni;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.ThinCrustDough;
import com.jimmysun.designpatterns.factory.Abstract.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}
