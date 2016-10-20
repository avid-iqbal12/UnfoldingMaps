package umd;

import java.io.*;

/**Simple program to read input and echo it to output with
 * line numbers */

public class Echo {
	public static void main(String args[]){
		String s;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		try{
			while( (s=in.readLine()) !=null){
				System.out.println((i++) + ": " + s);
			}	
		}
		catch(IOException e){
			System.out.println("Error: " + e);
		}
	}
}
