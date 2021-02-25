package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CustomReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, UnityPlayerActivity.class);

        Log.d("CUSTOM_RECEIVER", i.toString());

        if (i != null) {
            context.startActivity(i);
        }
    }
}
