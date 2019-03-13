package br.com.alura.agenda.web.services;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface DispositivoService {

    @POST("firebase/dispositivo")
    Call<Void> enviaToken(@Header("aa") String token);
}
