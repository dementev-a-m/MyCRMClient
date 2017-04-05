package com.example.mycrm.model;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private static List<Transaction> transactions = new ArrayList<>();

    public static synchronized List<Transaction> getTransactions() {
        return transactions;
    }
}
