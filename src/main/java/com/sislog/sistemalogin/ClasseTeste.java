/*Classe para testar mudanças na classe de cadastro*/
package com.sislog.sistemalogin;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ClasseTeste {
    protected String codigo_novo, senha, nome, email, telefone, data_recebida,
            estado, cidade;
    protected int registros;
    String comandoSQL;
    ClasseSQL sql = new ClasseSQL();
    String username = sql.getUsername();
    String password = sql.getPassword();
    Connection conexao = null;
    
    
    /*Metodos que recebem os dados do usuario*/
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setDTNascimento(String data_recebida){
        this.data_recebida = data_recebida;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    
    /*Método que cria um código aleátorio para o novo usuário.*/
    public String criacodigo(){
        UUID codigo_UUID = UUID.randomUUID();
        long codigo = ByteBuffer.wrap(
                codigo_UUID.toString().getBytes()).getLong();
        codigo_novo = Long.toString(codigo, Character.MAX_RADIX);
        return codigo_novo;
    }
    
    /*METODO TEMPORARIO PARA CRIAR SENHAS PARA USUARIOS*/
    public String criasenha(){
        Random senha_criada = new Random();
        senha = String.valueOf(senha_criada.nextInt(99999));
        return senha;
    }
    /*Metodo que converte a data de nascimento do tipo String para o tipo Date 
    (usado no Banco de Dados)*/
    public java.sql.Date castData() throws ParseException{
        SimpleDateFormat converte_data = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date data_convertida = converte_data.parse(data_recebida);
        java.sql.Date data_nascimento = new java.sql.Date(
                data_convertida.getTime());
        return data_nascimento;
    }
    
    /*O método connect em conjunto ao hashmap conecta ao postgresql, depois
    faz um "INSET INTO" na tabela de dados cadastrados.
    E cadastra os respectivos usuarios*/
    public HashMap<String, Object> connect() throws ParseException{
        HashMap<String, Object> cadastro = new HashMap<>();
       
        try{
            System.out.println("Tentando carregar o driver JDBC...");
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver carregado com sucesso.");
            
            System.out.println("Tentando conectar ao banco de dados...");
            conexao = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/siscad",
                    username, password);
            System.out.println("Conexão estabelecida com sucesso.\n");
            
            
            comandoSQL = "INSERT INTO cadastro(cod_acesso, senha, nome, email,"
                    + " telefone, data_nascimento, estado, cidade)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            
            /*Depuração: Aqui pode ser verificado se a classe esta recebendo
            os dados do usuário devidamente, antes de ser executada
            a interface.*/
            System.out.println("Modo de Depuração de Dados Sensíveis:");
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Telefone: " + telefone);
            System.out.println("Data RECEBIDA " + data_recebida +
                    " -> " + data_recebida.getClass().getSimpleName());
            System.out.println("Data de Nascimento convertida: " + castData());
            System.out.println("Estado: " + estado);
            System.out.println("Cidade: " + cidade);
            System.out.println("Código: " + criacodigo());
            System.out.println("Senha Criada: " + senha);
            System.out.println("Fim da linha\n");
            
            /*Os Prepared Statements, são interfaces que pre-compilam os
            comandos de SQL, diminuindo a sobrecarga do banco, alem de podermos
            usa-los para inserir as Strings dentro do comando SQL.*/
            System.out.println("Preparando o statement...\n");
            PreparedStatement precompila = conexao.prepareStatement(comandoSQL);
            precompila.setString(1, codigo_novo);
            precompila.setString(2, senha);
            precompila.setString(3, nome);
            precompila.setString(4, email);
            precompila.setString(5, telefone);
            precompila.setDate(6, castData());
            precompila.setString(7, estado);
            precompila.setString(8, cidade);
            
            /*Executa a interface, inserido os dados no banco de dados*/
            registros = precompila.executeUpdate();
            if (registros > 0) {
                cadastro.put("Nome", nome);
                cadastro.put("Email", email);
                cadastro.put("Telefone", telefone);
                cadastro.put("Data de Nascimento", castData());
                cadastro.put("Estado", estado);
                cadastro.put("Cidade", cidade);
                cadastro.put("Código de Acesso", codigo_novo);
                cadastro.put("Senha", senha);
                System.out.println("Dados inseridos com sucesso!");
                System.out.println("Foram cadastrdos " +
                        registros + " registros no banco de dados\n");
            } else {
                System.out.println("Nenhuma linha foi inserida.\n");
            }
        }
        catch(ClassNotFoundException erroClasse){
            System.out.println("\nErro no driver do banco de dados!\n" +
                    erroClasse.getMessage());
            System.out.println("\n\nRegistros:" + registros + "\n");
        }
        catch(SQLException erroSQL){
            System.out.println("\nErro ao acessar o banco de dados!\n" + 
                    erroSQL.getMessage ());
            System.out.println("\n" + registros + 
                    " registros no banco de dados." + "\n");
        }
        finally{
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException erroEncerrar) {
                    System.out.println("\nErro! Esta conexão não pode ser"
                            + " encerrada.\n" + erroEncerrar.getMessage());
                }
            }
        }
        return cadastro;
    }

    public static void main(String[] args) throws ParseException {
        ClasseTeste cadastro = new ClasseTeste();
        cadastro.setNome("Sislog_v0.2");
        cadastro.setEmail("sislog@email.com");
        cadastro.setTelefone("2190004321");
        cadastro.setDTNascimento("02/05/2024");
        cadastro.setEstado("Rio de Janeiro");
        cadastro.setCidade("Rio de Janeiro");
        cadastro.criacodigo();
        cadastro.criasenha();
        cadastro.connect();   
    }
}
