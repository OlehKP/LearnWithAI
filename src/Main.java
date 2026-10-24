public class Main {
    private static String maria;

    static void main() {
        BankAccount accountOfCustomer1 = new BankAccount("003478", "Oleg");
        BankAccount accountOfCustomer2 = new BankAccount("003458", "Anna");
        accountOfCustomer1.deposit(6500);
        accountOfCustomer1.withdraw(3400);
        accountOfCustomer2.block();
        accountOfCustomer2.unblock();
        accountOfCustomer2.deposit(1200);
        accountOfCustomer2.changeOwnerName(null);


    }
}
