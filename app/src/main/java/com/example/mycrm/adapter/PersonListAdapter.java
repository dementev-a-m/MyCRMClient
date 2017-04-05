package com.example.mycrm.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycrm.R;
import com.example.mycrm.activity.PersonActivity;
import com.example.mycrm.model.Person;
import com.example.mycrm.model.Persons;


public class PersonListAdapter extends RecyclerView.Adapter<PersonListAdapter.ViewHolder> {
    private LayoutInflater inflater;

    private Context context;
    public PersonListAdapter(Context context){
        this.context=context;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public PersonListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment_list_persons_item, parent,false);
         return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(PersonListAdapter.ViewHolder holder, int position) {
        Person person = Persons.getPersonList().get(position);
        holder.txtSFMName.setText(person.getLastName()+" "+person.getFirstName()+" "+person.getMiddelName());
       // holder.txtData.setText(person.getDataBithday().toString());
    }
    @Override
    public int getItemCount() {
        return Persons.getPersonList().size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        final TextView txtSFMName, txtData;
        ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            //imageView = (ImageView)view.findViewById(R.id.image);
            txtSFMName = (TextView) itemView.findViewById(R.id.txt_persons_second_first_secondName);
            txtData= (TextView) itemView.findViewById(R.id.txt_data_birthday);
            //txtMiddelName = (TextView)view.findViewById(R.id.txt_persons_middelName);
        }
        @Override
        public void onClick(View v) {
            final Intent intent= new Intent(context, PersonActivity.class);
            intent.putExtra("Person",getAdapterPosition());
            context.startActivity(intent);
        }
    }

}
