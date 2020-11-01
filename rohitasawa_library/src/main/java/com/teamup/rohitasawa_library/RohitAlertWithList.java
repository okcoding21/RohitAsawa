package com.teamup.rohitasawa_library;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

public class RohitAlertWithList {

    public static void showListDialog(final Context context, final ArrayAdapter list, int drawable) {
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(context);
        builderSingle.setIcon(drawable);
        builderSingle.setTitle("Select One Name:-");


        builderSingle.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builderSingle.setAdapter(list, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = (String) list.getItem(which);

                try {
                    AlertDialogList ad = (AlertDialogList) context;
                    ad.selected(strName);
                } catch (Exception v) {
                    Toast.makeText(context, "Please implement AlertDialogList interface in your " + context.getClass(), Toast.LENGTH_SHORT).show();
                }

            }
        });
        builderSingle.show();
    }

    public interface AlertDialogList {
        public void selected(String selected);
    }
}
