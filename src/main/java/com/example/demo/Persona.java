
package com.example.demo;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="persona")
public class Persona {
    @Id
    @Column(name="id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    
    @Column(name="numero_documento")
    private long numeroDocumento;
    
    @Column(name="tipo_documento")
    private String tipoDocumento;

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
            
    
}
