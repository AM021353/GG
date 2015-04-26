package File;

import java.io.*;

public class FileWrite2 {

	public static void main(String[] args) {
		try{
			FileOutputStream a = new FileOutputStream("D:/XXX.txt");
			OutputStreamWriter b = new OutputStreamWriter(a,"GBK");
			BufferedWriter c = new BufferedWriter(b);
			int i=0;
			while(i++ <100){
				c.write("test:"+i);
				c.newLine();
			}
			c.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
	}

}
