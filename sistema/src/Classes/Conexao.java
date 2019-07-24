/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author 2247461
 */

import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexao {  
  
  
   private static String URL ="jdbc:sqlserver://pgsrv19:1433;" +  
"databaseName=dbBancoTese;";//se não for acessar localmente mude localhost pelo nome do servidor  
    private static String usuario = "sa";//esse usuário é um sysadmin ele tem todos os poderes, é bom que se crie um login e usuário a parte  
    private static String password = "3253389";  
   private static String DRIVER ="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;//Esse é o nome do driver, que na internet você vai encontrar de varias maneiras, mas só esse resolveu meus problemas  
  
  
   public static Connection abreConexao() throws SQLException{  
      try {  
  
        Class.forName(DRIVER );  
        Connection con = DriverManager.getConnection(URL,usuario,password);  
        return con;  
  
      } catch (ClassNotFoundException e) {  
               throw new SQLException(e.getMessage());  
  
      }  
   }
   
   public Connection getConnection(){
       try {
           return DriverManager.getConnection(URL,usuario,password);
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }
} 


