package javatuts;
/**
 * @author iqbal
 * Overloading methods
 */

public class ABC {
	int a,b,c;
	
	public void setValue(){
		a=2;
		b=4;
		c=6;
	}

	public void setValue(int a){
		this.a = a;
		b = 4;
		c = 6;			
	}
	
	public int setValue(int a, int b){
		this.a = a;
		this.b = b;
		c = 6;
		int z = a+b+c;
		return z;		
	}
	
	public int setValue(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		int z = a+b+c;
		return z;
	}
	
	public static void main(String[] args){
		ABC abc = new ABC();
		System.out.println(abc.setValue(10, 14));
		System.out.println(abc.setValue(10, 20, 30));
	}
	
}
