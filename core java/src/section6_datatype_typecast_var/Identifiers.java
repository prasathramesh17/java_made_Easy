package section6_datatype_typecast_var;

public class Identifiers {
//rule-> a-z   A-Z   0-9  _   $  (can have)   (case sensitive)
//not allowed-> (no other symbol, no java keywords to be used,
//                           	cannot start with number, no spaces in between)

	//these rules are applicable for class and method name too 
	
	public static void main(String[] args) {

		byte mouse = 100;    // variable - (mouse / Mouse are different )
		byte Mouse = 120;
		byte Mou$e = 124;     // Mou$e is also a differnt variable
		
		int _$value = 10000;  // _ and $ symbol can be used u the beginning
		
		int unique_$ymbol = 17;  // $ and _ can be used in between variable name
		
	//	int float = 141.5f;   // java keywords cannot be used as variable/identifiers
		
	//	int num order = 124;  // no spaces are allowed in between variable/identifier;
		
	//	int 12num = 14;      // cannot start with the number
	}

}
