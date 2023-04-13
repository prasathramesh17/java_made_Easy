package section26_IO_STREAMS;

//copying a file using output stream

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output_stream_demo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		fis = new FileInputStream("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\Essential\\application & hallticket\\inputoutputstream.txt");
		fos = new FileOutputStream("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\Essential\\newiostream.txt");
		int data;
		while((data = fis.read())!=-1){
			fos.write(data);
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			fis.close();
			fos.close();               //press alt button and move the keyboard key for postion change of code 
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		}
	
}
