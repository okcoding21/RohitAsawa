package com.teamup.rohitasawa_library;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.Toast;

public class RohitPlayAudioFromUrl {

    static  MediaPlayer player;

    public static void play(Context context, String url)
    {
        try {
            Uri uri = Uri.parse(""+url);
             player = new MediaPlayer();
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
            player.setDataSource(context, uri);
            player.prepare();
            player.start();

        } catch(Exception e) {

            Toast.makeText(context, ""+e, Toast.LENGTH_SHORT).show();

        }
    }

    public static void stop(Context context)
    {
        player.stop();

    }
}
