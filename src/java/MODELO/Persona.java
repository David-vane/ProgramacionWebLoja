/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Robin
 */
@Entity
@Table(name = "persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByIDPersona", query = "SELECT p FROM Persona p WHERE p.iDPersona = :iDPersona")
    , @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Persona.findByCedula", query = "SELECT p FROM Persona p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Persona.findByDireccion", query = "SELECT p FROM Persona p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Persona.findByCelular", query = "SELECT p FROM Persona p WHERE p.celular = :celular")
    , @NamedQuery(name = "Persona.findByCorreoelectronico", query = "SELECT p FROM Persona p WHERE p.correoelectronico = :correoelectronico")
    , @NamedQuery(name = "Persona.findByTitulo", query = "SELECT p FROM Persona p WHERE p.titulo = :titulo")
    , @NamedQuery(name = "Persona.findByActividades", query = "SELECT p FROM Persona p WHERE p.actividades = :actividades")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Persona")
    private String iDPersona;
    @Size(max = 10)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "Cedula")
    private String cedula;
    @Size(max = 20)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 15)
    @Column(name = "Celular")
    private String celular;
    @Size(max = 30)
    @Column(name = "Correo_electronico")
    private String correoelectronico;
    @Size(max = 20)
    @Column(name = "Titulo")
    private String titulo;
    @Size(max = 20)
    @Column(name = "Actividades")
    private String actividades;
    @OneToMany(mappedBy = "iDPersona")
    private Collection<Supervision> supervisionCollection;
    @OneToMany(mappedBy = "iDPersona")
    private Collection<Empresa> empresaCollection;
    @OneToMany(mappedBy = "iDPersona")
    private Collection<Rol> rolCollection;

    public Persona() {
    }

    public Persona(String iDPersona) {
        this.iDPersona = iDPersona;
    }

    public String getIDPersona() {
        return iDPersona;
    }

    public void setIDPersona(String iDPersona) {
        this.iDPersona = iDPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    @XmlTransient
    public Collection<Supervision> getSupervisionCollection() {
        return supervisionCollection;
    }

    public void setSupervisionCollection(Collection<Supervision> supervisionCollection) {
        this.supervisionCollection = supervisionCollection;
    }

    @XmlTransient
    public Collection<Empresa> getEmpresaCollection() {
        return empresaCollection;
    }

    public void setEmpresaCollection(Collection<Empresa> empresaCollection) {
        this.empresaCollection = empresaCollection;
    }

    @XmlTransient
    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPersona != null ? iDPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.iDPersona == null && other.iDPersona != null) || (this.iDPersona != null && !this.iDPersona.equals(other.iDPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.Persona[ iDPersona=" + iDPersona + " ]";
    }
    
}
