package javatuts;

/**@author faisal
At line 11, attribute "number" is a private member of MyNumber class.
Not accessible from other classes but from Encapsulation class 
we are accessing the "number" variable of MyNumber class
using set and get "public" methods of MyNumber class.
 */

class MyNumber{
	private int number;
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
}

public class Encapsulation {
	public static void main(String[] args){
		MyNumber data = new MyNumber();
		data.setNumber(45);
		System.out.println(data.getNumber());
	}
	
}
