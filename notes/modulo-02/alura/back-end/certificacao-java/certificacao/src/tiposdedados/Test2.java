package tiposdedados;

class Car {
	int year;
	String model;
}

public class Test2 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.year = 2018;
		c1.model = "Ferrari";
		
		c1 = new Car();
		c1.year = 1998;
		c1.model = "Palio";
		
		System.out.println(c1.model);
		
	}

}
