package staticTest;

class B{
	//필드
	int iVar;
	static int sVar;
}

public class StaticTest3 {

	public static void main(String[] args)
	{
		B b1 =new B();
		B b2 = new B();
		
		b1.iVar =10;
		b2.iVar = 20;
		
		System.out.println(b1.iVar);
		System.out.println(b2.iVar);
		
		b1.sVar =10;
		b2.sVar = 20;
		System.out.println(b1.sVar);
		System.out.println(b2.sVar);
		
		//클래스 변수는 하나의 저장공간이다.
		// 즉. 하난의 클래스로 만든 모든 객체가 공유하는 저장공간이다
		// 그렇기 떄문에 클래스 명으로 접근해야한다.
		
		B.sVar =30;
		B.sVar = 100;
		System.out.println(B.sVar);
		System.out.println(B.sVar);
		
	}

}
