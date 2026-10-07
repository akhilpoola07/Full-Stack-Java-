package Day12;
import java.util.*;
public class MultiThreading {
    public static void main(String[] args)
    {
        Account account = new Account();
        account.deposit(5000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
class Account{
    private int balance = 0;
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(int amount)
    {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
    public int getBalance()
    {
        return balance;
    }
}