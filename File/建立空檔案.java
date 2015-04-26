package File;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		File f1 = new File("D:\\A.TXT");
		try{
			f1.createNewFile();
		} catch(IOException e){
			System.out.println("ABC");
		}
	}

}
