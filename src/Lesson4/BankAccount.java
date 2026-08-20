package Lesson4;

public class BankAccount {
    int id =1;

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = MyAccount;

        System.out.println(MyAccount.id);
        System.out.println(YourAccount); // ссылка
    }
}
