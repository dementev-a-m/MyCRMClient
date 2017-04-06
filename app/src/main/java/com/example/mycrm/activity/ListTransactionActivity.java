package com.example.mycrm.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mycrm.R;
import com.example.mycrm.adapter.TransactionListAdapter;
import com.example.mycrm.model.Transaction;
import com.example.mycrm.model.Transactions;

public class ListTransactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_transaction);
        setData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.list_transactions);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        TransactionListAdapter adapter = new TransactionListAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        Transactions.getTransactions().add(new Transaction(1,1));
        Transactions.getTransactions().add(new Transaction(2,2));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,3));
        Transactions.getTransactions().add(new Transaction(2,4));
        Transactions.getTransactions().add(new Transaction(2,5));
        Transactions.getTransactions().add(new Transaction(2,5));
        Transactions.getTransactions().add(new Transaction(3,4));

    }
}
