package com.MVC.Ciclo3.entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="Empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado", nullable = false)
    private long idEmpleado;

    @javax.validation.constraints.NotEmpty
    @Column(name = "nombreEmpleado")
    private String nombreEmpleado;
    @Pattern(regexp = "[a-zA-Z0-9!#$%&'*_+-]([\\.]?[a-zA-Z0-9!#$%&'*_+-])+@[a-zA-Z0-9]([^@&%$\\/()=?¿!.,:;]|\\d)+[a-zA-Z0-9][\\.][a-zA-Z]{2,4}([\\.][a-zA-Z]{2})?" ,message = "Debe ser un correo electrónico válido")
    @Column(name = "correoEmpleado")
    private String correoEmpleado;
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,128}$" , message = "La contraseña debe contener minimo 8 caracteres, máximo 15, una letra mayúscula, una letra minuscula, un número, un caracter especial y sin espacios en blanco")
    @Column(name = "contraseña")
    private String password;

    @ManyToOne
    @JoinColumn(name = "Empresa_ID")
    private Empresa empresaEmpleado;
    @NotNull
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
