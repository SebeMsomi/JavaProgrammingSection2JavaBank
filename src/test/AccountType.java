package test;

public enum AccountType {

    SAVINGS("SA", 1.0),
    CREDIT("CR", 2.0),
    CURRENT("CU", 0.0),
    DEPOSIT("DP", 3.0);

    private String code;
    private double rate;

    private AccountType(String code, double rate){

        this.code = code;
        this.rate = rate;

    }

    public String getCode(){

        return code;

    }
    public double getRate(){

        return rate;

    }

}
