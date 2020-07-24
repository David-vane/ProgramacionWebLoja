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
@Table(name = "direccion_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DireccionEmpresa.findAll", query = "SELECT d FROM DireccionEmpresa d")
    , @NamedQuery(name = "DireccionEmpresa.findByIDDireccionEmpresa", query = "SELECT d FROM DireccionEmpresa d WHERE d.iDDireccionEmpresa = :iDDireccionEmpresa")
    , @NamedQuery(name = "DireccionEmpresa.findByProvincia", query = "SELECT d FROM DireccionEmpresa d WHERE d.provincia = :provincia")
    , @NamedQuery(name = "DireccionEmpresa.findByCanton", query = "SELECT d FROM DireccionEmpresa d WHERE d.canton = :canton")
    , @NamedQuery(name = "DireccionEmpresa.findByDireccion", query = "SELECT d FROM DireccionEmpresa d WHERE d.direccion = :direccion")})
public class DireccionEmpresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Direccion_Empresa")
    private String iDDireccionEmpresa;
    @Size(max = 20)
    @Column(name = "Provincia")
    private String provincia;
    @Size(max = 20)
    @Column(name = "Canton")
    private String canton;
    @Size(max = 30)
    @Column(name = "Direccion")
    private String direccion;
    @JoinColumn(name = "ID_Empresa", referencedColumnName = "ID_Empresa")
    @ManyToOne
    private Empresa iDEmpresa;

    public DireccionEmpresa() {
    }

    public DireccionEmpresa(String iDDireccionEmpresa) {
        this.iDDireccionEmpresa = iDDireccionEmpresa;
    }

    public String getIDDireccionEmpresa() {
        return iDDireccionEmpresa;
    }

    public void setIDDireccionEmpresa(String iDDireccionEmpresa) {
        this.iDDireccionEmpresa = iDDireccionEmpresa;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        hash += (iDDireccionEmpresa != null ? iDDireccionEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DireccionEmpresa)) {
            return false;
        }
        DireccionEmpresa other = (DireccionEmpresa) object;
        if ((this.iDDireccionEmpresa == null && other.iDDireccionEmpresa != null) || (this.iDDireccionEmpresa != null && !this.iDDireccionEmpresa.equals(other.iDDireccionEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.DireccionEmpresa[ iDDireccionEmpresa=" + iDDireccionEmpresa + " ]";
    }
    
}
