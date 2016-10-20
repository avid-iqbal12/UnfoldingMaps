package javatuts;
/**
 * Write a Java program to show the following output:
				1
			  1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/

public class Pyramid {
	public static void main(String[] args){
		int n = 9;
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>=1;j--)
				System.out.print("  ");
			for(int k=1;k<=i;k++)
				System.out.print(k+" ");
			for(int p=i-1;p>=1;p--)
				System.out.print(p+" ");
			System.out.println(" ");
		}
	}
}