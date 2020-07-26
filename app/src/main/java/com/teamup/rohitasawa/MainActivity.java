package com.teamup.rohitasawa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import com.teamup.rohitasawa_library.RohitInternetCheck;
import com.teamup.rohitasawa_library.RohitToast;

public class MainActivity extends AppCompatActivity {

    Button please_wait_btn;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        please_wait_btn = findViewById(R.id.please_wait_btn);

        String message = "Hello";
        String title = "Hello";

//        RohitNotification.createNotif(getApplicationContext(),title,message);

        RohitToast.showToast(getApplicationContext(),"Notification Sent", "#FD6301");

//        RohitDialog.showDialog(MainActivity.this,"This is title","This will be message!!", "okay");

//        RohitPleaseWait.showDialog(this, "Loading..");
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                RohitPleaseWait.stopDialog(MainActivity.this);
//            }
//        }, 4000);


        RohitInternetCheck.checkInternet(this);



    }
}
