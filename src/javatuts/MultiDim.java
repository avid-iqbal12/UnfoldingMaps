package javatuts;

import java.util.Arrays;

/**
 * @author !qbal
 *	multi-dimensional array i.e. an array of arrays
 */

public class MultiDim {
	public static void matrix(){
		//declaration and creation of Array
		int [][] twoDim = new int[4][4];
		//init array using for loop
		for(int row=0;row<3;row++)
			for(int col=0;col<3;col++)
				twoDim[row][col]=1;				
		//use of array
		//for(int row=0;row<=2;row++)
			//for(int col=0;col<=2;col++)
				//System.out.println(twoDim[row][col]);
		
		System.out.println(Arrays.deepToString(twoDim));
	}
	
	public static void mulArray(){
		int[][] myArray = new int [4][4];
		for(int row=0;row<3;row++)
			for(int col=0;col<3;col++)
				myArray[row][col]=1;
		myArray[0] = new int [2];
		System.out.println(Arrays.deepToString(myArray));
		myArray[1] = new int [4];
		System.out.println(Arrays.deepToString(myArray));
		myArray[2] = new int [6];
		System.out.println(Arrays.deepToString(myArray));
		myArray[3] = new int [8];
		System.out.println(Arrays.deepToString(myArray));

	}
	
	
	public static void main (String[] args){
		//matrix();
		mulArray();
	}
}
