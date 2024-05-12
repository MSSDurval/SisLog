package com.sislog.sistemalogin;

public class usuario {
    //atributos que irao para sis.java
    String cod_acesso;
    String senha;
    //Contrutor da classe usuario
    public usuario(String cod_acesso, String senha){
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

