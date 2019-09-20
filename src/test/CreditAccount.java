package test;


public class CreditAccount extends AbstractBankAccount{

	int creditLimit;

	public CreditAccount(String name, int num, int credit) {

		super(name,num,credit);
		this.creditLimit = credit;

	}

	public CreditAccount(String name, int num,int amt,int credit) {

            super(name,num,amt);
            this.creditLimit = calculateCreditLimit(amt);
            
    }
	//modifier to set the account creditlimit
	 public void setcreditlimit(int num)
	    {
	    	    creditLimit = num;
	    }
	//accessor to get the account creditlimit
	 public int getcreditlimit ( ) {

		 return creditLimit;
	 }

	 //added this method
	 private static int calculateCreditLimit(int amt){

		 if(amt >= 1 && amt <= 100)
			 return 100;
		 else if(amt >= 2001 && amt <= 4000)
			 return 200;
		 else
			 return 300;

	 }

	//added this method
	 @Override
	 public void deposit(int amt) {

		balance = balance + amt;

	 }

	    //print method
	 public void print() {
	        System.out.println("Bank name: " + getBankName() + " "
					            + "\nAccount name: " + accountname + " "
					            + "\nAcc num: " + accountnum + " "
					            + "\nBalance: R" + balance
					            + "\nCredit Limit: R" + creditLimit);
	      }

	@Override
	public String toString() {
		return super.toString() + "\nCredit Limit  : " + creditLimit + "\n";
	}
}
