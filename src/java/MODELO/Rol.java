/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Robin
 */
@Entity
@Table(name = "rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
    , @NamedQuery(name = "Rol.findByIDRol", query = "SELECT r FROM Rol r WHERE r.iDRol = :iDRol")
    , @NamedQuery(name = "Rol.findByCoordPracticas", query = "SELECT r FROM Rol r WHERE r.coordPracticas = :coordPracticas")
    , @NamedQuery(name = "Rol.findByCoordCarreras", query = "SELECT r FROM Rol r WHERE r.coordCarreras = :coordCarreras")
    , @NamedQuery(name = "Rol.findByTutorCarrera", query = "SELECT r FROM Rol r WHERE r.tutorCarrera = :tutorCarrera")
    , @NamedQuery(name = "Rol.findByCoordEmpresa", query = "SELECT r FROM Rol r WHERE r.coordEmpresa = :coordEmpresa")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Rol")
    private String iDRol;
    @Size(max = 20)
    @Column(name = "Coord_Practicas")
    private String coordPracticas;
    @Size(max = 20)
    @Column(name = "Coord_Carreras")
    private String coordCarreras;
    @Size(max = 20)
    @Column(name = "Tutor_Carrera")
    private String tutorCarrera;
    @Size(max = 20)
    @Column(name = "Coord_Empresa")
    private String coordEmpresa;
    @JoinColumn(name = "ID_Persona", referencedColumnName = "ID_Persona")
    @ManyToOne
    private Persona iDPersona;

    public Rol() {
    }

    public Rol(String iDRol) {
        this.iDRol = iDRol;
    }

    public String getIDRol() {
        return iDRol;
    }

    public void setIDRol(String iDRol) {
        this.iDRol = iDRol;
    }

    public String getCoordPracticas() {
        return coordPracticas;
    }

    public void setCoordPracticas(String coordPracticas) {
        this.coordPracticas = coordPracticas;
    }

    public String getCoordCarreras() {
        return coordCarreras;
    }

    public void setCoordCarreras(String coordCarreras) {
        this.coordCarreras = coordCarreras;
    }

    public String getTutorCarrera() {
        return tutorCarrera;
    }

    public void setTutorCarrera(String tutorCarrera) {
        this.tutorCarrera = tutorCarrera;
    }

    public String getCoordEmpresa() {
        return coordEmpresa;
    }

    public void setCoordEmpresa(String coordEmpresa) {
        this.coordEmpresa = coordEmpresa;
    }

    public Persona getIDPersona() {
        return iDPersona;
    }

    public void setIDPersona(Persona iDPersona) {
        this.iDPersona = iDPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRol != null ? iDRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.iDRol == null && other.iDRol != null) || (this.iDRol != null && !this.iDRol.equals(other.iDRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.Rol[ iDRol=" + iDRol + " ]";
    }
    
}
