package id.mpeinc.parawisataapps.networking;

import id.mpeinc.parawisataapps.function.Constraints;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constraints.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static ApiServices getInstanceRetrofit() {
        return getRetrofit().create(ApiServices.class);
    }

}
