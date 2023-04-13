package day1_handson;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

		bill eb = new bill();
		eb.getdata();
		eb.calc();
		eb.display();

	}

}
class bill {

	int ConsumerNo;
	String ConsumerName;
	int PrevReading;
	int CurrentReading;
	String EBConn;
	
	int units;
	double bill;
	
	void getdata()
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Consumer Number : ");
	ConsumerNo = sc.nextInt();
	System.out.print("Enter Consumer Name : ");
	ConsumerName = sc.next();
	System.out.println("Enter the previous units: ");
    PrevReading = sc.nextInt();
	System.out.println("Enter the current units : ");
	CurrentReading = sc.nextInt();
	System.out.println("Connection Type (D for Domestic c for Commercial):");
	 EBConn = sc.next();
	 sc.close();
	}
	
	 void calc() {
		 if(PrevReading < CurrentReading)
		 {
			 units = CurrentReading - PrevReading;
			 if(EBConn.equals("D"))
			 {
				 if(units <=100)
					 bill=units*1;
				 else if(units<=200)
					 bill=(100*1+(units-100)*2.50);
				 else if(units <=500)
					 bill=(100*1+100*2.50)+(units-200)*4;
				 else
					bill=(100*1+100*2.50+300*4+(units-500)*6);
			 }
			 else
			 {
				 if(units <=100)
					 bill=units*2;
				 else if(units<=200)
					 bill=(100*2+(units-100)*4.50);
				 else if(units <=500)
					 bill=(100*2+100*4.50)+(units-200)*6;
				 else
					bill=(100*2+100*4.50+300*6+(units-500)*7);
			 }
			 }
		 }
	 void display() {
		 System.out.println("***********ELECTRICITY BILL**********");
		 System.out.println("Consumer number      = "+ConsumerNo);
		 System.out.println("Consumer name      = "+ConsumerName);
		 
		 if(EBConn.equals("D"))
			 System.out.println("Type of connection  = DOMESTIC ");
		 else
			 System.out.println("Type of connection  = COMMERCIAL");
		 
		 System.out.println("Current Reading      = "+CurrentReading);
		 System.out.println("Previous Reading      = "+PrevReading);
		 System.out.println("Total units     = "+units);
		 System.out.println("Total bill      = "+bill);
	 }
	 }
