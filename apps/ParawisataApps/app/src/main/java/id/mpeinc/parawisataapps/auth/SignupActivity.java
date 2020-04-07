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
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

import id.mpeinc.parawisataapps.R;
import id.mpeinc.parawisataapps.function.Preferences;
import id.mpeinc.parawisataapps.model.ResponseRegister;
import id.mpeinc.parawisataapps.networking.ApiServices;
import id.mpeinc.parawisataapps.networking.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignupActivity extends AppCompatActivity {

    EditText edNamaLengkap, edJenisKelamin, edUsername, edPassword, edConfirmPasword, edEmail;
    Button btSignupNow;
    ImageButton btBackToSignin;

    int randomCode = 0;

    Bundle adapterBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        int dataRandom = (int) Math.pow(10, 5 - 1);
        randomCode = dataRandom + new Random().nextInt(9 * dataRandom);

        edNamaLengkap = (EditText)findViewById(R.id.edtNamaLengkap);
        edJenisKelamin = (EditText)findViewById(R.id.edtJenisKelamin);
        edUsername = (EditText)findViewById(R.id.edtSetUsername);
        edPassword = (EditText)findViewById(R.id.edtSetPassword);
        edConfirmPasword = (EditText)findViewById(R.id.edtConfirmPassword);
        edEmail = (EditText)findViewById(R.id.edtEmail);

        btSignupNow = (Button)findViewById(R.id.btnProsesSignup);

        btSignupNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moduleConfirmInput();
            }
        });

    }

    public void moduleConfirmInput() {
        String getNamaLengkap, getJenisKelamin, getUsername, getPassword, getConfirmPass, getEmail;
        boolean cancel = false;

        getNamaLengkap = edNamaLengkap.getText().toString();
        getJenisKelamin = edJenisKelamin.getText().toString();
        getUsername = edUsername.getText().toString();
        getPassword = edPassword.getText().toString();
        getConfirmPass = edConfirmPasword.getText().toString();
        getEmail = edEmail.getText().toString();

        if (getNamaLengkap.isEmpty()) {
            edNamaLengkap.setError("Isi nama lengkap anda!");
            edNamaLengkap.requestFocus();
        } else if (TextUtils.isEmpty(getJenisKelamin)) {
            edJenisKelamin.setError("Isi jenis kelamin anda!");
            edJenisKelamin.requestFocus();
        } else if (TextUtils.isEmpty(getUsername)) {
            edUsername.setError("Isi Usename anda!");
            edUsername.requestFocus();
            cancel = true;
        } else if (cekUser(getUsername)) {
            edUsername.setError("Isi password anda!");
            edUsername.requestFocus();
            cancel = true;
        } else if (TextUtils.isEmpty(getPassword)) {
            edPassword.setError("Isi password anda!");
            edPassword.requestFocus();
            cancel = true;
        } else if (TextUtils.isEmpty(getConfirmPass)) {
            edConfirmPasword.setError("Isi confirm password anda!");
            edConfirmPasword.requestFocus();
            cancel = true;
        } else if (!getConfirmPass.equals(getPassword)) {
            edConfirmPasword.setError("Maaf! password tidak match!.");
            edConfirmPasword.requestFocus();
            cancel = true;
        } else if (!cekPassword(getPassword, getConfirmPass)) {
            edPassword.setError("isi password anda!");
            edPassword.requestFocus();
            cancel = true;
        } else if (TextUtils.isEmpty(getEmail)) {
            edEmail.setError("Isi Email Anda!.");
            edEmail.requestFocus();
        } else {
            // TODO A.1: Add Preferences Here
            Preferences.setRegisteredUser(getBaseContext(), getUsername);
            Preferences.setRegisteredPass(getBaseContext(), getPassword);

            moduleRegisterUser(randomCode, getNamaLengkap, getJenisKelamin, getUsername, getPassword, getEmail);
        }
    }

    public void moduleRegisterUser(int kd_user, String nm_user, String jk_user, final String usr_user, final String pwd_user, String eml_user) {
        final ProgressDialog dialog = ProgressDialog.show(SignupActivity.this, "Please wait...", "Prosess register new user is proces.");

        ApiServices apiServices = RetrofitClient.getInstanceRetrofit();
        Call<ResponseRegister> responseRegisterCall = apiServices.registerUser(kd_user, nm_user, jk_user, usr_user, pwd_user, eml_user);

        responseRegisterCall.enqueue(new Callback<ResponseRegister>() {
            @Override
            public void onResponse(Call<ResponseRegister> call, Response<ResponseRegister> response) {
                if (response.isSuccessful()) {
                    dialog.dismiss();

                    String message = response.body().getMessage();
                    Boolean status = response.body().isStatus();

                    if (status.equals(true)) {
                        Toast.makeText(SignupActivity.this, "Horay! " + message, Toast.LENGTH_SHORT).show();
                        String body = String.valueOf(response.body().getDataUser());

                        Log.d("LOG", "REGISTER " + body);

                        adapterBundle = new Bundle();
                        adapterBundle.putString("SENT_USERNAME", usr_user);
                        adapterBundle.putString("SENT_PASSWORD", pwd_user);

                        Intent kirimkeSignin = new Intent(SignupActivity.this, SigninActivity.class);

                        kirimkeSignin.putExtras(adapterBundle);
                        startActivity(kirimkeSignin);
                        finish();
                    } else {
                        Toast.makeText(SignupActivity.this, "Oopps! " + message, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseRegister> call, Throwable t) {
                Toast.makeText(SignupActivity.this, "Check your connection now!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
    }

    private boolean cekPassword(String passkey, String repasskey) {
        return passkey.equals(repasskey);
    }

    private boolean cekUser(String user) {
        return user.equals(Preferences.getRegisteredPass(getBaseContext()));
    }

    public void backtToSignin(View view) {
        startActivity(new Intent(SignupActivity.this, SigninActivity.class));
        finish();
    }
}
