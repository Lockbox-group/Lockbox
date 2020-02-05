package com.example.lotlockbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

import com.example.lotlockbox.ui.login.AdminLogin;

public class packageSent extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.package_sent_page);
        Button sendAnotherPackageBtn = findViewById(R.id.btn_send_another_package_admin);
        sendAnotherPackageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(packageSent.this, sendPackage.class);
                startActivity(intent);
            }
        });

    }
}
