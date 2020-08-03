package com.teamup.rohitasawa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.teamup.rohitasawa_library.Commons;
import com.teamup.rohitasawa_library.RohitApi;
import com.teamup.rohitasawa_library.RohitApiB;
import com.teamup.rohitasawa_library.RohitBlueLoadingDialog;
import com.teamup.rohitasawa_library.RohitCopyPaste;
import com.teamup.rohitasawa_library.RohitCurrentDate;
import com.teamup.rohitasawa_library.RohitErrorDialog;
import com.teamup.rohitasawa_library.RohitNotification;
import com.teamup.rohitasawa_library.RohitOpenUrl;
import com.teamup.rohitasawa_library.RohitPlayBeep;
import com.teamup.rohitasawa_library.RohitRandomNumber;
import com.teamup.rohitasawa_library.RohitRandomString;
import com.teamup.rohitasawa_library.RohitSuccessDialog;
import com.teamup.rohitasawa_library.RohitToast;
import com.teamup.rohitasawa_library.RohitVibrate;

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


            }
        });



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



//        RohitRandomNumber.generateRandomNumber(5);

//        RohitRandomString.generateLOWECASE(5);

//        RohitRandomString.generateUPPERCASE(5);

//        RohitCurrentDate.getTime();

//        RohitCurrentDate.getDateTimeInFormat("MMM-yyyy")

//        RohitCurrentDate.getDate();

//        RohitCopyPaste.copyText(getApplicationContext(),"Hello World!!");

//        RohitCopyPaste.pasteText(
//                getApplicationContext()
//        );										//returns string


//        RohitOpenUrl.openUrl(getApplicationContext(),"http://rohitasawa.c1.biz");

//        RohitVibrate.virate(getApplicationContext(), 500);

//        RohitPlayBeep.playBeep(MainActivity.this);

//        RohitApi.integrateWithThisApp(MainActivity.this, 0,"AYX54544824");

//        RohitErrorDialog.showDialog(MainActivity.this,"Order Placed","Order is placed successfully..");

//        RohitSuccessDialog.showDialog(MainActivity.this,"Order Placed","Order is placed successfully..");

//        RohitBlueLoadingDialog.showDialog(MainActivity.this);


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (RohitErrorDialog.dialogColsed)
        {
            Toast.makeText(this, "dialog closed", Toast.LENGTH_SHORT).show();
        }

    }

}
