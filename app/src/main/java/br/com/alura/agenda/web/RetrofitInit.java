package br.com.alura.agenda.web;

import br.com.alura.agenda.web.services.AlunoService;
import br.com.alura.agenda.web.services.DispositivoService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInit {

    public static final String IP_BASE = "172.24.44.75";
//    public static final String IP_BASE = "192.168.42.39";

    private final Retrofit retrofit;

    public RetrofitInit() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(interceptor);


        retrofit = new Retrofit.Builder()
                .baseUrl("http://" + IP_BASE + ":8080/api/")
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public AlunoService getAlunoService() {
        return retrofit.create(AlunoService.class);
    }
    public DispositivoService getDispositivoService() {
        return retrofit.create(DispositivoService.class);
    }
}
