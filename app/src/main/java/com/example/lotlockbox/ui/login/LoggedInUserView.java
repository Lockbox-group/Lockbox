package com.example.lotlockbox.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lotlockbox.R;
import com.example.lotlockbox.sendPackage;
import com.example.lotlockbox.data.model.LoggedInUser;

/**
 * Class exposing authenticated user details to the UI.
 */
public class LoggedInUserView extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_loggedin_page);
        final Button sendPackageButton = findViewById(R.id.btn_send_package);
        sendPackageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedInUserView.this,sendPackage.class);
                startActivity(intent);
            }
        });

   }
}
