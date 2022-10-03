/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao;

import java.sql.Date;

/**
 *
 * @author luiz
 */
public class compromissos {
    
private int idCompromissos;
private Date dataCadastro;
private Date dataVencimento;
private Double valor;
private int idFornecedor;
private String Documento;
private String parcela;
private String codigodeBarras;
private String observacao;
private int tipoDespesa;
private Date dataPagamento;
private boolean pagamentoEfetuado;        

    public int getIdCompromissos() {
        return idCompromissos;
    }

    public void setIdCompromissos(int idCompromissos) {
        this.idCompromissos = idCompromissos;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public String getCodigodeBarras() {
        return codigodeBarras;
    }

    public void setCodigodeBarras(String codigodeBarras) {
        this.codigodeBarras = codigodeBarras;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(int tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public boolean isPagamentoEfetuado() {
        return pagamentoEfetuado;
    }

    public void setPagamentoEfetuado(boolean pagamentoEfetuado) {
        this.pagamentoEfetuado = pagamentoEfetuado;
    }

    @Override
    public String toString() {
        return "compromissos{" + "idCompromissos=" + idCompromissos + ", dataCadastro=" + dataCadastro + ", dataVencimento=" + dataVencimento + ", valor=" + valor + ", idFornecedor=" + idFornecedor + ", Documento=" + Documento + ", parcela=" + parcela + ", codigodeBarras=" + codigodeBarras + ", observacao=" + observacao + ", tipoDespesa=" + tipoDespesa + ", dataPagamento=" + dataPagamento + ", pagamentoEfetuado=" + pagamentoEfetuado + '}';
    }



}
