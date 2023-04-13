package section18_MultiThreading;

import java.util.Scanner;

public class Join_demo extends Thread{

	static int n,sum=0;
	public static void main(String[] args) {

		System.out.println("sum of first n numbers : ");            //scanner will print 1st
		System.out.println("enter the value: ");
		Scanner sc = new Scanner(System.in);
		Join_demo.n = sc.nextInt();
		
		Join_demo jd = new Join_demo();
		jd.start();                                          //after start()..it goes to run()
		try {
			jd.join();                                     //join() is the dead last to execute
		} catch (InterruptedException e) {
			e.printStackTrace();
		}               //waits till the thread is dead(executes at last)
		System.out.println("sum of first :" + Join_demo.n + " Number is " + Join_demo.sum);
		
		
	}
	public void run()
	{
		for(int i=1;i<=Join_demo.n;i++) {
		Join_demo.sum+= i;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
