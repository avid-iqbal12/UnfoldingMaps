package javatuts;

import java.io.*;
import java.net.*;

public class HostServer {
	public static void main(String[] args){
		ServerSocket s = null;
		try{
			s = new ServerSocket(5432); 	 
			Socket s1 = s.accept();
			OutputStream s1out = s1.getOutputStream();
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (s1out)); 
			bw.write("Hello Net World");
			bw.close();
			s1.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
