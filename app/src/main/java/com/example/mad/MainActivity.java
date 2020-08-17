package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.rentalbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCarRentalActivity();
            }
        });

        button = (Button) findViewById(R.id.usraccbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserAccount();
            }
        });

        button = (Button) findViewById(R.id.empid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmployeeList();
            }
        });


    }

    public void openCarRentalActivity() {
        Intent intent = new Intent(this, CarRentalActivity.class);
        startActivity(intent);
    }

    public void openUserAccount() {
        Intent intent = new Intent(this, userAccount.class);
        startActivity(intent);
    }

    public void openEmployeeList() {
        Intent intent = new Intent(this, Employee_List.class);
        startActivity(intent);
    }
}
