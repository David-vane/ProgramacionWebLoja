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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "supervision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supervision.findAll", query = "SELECT s FROM Supervision s")
    , @NamedQuery(name = "Supervision.findByIDSupervision", query = "SELECT s FROM Supervision s WHERE s.iDSupervision = :iDSupervision")
    , @NamedQuery(name = "Supervision.findByFechaSupervision", query = "SELECT s FROM Supervision s WHERE s.fechaSupervision = :fechaSupervision")
    , @NamedQuery(name = "Supervision.findByObservaciones", query = "SELECT s FROM Supervision s WHERE s.observaciones = :observaciones")})
public class Supervision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Supervision")
    private String iDSupervision;
    @Column(name = "Fecha_Supervision")
    @Temporal(TemporalType.DATE)
    private Date fechaSupervision;
    @Size(max = 200)
    @Column(name = "Observaciones")
    private String observaciones;
    @JoinColumn(name = "ID_Persona", referencedColumnName = "ID_Persona")
    @ManyToOne
    private Persona iDPersona;
    @JoinColumn(name = "ID_Empresa", referencedColumnName = "ID_Empresa")
    @ManyToOne
    private Empresa iDEmpresa;

    public Supervision() {
    }

    public Supervision(String iDSupervision) {
        this.iDSupervision = iDSupervision;
    }

    public String getIDSupervision() {
        return iDSupervision;
    }

    public void setIDSupervision(String iDSupervision) {
        this.iDSupervision = iDSupervision;
    }

    public Date getFechaSupervision() {
        return fechaSupervision;
    }

    public void setFechaSupervision(Date fechaSupervision) {
        this.fechaSupervision = fechaSupervision;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Persona getIDPersona() {
        return iDPersona;
    }

    public void setIDPersona(Persona iDPersona) {
        this.iDPersona = iDPersona;
    }

    public Empresa getIDEmpresa() {
        return iDEmpresa;
    }

    public void setIDEmpresa(Empresa iDEmpresa) {
        this.iDEmpresa = iDEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSupervision != null ? iDSupervision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supervision)) {
            return false;
        }
        Supervision other = (Supervision) object;
        if ((this.iDSupervision == null && other.iDSupervision != null) || (this.iDSupervision != null && !this.iDSupervision.equals(other.iDSupervision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.Supervision[ iDSupervision=" + iDSupervision + " ]";
    }
    
}
