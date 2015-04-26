package File;

import java.io.*;

public class FileList {

	public static void main(String[] args) {
		File f1 = new File ("D:/iTunes/");
		if(f1.isDirectory()){
			String[] flist = f1.list();
			for(String fname:flist){
				File f2 = new File ("D:/iTunes/"+fname);
				if(f2.isDirectory()){
					System.out.println(fname+"\t<DIR>");
				}
				else if(f2.isFile()){
					System.out.println(fname+"\t"+f2.length()+"bytes");
				}
				else{
					System.out.println("XXX"+fname);
				}
			}
		}
	}
}
