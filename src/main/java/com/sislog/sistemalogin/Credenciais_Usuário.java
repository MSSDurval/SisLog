package com.sislog.sistemalogin;

public class Credenciais_Usuário {
    //atributos que irao para Sislog.java
    String cod_acesso;
    String senha;
    //Contrutor da classe Credenciais_Usuário
    public Credenciais_Usuário(String cod_acesso, String senha){
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

