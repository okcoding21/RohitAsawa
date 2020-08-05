package com.teamup.rohitasawa;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.teamup.rohitasawa_library.Commons;
import com.teamup.rohitasawa_library.RohitApi;
import com.teamup.rohitasawa_library.RohitApiB;
import com.teamup.rohitasawa_library.RohitBlueLoadingDialog;
import com.teamup.rohitasawa_library.RohitCopyPaste;
import com.teamup.rohitasawa_library.RohitCurrentDate;
import com.teamup.rohitasawa_library.RohitErrorDialog;
import com.teamup.rohitasawa_library.RohitNotification;
import com.teamup.rohitasawa_library.RohitOpenApps;
import com.teamup.rohitasawa_library.RohitOpenUrl;
import com.teamup.rohitasawa_library.RohitPermissions;
import com.teamup.rohitasawa_library.RohitPlayBeep;
import com.teamup.rohitasawa_library.RohitRandomNumber;
import com.teamup.rohitasawa_library.RohitRandomString;
import com.teamup.rohitasawa_library.RohitSecurity;
import com.teamup.rohitasawa_library.RohitShareScreenShot;
import com.teamup.rohitasawa_library.RohitSuccessDialog;
import com.teamup.rohitasawa_library.RohitTextToSpeech;
import com.teamup.rohitasawa_library.RohitToast;
import com.teamup.rohitasawa_library.RohitTorch;
import com.teamup.rohitasawa_library.RohitVibrate;

import static com.teamup.rohitasawa_library.RohitSecurity.authenticateApp;
import static com.teamup.rohitasawa_library.RohitSecurity.isDeviceSecure;

public class MainActivity extends AppCompatActivity {

    Button please_wait_btn;

    ImageView img;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        please_wait_btn = findViewById(R.id.please_wait_btn);
        img = findViewById(R.id.img);

        String message = "Hello";
        String title = "Hello";

        please_wait_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RohitOpenApps.openGpsSettings(MainActivity.this, 74);

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
////                RohitPleaseWait.stopDialog(MainActivity.this);
//
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

//        RohitSecurity.authenticateApp(MainActivity.this);

//        RohitTorch.start(MainActivity.this);

//        RohitTorch.stop(MainActivity.this);


//        String permissions[] = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};
//        RohitPermissions.askPermissions(MainActivity.this, permissions);
//
//        RohitPermissions.GPS_PERMISSIONS(MainActivity.this, 8885);

//        RohitTextToSpeech.speak(MainActivity.this,"Hello Rohit");


//        View content = findViewById(R.id.content);
//        RohitShareScreenShot.shotIt(MainActivity.this, content,"Hello buddy!!");

//        RohitOpenApps.openCamera(MainActivity.this,55);

    }


//    For security code below onAcitvity Result
//    private static final int LOCK_REQUEST_CODE = 221;
//    private static final int SECURITY_SETTING_REQUEST_CODE = 233;
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        switch (requestCode) {
//            case LOCK_REQUEST_CODE:
//                if (resultCode == RESULT_OK) {
//                    //If screen lock authentication is success update text
//                    Toast.makeText(this, ""+getResources().getString(R.string.unlock_success), Toast.LENGTH_SHORT).show();
//
//                } else {
//                    //If screen lock authentication is failed update text
//
//                    Toast.makeText(this, ""+getResources().getString(R.string.unlock_failed), Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case SECURITY_SETTING_REQUEST_CODE:
//                //When user is enabled Security settings then we don't get any kind of RESULT_OK
//                //So we need to check whether device has enabled screen lock or not
//                if (isDeviceSecure(MainActivity.this)) {
//
//                    Toast.makeText(this, getResources().getString(R.string.device_is_secure), Toast.LENGTH_SHORT).show();
//                    authenticateApp(MainActivity.this);
//                } else {
//                    //If screen lock is not enabled just update text
//                    Toast.makeText(this, ""+getResources().getString(R.string.security_device_cancelled), Toast.LENGTH_SHORT).show();
//                }
//
//                break;
//        }
//    }


//    onActivityResult for camera

//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == 55) {
//            Bitmap photo = (Bitmap) data.getExtras().get("data");
//            img.setImageBitmap(photo);
//        }
//    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (RohitErrorDialog.dialogColsed) {
            Toast.makeText(this, "dialog closed", Toast.LENGTH_SHORT).show();
        }

    }

}
