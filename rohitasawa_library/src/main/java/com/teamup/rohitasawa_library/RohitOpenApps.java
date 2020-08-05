package com.teamup.rohitasawa_library;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RohitOpenApps {

    public static void openCalculatorApp(Context context){

        try {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

            notFoundCalac(context);
        }
        catch (Exception c)
        {
            notFoundCalac(context);
        }


    }

    public static void notFoundCalac(Context context) {
        ArrayList<HashMap<String,Object>> items;
        PackageManager pm ;
        List<PackageInfo> packs;

        // initialise From Oncreate if you want
        items =new ArrayList<HashMap<String,Object>>();
        pm = context.getPackageManager();
        packs = pm.getInstalledPackages(0);
        for (PackageInfo pi : packs)
        {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("appName", pi.applicationInfo.loadLabel(pm));
            map.put("packageName", pi.packageName);
            items.add(map);
        }

        int d=0;
        if(items.size()>=1){
            int j=0;
            for(j=0;j<items.size();j++){
                String AppName = (String) items.get(j).get("appName");
// Log.w("Name",""+AppName);
                if(AppName.matches("Calculator"))
                {
                    d=j;
                    break;
                }
            }
            String packageName = (String) items.get(d).get("packageName");

            Intent i = pm.getLaunchIntentForPackage(packageName);
            if (i != null){
//                Toast.makeText(getApplicationContext(),"STARTING",Toast.LENGTH_SHORT).show();

                context.startActivity(i);}
            else {
                Toast.makeText(context,"SORRY CANT OPEN CALCULATOR :(",Toast.LENGTH_SHORT).show();

            }
        }


        else{
            Toast.makeText(context,"SORRY CANT START CALCULATOR :(",Toast.LENGTH_SHORT).show();


        }
    }


    public static void openCamera(Context context, int requestCode)
    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        ((Activity)context).startActivityForResult(intent,requestCode);
    }


    public static void openGpsSettings(Context context, int requestCode)
    {
        if (!isLocationEnabled(context)) {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            ((Activity) context).startActivityForResult(intent, requestCode);
        }
    }

    public static Boolean isLocationEnabled(Context context)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
// This is new method provided in API 28
            LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
            return lm.isLocationEnabled();
        } else {
// This is Deprecated in API 28
            int mode = Settings.Secure.getInt(context.getContentResolver(), Settings.Secure.LOCATION_MODE,
                    Settings.Secure.LOCATION_MODE_OFF);
            return  (mode != Settings.Secure.LOCATION_MODE_OFF);

        }
    }
}
