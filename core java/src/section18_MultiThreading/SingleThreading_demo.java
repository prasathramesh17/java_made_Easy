package section18_MultiThreading;
//execution is sequential in order no multithreading is involved
//they have their own method space
public class SingleThreading_demo {

	public static void main(String[] args) {

		SingleThreading_demo st = new SingleThreading_demo();
		
		st.printNumbers();
		for(int j=1;j<=100;j++) {
			System.out.print("j : " + j  +"\t");
		}
	}

	void printNumbers()
	{	for(int i=1;i<=100;i++) {
		System.out.print("i : " + i  +"\t");
	}
}
}
