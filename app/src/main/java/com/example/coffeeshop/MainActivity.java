package com.example.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int qty = 0;
    private int cappuccinoPrice = 5; //треба взагалі-то double

    private void refreshViews()
    {
        String txtPrice = String.valueOf(cappuccinoPrice);
        String txtQty = String.valueOf(qty);
        String txtTotalAmount = String.valueOf(cappuccinoPrice*qty);

        TextView textPrice = (TextView) findViewById(R.id.textPrice);
        textPrice.setText(txtPrice);

        TextView textQty = (TextView) findViewById(R.id.textQty);
        textQty.setText(txtQty);

        TextView textTotalAmount = (TextView) findViewById(R.id.textTotalAmount);
        textTotalAmount.setText(txtTotalAmount);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshViews();

        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                qty++;
                refreshViews();
            }
        });

        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                qty--;
                if(qty < 0)
                {
                    qty = 0;
                }
                refreshViews();
            }
        });
    }
}
