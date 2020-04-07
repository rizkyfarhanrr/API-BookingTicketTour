package id.mpeinc.parawisataapps.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.mpeinc.parawisataapps.R;
import id.mpeinc.parawisataapps.dashboard.DashbaordActivity;
import id.mpeinc.parawisataapps.function.Preferences;
import id.mpeinc.parawisataapps.model.ResponseLogin;
import id.mpeinc.parawisataapps.networking.ApiServices;
import id.mpeinc.parawisataapps.networking.RetrofitClient;
import id.mpeinc.parawisataapps.users.UserActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SigninActivity extends AppCompatActivity {

    EditText getUsrName, getPwdUser;
    Button btnSignIn;
    boolean cancel = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getUsrName = (EditText)findViewById(R.id.edtUsername);
        getPwdUser = (EditText)findViewById(R.id.edtPassword);

        btnSignIn = (Button)findViewById(R.id.btnProsesSignin);

        if (getIntent().getExtras() != null) {
            Bundle adapterTampung = getIntent().getExtras();
            getUsrName.setText(adapterTampung.getString("SENT_USERNAME"));
            getPwdUser.setText(adapterTampung.getString("SENT_PASSWORD"));

            // Log.d("SIGNIN", "TAMPUNG : " + getUsrName.getText().toString() + ", " + getPwdUser.getText().toString());
        }

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String upsetUsername = getUsrName.getText().toString();
                String upsetPassword = getPwdUser.getText().toString();

                moduleConfirmInput(upsetUsername, upsetPassword);
            }
        });
    }

    // TODO A.4: Add Preferences @ onStart Override Method

    @Override
    protected void onStart() {
        super.onStart();
        if (Preferences.getLoggedInUserStatus(getBaseContext())) {
            startActivity(new Intent(getBaseContext(), UserActivity.class));
            finish();
        }
    }

    private void moduleConfirmInput(String upsetUsername, String upsetPassword) {
        if (TextUtils.isEmpty(upsetUsername)) {
            getUsrName.setError("This field username must be fill!.");
            getUsrName.requestFocus();
            cancel = true;
        } else if (TextUtils.isEmpty(upsetPassword)) {
            getPwdUser.setError("This field password must be fill!.");
            getPwdUser.requestFocus();
            cancel = true;
        } else {
            // TODO A.3: Add Preferences Here
            Preferences.setRegisteredUser(getBaseContext(), upsetUsername);
            Preferences.setRegisteredPass(getBaseContext(), upsetPassword);

            moduleLoginUser(upsetUsername, upsetPassword);
        }
    }

    private void moduleLoginUser(String upsetUsername, String upsetPassword) {
        final ProgressDialog dialog = ProgressDialog.show(SigninActivity.this, "Please wait...", "Prosess login on going.");

        ApiServices apiServices = RetrofitClient.getInstanceRetrofit();

        Call<ResponseLogin> responseLoginCall = apiServices.loginUser(upsetUsername, upsetPassword);

        responseLoginCall.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                if (response.isSuccessful()) {
                    dialog.dismiss();

                    String message = response.body().getMessage();
                    int messageCode = response.body().getCode();

                    if (messageCode == 200) {
                        Toast.makeText(SigninActivity.this, "Congrate! " + message, Toast.LENGTH_SHORT).show();
                        String dataUserLogin = String.valueOf(response.body().getInformasiUser());
                        Log.d("LOG", "USERLOGIN " + dataUserLogin);

                        String status = "Login successfully.";
                        if (message.equals(status)) {
                            moduleSigninPreference();
                        }
                     } else {
                        Toast.makeText(SigninActivity.this, message, Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {
                Toast.makeText(SigninActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // TODO A.5: Add Preferences to Module moduleSignin()

    private void moduleSigninPreference() {
        Preferences.setLoggedInUser(getBaseContext(), Preferences.getRegisteredUser(getBaseContext()));
        Preferences.setLoggedInUserStatus(getBaseContext(), true);
        startActivity(new Intent(getBaseContext(), UserActivity.class));
        finish();
    }

    public void goToRegisterActivity(View view) {
        startActivity(new Intent(SigninActivity.this, SignupActivity.class));
        finish();
    }

    public void backtToDashboard(View view) {
        startActivity(new Intent(SigninActivity.this, DashbaordActivity.class));
        finish();
    }
}
