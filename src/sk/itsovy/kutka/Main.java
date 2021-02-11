package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
	Car cars = new Car();
	    //added comment
	CarInterface ref = cars::fuelType;
	ref.printFuelType("Gasoline");
    }
}
