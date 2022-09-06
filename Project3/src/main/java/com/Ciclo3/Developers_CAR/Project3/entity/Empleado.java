package com.Ciclo3.Developers_CAR.Project3.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name="Empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado", nullable = false)
    private long idEmpleado;
    @Column(name = "nombreEmpleado", nullable = false)
    private String nombreEmpleado;
    @Column(name = "correoEmpleado", unique = true, nullable = false)
    private String correoEmpleado;
    @ManyToOne
    @JoinColumn(name = "empresaEmpleado", unique = true, nullable = false)
    private Empresa empresaEmpleado;
    @Column(name = "rolEmpleado", nullable = false)
    private Rol rolEmpleado;

    @ManyToOne
    @JoinColumn(name = "movimientos", nullable = false)
    private MovimientoDinero movimientos;
    public Empleado() {
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }


    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public Rol getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Rol rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(MovimientoDinero movimientos) {
        this.movimientos = movimientos;
    }
}
