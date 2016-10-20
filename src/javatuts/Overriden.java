package javatuts;
/**
 * 
 * @author faisal
 *	In line 16 declare the method show(), 
 *  which override the parent class
 *  show() method of line 10.
 */
		
class Over{
	public void show(){
		System.out.println("Birds can fly");
	}
}

public class Overriden extends Over{
	public void show(){
		System.out.println("Birds fly in the sky");
	}
	
	public static void main(String[] args){
		Overriden methodOverride = new Overriden();
		methodOverride.show();
	}
}
