package com.sislog.sistemalogin;

//Informações necessárias para o java conectar ao PostegreSQL
public class ClasseSQL {
        protected String severName = "localhost";
        protected String database = "siscad";
        protected String username = "postgres";
        protected String password = "admin";
        protected String url = "jdbc:postgresql://localhost:5432/siscad";
        protected String jbdcDriver = "org.postgresql.Driver";
        
        public String getUsername(){
            return this.username;
        }
        public String getPassword(){
            return this.password;
        }
}
