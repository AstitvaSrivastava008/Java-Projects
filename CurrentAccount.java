public class CurrentAccount extends Bank_account {
    void calculateInterest() {
        long CurrentAccountInterest=2*(balance/100);
        System.out.println("Interest for Current Account: "+CurrentAccountInterest);
    }
    public static void main(String[] args) {
        Bank_account ca=new CurrentAccount();
        Bank_account sa=new SavingAccount();
        ca.accountNumber=123456789;
        ca.balance=50000;
        ca.calculateInterest();
        sa.accountNumber=987654321;
        sa.balance=100000;
        sa.calculateInterest();

    }
    
}
