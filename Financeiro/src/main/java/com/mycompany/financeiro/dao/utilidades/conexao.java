/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao.utilidades;




import com.mycompany.financeiro.dao.fornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz.souza
 */
public class conexao {

    
    public Connection conectar;
    public Statement statement;
    public ResultSet resultado;
    public String SQL;
    public String url;

    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public final String URL = "jdbc:mysql://luiz-tjm.hopto.org:3307/financeiro";
    public final String USUARIO = "root";
    public final String SENHA = "Caralho@oracle1";
    
    String ipservidor = ("luiz-tjm.hopto.org:3307");
    String userbanco = ("root");
    String senhabanco = ("Caralho@oracle1");
           
    
public boolean conecta()
{
    
    /*
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final String URL = "jdbc:mysql://localhost/teste";
    final String USUARIO = "root";
    final String SENHA = "1234Abc@";
    
    String ipservidor = ("localhost");
    String userbanco = ("root");
    String senhabanco = ("1234Abc@");
    final public String url = "jdbc:mysql://" + ipservidor + ":3306/teste";
    //final public String url = "jdbc:sqlite:C:/banco/impressoras.db";
    final public String user = userbanco;
    final public String senha = senhabanco;
    public String conexao = "jdbc:mysql://" + ipservidor + "/jTable," + userbanco + "," + senhabanco;

    */
    try
    {
    Class.forName(DRIVER);
        System.out.println("\nClasse carregada");
    }
    catch (ClassNotFoundException e)
    {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
    return true;
}
public ResultSet executaConsulta(String SQL)
    {
    
        try{
            conexao con = new conexao();
           // url = configs.leBanco().getProperty("banco"); 
           
           conectar = DriverManager.getConnection(URL,USUARIO,SENHA);
            System.out.println("\nDriver manager conexao efetuada");
            statement =conectar.createStatement();
            System.out.println("\nStatement criado");
            //System.out.println("\nSQL:"+SQL);
            resultado = statement.executeQuery(SQL);
            //statement.close();
            ////System.out.println("\nresultset preenchido");
            return resultado;
            }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "CONSULTA:"+e);
        }
        
        return resultado;
    }
    
public void executaUpdate(String SQL)
    {
        
        try{
            conexao con = new conexao();
            //url = configs.leBanco().getProperty("banco"); 
            
            
           conectar = DriverManager.getConnection(URL,USUARIO,SENHA);
            System.out.println("\nDriver manager conexao efetuada");
            statement =conectar.createStatement();
            System.out.println("\nStatement criado");
            System.out.println("\nSQL:"+SQL);
            statement.executeUpdate(SQL);
            //System.out.println("\nresultset preenchido");
            statement.close();
            }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "UPDATE: "+e);
        }
    
    }
    

}
