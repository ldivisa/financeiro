/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao;

/**
 *
 * @author luiz.souza
 */
public class fornecedores {
    private int IdFornecedor;
    private String NomeFornecedor;
    private String FoneFornecedor;
    private String EnderecoFornecedor;
    private String Observacoesfornecedor;

    public int getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(int IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public String getFoneFornecedor() {
        return FoneFornecedor;
    }

    public void setFoneFornecedor(String FoneFornecedor) {
        this.FoneFornecedor = FoneFornecedor;
    }

    public String getEnderecoFornecedor() {
        return EnderecoFornecedor;
    }

    public void setEnderecoFornecedor(String EnderecoFornecedor) {
        this.EnderecoFornecedor = EnderecoFornecedor;
    }

    public String getObservacoesfornecedor() {
        return Observacoesfornecedor;
    }

    public void setObservacoesfornecedor(String Observacoesfornecedor) {
        this.Observacoesfornecedor = Observacoesfornecedor;
    }

    @Override
    public String toString() {
        return "fornecedores{" + "IdFornecedor=" + IdFornecedor + ", NomeFornecedor=" + NomeFornecedor + ", FoneFornecedor=" + FoneFornecedor + ", EnderecoFornecedor=" + EnderecoFornecedor + ", Observacoesfornecedor=" + Observacoesfornecedor + '}';
    }
    
    
}
