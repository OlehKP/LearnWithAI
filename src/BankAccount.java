import java.math.BigDecimal;

public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;
    private boolean blocked;


    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public boolean deposit(double amount) {
        if (amount > 0 && !blocked) {
            balance += amount;
            System.out.println("Рахуннок поповнений на " + amount + ". Стан рахунку " + balance +"$");
            return true;
        }
        return false;
    }

    public boolean withdraw (double amount) {
        if (amount > 0 && !blocked && amount <=balance ) {
            balance = balance - amount;
            System.out.println("Ви зняли " + amount + ". Стан рахунку " + balance);
            return true;
        }
        return false;
    }
    public void block() {
        blocked = true;
        System.out.println("Рахунок був заблокований");
    }

    public void unblock() {
        blocked = false;
        System.out.println("Рахунок був успішно розблокований");
    }

    public void changeOwnerName(String newName) {
        if (newName != null) {
            setOwnerName(newName);
            System.out.println("Ім'я було успішно змінено. Нове ім'я: " + newName);
        }
        System.out.println("Упс.. Щось пішло не так");
    }

}


