package org.example.task1;

// Шаблон для создания объекта
public class BankAccount implements Printable {
    private String accountNumber;
    private int balance;

    // Сеттер
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Геттер
    public int getBalance(){
        return this.balance;
    }

    @Override
    public void print() {
        System.out.println("Balance " + this.balance);
    }
}
