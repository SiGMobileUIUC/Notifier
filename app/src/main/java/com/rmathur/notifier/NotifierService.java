package com.rmathur.notifier;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class NotifierService extends Service {
    public NotifierService() {
        // nothing
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //TODO do something useful
        return Service.START_STICKY_COMPATIBILITY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
