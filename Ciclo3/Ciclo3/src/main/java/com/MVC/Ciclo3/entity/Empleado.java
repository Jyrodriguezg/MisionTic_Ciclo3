package com.MVC.Ciclo3.entity;

import javax.persistence.*;

@Entity
@Table(name="Empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado", nullable = false)
    private long idEmpleado;
    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;
    @Column(name = "correoEmpleado")
    private String correoEmpleado;
    @Column(name = "contraseña")
    private String password;
    @ManyToOne
    @JoinColumn(name = "Empresa_ID")
    private Empresa empresaEmpleado;
    @Column(name = "rolEmpleado")
    private Rol rolEmpleado;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String contraseña) {
        this.password = contraseña;
    }
}
