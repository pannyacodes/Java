class Bank {
    void withdraw() {
        System.out.println("withdraw money");
    }
}

class SBI extends Bank {
    @Override
    void withdraw() {
        System.out.println("withdraw money from SBI");
    }
}

class HDFC extends Bank {
    @Override
    void withdraw() {
        System.out.println("withdraw money from HDFC");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b1 = new SBI() ;
        b1.withdraw();

        Bank b2 = new HDFC();
        b2.withdraw();
    }
}
