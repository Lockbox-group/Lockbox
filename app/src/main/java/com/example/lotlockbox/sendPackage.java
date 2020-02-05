package com.example.lotlockbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sendPackage extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_package_page);
        Button sendPackageBtn = findViewById(R.id.btn_send_package);
        sendPackageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sendPackage.this, packageSent.class);
                startActivity(intent);
            }
        });
    }

}
