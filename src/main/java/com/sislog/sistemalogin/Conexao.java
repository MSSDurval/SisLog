package com.sislog.sistemalogin;
import java.sql.*;
import java.util.HashMap;
/*O HasMap é uma estrutura que permite inserir elementos, usando Chave-Valor
pares, com possibilidade de escolher o tipo da variável*/

//O sislog.java acessa essa classe para se conectar ao postgresql.
public class Conexao {
    String cod_acesso;
    String senha;
    ClasseSQL sql = new ClasseSQL();
    String username = sql.getUsername();
    String password = sql.getPassword();
    Connection conexao = null;
    
    /*O método connect em conjunto ao hashmap conecta ao bd postgresql, depois
    faz um "SELECT" na tabela de dados cadastrados. E retorna-os as respectivas
    strings*/
    public HashMap<String, String> connect() {  
        HashMap<String, String> credenciais = new HashMap<>();
            /*Tratamento de erros/excessões que podem ocorrer. Obrigatório para 
            o medodo "getConnection()"*/
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/siscad", username, password);
            Class.forName("org.postgresql.Driver");
            ResultSet rsCadastro = conexao.createStatement().executeQuery("SELECT * FROM cadastro");
            while(rsCadastro.next()){
                String cod_acesso = rsCadastro.getString("cod_acesso");
                String senha = rsCadastro.getString("senha");
                credenciais.put(cod_acesso, senha);
            }
        } catch(ClassNotFoundException erroClasse) {
            System.out.println("\nDriver do banco de dados nao encontrado!\n" + erroClasse.getMessage());
        } catch(SQLException erroSQL) {
            System.out.println("\nOcorreu um erro ao acessar o banco de dados: \n" + erroSQL.getMessage());
            //Encerramento da conexão do postgresql.
        } finally {
            if(conexao != null) {
                try {
                    conexao.close();
            //Tratamento de erro para conexôes que não podem ser fechadas.
                } catch(SQLException erroClose) {
                    System.out.println("\nErro! Esta conexão não pode ser encerrada\n" + erroClose.getMessage());
                }
            }
        }
        //Retorno obrigatório das credencias. (Requisito do HashMap)
        return credenciais;
    }
}

