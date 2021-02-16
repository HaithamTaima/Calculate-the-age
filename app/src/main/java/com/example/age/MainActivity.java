package com.example.age;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int yers,day,month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_result1=findViewById(R.id.tv_result);
        EditText et_day =findViewById(R.id.et_date);
        EditText et_year =findViewById(R.id.et_number);
        EditText et_month=findViewById(R.id.et_number2);
         Button  bt_sum1 =findViewById(R.id.bt_sum);


         bt_sum1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String days =et_day.getText().toString();
                 String monhts =et_month.getText().toString();
                 String years =et_year.getText().toString();

                 int daybirth =Integer.parseInt(days);
                 int monthbirth =Integer.parseInt(monhts);
                 int yeaesbirth =Integer.parseInt(years);

                 int presentday = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                 int presentmonth = Calendar.getInstance().get(Calendar.MONTH);
                 int presentyear = Calendar.getInstance().get(Calendar.YEAR);

                 int day =presentday - daybirth;
                 int month =presentmonth - monthbirth;
                 int yare =presentyear - yeaesbirth;



                 if (day<0){month-=1;day+=30;
                 }

                 if (month<0){yare-=1;month+=12;
                 }


                        tv_result1.setText("year"+yare+""+"month"+month+""+"day"+day);
                 Toast.makeText(getBaseContext(),"don",Toast.LENGTH_LONG).show();


             }
         });


    }
}