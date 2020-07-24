/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Robin
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findByIDEmpresa", query = "SELECT e FROM Empresa e WHERE e.iDEmpresa = :iDEmpresa")
    , @NamedQuery(name = "Empresa.findByNombreEmpresa", query = "SELECT e FROM Empresa e WHERE e.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Empresa.findByTipoEmpresa", query = "SELECT e FROM Empresa e WHERE e.tipoEmpresa = :tipoEmpresa")
    , @NamedQuery(name = "Empresa.findByNumRuc", query = "SELECT e FROM Empresa e WHERE e.numRuc = :numRuc")
    , @NamedQuery(name = "Empresa.findByActividadEconomica", query = "SELECT e FROM Empresa e WHERE e.actividadEconomica = :actividadEconomica")
    , @NamedQuery(name = "Empresa.findByNumeroEstudiantes", query = "SELECT e FROM Empresa e WHERE e.numeroEstudiantes = :numeroEstudiantes")
    , @NamedQuery(name = "Empresa.findByEmailEmpresa", query = "SELECT e FROM Empresa e WHERE e.emailEmpresa = :emailEmpresa")
    , @NamedQuery(name = "Empresa.findByNumContacto", query = "SELECT e FROM Empresa e WHERE e.numContacto = :numContacto")
    , @NamedQuery(name = "Empresa.findByDocAdjuntos", query = "SELECT e FROM Empresa e WHERE e.docAdjuntos = :docAdjuntos")
    , @NamedQuery(name = "Empresa.findByNumConvenio", query = "SELECT e FROM Empresa e WHERE e.numConvenio = :numConvenio")
    , @NamedQuery(name = "Empresa.findByNumInforme", query = "SELECT e FROM Empresa e WHERE e.numInforme = :numInforme")
    , @NamedQuery(name = "Empresa.findByHorarioAtencion", query = "SELECT e FROM Empresa e WHERE e.horarioAtencion = :horarioAtencion")
    , @NamedQuery(name = "Empresa.findByFirmaConvenio", query = "SELECT e FROM Empresa e WHERE e.firmaConvenio = :firmaConvenio")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Empresa")
    private String iDEmpresa;
    @Size(max = 15)
    @Column(name = "Nombre_Empresa")
    private String nombreEmpresa;
    @Size(max = 25)
    @Column(name = "Tipo_Empresa")
    private String tipoEmpresa;
    @Column(name = "Num_Ruc")
    private Integer numRuc;
    @Size(max = 50)
    @Column(name = "Actividad_Economica")
    private String actividadEconomica;
    @Column(name = "Numero_Estudiantes")
    private Integer numeroEstudiantes;
    @Size(max = 50)
    @Column(name = "Email_Empresa")
    private String emailEmpresa;
    @Size(max = 10)
    @Column(name = "Num_Contacto")
    private String numContacto;
    @Size(max = 100)
    @Column(name = "Doc_Adjuntos")
    private String docAdjuntos;
    @Column(name = "Num_Convenio")
    private Integer numConvenio;
    @Column(name = "Num_Informe")
    private Integer numInforme;
    @Column(name = "Horario_Atencion")
    @Temporal(TemporalType.TIME)
    private Date horarioAtencion;
    @Size(max = 15)
    @Column(name = "Firma_Convenio")
    private String firmaConvenio;
    @OneToMany(mappedBy = "iDEmpresa")
    private Collection<RegistroActividad> registroActividadCollection;
    @OneToMany(mappedBy = "iDEmpresa")
    private Collection<Supervision> supervisionCollection;
    @JoinColumn(name = "ID_Persona", referencedColumnName = "ID_Persona")
    @ManyToOne
    private Persona iDPersona;
    @OneToMany(mappedBy = "iDEmpresa")
    private Collection<DireccionEmpresa> direccionEmpresaCollection;

    public Empresa() {
    }

    public Empresa(String iDEmpresa) {
        this.iDEmpresa = iDEmpresa;
    }

    public String getIDEmpresa() {
        return iDEmpresa;
    }

    public void setIDEmpresa(String iDEmpresa) {
        this.iDEmpresa = iDEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public Integer getNumRuc() {
        return numRuc;
    }

    public void setNumRuc(Integer numRuc) {
        this.numRuc = numRuc;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
    }

    public Integer getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(Integer numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    public String getDocAdjuntos() {
        return docAdjuntos;
    }

    public void setDocAdjuntos(String docAdjuntos) {
        this.docAdjuntos = docAdjuntos;
    }

    public Integer getNumConvenio() {
        return numConvenio;
    }

    public void setNumConvenio(Integer numConvenio) {
        this.numConvenio = numConvenio;
    }

    public Integer getNumInforme() {
        return numInforme;
    }

    public void setNumInforme(Integer numInforme) {
        this.numInforme = numInforme;
    }

    public Date getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(Date horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getFirmaConvenio() {
        return firmaConvenio;
    }

    public void setFirmaConvenio(String firmaConvenio) {
        this.firmaConvenio = firmaConvenio;
    }

    @XmlTransient
    public Collection<RegistroActividad> getRegistroActividadCollection() {
        return registroActividadCollection;
    }

    public void setRegistroActividadCollection(Collection<RegistroActividad> registroActividadCollection) {
        this.registroActividadCollection = registroActividadCollection;
    }

    @XmlTransient
    public Collection<Supervision> getSupervisionCollection() {
        return supervisionCollection;
    }

    public void setSupervisionCollection(Collection<Supervision> supervisionCollection) {
        this.supervisionCollection = supervisionCollection;
    }

    public Persona getIDPersona() {
        return iDPersona;
    }

    public void setIDPersona(Persona iDPersona) {
        this.iDPersona = iDPersona;
    }

    @XmlTransient
    public Collection<DireccionEmpresa> getDireccionEmpresaCollection() {
        return direccionEmpresaCollection;
    }

    public void setDireccionEmpresaCollection(Collection<DireccionEmpresa> direccionEmpresaCollection) {
        this.direccionEmpresaCollection = direccionEmpresaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEmpresa != null ? iDEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.iDEmpresa == null && other.iDEmpresa != null) || (this.iDEmpresa != null && !this.iDEmpresa.equals(other.iDEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.Empresa[ iDEmpresa=" + iDEmpresa + " ]";
    }
    
}
