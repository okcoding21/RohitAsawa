package com.teamup.rohitasawa_library;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.core.content.FileProvider;

import java.io.File;

public class RohitOpenFile {
    private void openPdf(Context context, File pdfFile) {
        try {


            Intent intent = new Intent(Intent.ACTION_VIEW);
            File file = pdfFile;
            Uri data = FileProvider.getUriForFile(context, BuildConfig.APPLICATION_ID + ".provider", file);
            intent.setDataAndType(data, "application/pdf");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            context.startActivity(intent);
        } catch (Exception v) {
            Toast.makeText(context, "" + v, Toast.LENGTH_SHORT).show();
        }
    }

    private void openExcel(Context context, File excelFile) {
        try {


            Intent intent = new Intent(Intent.ACTION_VIEW);
            File file = excelFile;
            Uri data = FileProvider.getUriForFile(context, BuildConfig.APPLICATION_ID + ".provider", file);
            intent.setDataAndType(data, "application/vnd.ms-excel");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            context.startActivity(intent);
        } catch (Exception v) {
            Toast.makeText(context, "" + v, Toast.LENGTH_SHORT).show();
        }
    }

    private void openImage(Context context, File excelFile) {
        try {


            Intent intent = new Intent(Intent.ACTION_VIEW);
            File file = excelFile;
            Uri data = FileProvider.getUriForFile(context, BuildConfig.APPLICATION_ID + ".provider", file);
            intent.setDataAndType(data, "image/jpg");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            context.startActivity(intent);
        } catch (Exception v) {
            Toast.makeText(context, "" + v, Toast.LENGTH_SHORT).show();
        }
    }

}
