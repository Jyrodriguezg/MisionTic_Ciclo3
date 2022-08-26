package com.Ciclo3.Developers_CAR.Project3._entity;

public class MovimientoDinero {
    private long montoDinero;
    private String concepto;
    private String usuarioRegistro;

    public MovimientoDinero() {
    }

    public long getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(long montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
