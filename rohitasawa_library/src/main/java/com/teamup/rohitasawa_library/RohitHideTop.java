package com.teamup.rohitasawa_library;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

public class RohitHideTop {
    public static void hide(Context context)
    {
        try {
            ((Activity)context).requestWindowFeature(Window.FEATURE_NO_TITLE);
            ((Activity)context).getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        catch (Exception v)
        {
            v.printStackTrace();
        }

    }
}
