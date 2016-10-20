package javatuts;

import java.io.*;
import java.net.*;


public class ClientServer {
	public static void main(String[] args){
		try {
			Socket s1 = new Socket ("127.0.0.1" , 5432);
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readUTF());
			dis.close();
			s1.close();
		} catch (ConnectException e1){
			System.out.println(e1);			
		} catch (IOException e2){
			e2.printStackTrace();
		}
	}
}
