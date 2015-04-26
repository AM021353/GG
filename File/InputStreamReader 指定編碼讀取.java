package File;

import java.io.*;

public class FileRead1 {

	public static void main(String[] args) {
		try{
			FileInputStream a = new FileInputStream("D:/Sony C903/Blog.html");
			InputStreamReader b = new InputStreamReader(a,"GBK");
			BufferedReader c = new BufferedReader(b);
			String line;
			while((line=c.readLine())!=null){
				System.out.println(line);
			}
			c.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}

	}

}
