package com.Ciclo3.Developers_CAR.Project3.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nombreEmpleado", nullable = false)
    private String nombreEmpleado;
    @Column(name = "correoEmpleado", unique = true)
    private String correoEmpleado;
    @ManyToOne
    @JoinColumn(name = "empresaEmpleado")
    private Empresa empresaEmpleado;
    @Column(name = "rolEmpleado")
    private Rol rolEmpleado;

    public Empleado() {
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
}
