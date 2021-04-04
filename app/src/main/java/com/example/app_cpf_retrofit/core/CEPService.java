package com.example.app_cpf_retrofit.core;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CEPService {

    //Definiar parametros
    @GET("{cep}/json")
    //mapear o campo CEP, digitado pelo usuário
    Call<CEP> buscarCEP(@Path("cep") String cep);

}
