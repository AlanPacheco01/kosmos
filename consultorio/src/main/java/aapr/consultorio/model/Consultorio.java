package aapr.consultorio.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Clínica")
public class Consultorio {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_clínica")
private Long id;

@Column(name="Nombre_Doctor", length=120, nullable=false, unique=false)
private String nombreDoctor;

@Column(name="Apellido_Paterno_Doctor", length=120, nullable=false, unique=false)
private String aPaternoDoctor;

@Column(name="Apellido_Materno_Doctor", length=120, nullable=false, unique=false)
private String aMaternoDoctor;

@Column(name="Especialidad_Doctor", length=120, nullable=false, unique=false)
private String especialidad;

@Column(name="Consultorio", length=120, nullable=false, unique=true)
private Integer numConsultorio;

@Column(name="Piso", length=120, nullable=false, unique=false)
private Integer piso;

@Column(name="Hora_Cita", length=120, nullable=false, unique=true)
private Integer horaCita;

@Column(name="Nombre_Paciente", length=120, nullable=false, unique=false)
private String nombrePaciente;

public Consultorio() {
	
}

public Consultorio(Long id, String nombreDoctor, String aPaternoDoctor, String aMaternoDoctor, String especialidad,
		Integer numConsultorio, Integer piso, Integer horaCita, String nombrePaciente) {
	super();
	this.id = id;
	this.nombreDoctor = nombreDoctor;
	this.aPaternoDoctor = aPaternoDoctor;
	this.aMaternoDoctor = aMaternoDoctor;
	this.especialidad = especialidad;
	this.numConsultorio = numConsultorio;
	this.piso = piso;
	this.horaCita = horaCita;
	this.nombrePaciente = nombrePaciente;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombreDoctor() {
	return nombreDoctor;
}

public void setNombreDoctor(String nombreDoctor) {
	this.nombreDoctor = nombreDoctor;
}

public String getaPaternoDoctor() {
	return aPaternoDoctor;
}

public void setaPaternoDoctor(String aPaternoDoctor) {
	this.aPaternoDoctor = aPaternoDoctor;
}

public String getaMaternoDoctor() {
	return aMaternoDoctor;
}

public void setaMaternoDoctor(String aMaternoDoctor) {
	this.aMaternoDoctor = aMaternoDoctor;
}

public String getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

public Integer getNumConsultorio() {
	return numConsultorio;
}

public void setNumConsultorio(Integer numConsultorio) {
	this.numConsultorio = numConsultorio;
}

public Integer getPiso() {
	return piso;
}

public void setPiso(Integer piso) {
	this.piso = piso;
}

public Integer getHoraCita() {
	return horaCita;
}

public void setHoraCita(Integer horaCita) {
	this.horaCita = horaCita;
}

public String getNombrePaciente() {
	return nombrePaciente;
}

public void setNombrePaciente(String nombrePaciente) {
	this.nombrePaciente = nombrePaciente;
}

@Override
public String toString() {
	return "Consultorio [id=" + id + ", nombreDoctor=" + nombreDoctor + ", aPaternoDoctor=" + aPaternoDoctor
			+ ", aMaternoDoctor=" + aMaternoDoctor + ", especialidad=" + especialidad + ", numConsultorio="
			+ numConsultorio + ", piso=" + piso + ", horaCita=" + horaCita + ", nombrePaciente=" + nombrePaciente + "]";
}

@Override
public int hashCode() {
	return Objects.hash(aMaternoDoctor, aPaternoDoctor, especialidad, horaCita, id, nombreDoctor, nombrePaciente,
			numConsultorio, piso);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Consultorio other = (Consultorio) obj;
	return Objects.equals(aMaternoDoctor, other.aMaternoDoctor) && Objects.equals(aPaternoDoctor, other.aPaternoDoctor)
			&& Objects.equals(especialidad, other.especialidad) && Objects.equals(horaCita, other.horaCita)
			&& Objects.equals(id, other.id) && Objects.equals(nombreDoctor, other.nombreDoctor)
			&& Objects.equals(nombrePaciente, other.nombrePaciente)
			&& Objects.equals(numConsultorio, other.numConsultorio) && Objects.equals(piso, other.piso);
}


}
