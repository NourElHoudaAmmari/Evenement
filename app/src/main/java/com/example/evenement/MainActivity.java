package com.example.evenement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
Button showme,longtext,calender;
Date DateTime= new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showme=(Button) findViewById(R.id.showme);
        longtext=(Button) findViewById(R.id.longtext);
        calender=(Button) findViewById(R.id.calender);
    }
    public void Showme (View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void act2(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
public void add(View view){
    Intent intent = new Intent(Intent.ACTION_EDIT);
    intent.setType("vnd.android.cursor.item/event");
    intent.putExtra(CalendarContract.Events.TITLE, "My Event");

    intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, DateTime);
    intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, DateTime);
    intent.putExtra(CalendarContract.Events.ALL_DAY, false);
    intent.putExtra(CalendarContract.Events.DESCRIPTION, "Event Description");
    intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Iset Rades");
    startActivity(Intent.createChooser(intent, "Add to calendar"));
}
}
