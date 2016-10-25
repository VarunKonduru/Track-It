package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;


import java.util.ArrayList;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity implements OnClickListener {
    int quantity = 0;
    Button addExpenses;
    EditText value;
    EditText amount;
    ArrayList<String> list = new ArrayList<>();
    private Button btnAdd;
    private EditText et;
    private ListView lv;
    private EditText addMoney;
    ArrayAdapter<String> adapter;
    private String input;
    EditText num1, num2;
    TextView resu;
    int res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdd = (Button) findViewById(R.id.addTaskBtn);
        addMoney = (EditText) findViewById(R.id.editMoney);
        btnAdd.setOnClickListener(this);
        et = (EditText) findViewById(R.id.editText);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);



        // set the lv variable to your list in the xml
        lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(adapter);
    }

    public void onClick(View v) {
        String input1 = et.getText().toString();
        String input2 = addMoney.getText().toString();
        if (input1.length() > 0 && input2.length() > 0) {

            input = input1 + "=" + input2;
            // add string to the adapter, not the listview
            adapter.add(input);

            et.getText().clear();
            addMoney.getText().clear();
            // no need to call adapter.notifyDataSetChanged(); as it is done by the adapter.add() method
        }


    }
}
