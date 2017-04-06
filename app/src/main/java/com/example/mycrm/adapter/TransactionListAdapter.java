package com.example.mycrm.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycrm.R;
import com.example.mycrm.model.Person;
import com.example.mycrm.model.Persons;
import com.example.mycrm.model.Transaction;
import com.example.mycrm.model.Transactions;

import java.util.List;


public class TransactionListAdapter extends RecyclerView.Adapter<TransactionListAdapter.ViewHolder> {
    private LayoutInflater inflater;

    private Context context;
    public TransactionListAdapter(Context context) {

        this.context = context;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_list_transaction_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Transaction transaction = Transactions.getTransactions().get(position);
        Person person=Persons.getPersonList().get(transaction.getPersonId());//сделать корректный поиск по id
        holder.txtTransactionClientName.setText(person.getLastName()+" "+person.getFirstName()+" "+person.getMiddelName());
    }

    @Override
    public int getItemCount() {
        return Transactions.getTransactions().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        final TextView txtTransactionId, txtTransactionClientName, txtTransactionProductName,txtTransactionPrice;
        public ViewHolder(View itemView) {
            super(itemView);
            txtTransactionId = (TextView) itemView.findViewById(R.id.txtTransactionId);
            txtTransactionClientName=(TextView) itemView.findViewById(R.id.txtTransactionClientName);
            txtTransactionProductName = (TextView) itemView.findViewById(R.id.txtTransactionProductName);
            txtTransactionPrice = (TextView) itemView.findViewById(R.id.txtTransactionPrice);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
