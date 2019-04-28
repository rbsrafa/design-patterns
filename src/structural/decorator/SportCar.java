package structural.decorator;

public class SportCar extends CarDecorator {

	public SportCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("--Adding sport functionalities");
	}

}
