package id.mpeinc.parawisataapps.networking;

import id.mpeinc.parawisataapps.model.ResponseLogin;
import id.mpeinc.parawisataapps.model.ResponseRegister;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiServices {

    @FormUrlEncoded
    @POST("signup.php")
    Call<ResponseRegister> registerUser (
            @Field("kode_user") int str_kodeuser,
            @Field("namalengkap_user") String str_namalengkap,
            @Field("jeniskelamin_user") String str_jeniskelamin,
            @Field("username_user") String str_username,
            @Field("password_user") String str_password,
            @Field("email_user") String str_email
    );

    @FormUrlEncoded
    @POST("signin.php")
    Call<ResponseLogin> loginUser (
            @Field("username") String str_username,
            @Field("password") String str_password
    );
}
