package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
	Car car = new Car();
	CarInterface ref = car::fuelType;
	ref.printFuelType("Gasoline");
    }
}
