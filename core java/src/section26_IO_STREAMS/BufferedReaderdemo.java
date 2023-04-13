package section26_IO_STREAMS;
//buffered reader is a decorator for file reader
//sensitive information can be serialized using [TRANSIENT] keyword before datatype_var;
//.SER (is the extension used with serialization of data
//serialization: objectinputstream [read OBJECT-> when we read a file]
//DE-serialization: objectoutputstream [write OBJECT-> when we write&read the obj back from  a file]
//RMI-> REMOTE METHOD INVOCATION
//EJB-> ENTERPRISE JAVA BEANS
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderdemo {

	public static void main(String[] args) {

		FileReader fr= null;
		BufferedReader br = null;
		int count =0;
		
		//try with resources blocks
//	try(fr = new FileReader("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\Essential\\application & hallticket\\inputoutputstream.txt");
//		br= new BufferedReader(fr);){ }
		
		try {                               //hit ctrl+1 surround by try catch action
			fr = new FileReader("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\Essential\\application & hallticket\\inputoutputstream.txt");
		br= new BufferedReader(fr);
		
		String line;
		
		while((line=br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				count++;
			}
		}
		System.out.println("no of words in the file are :"+ count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {          //finally block can be unused when we use try with resource block 
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
