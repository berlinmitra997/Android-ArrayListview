package com.example.berlin.materisatu;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    //Array of String

    String[] windowArray = {"Berlin", "Yoni", "Rifa"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>
                (this, R.layout.activity_listview, windowArray);

        listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

    }


}
