package File;

import java.io.*;

public class FileWrite1 {

	public static void main(String[] args) {
		try{
			PrintWriter a = new PrintWriter("D:/XXX.txt");
			int i=0;
			while(i++ <100){
				a.println("This is a Text:"+i);
			}
			a.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
