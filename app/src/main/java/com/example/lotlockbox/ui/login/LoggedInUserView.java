package com.example.lotlockbox.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lotlockbox.R;
import com.example.lotlockbox.sendPackage;
import com.example.lotlockbox.adminSentHistory;
import com.example.lotlockbox.settingPage;


/**
 * Class exposing authenticated user details to the UI.
 */
public class LoggedInUserView extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_loggedin_page);
        final Button sendPackageButton = findViewById(R.id.btn_send_package);
        final Button settingButton = findViewById(R.id.btn_setting);
        final Button adminHistoryButton = findViewById(R.id.btn_admin_view_history);

        sendPackageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedInUserView.this,sendPackage.class);
                startActivity(intent);
            }
        });

        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedInUserView.this,settingPage.class);
                startActivity(intent);
            }
        });

        adminHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedInUserView.this,adminSentHistory.class);
                startActivity(intent);
            }
        });

   }
}
