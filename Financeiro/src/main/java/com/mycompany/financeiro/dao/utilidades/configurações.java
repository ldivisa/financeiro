/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao.utilidades;


import com.mycompany.financeiro.Configuracoes.frmConfiguracoes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz
 */
public class configurações {
    public String url;
    public Properties prop = new Properties();
    public String caminho ="config.properties";
    public Path p1 = Paths.get(caminho);
    
    
    public void gravaBanco(String url){
        

        try {
        //definir as propriedades e valores
        prop.setProperty("banco", url);
        //salvar o arquivo
        prop.store(new FileOutputStream(p1.toString()), null);
        } catch (IOException ex) {
        ex.printStackTrace();
        }    
         }
    
    public Properties leBanco (){
    try {
    
    
    
    if (!Files.exists(p1))
    {
        System.out.print("\nNão achei o arquivo");
        frmConfiguracoes fr = new frmConfiguracoes();
        fr.setVisible(true);
    }
    else
    {
    System.out.print("\nO arquivo "+p1.toString()+" foi encontrado");
    }
    prop.load(new FileInputStream(p1.toString()));
    } catch (IOException ex) {
        
        
        JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo de configurações "+ex);
        
       
    }
    return prop;   
    }

}
