package com.example.list_customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    private static final List<Customers> customers = new ArrayList<>();

    static {
        initData();
    }

    public static void initData() {
        Customers customers1 = new Customers("Luc","22/12/2022" , "Moscow");
        Customers customers2 = new Customers("Huy", "01/03/2023", "Paris");
        Customers customers3 = new Customers("Nam", "02/12/2023", "London");
        Customers customers4 = new Customers("Tuan", "12/01/2023", "Tokyo");
        Customers customers5 = new Customers("Hoang", "10/08/2023", "Berlin");
        Customers customers6 = new Customers("Doan", "02/06/2023", "Bangkok");
        customers.add(customers1);
        customers.add(customers2);
        customers.add(customers3);
        customers.add(customers4);
        customers.add(customers5);
        customers.add(customers6);
    }

    public static List<Customers> queryCustomers() {
        return customers;
    }
}
