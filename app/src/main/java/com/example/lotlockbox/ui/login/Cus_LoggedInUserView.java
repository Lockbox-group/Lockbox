package com.example.lotlockbox.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lotlockbox.R;
import com.example.lotlockbox.pickupResult;
import com.example.lotlockbox.customerHistory;
import com.example.lotlockbox.settingPage;

/**
 * Class exposing authenticated user details to the UI.
 */
public class Cus_LoggedInUserView extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_loggedin_page);
        final Button PickUpPackageButton = findViewById(R.id.btn_pickup_package);
        final Button cusHistoryButton = findViewById(R.id.btn_customer_view_history);
        final Button settingButton = findViewById(R.id.btn_setting);
        PickUpPackageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cus_LoggedInUserView.this,pickupResult.class);
                startActivity(intent);
            }
        });
        cusHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cus_LoggedInUserView.this,customerHistory.class);
                startActivity(intent);
            }
        });
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cus_LoggedInUserView.this,settingPage.class);
                startActivity(intent);
            }
        });

   }
}
