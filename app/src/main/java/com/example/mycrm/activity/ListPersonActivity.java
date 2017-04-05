package com.example.mycrm.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mycrm.R;
import com.example.mycrm.adapter.PersonListAdapter;
import com.example.mycrm.model.Person;
import com.example.mycrm.model.Persons;

import static com.example.mycrm.R.attr.layoutManager;

public class ListPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_persons);

        setDataList();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_person);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        PersonListAdapter personListAdapter = new PersonListAdapter(this);
        recyclerView.setAdapter(personListAdapter);
    }
    public void setDataList() {
        Persons.getPersonList().add(new Person("Дементьев","Антон","Михайлович"));
        Persons.getPersonList().add(new Person("Воробьева","Софья","Андреева"));
        Persons.getPersonList().add(new Person("Иванчиков","Александр","Валдимирович"));
        Persons.getPersonList().add(new Person("Дворников","Даниил","Дмитриевич"));
        Persons.getPersonList().add(new Person("Куликова","Елена","Неизвестно"));
        Persons.getPersonList().add(new Person("Шмелев","Юрий","Дмитриевич"));
        Persons.getPersonList().add(new Person("Дементьев","Антон","Михайлович"));
        Persons.getPersonList().add(new Person("Воробьева","Софья","Андреева"));
        Persons.getPersonList().add(new Person("Иванчиков","Александр","Валдимирович"));
        Persons.getPersonList().add(new Person("Дворников","Даниил","Дмитриевич"));
        Persons.getPersonList().add(new Person("Куликова","Елена","Неизвестно"));
        Persons.getPersonList().add(new Person("Шмелев","Юрий","Дмитриевич"));

    }
}
