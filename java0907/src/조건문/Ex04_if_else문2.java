package 조건문;

import java.util.Scanner;

class Ex04_if_else문2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한수 : ");
		int num = sc.nextInt();
		
		if (num%10>=5)
		{
			num = (num/10+1) *10;
			System.out.println("반올림한 수 : "+num);
		}
		else
		{
			num= num/10*10;
			System.out.println("반올림한 수 : "+num);
		}
		
		
		

	}

}
