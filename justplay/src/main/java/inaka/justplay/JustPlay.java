package inaka.justplay;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;

import java.io.IOException;


/**
 * Created by emi on 1/8/16.
 */
public class JustPlay {

    public static void thisAudio(Uri audioUri, Context context) {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(context, audioUri);
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
                if (player.isPlaying()) {
                    player.stop();
                } else {
                    player.start();
                }
            }
        }).start();

    }


}
