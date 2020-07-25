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
import android.provider.SyncStateContract;

import com.teamup.rohitasawa_library.RohitDialog;
import com.teamup.rohitasawa_library.RohitNotification;
import com.teamup.rohitasawa_library.RohitToast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "Hello";
        String title = "Hello";

        RohitNotification.createNotif(getApplicationContext(),title,message);

        RohitToast.showToast(getApplicationContext(),"Notification Sent", "#FD6301");

        RohitDialog.showDialog(MainActivity.this,"This is title","This will be message!!");

    }
}
