package com.example.lotlockbox.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lotlockbox.R;
import com.example.lotlockbox.pickupResult;

/**
 * Class exposing authenticated user details to the UI.
 */
public class Cus_LoggedInUserView extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_loggedin_page);
        final Button PickUpPackageButton = findViewById(R.id.btn_pickup_package);
        PickUpPackageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cus_LoggedInUserView.this,pickupResult.class);
                startActivity(intent);
            }
        });

   }
}
