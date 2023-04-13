package section26_IO_STREAMS;

import java.io.FileInputStream;
//file inputstream has return type as int to read() the content of the file
public class Input_Output_streams {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Prasath\\OneDrive\\Desktop\\Meow\\Documents\\Essential\\application & hallticket\\inputoutputstream.txt");
		System.out.println("file opened");
			int i=0;   
//to read the contents of the file (read() return a int type->so int is declared
	      while((i=fis.read())!=-1){    
	//assigning to variable and made a check till end [!=-1] ->till it reaches the end of file 
	             System.out.print((char)i);   
	    //we need to get the character/ not int in console->so (char)i
	            }    
	          
		
		} catch (Exception e)
		{
			System.out.println(e);
		}
		
	
	}

}
