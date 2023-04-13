package section6_datatype_typecast_var;

public class BankAccount {
// variable type (static variable / local variable / instance variable )
	
static String BankName= "Canara Bank";   //common across all obj (static variable)
String accountHolderName;                // anything unique for every obj (instance variable)
String AccountNumber;                     //directly declared under class
float Balance;
	
	public static void main(String[] args) {
                                                 // access modifier are not used in local variable
		double loanInterestrate =7.5;            //(local variable)are declared inside the blocks/methods
		System.out.println(loanInterestrate);   // we have assign value to local variable before they are used
		                                        //once work completes it may disappear
		System.out.println(BankAccount.BankName);
		
		BankAccount bankacc = new BankAccount();
		
		bankacc.accountHolderName="karthick";
		bankacc.AccountNumber="136710152025";
		bankacc.Balance = 20000f;
		System.out.println(bankacc.accountHolderName);
		System.out.println(bankacc.AccountNumber);
		System.out.println(bankacc.Balance);
		
	}

}
