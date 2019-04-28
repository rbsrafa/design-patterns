package structural.decorator;

public class DecoratorMain {
	
	public DecoratorMain() {
		
		// Creating basic car
		Car c1 = new BasicCar();
		c1.assemble();

		// Decorating basic car
		Car c2 = new SportCar(c1);
		c2.assemble();

		// Decorating the car that
		// already has been decorated
		Car c3 = new LuxuryCar(c2);
		c3.assemble();
		
	}

}
