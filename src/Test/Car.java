package Test;

public class Car
{	//필드
	String brand;
	String color;
	int price;
	
	
	//생성자
	public Car()
	{
		this("KIA","Blue",3500);
	}
	
	public Car(String brand, int price)
	{
		this(brand, "white", price);
		System.out.println("생성자 실행");
	}
	
	
	public Car(String brand, String color, int price)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	// 메소드
	
	
}
