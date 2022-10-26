package test1;

public class Restaurant extends Store {
	double service;
	double flavor;
	double clean;

	
	@Override
	public String toString() {
		return ". " + name + "       ∆Ú¡° : " + grade();
	}


	public Restaurant(String name,String event,double service, double flavor, double clean) {
		this.name = name;
		this.event= event;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}


	@Override
	public double grade() {
		// TODO Auto-generated method stub
		return (service+flavor +clean+price)/4;
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
