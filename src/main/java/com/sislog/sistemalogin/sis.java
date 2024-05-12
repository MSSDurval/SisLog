package com.sislog.sistemalogin;

import java.util.HashMap;
<<<<<<< HEAD
=======
import java.util.Scanner;
import com.sislog.gui.SislogGUI;
>>>>>>> b2b921866b892dce7a05369c270ab649abeead9f

public class sis {
    String cod_acesso = null;
    String senha = null;
    int i;
<<<<<<< HEAD
    public int sucesso = 0;
    
    //Metodo que verifica e realiza o login do usuário.
    public void RealizaLogin(String CodigoAcesso, String SenhaAcesso){
        for(i = 1; i <= 3; i++){
        //O SisLog pedirá um Código de Acesso e uma Senha como credenciais.
            cod_acesso = CodigoAcesso;
            senha = SenhaAcesso;

            //Após, o SisLog verifica se as credenciais estão ccorretas no Banco de Dados.
            Conexao conexao = new Conexao();
            HashMap<String, String> credenciais = conexao.connect();
            if (credenciais.containsKey(cod_acesso) && (credenciais.get(cod_acesso).equals(senha))) {
                /*Caso estejam corretas, o Sistema irá exibir uma menssagem dizendo
                que o seu login foi realizado com sucesso.*/
                sucesso++;
                break;
                //Se não estiver ele irá pedir as credenciais novamente.
            }
=======
    public int tentativas;
    public int sucesso;
    
    //Metodo login criado no lugar do psvm.
    public void RealizaLogin(String CodigoAcesso, String SenhaAcesso){
    //Tela de Login do Sislog.
    Scanner login = new Scanner(System.in);
    for(i = 0; i <= 3; i++){
    //O SisLog pedirá um Código de Acesso e uma senha como credenciais.
        cod_acesso = CodigoAcesso;
        senha = SenhaAcesso;

        //Após, o SisLog verifica se as credenciais estão ccorretas no Banco de Dados.
        Conexao conexao = new Conexao();
        HashMap<String, String> credenciais = conexao.connect();
        if (credenciais.containsKey(cod_acesso) && (credenciais.get(cod_acesso).equals(senha))) {
            /*Caso estejam corretas, o Sistema irá exibir uma menssagem dizendo
            que o seu login foi realizado com sucesso.*/
            sucesso = 0;
            sucesso++;
            break;
            //Se não estiver ele irá pedir as credenciais novamente.
        } else {
            tentativas = 0;
            tentativas++;  
        }
    }
    /* O SisLog bloqueará temporiamente o usuário de fazer Login caso ele
        erre mais de três vezes suas credencias, medida criada para evitar
        ataques de força bruta nas contas dos usuários. */
    SislogGUI GUI = new SislogGUI();
    if(tentativas >= 3){
        GUI.lblAviso.setText("\n------------ATENÇÃO!!!------------\n\n" + 
                "Muitas Tentativas Incorretas!\n" + 
                "Tente Novamente Mais Tarde.\n");
>>>>>>> b2b921866b892dce7a05369c270ab649abeead9f
        }
    }
}
