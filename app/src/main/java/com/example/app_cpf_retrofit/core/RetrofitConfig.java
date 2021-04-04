package com.example.app_cpf_retrofit.core;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit; //Atributo que será setado assim que for instanciada

    public RetrofitConfig(){

       this.retrofit = new Retrofit.Builder()
               .baseUrl("https://viacep.com.br/ws/") //Definindo a URL que será utilizada no web service
               .addConverterFactory(JacksonConverterFactory.create())  // classe que será responsável por lidar com a conversão
               .build(); //objeto Retrofit para utilizarmos em nosso projeto
    }

    public CEPService getCEPService() {
        return this.retrofit.create(CEPService.class);
    }
}
