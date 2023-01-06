package staticTest;

// 메소드 만들기
// 리턴타입 메소드명(매게변수)

	



public class StaticTest {

	//메소드 만들기
	void iMethod1()
	{
		System.out.println("인스턴스 메소드 1 실행");
		iMethod2();
		System.out.println();
		cMethod1(); //실행가능하지만 Static이 붙은것은 권장하지 않음.
		System.out.println();
	}
	void iMethod2()
	{
		System.out.println("인스턴스 메소드 2 실행");
	}

	static void cMethod1()
	{
		System.out.println("클래스 메소드 1실행");
		cMethod2(); // 이건 가능
		//iMethod1(); // 안됨 
	}
	static void cMethod2()
	{
		System.out.println("클래스 메소드 2실행");
		//iMethod1(); // 안됨
	}
	
	
	public static void main(String[] args)
	{
		StaticTest st = new StaticTest();
		st.iMethod1();
		st.cMethod1();
		
	}

}
