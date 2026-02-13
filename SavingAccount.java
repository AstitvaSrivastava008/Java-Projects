public class SavingAccount extends Bank_account {
    void calculateInterest() {
        long SavingAccountInterest=4*(balance/100);
        System.out.println("Interest for Saving Account: "+SavingAccountInterest);
    }
    
}
