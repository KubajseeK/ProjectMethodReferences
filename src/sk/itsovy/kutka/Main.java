package sk.itsovy.kutka;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
	Car cars = new Car();
	    //added comment
	CarInterface ref = cars::fuelType;
	ref.printFuelType("Gasoline");

	BiFunction<Integer, Integer, Integer> product = Addition::add;
	int pr = product.apply(5, 5);
	System.out.println("Product of given number is: " + pr);
    }
}
