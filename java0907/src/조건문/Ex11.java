package 조건문;

import java.util.Scanner;

public class Ex11 {

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

		if (result1.equals(result2)) {
			System.out.println("무승부입니다.");

		}

		else if (result1.equals("가위")) {
			if (result2.equals("바위")) {
				System.out.println(user1 + "님이 졌다.");

			} else {
				System.out.println(user1 + "님이 이겼다.");
			}

		} else if (result1.equals("바위")) {
			if (result2.equals("가위"))
			{
				System.out.println(user1+"님이 이겼습니다");

			}
			else
				System.out.println(user1+"님이 지셨습니다.");
		} else if (result1.equals("보"))

		{
			if (result2.equals("바위")) {
				System.out.println(user1 + "님이 승리하셨습니다.");
			} else {
				System.out.println(user1 + "님이 패배하셨습니다.");
			}
		}
	}

}
