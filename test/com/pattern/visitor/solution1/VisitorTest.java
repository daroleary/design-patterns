package com.pattern.visitor.solution1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class VisitorTest {

    @Test
    public void testVisit() throws Exception {
        Customers customers = new Customers();

        Customer georgeCustomer = new Customer("George", 233.50);
        Customer janiceCustomer = new Customer("Janice", 102.25);
        Customer richardCustomer = new Customer("Richard", 2005.48);

        customers.attachElement(georgeCustomer);
        customers.attachElement(janiceCustomer);
        customers.attachElement(richardCustomer);

        assertEquals(3, customers._customers.size());

        CreditVistor creditVistor = new CreditVistor(50.15);
        DebitVistor debitVistor = new DebitVistor(22.20);

        Map<String, Double> expectedResults = new HashMap<>();
        expectedResults.put(georgeCustomer.getName(), 233.50);
        expectedResults.put(janiceCustomer.getName(), 102.25);
        expectedResults.put(richardCustomer.getName(), 2005.48);
        assertCustomers(customers, expectedResults);

        customers.acceptVisitor(creditVistor);

        expectedResults = new HashMap<>();
        expectedResults.put(georgeCustomer.getName(), 283.65);
        expectedResults.put(janiceCustomer.getName(), 152.40);
        expectedResults.put(richardCustomer.getName(), 2055.63);
        assertCustomers(customers, expectedResults);

        customers.acceptVisitor(debitVistor);

        expectedResults = new HashMap<>();
        expectedResults.put(georgeCustomer.getName(), 261.45);
        expectedResults.put(janiceCustomer.getName(), 130.20);
        expectedResults.put(richardCustomer.getName(), 2033.43);
        assertCustomers(customers, expectedResults);

        customers.dettachElement(georgeCustomer);
        customers.dettachElement(janiceCustomer);
        customers.dettachElement(richardCustomer);
        assertEquals(0, customers._customers.size());
    }

    private void assertCustomers(Customers customers, Map<String, Double> expectedResults) {
        for (Map.Entry<String, Double> nameDoubleEntry : expectedResults.entrySet()) {
            String name = nameDoubleEntry.getKey();
            double expectedBalance = nameDoubleEntry.getValue();

            Customer customer = customers.getCustomer(name);
            assertEquals(expectedBalance, customer.getBalance(), 0.00001);
        }
    }
}
