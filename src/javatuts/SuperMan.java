package javatuts;

class Man{
	private int weight;
	
	public Man(int weight){
		this.weight = weight;
	}
	
	public void setWeight(int weight){	//setter method
		if(weight>=50 && weight<=100){
			this.weight = weight;
		}
	}
	
	public int getWeight(){	//getter method
		return weight;
	}
	
	public void show(){
		System.out.println(weight);
	}
}

public class SuperMan extends Man {
	public int power;
	
	public SuperMan(int power){
		super(55); //invoking parent class constructor
		this.power = power;
	}
	
	public SuperMan(int weight, int power){ //Overloading
		super(weight); //invoking parent class constructor
		this.power = power;
	}
	
	public void show(){	//Overriding method
		super.show(); 	//invoking parent class method
		System.out.println(power);
	}
	
	public void show(String abc){	//overloading method
		System.out.println(abc);
	}
	
	public static void main(String[] args){
		SuperMan cavill = new SuperMan(10);
		cavill.show();
		SuperMan kent = new SuperMan(50, 100);
		kent.show();
		kent.show("Tiger");	
	}
}







