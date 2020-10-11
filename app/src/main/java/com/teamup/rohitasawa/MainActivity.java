package com.teamup.rohitasawa;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.teamup.rohitasawa_library.RohitCalendarView;
import com.teamup.rohitasawa_library.RohitCurrentDate;
import com.teamup.rohitasawa_library.RohitDaysTheory;
import com.teamup.rohitasawa_library.RohitErrorDialog;
import com.teamup.rohitasawa_library.RohitPlaySounds;
import com.teamup.rohitasawa_library.RohitUpdate;
import com.teamup.rohitasawa_library.RohitVolumeControl;
import com.teamup.rohitasawa_library.RohitYesNoDialog;

public class MainActivity extends AppCompatActivity   {

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



            }
        });

//        RohitYesNoDialog.showDialog(MainActivity.this, "Are you sure to accept?");
//        implements RohitYesNoDialog.dialogSayings

//        RohitVolumeControl.IncreaseMusicVolume(MainActivity.this, 20);
//        RohitPlaySounds.playFromAsset(MainActivity.this, "tick.mp3");
//        RohitPlaySounds.stopMusic(
//                MainActivity.this
//        );

//        RohitDaysTheory.differenceBetweenDays("13/10/2020", "18/10/2020","dd/MM/yyyy");

//        RohitDaysTheory.compareDate("13/10/2020", "13/10/2020", "dd/MM/yyyy");

//        RohitDaysTheory.addDaysToDate(RohitCurrentDate.getDateTimeInFormat("dd/MM/yyyy"),2,"dd/MM/yyyy");

//        RohitVolumeControl.IncreaseMusicVolume(MainActivity.this,10);
//        implements RohitVolumeControl.onVolumeIncreased

//        RohitNotification.createNotif(getApplicationContext(),title,message);

//        RohitToast.showToast(getApplicationContext(),"Notification Sent", "#FD6301");

//        RohitDialog.showDialog(MainActivity.this,"This is title","This will be message!!", "okay");

//        RohitPleaseWait.showDialog(this, "Loading..");
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                RohitPlaySounds.stopMusic(MainActivity.this);
//
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

//        RohitOpenApps.openGpsSettings(MainActivity.this, 74);

//        RohitGoogleSignIn.getAccounts(MainActivity.this,500);


//        RohitPlayAudioFromUrl.play(MainActivity.this,"https://file-examples-com.github.io/uploads/2017/11/file_example_MP3_700KB.mp3");


//        RohitPlayAudioFromUrl.stop(MainActivity.this);

//        RohitSimpleTextDialog.hexColor = "#4CC417";
//        RohitSimpleTextDialog.textColor = "#FFFFFF";
//        RohitSimpleTextDialog.showTextDialog(MainActivity.this,"Hello brother");


//        RohitCustomNotification.show(MainActivity.this, R.layout.activity_main);

//        RohitWebviewDialog.show(MainActivity.this,"http://rohitasawa.c1.biz");

//        RohitImageDialog.show(MainActivity.this,"https://image.spreadshirtmedia.com/image-server/v1/mp/products/T812A804MPA3140PT17X41Y98D10433227FS20899Cx512D0A/views/1,width=550,height=550,appearanceId=804,backgroundColor=F2F2F2,modelId=1237,crop=list,version=1581947588,modelImageVersion=1585828267/daggy-glasses-nerd-mens-premium-t-shirt.jpg");


//        RohitCalendarView.show(MainActivity.this);

//        RohitUpiPay.doPayment(MainActivity.this,"Rohit Asawa","gugalepranav72@oksbi","5.0","Paythis");
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



//    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 500 && resultCode == RESULT_OK) {
//
//            String accountName = data.getStringExtra(AccountManager.KEY_ACCOUNT_NAME);
//            Toast.makeText(this, ""+accountName, Toast.LENGTH_SHORT).show();
//
//        }
//    }



//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        Log.e("main ", "response " + resultCode);
//        /*
//       E/main: response -1
//       E/UPI: onActivityResult: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
//       E/UPIPAY: upiPaymentDataOperation: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
//       E/UPI: payment successfull: 922118921612
//         */
//        switch (requestCode) {
//            case UPI_PAYMENT:
//                if ((RESULT_OK == resultCode) || (resultCode == 11)) {
//                    if (data != null) {
//                        String trxt = data.getStringExtra("response");
//                        Log.e("UPI", "onActivityResult: " + trxt);
//                        ArrayList<String> dataList = new ArrayList<>();
//                        dataList.add(trxt);
//                        if (RohitUpiPay.upiPaymentDataOperation(dataList, MainActivity.this))
//                        {
//                            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
//                        }
//                        else
//                        {
//                            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
//                        }
//                    } else {
//                        Log.e("UPI", "onActivityResult: " + "Return data is null");
//                        ArrayList<String> dataList = new ArrayList<>();
//                        dataList.add("nothing");
//                        if (RohitUpiPay.upiPaymentDataOperation(dataList, MainActivity.this))
//                        {
//                            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
//                        }
//                        else
//                        {
//                            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                } else {
//                    //when user simply back without payment
//                    Log.e("UPI", "onActivityResult: " + "Return data is null");
//                    ArrayList<String> dataList = new ArrayList<>();
//                    dataList.add("nothing");
//                    if (RohitUpiPay.upiPaymentDataOperation(dataList, MainActivity.this))
//                    {
//                        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
//                    }
//                    else
//                    {
//                        Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
//                    }
//                }
//                break;
//        }
//    }








    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (RohitErrorDialog.dialogColsed) {
            Toast.makeText(this, "dialog closed", Toast.LENGTH_SHORT).show();
        }

        if (!TextUtils.isEmpty(RohitCalendarView.year))
        {
            Toast.makeText(this, ""+RohitCalendarView.day+"/"+RohitCalendarView.month+"/"+RohitCalendarView.year, Toast.LENGTH_SHORT).show();
        }

    }




}
