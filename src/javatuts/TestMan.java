package javatuts;

/**
 * @author iqbal
 * Polymorphism is the technique of creating object of parent-class
 * through the constructor of child-class
 */

class Man1{
	public void fly(){
		System.out.println("Man cannot fly");
	}
}


class SuperMan1 extends Man1{
	public void fly(){
		System.out.println("Superman can fly");
	}
}


public class TestMan {
	public static void main(String[] args){
		SuperMan1 max = new SuperMan1(); //polymorphism
		max.fly();
	}
}

