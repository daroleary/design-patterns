package com.pattern.visitor.solution1;

import java.util.*;

public class Customers {

    Map<String, Customer> _customers = new HashMap<>();

    public void attachElement(Customer customer) {
        _customers.put(customer.getName(), customer);
    }

    public void dettachElement(Customer customer) {
        _customers.remove(customer.getName());
    }

    public Customer getCustomer(String name) {
        return _customers.get(name);
    }

    public void acceptVisitor(Visitor visitor) {
        for (Customer customer : _customers.values()) {
            customer.accept(visitor);
        }
    }
}
