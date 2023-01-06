package staticTest;


class A{
	//필드
	int iVar; //인스턴스 변수화
	static int sVar;
	
	void iMethod1() // 인스턴스 메소드
	{
		iVar = 10;
		sVar = 100;
		cMethod1();
		iMethod2();
		System.out.println(iVar);
		System.out.println(sVar);
		cMethod1();
		System.out.println(sVar);
	}
	void iMethod2() // 인스턴스 메소드
	{
		iVar = 20;
		sVar = 200;
	}
	static void cMethod1() // 클래스 메소드
	{
		//iVar = 30; 불가능
		System.out.println(sVar);
		System.out.println();
		//cMethod2();
		sVar = 600;
		System.out.println(sVar);
		System.out.println();
	}
	
	static void cMethod2() // 클래스 메소드
	{
		//iVar = 40; 불가능
		sVar = 400;
	}
}
public class StaticClass2 {

	
	
	public static void main(String[] args)
	{
		// 다른 클래스에서 인스턴스 멤버를 사용하는 경우
		A a = new A();
		a.iVar = 10;
		a.iMethod1();
		a.iMethod2();
		// 다른 클래스에서 static 멤버를 사용하는 경우 (DO NOT)
		
		a.sVar = 1000;
		a.cMethod1();
		
		// 클래스명을 이용하여 클래스 멤버에 접근하는 것을 권장.
		A.sVar =20;
		A.cMethod1();
		
		
		
		// 결론 | 
		
		
	}

}
