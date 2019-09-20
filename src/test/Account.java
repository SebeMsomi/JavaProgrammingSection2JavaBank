package test;




public class Account extends AbstractBankAccount {

	    private int bonusValue;
	    private AccountType type;

	    public Account(String name, int num, int amt, AccountType type){

	    	super(name,num, (amt + claculateInitialBonusValue(amt)));
            this.type = type;

		}

		public void deposit(int amt){

	    	if(amt>100)
	    		balance = balance + (amt +(int)(bonusValue * 0.1));
	    	else
	    		balance = balance + amt;

		}

	    private static int claculateInitialBonusValue(int amt){

	    	if(amt >= 1 && amt <= 100)
	    		return 10;
	    	else if(amt <= 300)
	    		return 20;
	    	else
	    		return 30;

		}//end of calculate method
	    
	    //print method 
	    public void print() {
	        System.out.println("Bank name: " + getBankName() + " "
	                         + "\nAccount name: " + accountName + " "
	                         + "\nAcc num: " + accountnum + " " 
	                         + "\nBalance: R" + balance);
	      }

	@Override
	public String toString() {
		return super.toString() +
				"\nbonusValue    : " + bonusValue + "\n";
	}
}
