package id.mpeinc.parawisataapps.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.mpeinc.parawisataapps.R;
import id.mpeinc.parawisataapps.auth.SigninActivity;
import id.mpeinc.parawisataapps.auth.SignupActivity;
import id.mpeinc.parawisataapps.function.Preferences;
import id.mpeinc.parawisataapps.users.UserActivity;

public class DashbaordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbaord);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (Preferences.getLoggedInUserStatus(getBaseContext())) {
            startActivity(new Intent(getBaseContext(), UserActivity.class));
            finish();
        }
    }

    public void goToWisataKita(View view) {
    }

    public void goToAboutApps(View view) {
    }

    public void goToDestinasiWisata(View view) {
    }

    public void goToPenginapan(View view) {
    }

    public void goToSignIn(View view) {
        startActivity(new Intent(DashbaordActivity.this, SigninActivity.class));
        finish();
    }

    public void goToSignup(View view) {
        startActivity(new Intent(DashbaordActivity.this, SignupActivity.class));
        finish();
    }
}
