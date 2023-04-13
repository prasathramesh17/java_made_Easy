package section5_non_static;

public class Def_Constructor {        
//if java compiler could not find default constructor it will automatically inject 1 for us
                   
/*   Def_Constructor(){                                 //constructor is not found
			System.out.println("inside constructor");
		}
*/	
		{
			System.out.println("inside non static block");
		}
		
		public static void main(String[] args) {
	     System.out.println("inside the main method");  //2.main method is printed second
			new Def_Constructor();                           //3.when new object is created it looks for
			new Def_Constructor();                           //non-static block and then constructor
			new Def_Constructor();                          //4. three times new obj created so it is called 3 times
		}
		static {
			System.out.println("static block");         //1.gets printed first as it is static
		

	}

}
