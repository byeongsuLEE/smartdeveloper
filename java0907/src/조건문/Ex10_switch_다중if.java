package 조건문;

import java.util.Scanner;

public class Ex10_switch_다중if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("user1 : ");
		String user1 = sc.next();
		System.out.println("user2 : ");

		String user2 = sc.next();
		System.out.println(user1 + " >>");

		String result1 = sc.next();
		System.out.println(user2 + " >>");
		String result2 = sc.next();
		String result = result1 + result2;
		
		//문자열과 문자열을 비교해주는 함수-> 값.equals.(비교할 값)
		if (result=="보보"||result==("주먹주먹")||result==("가위가위"))
		{
			System.out.println("무승부입니다");
			
		}
		else if(result==("보주먹")||result==("가위보")||result==("주먹가위"))
		{
			System.out.println(user1+"님이 이겼습니다.");
					
		}
		else if(result==("보가위")||result==("가위주먹")||result==("주먹보"))
		{
			System.out.println(user1+"님이 졌습니다.");
			
			
		}
		else
		{
			System.out.println("오류 입니다~");
		}
	}

}
