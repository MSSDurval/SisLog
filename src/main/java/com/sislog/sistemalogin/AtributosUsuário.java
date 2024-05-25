package com.sislog.sistemalogin;

public class AtributosUsuário {
    //atributos que irao para sis.java
    String cod_acesso;
    String senha;
    //Contrutor da classe AtributosUsuário
    public AtributosUsuário(String cod_acesso, String senha){
        this.cod_acesso = cod_acesso;
        this.senha = senha;
    }
    //Metodos getters que retonam as credenciais de acesso.
    public String getAcesso(){
        return cod_acesso;
    }
    public String getSenha(){
        return senha;
    }
}

