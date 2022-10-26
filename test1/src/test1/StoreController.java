package test1;

import java.util.ArrayList;

public class StoreController {

	
	public ArrayList<Store> s ;
	
	
	public StoreController(ArrayList<Store> sd) {
		this.s= sd;
		
	}
	
	public void printRestaurant()
	{
		for ( int i = 0;i<s.size();i++)
		{
			System.out.println(i+1+". "+ s.get(i).name+"        ÆòÁ¡ : "+s.get(i).grade());
		}
	}
	
	
	
}
