package com.Ciclo3.Developers_CAR.Project3.entity;
import javax.persistence.*;
@Entity
@Table(name="Movientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento", nullable = false)
    private long id_movientos;
    @Column(name = "monto_Dinero", nullable = false)
    private long montoDinero;
    @Column(name = "concepto", nullable = false)
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "Usuario", nullable = false)
    private Empleado usuarioRegistro;
    @ManyToOne
    @JoinColumn(name = "empresa", nullable = false)
    private Empresa empresa;
    public MovimientoDinero() {
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public long getId_movientos() {
        return id_movientos;
    }

    public void setId_movientos(long id_movientos) {
        this.id_movientos = id_movientos;
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

    public Empleado getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Empleado usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

}
