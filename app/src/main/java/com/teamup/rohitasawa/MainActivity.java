package com.teamup.rohitasawa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.teamup.rohitasawa_library.Commons;
import com.teamup.rohitasawa_library.RohitCall;
import com.teamup.rohitasawa_library.RohitDialog;
import com.teamup.rohitasawa_library.RohitFeedbackGmail;
import com.teamup.rohitasawa_library.RohitInternetCheck;
import com.teamup.rohitasawa_library.RohitJsonRead;
import com.teamup.rohitasawa_library.RohitNotification;
import com.teamup.rohitasawa_library.RohitPleaseWait;
import com.teamup.rohitasawa_library.RohitSMS;
import com.teamup.rohitasawa_library.RohitShareApp;
import com.teamup.rohitasawa_library.RohitToast;
import com.teamup.rohitasawa_library.RohitWhatsappToNo;

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

        please_wait_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, ""+Commons.jsonResult, Toast.LENGTH_SHORT).show();
            }
        });

        RohitJsonRead.ReadJsonFromLink(MainActivity.this,"https://script.googleusercontent.com/macros/echo?user_content_key=RaChwECkm1h2Y5nUgX29BIkV_O6lhDRFTZeWvMXKgDwBp__3c3AHUbP6mAkViUFkEYpMG0k_tQ-X4wtV-NNaWQLcI_6WNT0xOJmA1Yb3SEsKFZqtv3DaNYcMrmhZHmUMWojr9NvTBuBLhyHCd5hHa1GhPSVukpSQTydEwAEXFXgt_wltjJcH3XHUaaPC1fv5o9XyvOto09QuWI89K6KjOu0SP2F-BdwUiUpHY0ECwtazvnjKiqETyn-2pSU2sUWtUBkVbbknTo0_0RXKHZxCXD1rlR5I2O0_5y7FLqOV0Tk27B8Rh4QJTQ&lib=MnrE7b2I2PjfH799VodkCPiQjIVyBAxva");


//        RohitNotification.createNotif(getApplicationContext(),title,message);

//        RohitToast.showToast(getApplicationContext(),"Notification Sent", "#FD6301");

//        RohitDialog.showDialog(MainActivity.this,"This is title","This will be message!!", "okay");

//        RohitPleaseWait.showDialog(this, "Loading..");
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                RohitPleaseWait.stopDialog(MainActivity.this);
//            }
//        }, 4000);


//        RohitInternetCheck.checkInternet(this);


//        RohitCall.call(getApplicationContext(),"7387191410");


//        RohitSMS.sms(getApplicationContext(),"7387191410", "Hello buddy!!");



//                RohitShareApp.shareApp(MainActivity.this, "Hey i recommend you this app!!!\n\n");

//        RohitFeedbackGmail.takeFeedback(MainActivity.this, "Feedback from app : ", "teamup.developer@gmail.com");

//        RohitWhatsappToNo.sendToNo(MainActivity.this,"7387191410","Hello Buddy!!");





    }
}
