package test;

public class TestCustomerAccounts {

    public static void main(String[] args) {

        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];

        bankAccount[0] = new Account("Abel", 101, 100, AccountType.SAVINGS);
        bankAccount[1] = new Account("Betty", 102, 200, AccountType.SAVINGS);
        bankAccount[2] = new Account("Craig", 103, 300, AccountType.SAVINGS);

        bankAccount[3] = new CreditAccount("David", 104, 400);
        bankAccount[4] = new CreditAccount("Ethan", 105, 1450,500);

        showAllCustomerAccounts(bankAccount);
        showAllAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);

        for (AccountType act: AccountType.values()){

            System.out.println("Value: " + act.name()
                           + ", position: " + act.ordinal());

        }


    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount){

        System.out.println("\nAll Customer Accounts******\n");

        for(AbstractBankAccount act: bankAccount)

            System.out.println(act);

    }

    //prints all the instances of the accounts class in the bankAccount array
    public static void showAllAccounts(AbstractBankAccount[] bankAccount){

        System.out.print("\nAll Account types*******\n");

        for(AbstractBankAccount act: bankAccount)
            if(act instanceof Account)
            System.out.println(act);

    }

    //prints all the instances of the CreditAccount class in the bankAccount array
    public static void showAllCreditAccounts(AbstractBankAccount[] bankAccount){

        System.out.print("\nAll Credit Account types*******\n");

        for(AbstractBankAccount act: bankAccount)
            if(act instanceof CreditAccount)
                System.out.println(act);

    }



}
