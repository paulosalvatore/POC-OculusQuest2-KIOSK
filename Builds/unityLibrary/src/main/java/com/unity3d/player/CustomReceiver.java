package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CustomReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, UnityPlayerActivity.class);

        if (i != null) {
            context.startActivity(i);
        }
    }
}
