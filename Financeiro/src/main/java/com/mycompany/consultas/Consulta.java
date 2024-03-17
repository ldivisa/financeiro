/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultas;

/**
 *
 * @author luiz.souza
 */
public class Consulta {
    private int idCompromisso;
    private boolean TipoDivida;
    private String DataVencimento;
    private double Valor;
    private int IdFornecedor;
    private String Documento;
    private String Parcela;
    private String CodigoBarras;
    private String Observacao;
    private int TipoDespesa;
    private String DataPagamento;
    private boolean PagamentoEfetuado;
    private String NCheque;
    private int IdFornecedorb;
    private String NomeFornecedor;
    private int IdTipoDespesa;
    private String NomeDespesa;

    public int getIdCompromisso() {
        return idCompromisso;
    }

    public void setIdCompromisso(int idCompromisso) {
        this.idCompromisso = idCompromisso;
    }

    public boolean getTipoDivida() {
        return TipoDivida;
    }

    public void setTipoDivida(boolean TipoDivida) {
        this.TipoDivida = TipoDivida;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(int IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getParcela() {
        return Parcela;
    }

    public void setParcela(String Parcela) {
        this.Parcela = Parcela;
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(String CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public int getTipoDespesa() {
        return TipoDespesa;
    }

    public void setTipoDespesa(int TipoDespesa) {
        this.TipoDespesa = TipoDespesa;
    }

    public String getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(String DataPagamento) {
        this.DataPagamento = DataPagamento;
    }

    public boolean getPagamentoEfetuado() {
        return PagamentoEfetuado;
    }

    public void setPagamentoEfetuado(boolean PagamentoEfetuado) {
        this.PagamentoEfetuado = PagamentoEfetuado;
    }

    public String getNCheque() {
        return NCheque;
    }

    public void setNCheque(String NCheque) {
        this.NCheque = NCheque;
    }

    public int getIdFornecedorb() {
        return IdFornecedorb;
    }

    public void setIdFornecedorb(int IdFornecedorb) {
        this.IdFornecedorb = IdFornecedorb;
    }

    public String getNomeFornecedor() {
        return NomeFornecedor;
    }

    public void setNomeFornecedor(String NomeFornecedor) {
        this.NomeFornecedor = NomeFornecedor;
    }

    public int getIdTipoDespesa() {
        return IdTipoDespesa;
    }

    public void setIdTipoDespesa(int IdTipoDespesa) {
        this.IdTipoDespesa = IdTipoDespesa;
    }

    public String getNomeDespesa() {
        return NomeDespesa;
    }

    public void setNomeDespesa(String NomeDespesa) {
        this.NomeDespesa = NomeDespesa;
    }

    @Override
    public String toString() {
        return "Consulta{" + "idCompromisso=" + idCompromisso + ", TipoDivida=" + TipoDivida + ", DataVencimento=" + DataVencimento + ", Valor=" + Valor + ", IdFornecedor=" + IdFornecedor + ", Documento=" + Documento + ", Parcela=" + Parcela + ", CodigoBarras=" + CodigoBarras + ", Observacao=" + Observacao + ", TipoDespesa=" + TipoDespesa + ", DataPagamento=" + DataPagamento + ", PagamentoEfetuado=" + PagamentoEfetuado + ", NCheque=" + NCheque + ", IdFornecedorb=" + IdFornecedorb + ", NomeFornecedor=" + NomeFornecedor + ", IdTipoDespesa=" + IdTipoDespesa + ", NomeDespesa=" + NomeDespesa + '}';
    }
    
}
