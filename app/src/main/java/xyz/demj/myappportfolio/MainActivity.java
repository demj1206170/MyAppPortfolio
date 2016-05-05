package xyz.demj.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.my_app_container);
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View v = viewGroup.getChildAt(i);
            if (v instanceof AppCompatButton) {
                v.setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {
        int resId = R.string.nothing;
        switch (v.getId()) {
            case R.id.spotify_streamer:
                resId = R.string.spotify_streamer;
                break;
            case R.id.football_scores:
                resId = R.string.football_scores;
                break;
            case R.id.library:
                resId = R.string.library;
                break;
            case R.id.build_it_bigger:
                resId = R.string.build_it_bigger;
                break;
            case R.id.xyz_reader:
                resId = R.string.xyz_reader;
                break;
            case R.id.capstone_my_own_app:
                resId = R.string.my_nanodegree_apps;
                break;
        }
        String msg = String.format(getString(R.string.this_button_will_launch), getString(resId));
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
