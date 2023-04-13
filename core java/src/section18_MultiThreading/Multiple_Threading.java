package section18_MultiThreading;

//to implement multiplethreading we can different methods
//1. to EXTENDS the thread class (from java.lang package)
//2. to implement the RUNNABLE INTERFACE
//while using mt.start() from thread class -> execution switches to print the both (i&j)
//thread.sleep() is used in synchronizing (while we need to wait for a browser to appear) 
public class Multiple_Threading extends Thread{
	

	public static void main(String[] args) throws InterruptedException {
		
		//create a instance for the class
		Multiple_Threading mt = new Multiple_Threading();
		
		mt.start();

		for(int j =1;j<=100;j++) {
			System.out.print("j"  + j + "\t");
			Thread.sleep(1000);   //if tiz method goes wrong it gives interruptedexcp
		}
		
	}
	public void run() {
		for(int i =1;i<=100;i++) {
		System.out.print("i"  + i + "\t");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("child thread exiting");
			e.printStackTrace();
		}
	}

	}
	}
