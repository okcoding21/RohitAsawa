package com.teamup.rohitasawa_library;

import android.Manifest;
import android.app.Activity;
import android.content.Context;

import androidx.core.app.ActivityCompat;

public class RohitPermissions {
    public static void askPermissions(Context context, String[] permissions)
    {
        try {
            ActivityCompat.requestPermissions((Activity) context, permissions,
                    131);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void READ_WRITE_STORAAGE(Context context, int code)
    {
        try {
            String permissions[] = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

            ActivityCompat.requestPermissions((Activity) context, permissions,
                    code);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void CAMERA_PERMISSION(Context context, int code)
    {
        try {
            String permissions[] = {Manifest.permission.CAMERA};

            ActivityCompat.requestPermissions((Activity) context, permissions,
                    code);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void GPS_PERMISSIONS(Context context, int code)
    {
        try {
            String permissions[] = {Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_BACKGROUND_LOCATION};

            ActivityCompat.requestPermissions((Activity) context, permissions,
                    code);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


}
