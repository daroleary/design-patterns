package com.pattern.visitor.solution1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class VisitorTest {

    @Test
    public void testVisit() throws Exception {
        Customers customers = new Customers();

        String george = "George";
        String janice = "Janice";
        String richard = "Richard";

        customers.attachElement(new Customer(george, 233.50));
        customers.attachElement(new Customer(janice, 102.25));
        customers.attachElement(new Customer(richard, 2005.48));

        CreditVistor creditVistor = new CreditVistor(50.15);
        DebitVistor debitVistor = new DebitVistor(22.20);

        Map<String, Double> expectedResults = new HashMap<>();
        expectedResults.put(george, 233.50);
        expectedResults.put(janice, 102.25);
        expectedResults.put(richard, 2005.48);
        assertCustomers(customers, expectedResults);

        customers.acceptVisitor(creditVistor);

        expectedResults = new HashMap<>();
        expectedResults.put(george, 283.65);
        expectedResults.put(janice, 152.40);
        expectedResults.put(richard, 2055.63);
        assertCustomers(customers, expectedResults);

        customers.acceptVisitor(debitVistor);

        expectedResults = new HashMap<>();
        expectedResults.put(george, 261.45);
        expectedResults.put(janice, 130.20);
        expectedResults.put(richard, 2033.43);
        assertCustomers(customers, expectedResults);
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
