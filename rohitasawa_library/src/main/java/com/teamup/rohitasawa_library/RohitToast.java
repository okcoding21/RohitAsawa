package com.teamup.rohitasawa_library;

import android.content.Context;
import android.graphics.Color;
import android.widget.Toast;

import com.marcoscg.materialtoast.MaterialToast;

public class RohitToast {

    public static  void showToast(Context context, String title, String hexColor)
    {
        try {


        new MaterialToast(context)
                .setMessage(title)
                .setDuration(Toast.LENGTH_SHORT)
                .setBackgroundColor(Color.parseColor(hexColor))
                .show();
        }
        catch (Exception e)
        {
            Toast.makeText(context, ""+e, Toast.LENGTH_SHORT).show();
        }
    }
}
