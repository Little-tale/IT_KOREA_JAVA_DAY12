package Test;

import java.util.Random;
import java.util.Scanner;

class Enhance
{
	//필드
	static boolean[] archance = {true,true,true,true,false,false,false,false,false,false};
	
	String weapone;
	int cnt;
	
	//생성자 
	public Enhance(String weapone)
	{
		this.weapone = weapone;
	}
	
	//메소드
	void start()
	{
		Random r = new Random();
		int index = r.nextInt(10);
		
		// 강화 성공, 실패
		
		if (archance[index])
		{
			cnt++;
			System.out.println("강화에 성공함");
			
		}else
		{
			cnt = 0;
			System.out.println("강화에 실패함");
		}
		
		
		
	}
	void printInfo()
	{
		System.out.println("굳");
	}
	
}

public class RandomTask {

	public static void main(String[] args)
	{
		Enhance rg = new Enhance("목검");
		String msg = "1. 강화 시작 \n2. 종료";
		Scanner sc = new Scanner(System.in)
;
		int choice =0;
		boolean flag = true;
		
		String input =null;
		
		while(flag)
		{
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				rg.start();
				rg.printInfo();
				break;
			case 2:
				System.out.println("종료하료면 종료 라고 입력");input = sc.next();
				if (input.equals("종료"))
				{
					flag = false;
				}
				break;
			default :
				System.out.println("잘못입력했어요.");

					
				
			}
			
		}
		

	}

}
