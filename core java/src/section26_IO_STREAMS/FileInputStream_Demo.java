package section26_IO_STREAMS;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStream_Demo {

	public static void main(String[] args) {
//to read all characters
		FileInputStream fis = null;
		try {
		fis = new FileInputStream(new File("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\myfolder\\SQL from git.docx"));
		System.out.println("File Opened");
		
		int i;                                  //to read single character
		while((i=fis.read())!=-1) {              //int i = fis.read();
			System.out.print((char)i);          //system.out.print((char)i);
		}
		fis.close();
		}catch(Exception e) {
		
				System.out.println(e);
		}
		}

}
