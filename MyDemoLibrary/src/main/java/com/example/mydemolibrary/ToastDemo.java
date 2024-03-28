package com.example.mydemolibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastDemo {
    public static void longToast(Context context,String s)
    {
        Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    }
}
