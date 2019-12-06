package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener  {

   private Button button_value_1,button_value_2,
            button_value_3,button_value_4,
            button_value_5,button_value_6,
            button_value_7,button_value_8,
            button_value_9,button_value_0,
            button_for_plus, button_for_minus, button_for_multiply,button_for_division, button_for_point,button_for_equal,button_for_delete;

 private    EditText edit_text;

    private Float value1,value2;
    boolean m_minus,m_plus,m_multiply,m_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_value_1 = (Button)findViewById(R.id.button_value_1);
        button_value_2 = (Button)findViewById(R.id.button_value_2);
        button_value_3 = (Button)findViewById(R.id.button_value_3);
        button_value_4 = (Button)findViewById(R.id.button_value_4);
        button_value_5 = (Button)findViewById(R.id.button_value_5);
        button_value_6 = (Button)findViewById(R.id.button_value_6);
        button_value_7 = (Button)findViewById(R.id.button_value_7);
        button_value_8 = (Button)findViewById(R.id.button_value_8);
        button_value_9 = (Button)findViewById(R.id.button_value_9);
        button_value_0 = (Button)findViewById(R.id.button_value_0);
        button_for_point = (Button)findViewById(R.id.button_for_point);
        button_for_equal = (Button)findViewById(R.id.button_for_eqaul);
        button_for_plus = (Button)findViewById(R.id.button_for_plus);
        button_for_minus = (Button)findViewById(R.id.button_for_minus);
        button_for_multiply = (Button)findViewById(R.id.button_for_multiply);
        button_for_division = (Button)findViewById(R.id.button_for_division);
        button_for_delete = (Button)findViewById(R.id.button_for_delete);


        edit_text = (EditText)findViewById(R.id.edit_text);

        button_value_1.setOnClickListener(this);
        button_value_2.setOnClickListener(this);
        button_value_3.setOnClickListener(this);
        button_value_4.setOnClickListener(this);
        button_value_5.setOnClickListener(this);
        button_value_6.setOnClickListener(this);
        button_value_7.setOnClickListener(this);
        button_value_8.setOnClickListener(this);
        button_value_9.setOnClickListener(this);
        button_value_0.setOnClickListener(this);
        button_for_plus.setOnClickListener(this);
        button_for_minus.setOnClickListener(this);
        button_for_multiply.setOnClickListener(this);
        button_for_division.setOnClickListener(this);
        button_for_point.setOnClickListener(this);
        button_for_equal.setOnClickListener(this);
        button_for_delete.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button_value_1)
        {
            String one = edit_text.getText() + "1";

          edit_text.setText(one);

        }
        if(v.getId() == R.id.button_value_2)
        {
            String two = edit_text.getText() + "2";
            edit_text.setText(two);

        }
        if(v.getId() == R.id.button_value_3)
        {
            String three = edit_text.getText() + "3";
            edit_text.setText(three);

        }
        if(v.getId() == R.id.button_value_4)
        {
            String four = edit_text.getText() + "4";
            edit_text.setText(four);

        }
        if(v.getId() == R.id.button_value_5)
        {
            String five = edit_text.getText() + "5";
            edit_text.setText(five);

        }
        if(v.getId() == R.id.button_value_6)
        {
            String six = edit_text.getText() + "6";
            edit_text.setText(six);

        }
        if(v.getId() == R.id.button_value_7)
        {
            String seven = edit_text.getText() + "7";
            edit_text.setText(seven);

        }
        if(v.getId() == R.id.button_value_8)
        {
            String eight = edit_text.getText() + "8";
            edit_text.setText(eight);

        }
        if(v.getId() == R.id.button_value_9)
        {
            String nine = edit_text.getText() + "9";
            edit_text.setText(nine);

        }
        if(v.getId() == R.id.button_value_0)
        {
            String zero = edit_text.getText() + "0";
            edit_text.setText(zero);

        }
        if(v.getId() == R.id.button_for_point){

            String point = edit_text.getText() + ".";
            edit_text.setText(point);
        }

        if(v.getId() == R.id.button_for_plus)
        {

            value1 = Float.parseFloat(edit_text.getText() + "");

            m_plus = true ;
            edit_text.setText(null);
        }
        if(v.getId() == R.id.button_for_minus)
        {


            value1 = Float.parseFloat(edit_text.getText() + "");

            m_minus = true ;
            edit_text.setText(null);


        }
        if(v.getId() == R.id.button_for_multiply)
        {
            value1 = Float.parseFloat(edit_text.getText() + "");

            m_multiply = true ;
            edit_text.setText(null);

        }
        if(v.getId() == R.id.button_for_division)
        {
            value1 = Float.parseFloat(edit_text.getText() + "");

            m_divide = true ;
            edit_text.setText(null);

        }

        if(v.getId() == R.id.button_for_delete){
            edit_text.setText("");

        }
        if(v.getId() == R.id.button_for_eqaul){

            value2 = Float.parseFloat(edit_text.getText() + "");

            if (m_minus == true){
                edit_text.setText(value1 - value2 +"");
                m_minus=false;
            }
            if (m_plus == true){
                edit_text.setText(value1 + value2 +"");
                m_plus=false;
            }
            if (m_multiply == true){
                edit_text.setText(value1 * value2 +"");
                m_multiply=false;
            }
            if (m_divide == true){
                edit_text.setText(value1 / value2 +"");
                m_divide=false;
            }

        }




    }
}
