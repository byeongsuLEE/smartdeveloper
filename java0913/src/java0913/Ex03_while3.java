package java0913;

import java.util.Scanner;

public class Ex03_while3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int add = 0;
		int even = 0;

		while (true) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				even++;
			} else if (num == -1) {
				System.out.println("����Ǿ����ϴ�");
				break;
				
			} else {
				add++;
			}
			System.out.println("¦������ : " + even);
			System.out.println("Ȧ������ : " + add);
		}

	}
}