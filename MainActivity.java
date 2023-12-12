package com.example.foodorderapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//I have commented on some part code below because I am using Room Database. If you uncomment my code and run my program. It crashes my program. The app won't even start?
// This is the error I am getting in the LogCat:  android.content.ActivityNotFoundException: Unable to find explicit activity class {com.example.foodorderapp2/com.example.foodorderapp2.FoodOrderActivity}; have you declared this activity in your AndroidManifest.xml, or does your intent not match its declared <intent-filter>?

        

        //Access the Room Database instance from MyApp
//        MyApp myApp = (MyApp) getApplication();
//        FoodOrderDatabase appDatabase = myApp.getAppDatabase();

        //FoodOrderDao in the database
//        FoodOrderDao foodOrderDao = appDatabase.getFoodOrderDao();

        Button exploreButton = findViewById(R.id.exploreButton);
        exploreButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                //Create a new FoodOrder entity
//                FoodOrder foodOrder = new FoodOrder();
//                foodOrder.setFoodOrderId(1);
//                foodOrder.setFoodName("Pizza");
//                foodOrder.setFoodPrice(10.99);

                //Insert the food order into the database
//                foodOrderDao.insertFoodOrder(foodOrder);

                //Create an Intent to navigate to the Food Item activity
                Intent intent = new Intent(MainActivity.this, FoodItemActivity.class);
                //Intent intent2 = new Intent(MainActivity.this, FoodOrderActivity.class);

                //Start the Food Item Activity
                startActivity(intent);
            }

        });
    }

}

