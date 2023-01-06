package day12;

public class Tv
{
	// 필드란
		// 채널, 불륨, 파워, 인치, 가격, 컬러
	int channel,vol,inch,price;
	boolean power;
	String tvColor ;
	
	// 자동생성 과 직접생성 (소스 -> 제너레이터 필드) 또는 알트 쉬프트 s o 
	public Tv(int channel, int vol, int inch)
	{
		this.channel = channel;
		this.vol = vol;
		this.inch = inch;
		
		//this 
		
		
		
	}

	public Tv(int channel, int vol, int inch, int price, boolean power, String tvColor) {
		super();
		this.channel = channel;
		this.vol = vol;
		this.inch = inch;
		this.price = price;
		this.power = power;
		this.tvColor = tvColor;
	}
	
	// 생성자 
	
	
	
}
