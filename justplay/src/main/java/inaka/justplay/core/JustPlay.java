package inaka.justplay.core;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;

import java.io.IOException;

import inaka.justplay.R;


public class JustPlay {

    public static void thisAudio(Uri audioUri, Context context) {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(context, audioUri);
            mediaPlayer.prepare();
        } catch (IOException e) {
            Log.e(context.getString(R.string.app_name), context.getString(R.string.data_source_error));
        }
        playAudio(mediaPlayer);
    }

    public static void thisAudio(String url, final Context context) {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepare();
        } catch (IOException e) {
            Log.e(context.getString(R.string.app_name), context.getString(R.string.data_source_error));
        }
        playAudio(mediaPlayer);
    }

    public static void thisAudio(int rawID, final Context context) {
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, rawID);
        playAudio(mediaPlayer);
    }


    private static void playAudio(final MediaPlayer player) {
        new Thread(new Runnable() {
            public void run() {

                player.start();
                player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.reset();
                        mp.release();
                    }
                });
            }
        }).start();

    }


}
