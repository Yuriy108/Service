package com.example.media;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MediaService extends Service {
    MediaPlayer ambientMediaPlayer;
    public MediaService() {
            }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ambientMediaPlayer=MediaPlayer.create(this,R.raw.kazkapalala);
        ambientMediaPlayer.setLooping(true);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        ambientMediaPlayer.start();
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
       ambientMediaPlayer.stop();
    }
}
