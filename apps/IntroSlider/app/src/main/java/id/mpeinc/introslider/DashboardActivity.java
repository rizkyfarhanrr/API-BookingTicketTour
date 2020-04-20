package id.mpeinc.introslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.mpeinc.introslider.preferences.PreferenceManager;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void setUpAgain(View view) {
        PreferenceManager preferenceManager= new PreferenceManager(getApplicationContext());
        preferenceManager.setFirstTimeLaunch(true);

        startActivity(new Intent(DashboardActivity.this, MainActivity.class));
        finish();
    }
}
