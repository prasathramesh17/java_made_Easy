package Section9_flow_control_statements;

public class Break_Statement {
//used in loop statement to break some execution
	//used with labelled block rarely

	public static void main(String[] args) {

		for(int i=2;i<=20;i++) {
			if(i==12) {        //when int reaches 12 it will break and stops the execution
				break;
			}
			System.out.println(i);
		}
		
		//labelled block example
		int x=20;
		
		l1: {
			System.out.println("block begins");
			
			if(x==20) {
				break l1;
			}
			System.out.println("block ends");
		}
		System.out.println("outside the block");
		}
	}

