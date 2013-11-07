package com.pattern.visitor.solution1;

import java.text.MessageFormat;

public class DebitVistor implements Visitor {

    private double _amount;

    public DebitVistor(double amount) {
        _amount = amount;
    }

    @Override
    public void visit(ICustomer iCustomer) {
        Customer customer = (Customer) iCustomer;
        customer.debit(_amount);

        System.out.println(MessageFormat.format("DebitVistor debited {0} ${1}. Balance: ${2}",
                customer.getName(),
                _amount,
                customer.getBalance()));
    }
}
