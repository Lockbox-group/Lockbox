package com.example.lotlockbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lotlockbox.ui.login.AdminLogin;
import com.example.lotlockbox.ui.login.LoggedInUserView;
import com.example.lotlockbox.ui.login.CustomerLogin;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button adminLoginBtn = findViewById(R.id.btn_login_admin);
        adminLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdminLogin.class);
                startActivity(intent);

            }
        });

        Button customerLoginBtn = findViewById(R.id.btn_login_customer);
        customerLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomerLogin.class);
                startActivity(intent);
            }
        });


    }


}


