package javatuts;

/*
Write a Java program that will display the Fibonacci sequence is generated 
by adding the previous two terms. By starting with 1, 1, and 2, and
continue up to the first 10 terms.
*/

public class Fibonacci {
	public static void main(String[] args){
		int x=1, y=1, z=0;
		for(int i=0;i<=10;i++){
			if(i==0){
				System.out.print(0+" ");
			}
			else if(i==1){
				System.out.print(x +" "+ y);				
			}
			else{
			z = x + y;
			System.out.print(" "+z);
			x = y;
			y = z;
			}
		}
	}
}



