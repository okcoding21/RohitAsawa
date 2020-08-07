package com.teamup.rohitasawa_library;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class RohitNotification {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void createNotif(Context context, String title, String desc) {
        try {


            Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

            String CHANNEL_ID = "MYCHANNEL";
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "name", NotificationManager.IMPORTANCE_DEFAULT);

            Notification notification = new Notification.Builder(context, CHANNEL_ID)
                    .setContentText(desc)
                    .setContentTitle(title)
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setSound(uri)
//                .addAction(android.R.drawable.sym_action_chat,"Title",pendingIntent)
                    .setChannelId(CHANNEL_ID)
                    .setSmallIcon(android.R.drawable.ic_notification_overlay)
                    .build();

            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
            notificationManager.notify(1, notification);

        } catch (Exception e) {
            Toast.makeText(context, "" + e, Toast.LENGTH_SHORT).show();
        }
    }
}
