class BankAccount{
    private int accountNumber;
    private double balance;

    int getAccountNumber(){
        return accountNumber;
    }

    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    double getBalance(){
        return balance;
    }

    void depositAmount(double dep){
       // this.balance = this.balance + dep;
       this.balance += dep;
    }

    void withdrawAmount(double wd){
        if(wd <= this.balance){
            this.balance -= wd;
        }else{
            System.out.println("insufficient funds");
        }

    }

}

public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccountNumber(2828);
        b1.depositAmount(100);
        b1.withdrawAmount(101);
    }
}
