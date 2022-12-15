package com.si51.mashupmusic;

import static com.si51.mashupmusic.R.id.tv_videoid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvJudul, tvKeterangan, tvVideoid;
    private YouTubePlayerView ypvVideo;
    private Button btnKembali;
    private String judul, keterangan, videoid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tv_judul);
        tvKeterangan = findViewById(R.id.tv_keterangan);
        tvVideoid = findViewById(tv_videoid);
        ypvVideo = findViewById(R.id.ypv_video);
        btnKembali = findViewById(R.id.btnKembali);

        Intent intent = getIntent();
        judul = intent.getStringExtra("varJudul");
        keterangan = intent.getStringExtra("varKeterangan");
        videoid = intent.getStringExtra("varVideoid");

        Toast.makeText(DetailActivity.this, "Judul : "+judul+" | Keterangan : " + keterangan+ " | videoid : "+videoid, Toast.LENGTH_LONG).show();
        tvJudul.setText(judul);
        tvKeterangan.setText(keterangan);

        ypvVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.cueVideo(videoid, 0);
            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ypvVideo.release();
                startActivity(new Intent(DetailActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ypvVideo.release();
    }
}