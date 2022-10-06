/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao.utilidades;


import com.mycompany.financeiro.Configuracoes.frmConfiguracoes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class configurações {
    public String url;
    public Properties prop = new Properties();

    
    
    public void gravaBanco(String url){
        

        try {
        //definir as propriedades e valores
        prop.setProperty("banco", url);
        //salvar o arquivo
        prop.store(new FileOutputStream("config.properties"), null);
        } catch (IOException ex) {
        ex.printStackTrace();
        }    
         }
    
    public Properties leBanco (){
    try {
    //carrega properties
   
    prop.load(new FileInputStream("config.properties"));
    } catch (IOException ex) {
        
        JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo de configurações "+ex);
        
       
    }
    return prop;   
    }

}
