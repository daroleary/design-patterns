package com.pattern.visitor.solution1;

public class Customer extends Element {

    private String _name;
    private double _balance;

    public Customer(String name, double balance) {
        _name = name;
        _balance = balance;
    }

    public String getName() {
        return _name;
    }

    public double getBalance() {
        return _balance;
    }

    public void credit(double amount) {
        _balance += amount;
    }

    public void debit(double amount) {
        _balance -= amount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
