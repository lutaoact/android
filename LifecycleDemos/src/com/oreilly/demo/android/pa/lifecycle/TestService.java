package com.oreilly.demo.android.pa.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TestService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
