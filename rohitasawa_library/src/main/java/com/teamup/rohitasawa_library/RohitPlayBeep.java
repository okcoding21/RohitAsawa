package com.teamup.rohitasawa_library;

import android.content.Context;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.widget.Toast;

public class RohitPlayBeep {
    public static void playBeep(Context context)
    {
        try {
            Uri notification = RingtoneManager
                    .getDefaultUri(RingtoneManager.TYPE_ALL);
            Ringtone r = RingtoneManager.getRingtone(context,
                    notification);
            r.play();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, ""+context, Toast.LENGTH_SHORT).show();
        }
    }
}
