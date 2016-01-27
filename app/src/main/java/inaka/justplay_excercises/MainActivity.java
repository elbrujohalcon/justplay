package inaka.justplay_excercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import inaka.justplay.JustPlay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.play_raw_sound)
    public void playrawsound(){
        JustPlay.thisAudio(R.raw.hit_hat, this);
    }

    @OnClick(R.id.play_stream_sound)
    public void playstreamsound(){
        JustPlay.thisAudio("http://www.wavsource.com/snds_2016-01-10_6357263721580594/animals/bird_caw1.wav", this);
    }

    @OnClick(R.id.play_uri_sound)
    public void playurisound(){
        JustPlay.thisAudio(R.raw.hit_hat, this);
    }
}
