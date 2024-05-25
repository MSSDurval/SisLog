package com.sislog.sistemalogin;
import java.util.HashMap;

public class Sislog {
    String cod_acesso = null;
    String senha = null;
    int i;
    public int sucesso = 0;
    
    /*Metodo que verifica e realiza o login do usuário.*/
    public void RealizaLogin(String CodigoAcesso, String SenhaAcesso){
        for(i = 1; i <= 3; i++){
        /*O SisLog pedirá um Código de Acesso e uma Senha como credenciais.*/
            cod_acesso = CodigoAcesso;
            senha = SenhaAcesso;

            /*Após, o SisLog verifica se as credenciais estão ccorretas no Banco de Dados.*/
            ConsultaSQL conexao = new ConsultaSQL();
            HashMap<String, String> credenciais = conexao.connect();
            if (credenciais.containsKey(cod_acesso) && (credenciais.get(cod_acesso).equals(senha))) {
                /*Caso estejam corretas, o Sistema irá exibir uma menssagem dizendo
                que o seu login foi realizado com sucesso.*/
                sucesso++;
                break;
                /*Se não estiver ele irá pedir as credenciais novamente.*/
            }
        }
    }
    public void RealizaCadastro(String cod_cadastro, String senha_cadastro){
        
    }
}
