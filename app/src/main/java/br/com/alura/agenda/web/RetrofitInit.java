package br.com.alura.agenda.web;

import br.com.alura.agenda.web.services.AlunoService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInit {

    private final Retrofit retrofit;

    public RetrofitInit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://172.24.44.75:8080/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public AlunoService getAlunoService() {
        return retrofit.create(AlunoService.class);
    }
}
