package id.mpeinc.parawisataapps.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import id.mpeinc.parawisataapps.R;
import id.mpeinc.parawisataapps.auth.SigninActivity;
import id.mpeinc.parawisataapps.function.Preferences;

public class UserActivity extends AppCompatActivity {

    TextView tvGetUsernameafterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        tvGetUsernameafterLogin = (TextView)findViewById(R.id.tvUsernameGet);

        // TODO A.2: Add Preferences Here
        tvGetUsernameafterLogin.setText("Welcome! " + Preferences.getLoggedInUser(getBaseContext()));
        String usernameget = Preferences.getLoggedInUser(getBaseContext());

        Log.d("LOG", "USERNAME " + usernameget);
        getDataUserLogged(usernameget);
    }

    public void logoutUser(View view) {
        Preferences.clearLoggedInuser(getBaseContext());
        startActivity(new Intent(UserActivity.this, SigninActivity.class));
        finish();
    }

    public void getDataUserLogged(String username) {
    }
}
