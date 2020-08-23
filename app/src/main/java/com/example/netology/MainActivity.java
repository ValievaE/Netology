package com.example.netology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Items> items = new ArrayList<>();
        items.add(new Items("Записная книжка", "Дата последеней записи 17.07.2020: Компонеты ViewGroup", false, R.drawable.notes));
        items.add(new Items("Настройки", "Настройки Андроид", true, R.drawable.settings));

        ListView listView = findViewById(R.id.listView);
        ItemsAdapter itemsAdapter = new ItemsAdapter(this,items);
        listView.setAdapter(itemsAdapter);

    }

}