package javatuts;

/**
 * Homogeneous collection is the collection of objects 
 * that have a common class.
 */

import java.util.Arrays;

public class TestHomogeneous {
	public static void main(String[] args){
		TestHomogeneous[] arr = new TestHomogeneous[3]; 
		arr[0] = new TestHomogeneous();
		arr[1] = new TestHomogeneous();
		arr[2] = new TestHomogeneous();
		
		System.out.println(Arrays.toString(arr));
	}
}
