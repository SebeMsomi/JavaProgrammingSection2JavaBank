package test;


public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account A1 = new Account("Sanjay Gupta",11556,300,AccountType.SAVINGS);
    	// Using default constructor
	Account A2 = new Account("Drew", 11557, 500,AccountType.SAVINGS);
	Account A3 = new Account("Paul", 11558, 1000,AccountType.SAVINGS);

	
	// Print accounts
	System.out.println(A1);
	System.out.println(A2);
	System.out.println(A3);

	}

}
