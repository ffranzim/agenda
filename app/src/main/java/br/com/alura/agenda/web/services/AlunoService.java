package br.com.alura.agenda.web.services;

import java.util.List;

import br.com.alura.agenda.dto.AlunoSync;
import br.com.alura.agenda.modelo.Aluno;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AlunoService {

    @POST("aluno")
    Call<Void> insere(@Body Aluno aluno);

    @GET("aluno")
    Call<AlunoSync> lista();

    @DELETE("aluno/{id}")
    Call<Void>  deleta(@Path("id") String idAluno);
}
