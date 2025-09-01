


class Account{

    String name;
    int AccountNo;
    double balance;
    String type;
    public void withdraw(){
        System.out.println(" Withdraw method in Account class ");

    }
}
class Saving_Account extends Account{
    public void withdraw(){
        // Implementation for withdraw

        System.out.println(name + " " + AccountNo + " " + balance + " " + type);
    }

}
class Current_Account extends Account{
    public void withdraw(){
        // Implementation for withdraw

        System.out.println(name + " " + AccountNo + " " + balance + " " + type);
    }
}

public class Bank {
    public static void main(String[] args) {
        Saving_Account sa = new Saving_Account();
        sa.name = "John";
        sa.AccountNo = 123456;
        sa.balance = 1000.0;
        sa.type = "Saving";
        sa.withdraw();
    Current_Account ca = new Current_Account();
    ca.name = "Param";
    ca.AccountNo = 654321;
    ca.balance = 2000.0;
    ca.type = "Current";
   ca.withdraw();
    }
}