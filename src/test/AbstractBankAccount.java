package test;

public abstract class AbstractBankAccount {

	//instance variables
    public final String BANK = "JavaBank";
	protected String accountName;
	protected int accountnum;
	protected int balance;

	public AbstractBankAccount(String name, int num,int amt) {

		accountName = name;
		accountnum = num;
		balance = amt;

	}


	//methods
	public String getBankName() { return InterfaceBankAccount.BANK; }
	public abstract void deposit(int amt);
	public void withdraw(int amt)
	{
		balance=balance-amt;
	}
	public int getbalance(){return balance;};
	public void setbalance(int num)
	{
		balance = num;
	}
	public int getaccountnum ( ) {

		return accountnum;
	}
	public void setaccountnum(int num)
	{
		accountnum = num;
	}
	public String getaccountname ( ) {

		return accountName;
	}
	public void setaccountname(String name)
	{
		accountName = name;
	}

	@Override
	public String toString() {

		return    "Bank name     : " + getBankName()
				+ "\nAccount name  : " + accountName
				+ "\nAcc num       : " + accountnum
				+ "\nBalance       : R" + balance;

	}
}
