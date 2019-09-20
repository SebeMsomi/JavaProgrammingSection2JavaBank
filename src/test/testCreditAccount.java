package test;


public class testCreditAccount {
	

	public static void main(String[] args) {

		// Instantiate 3 accounts
	    // Using constructor with values
	    Account A1 = new Account("Sanjay Gupta",11556,300,AccountType.SAVINGS);
	    	// Using default constructor
		Account A2 = new Account("Gupta",11557,1300, AccountType.SAVINGS);
	 	Account A3 = new Account("George",11558,2300, AccountType.SAVINGS);

		// Instantiate 2 credit accounts
        // Using constructor with values which will call constructor from super

        CreditAccount C1 = new CreditAccount("Number one", 66777, 1000);
        CreditAccount C2 = new CreditAccount("Another",66778,1000,500);

        /*
		// Print accounts
		A1.print();
		A2.print();
		A3.print();
		C1.print();
		C2.print();
		*/


        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(C1);
        System.out.println(C2);

    }
}

