package com.MVC.Ciclo3.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Empresas")
public class    Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empresa", nullable = false)
    private long idEmpresa;
    @Column(name = "nombreEmpresa")
    private String nombreEmpresa;
    @Column(name = "direccionEmpresa")
    private String direccionEmpresa;
    @Column(name = "telefonoEmpresa")
    private String telefonoEmpresa;
    @Column(name = "nitEmpresa")
    private String nitEmpresa;

    public Empresa() {
    }


    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

}
