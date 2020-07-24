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
@Table(name = "registro_actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroActividad.findAll", query = "SELECT r FROM RegistroActividad r")
    , @NamedQuery(name = "RegistroActividad.findByIDRegistroActividad", query = "SELECT r FROM RegistroActividad r WHERE r.iDRegistroActividad = :iDRegistroActividad")
    , @NamedQuery(name = "RegistroActividad.findByHoraEntrada", query = "SELECT r FROM RegistroActividad r WHERE r.horaEntrada = :horaEntrada")
    , @NamedQuery(name = "RegistroActividad.findByHoraSalida", query = "SELECT r FROM RegistroActividad r WHERE r.horaSalida = :horaSalida")
    , @NamedQuery(name = "RegistroActividad.findByFecha", query = "SELECT r FROM RegistroActividad r WHERE r.fecha = :fecha")})
public class RegistroActividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_RegistroActividad")
    private String iDRegistroActividad;
    @Column(name = "Hora_Entrada")
    @Temporal(TemporalType.TIME)
    private Date horaEntrada;
    @Column(name = "Hora_Salida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "ID_Empresa", referencedColumnName = "ID_Empresa")
    @ManyToOne
    private Empresa iDEmpresa;
    @JoinColumn(name = "ID_Estudiante", referencedColumnName = "ID_Estudiante")
    @ManyToOne
    private Estudiante iDEstudiante;

    public RegistroActividad() {
    }

    public RegistroActividad(String iDRegistroActividad) {
        this.iDRegistroActividad = iDRegistroActividad;
    }

    public String getIDRegistroActividad() {
        return iDRegistroActividad;
    }

    public void setIDRegistroActividad(String iDRegistroActividad) {
        this.iDRegistroActividad = iDRegistroActividad;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empresa getIDEmpresa() {
        return iDEmpresa;
    }

    public void setIDEmpresa(Empresa iDEmpresa) {
        this.iDEmpresa = iDEmpresa;
    }

    public Estudiante getIDEstudiante() {
        return iDEstudiante;
    }

    public void setIDEstudiante(Estudiante iDEstudiante) {
        this.iDEstudiante = iDEstudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRegistroActividad != null ? iDRegistroActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroActividad)) {
            return false;
        }
        RegistroActividad other = (RegistroActividad) object;
        if ((this.iDRegistroActividad == null && other.iDRegistroActividad != null) || (this.iDRegistroActividad != null && !this.iDRegistroActividad.equals(other.iDRegistroActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.RegistroActividad[ iDRegistroActividad=" + iDRegistroActividad + " ]";
    }
    
}
