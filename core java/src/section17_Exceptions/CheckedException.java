package section17_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	void readfile() {
		try {
			FileInputStream fis = new FileInputStream("");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("file not found exception");
		}

	public static void main(String[] args) {
		
           CheckedException ce = new CheckedException();
ce.readfile();
}
}