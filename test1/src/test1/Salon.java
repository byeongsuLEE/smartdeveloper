package test1;

public class Salon extends Store{

	double technology;
	double kindness;
	
	@Override
	public String toString() {
		return ". " + name + "       ∆Ú¡° : " + grade();
	}
	
	public Salon(String name,String event , double technology, double kindness,double price)
	{
		this.name = name;
		this.event = event;
		this.technology = technology;
		this.kindness = kindness;
		this.price = price;
	}

	
	@Override
	public double grade() {
		// TODO Auto-generated method stub
		return (kindness+technology+price)/3;
	}


	@Override
	public String getEvent() {
		// TODO Auto-generated method stub
		return this.event;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	

	
	
}
