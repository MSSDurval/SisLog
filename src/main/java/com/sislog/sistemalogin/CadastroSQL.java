package com.sislog.sistemalogin;
import java.util.HashMap;
import java.sql.*;
import com.sislog.gui.*;

public class CadastroSQL {
    String cod_acesso, senha, nome, email;
    String comandoSQL;
    ClasseSQL sql = new ClasseSQL();
    String username = sql.getUsername();
    String password = sql.getPassword();
    Connection conexao = null;
    /*O método connect em conjunto ao hashmap conecta ao bd postgresql, depois
    faz um "INSET INTO" na tabela de dados cadastrados. E cadastra os respectivos
    usuarios*/
    public HashMap<String, String> connect(){
        HashMap<String, String> cadastro = new HashMap<>();
        SislogGUI GUI = new SislogGUI();
        try{
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/siscad", username, password);
            Class.forName("org.postgresql.Driver");
            comandoSQL = "INSERT INTO cadastro(cod_acesso, senha, nome, email) VALUES(0, 1, 2, 3)";
            /*Os Prepared Statements, são interfaces que pre-compilam os
            comandos de SQL, diminuindo a sobrecarga do banco, alem de podermos
            usa-los para inserir as Strings dentro do comando SQL.*/
            PreparedStatement precompila = conexao.prepareStatement(comandoSQL);
            precompila.setString(0, cod_acesso);
            precompila.setString(1, senha);
            precompila.setString(2, nome);
            precompila.setString(3, email);
            precompila.executeUpdate();
            /*SERÃO FEITAS CORREÇÕES PARA A LINHAS DE CÓDIGO A SEGUIR*/
            while(precompila.execute()){
                cadastro.put(cod_acesso, senha);
            }
            /*-------------------------------------*/
        }
        catch(ClassNotFoundException erroClasse){
            GUI.lblAviso.setText("\nDriver do banco de dados nao encontrado!\n" + erroClasse.getMessage());
        }
        catch(SQLException erroSQL){
            GUI.lblAviso.setText("\nOcorreu um erro ao acessar o banco de dados: \n" + erroSQL.getMessage());
        }
        finally{
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException erroEncerrar) {
                    GUI.lblAviso.setText("\nErro! Esta conexão não pode ser encerrada.\n" + erroEncerrar.getMessage());
                }
            }
        }
        return cadastro;
    }
}
