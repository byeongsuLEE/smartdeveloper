package ���ǹ�;

import java.util.Scanner;

public class Ex06_����if��2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (10<=age && age<20)
		{
			System.out.println("10���Դϴ�.");
			
		}
		
		else if(age<30)
		{
			System.out.print("20���Դϴ�.");
		}
		else if (age <40)
		{
			System.out.print("30���Դϴ�.");
		}
		
	}

}
