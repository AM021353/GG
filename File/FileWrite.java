package File;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		try{
			FileWriter a = new FileWriter("D:/XXX.txt");
			BufferedWriter b = new BufferedWriter(a);
			int i=0;
			while(i++ <100){
				b.write("This is a Text:"+i);
				b.newLine();
			}
			b.close();
		}catch(IOException e){
			System.out.println(e);
		}

	}

}
