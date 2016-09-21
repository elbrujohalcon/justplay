package inaka.justplayExcercises.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import inaka.justplay.core.JustPlay;
import inaka.justplayExcercises.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.playRawSound)
    public void playrawsound(){
        JustPlay.thisAudio(R.raw.hit_hat, this);
    }

    @OnClick(R.id.playStreamSound)
    public void playstreamsound(){
        JustPlay.thisAudio("http://sampleswap.org/samples-ghost/DRUMS%20and%20SINGLE%20HITS/crashes/666[kb]18_inch_crash.aif.mp3", this);
    }

    @OnClick(R.id.playUriSound)
    public void playurisound(){
        Uri exampleURI = Uri.parse("android.resource"
                + "://" + getPackageName() + "/raw/snare");
        JustPlay.thisAudio(exampleURI, this);
    }
}
