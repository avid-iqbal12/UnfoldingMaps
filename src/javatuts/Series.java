package javatuts;

/*	Write a Java program that loops 1-50 and print foo for every multiple
of 3, bar for every multiple of 5 and baz for every multiple of 3 and 5.
*/	

public class Series {
	public static void main(String[] main){
		for(int i=0;i<=50;i++){
			System.out.println(i);
			if(i%3==0 && i%5==0)
				System.out.print("-baz");
			else if(i%3==0)
				System.out.print("-foo");
			else if(i%5==0)
				System.out.print("-bar");
			System.out.print(" ");
		}
	}
}
