package Test;

public class DisTest {

	public static void main(String[] args)
	{	Car car = new Car("bmw", "white",6500);
		Car car1 = new Car(); //초기값이 들어감.!!
		Car car2 = new Car("밴츠",7000);
		
		
		System.out.println(car1.brand);
		System.out.println(car2.brand);
		System.out.println(car.brand);

	}

}
