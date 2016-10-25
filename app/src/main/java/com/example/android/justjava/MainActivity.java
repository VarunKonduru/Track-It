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


 /*   public void increment(View view) {
    //    int quantity = 2;
        quantity = quantity+1;
        display(quantity);

    }

    public void value(View view){

    }
    /**
     * This method is called when the order button is clicked.
     */
/*    public void submitOrder() {
     // int quantity = 1;
       // display(quantity);
      //  displayPrice(quantity*5);
     /*   EditText text = (EditText) findViewById(R.id.my_name);
        String value = text.getText().toString();

        EditText money = (EditText) findViewById(R.id.value_amount);
        String amount = money.getText().toString();

        text.getText().clear();

        money.getText().clear();
        String name = value.getText().toString();
        String dollar = amount.getText().toString();

        value.getText().clear();
        amount.getText().clear();


      String message = createOrderSummary(name,dollar);
       displayMessage(message);

    }



    public void decrement(View view) {
    //  int quantity = 1;
        quantity = quantity - 1;
        display(quantity);

    }

    public int calculatePrice() {
        int price = quantity*5;
        return price;
    }

    public String createOrderSummary(String myname, String amount) {
        String name = myname;

            name = name + " = " + "$" + amount;
            return name;

    }

    /**
     * This method displays the given quantity value on the screen.
     */
 /* private void display(int number) {
      TextView quantityTextView = (TextView) findViewById(
              R.id.quantity_text_view);
      quantityTextView.setText("" + number);
  }

     //  private void displayMessage(String message) {
       // TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        // orderSummaryTextView.setText(message);
    //}

  //  public void displayImage(View view){
    //    ImageView androidBgImageView = (ImageView) findViewById(R.id.android_bg_image_view);
      //  androidBgImageView.setImageResource(R.drawable.lambo);
    //}
//}*/