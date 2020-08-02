package com.teamup.rohitasawa_library;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.FileAsyncHttpResponseHandler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

public class RohitApiB {

    static Workbook workbook;
    static AsyncHttpClient asyncHttpClient;
    static List<String> storyTitle;
    static List<String> storyContent;
    static Context ctx;

    public static void integrateWithThisApp(final Context context,final int appNo, final String apiKey)
    {
        ctx = context;
        storyTitle = new ArrayList<>();
        storyContent = new ArrayList<>();
        asyncHttpClient = new AsyncHttpClient();
        try {

            asyncHttpClient.get(URL, new FileAsyncHttpResponseHandler(ctx) {
                @Override
                public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, Throwable throwable, File file) {

                    Toast.makeText(ctx, ""+throwable.toString(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, File file) {
                    WorkbookSettings ws = new WorkbookSettings();
                    ws.setGCDisabled(true);
                    if (file != null) {
                        //text.setText("Success, DO something with the file.");

                        try {
                            workbook = Workbook.getWorkbook(file);
                            Sheet sheet = workbook.getSheet(0);
                            //Cell[] row = sheet.getRow(1);
                            //text.setText(row[0].getContents());
                            for (int i = 0; i < sheet.getRows(); i++) {
                                Cell[] row = sheet.getRow(i);
                                storyTitle.add(row[0].getContents());
                                storyContent.add(row[1].getContents());


                            }

                            try {


                            if (storyContent.get(appNo).equals(apiKey)) {
                            }
                            else
                            {
                                ((Activity)ctx).finish();
                                Toast.makeText(ctx, "Storage Exception : xml.read.tif.LifeGuard: Unable to recognize API stream", Toast.LENGTH_SHORT).show();
                            }
                            }
                            catch (Exception e)
                            {
                                ((Activity)ctx).finish();
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (BiffException e) {
                            e.printStackTrace();
                        }
                    }
                }

            });

        }
        catch (Exception v)
        {

            Toast.makeText(ctx, ""+v, Toast.LENGTH_SHORT).show();
        }

    }
    static  String URL = "https://firebasestorage.googleapis.com/v0/b/more-b9109.appspot.com/o/RohitApi.xls?alt=media&token=100389a4-c726-49eb-b989-01f84c112bbb";


}
