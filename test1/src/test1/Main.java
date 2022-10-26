package test1;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = 1;
		Scanner sc = new Scanner(System.in);

		ArrayList<StoreController> sct = new ArrayList<StoreController>();
		ArrayList<Store> st1 = new ArrayList<Store>();
		ArrayList<Store> st2 = new ArrayList<Store>();
		Store a1 = new Restaurant("해성식당", "음식점", 75, 75, 75);
		Store a2 = new Restaurant("정림이네 ", "음식점", 93, 93, 93);
		Store a3 = new Restaurant("왕뼈사랑", "음식점", 76, 76, 76);

		st1.add(a1);
		st1.add(a2);
		st1.add(a3);

		sct.add(new StoreController(st1));
		Store b1 = new Salon("박승철", "미용실", 75, 75, 75);
		Store b2 = new Salon("이가자 ", "미용실", 93, 93, 93);
		Store b3 = new Salon("리안", "미용실", 76, 76, 76);
		st2.add(b1);
		st2.add(b2);
		st2.add(b3);

		sct.add(new StoreController(st2));

		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int x = sc.nextInt();
			if (x == 1) {
				System.out.println("====음식점보기====");
				for (int i = 0; i < sct.size(); i++) {
					for (int j = 0; j < 3; j++) {
						String a = sct.get(i).s.get(j).getEvent();
						String b = "음식점";
//					System.out.println(sct.get(i).s.get(j).event);
						if (a.equals(b)) {

							System.out.println(n + sct.get(i).s.get(j).toString());
							n++;
						}

					}

				}
				n = 1;
//				sct.get(0).printRestaurant();

			} else if (x == 2) {
				System.out.println("====미용실보기====");
				for (int i = 0; i < sct.size(); i++) {
					for (int j = 0; j < 3; j++) {
						String a = sct.get(i).s.get(j).getEvent();
						String b = "미용실";
//					System.out.println(sct.get(i).s.get(j).event);
						if (a.equals(b)) {

							System.out.println(n + sct.get(i).s.get(j).toString());
							n++;
						}

					}

				}
				n = 1;
//				sct.get(0).printRestaurant();

			} else if (x == 3) {
				System.out.println("====상세정보====");
				System.out.print("가게명 입력 : ");
				String a = sc.next();
				for (int i = 0; i < sct.size(); i++) {
					for (int j = 0; j < 3; j++) {
						String b = sct.get(i).s.get(j).getName();

						if (a.equals(b)) {
							int c = (int) sct.get(i).s.get(j).grade() / 10;
							System.out.println("가게명 : " + b);
							System.out.println("10\t20\t30\t40\t50\t60\t70\t80\t90\t100");
							for (int k = 0; k < c; k++) {
								System.out.print("*\t");
							}
							System.out.println();
							System.out.println("평점 : " +sct.get(i).s.get(j).grade());
						}
					}
				}

			} else if (x == 4) {
				
				int result[]=new int[6];
				int k=0;
				for (int i = 0 ;i<sct.size();i++)
				{
					
					for(int j = 0; j<3;i++)
					{
						result[k] = (int) sct.get(i).s.get(j).grade()/10;
						k++;
					}
				}
				
				
				
				
//				for( int i =100 ;i>=10 ; i-=10)
//				{
//					int c ;
//					int k =0;
//					
//					System.out.print(i);
//					for(int j = 0 ;j<6;j++)
//					{
//						if(result[j])
//						{
//							System.out.print("*");
//							
//						}
//						
//					} 
//					if(c==(i/10))
//					{
//						System.out.print("\t");
//					}
//					
//					System.out.println();
//				}

			} else if (x == 5) {
				System.out.println("종료합니다");
				break;

			} else {
				System.out.println("정확한 숫자를 입력하세요");
			}
		}
	}

}
