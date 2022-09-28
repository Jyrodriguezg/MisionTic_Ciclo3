package com.MVC.Ciclo3.entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Movientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento", nullable = false)
    private long id_movimiento;
    @Column(name = "monto_Dinero")
    private int montoDinero;
    @javax.validation.constraints.NotEmpty
    @Column(name = "concepto")
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "Usuario")
    private Empleado usuarioRegistro;
    @ManyToOne
    @JoinColumn(name = "empresa_ID")
    private Empresa empresa;
    public MovimientoDinero() {
    }
    public long getId_movimiento() {
        return id_movimiento;
    }
    public void setId_movimiento(long id_movimiento) {
        this.id_movimiento = id_movimiento;
    }
    public int getMontoDinero() {
        return montoDinero;
    }
    public void setMontoDinero(int montoDinero) {
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
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
