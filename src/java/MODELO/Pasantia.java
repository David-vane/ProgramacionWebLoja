/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Robin
 */
@Entity
@Table(name = "pasantia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasantia.findAll", query = "SELECT p FROM Pasantia p")
    , @NamedQuery(name = "Pasantia.findByIDPasantia", query = "SELECT p FROM Pasantia p WHERE p.iDPasantia = :iDPasantia")
    , @NamedQuery(name = "Pasantia.findByIDEmpresa", query = "SELECT p FROM Pasantia p WHERE p.iDEmpresa = :iDEmpresa")
    , @NamedQuery(name = "Pasantia.findByIDEstudiante", query = "SELECT p FROM Pasantia p WHERE p.iDEstudiante = :iDEstudiante")
    , @NamedQuery(name = "Pasantia.findByFechaInicio", query = "SELECT p FROM Pasantia p WHERE p.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Pasantia.findByFechaFinal", query = "SELECT p FROM Pasantia p WHERE p.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "Pasantia.findByIncidencias", query = "SELECT p FROM Pasantia p WHERE p.incidencias = :incidencias")
    , @NamedQuery(name = "Pasantia.findByADDesempe\u00f1o", query = "SELECT p FROM Pasantia p WHERE p.aDDesempe\u00f1o = :aDDesempe\u00f1o")})
public class Pasantia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Pasantia")
    private String iDPasantia;
    @Size(max = 10)
    @Column(name = "ID_Empresa")
    private String iDEmpresa;
    @Size(max = 10)
    @Column(name = "ID_Estudiante")
    private String iDEstudiante;
    @Column(name = "Fecha_Inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "Fecha_Final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Size(max = 100)
    @Column(name = "Incidencias")
    private String incidencias;
    @Size(max = 100)
    @Column(name = "AD_Desempe\u00f1o")
    private String aDDesempeño;

    public Pasantia() {
    }

    public Pasantia(String iDPasantia) {
        this.iDPasantia = iDPasantia;
    }

    public String getIDPasantia() {
        return iDPasantia;
    }

    public void setIDPasantia(String iDPasantia) {
        this.iDPasantia = iDPasantia;
    }

    public String getIDEmpresa() {
        return iDEmpresa;
    }

    public void setIDEmpresa(String iDEmpresa) {
        this.iDEmpresa = iDEmpresa;
    }

    public String getIDEstudiante() {
        return iDEstudiante;
    }

    public void setIDEstudiante(String iDEstudiante) {
        this.iDEstudiante = iDEstudiante;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public String getADDesempeño() {
        return aDDesempeño;
    }

    public void setADDesempeño(String aDDesempeño) {
        this.aDDesempeño = aDDesempeño;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPasantia != null ? iDPasantia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasantia)) {
            return false;
        }
        Pasantia other = (Pasantia) object;
        if ((this.iDPasantia == null && other.iDPasantia != null) || (this.iDPasantia != null && !this.iDPasantia.equals(other.iDPasantia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.Pasantia[ iDPasantia=" + iDPasantia + " ]";
    }
    
}
