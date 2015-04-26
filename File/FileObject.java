package File;

import java.io.*;

public class FileObject {

	public static void main(String[] args) {
		String s1 = "D:/iTunes/iTunes iPad/iTunes Library.itl";
		String s2 = "D:/iTunes/iTunesHelper.exe";
		File f1 = new File(s1);
		System.out.println(s1+" is a folder?"+f1.isDirectory());
		System.out.println(s1+" is a file?"+f1.isFile());
		System.out.println(s1+" length:"+f1.length()+"bytes");
		File f2 = new File(s2);
		f1.renameTo(f2);

	}

}
