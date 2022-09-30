/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financeiro.dao;

/**
 *
 * @author luiz.souza
 */
public class tipodespesa {

private int IdTipoDespesa;
private String NomeDespesa;
private String ObservaçãoDespesa;
private String TipoDespesa;

    public int getIdTipoDespesa() {
        return IdTipoDespesa;
    }
    

    public void setIdTipoDespesa(int IdTipoDespesa) {
        this.IdTipoDespesa = IdTipoDespesa;
    }

    public String getTipoDespesa() {
        return TipoDespesa;
    }
    

    public void setTipoDespesa(String TipoDespesa) {
        this.TipoDespesa = TipoDespesa;
    }

    
    
    public String getNomeDespesa() {
        return NomeDespesa;
    }

    public void setNomeDespesa(String NomeDespesa) {
        this.NomeDespesa = NomeDespesa;
    }

    public String getObservaçãoDespesa() {
        return ObservaçãoDespesa;
    }

    public void setObservaçãoDespesa(String ObservaçãoDespesa) {
        this.ObservaçãoDespesa = ObservaçãoDespesa;
    }

    @Override
    public String toString() {
        return "tipodespesa{" + "IdTipoDespesa=" + IdTipoDespesa + ", NomeDespesa=" + NomeDespesa + ", Observa\u00e7\u00e3oDespesa=" + ObservaçãoDespesa + '}';
    }


}
