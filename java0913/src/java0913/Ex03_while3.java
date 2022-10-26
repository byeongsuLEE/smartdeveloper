package java0913;

import java.util.Scanner;

public class Ex03_while3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int add = 0;
		int even = 0;

		while (true) {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				even++;
			} else if (num == -1) {
				System.out.println("종료되었습니다");
				break;
				
			} else {
				add++;
			}
			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + add);
		}

	}
}