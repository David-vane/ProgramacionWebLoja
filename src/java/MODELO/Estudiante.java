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
@Table(name = "estudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e")
    , @NamedQuery(name = "Estudiante.findByIDEstudiante", query = "SELECT e FROM Estudiante e WHERE e.iDEstudiante = :iDEstudiante")
    , @NamedQuery(name = "Estudiante.findByCedula", query = "SELECT e FROM Estudiante e WHERE e.cedula = :cedula")
    , @NamedQuery(name = "Estudiante.findByNombres", query = "SELECT e FROM Estudiante e WHERE e.nombres = :nombres")
    , @NamedQuery(name = "Estudiante.findByApellidos", query = "SELECT e FROM Estudiante e WHERE e.apellidos = :apellidos")
    , @NamedQuery(name = "Estudiante.findByFechaNacimiento", query = "SELECT e FROM Estudiante e WHERE e.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Estudiante.findByCelular", query = "SELECT e FROM Estudiante e WHERE e.celular = :celular")
    , @NamedQuery(name = "Estudiante.findByCorreo", query = "SELECT e FROM Estudiante e WHERE e.correo = :correo")
    , @NamedQuery(name = "Estudiante.findByDireccion", query = "SELECT e FROM Estudiante e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Estudiante.findByCiclo", query = "SELECT e FROM Estudiante e WHERE e.ciclo = :ciclo")
    , @NamedQuery(name = "Estudiante.findByParalelo", query = "SELECT e FROM Estudiante e WHERE e.paralelo = :paralelo")
    , @NamedQuery(name = "Estudiante.findByExtension", query = "SELECT e FROM Estudiante e WHERE e.extension = :extension")
    , @NamedQuery(name = "Estudiante.findByAfinidades", query = "SELECT e FROM Estudiante e WHERE e.afinidades = :afinidades")
    , @NamedQuery(name = "Estudiante.findByDiscapacidad", query = "SELECT e FROM Estudiante e WHERE e.discapacidad = :discapacidad")
    , @NamedQuery(name = "Estudiante.findByNumEmergencia", query = "SELECT e FROM Estudiante e WHERE e.numEmergencia = :numEmergencia")})
public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_Estudiante")
    private String iDEstudiante;
    @Size(max = 10)
    @Column(name = "Cedula")
    private String cedula;
    @Size(max = 25)
    @Column(name = "Nombres")
    private String nombres;
    @Size(max = 25)
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "Fecha_Nacimiento")
    @Temporal(TemporalType.TIME)
    private Date fechaNacimiento;
    @Size(max = 10)
    @Column(name = "Celular")
    private String celular;
    @Size(max = 45)
    @Column(name = "Correo")
    private String correo;
    @Size(max = 55)
    @Column(name = "Direccion")
    private String direccion;
    @Size(max = 10)
    @Column(name = "Ciclo")
    private String ciclo;
    @Size(max = 10)
    @Column(name = "Paralelo")
    private String paralelo;
    @Size(max = 10)
    @Column(name = "Extension")
    private String extension;
    @Size(max = 20)
    @Column(name = "Afinidades")
    private String afinidades;
    @Column(name = "Discapacidad")
    private Integer discapacidad;
    @Size(max = 10)
    @Column(name = "Num_Emergencia")
    private String numEmergencia;
    @JoinColumn(name = "ID_Carrera", referencedColumnName = "ID_Carrera")
    @ManyToOne
    private Carrera iDCarrera;
    @OneToMany(mappedBy = "iDEstudiante")
    private Collection<RegistroActividad> registroActividadCollection;

    public Estudiante() {
    }

    public Estudiante(String iDEstudiante) {
        this.iDEstudiante = iDEstudiante;
    }

    public String getIDEstudiante() {
        return iDEstudiante;
    }

    public void setIDEstudiante(String iDEstudiante) {
        this.iDEstudiante = iDEstudiante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getAfinidades() {
        return afinidades;
    }

    public void setAfinidades(String afinidades) {
        this.afinidades = afinidades;
    }

    public Integer getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Integer discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getNumEmergencia() {
        return numEmergencia;
    }

    public void setNumEmergencia(String numEmergencia) {
        this.numEmergencia = numEmergencia;
    }

    public Carrera getIDCarrera() {
        return iDCarrera;
    }

    public void setIDCarrera(Carrera iDCarrera) {
        this.iDCarrera = iDCarrera;
    }

    @XmlTransient
    public Collection<RegistroActividad> getRegistroActividadCollection() {
        return registroActividadCollection;
    }

    public void setRegistroActividadCollection(Collection<RegistroActividad> registroActividadCollection) {
        this.registroActividadCollection = registroActividadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEstudiante != null ? iDEstudiante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.iDEstudiante == null && other.iDEstudiante != null) || (this.iDEstudiante != null && !this.iDEstudiante.equals(other.iDEstudiante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MODELO.Estudiante[ iDEstudiante=" + iDEstudiante + " ]";
    }
    
}
