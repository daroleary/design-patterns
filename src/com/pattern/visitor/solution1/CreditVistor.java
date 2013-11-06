package com.pattern.visitor.solution1;

import java.text.MessageFormat;

public class CreditVistor extends Visitor {

    private double _amount;

    public CreditVistor(double amount) {
        _amount = amount;
    }

    @Override
    public void visit(ICustomer iCustomer) {
        Customer customer = (Customer) iCustomer;
        customer.credit(_amount);

        System.out.println(MessageFormat.format("CreditVistor credited {0} ${1}. Balance: ${2}",
                customer.getName(),
                _amount,
                customer.getBalance()));
    }
}
