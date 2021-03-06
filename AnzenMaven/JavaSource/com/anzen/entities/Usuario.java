package com.anzen.entities;
// Generated 27/05/2018 10:52:29 PM by Hibernate Tools 5.2.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "anzenjsf", uniqueConstraints = { @UniqueConstraint(columnNames = "correo_anzen"),
		@UniqueConstraint(columnNames = "nombre_anzen") })
public class Usuario implements java.io.Serializable {

	private Integer idAnzen;
	private RolUsuario rolUsuario;
	private String nombreAnzen;
	private String correoAnzen;
	private String claveAnzen;
	private Boolean notificacionesAnzen;

	public Usuario() {
	}

	public Usuario(RolUsuario rolUsuario, String nombreAnzen, String correoAnzen, String claveAnzen,
			Boolean notificacionesAnzen) {
		this.rolUsuario = rolUsuario;
		this.nombreAnzen = nombreAnzen;
		this.correoAnzen = correoAnzen;
		this.claveAnzen = claveAnzen;
		this.notificacionesAnzen = notificacionesAnzen;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_anzen", unique = true, nullable = false)
	public Integer getIdAnzen() {
		return this.idAnzen;
	}

	public void setIdAnzen(Integer idAnzen) {
		this.idAnzen = idAnzen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol_anzen")
	public RolUsuario getRolUsuario() {
		return this.rolUsuario;
	}

	public void setRolUsuario(RolUsuario rolUsuario) {
		this.rolUsuario = rolUsuario;
	}

	@Column(name = "nombre_anzen", unique = true, length = 150)
	public String getNombreAnzen() {
		return this.nombreAnzen;
	}

	public void setNombreAnzen(String nombreAnzen) {
		this.nombreAnzen = nombreAnzen;
	}

	@Column(name = "correo_anzen", unique = true, length = 150)
	public String getCorreoAnzen() {
		return this.correoAnzen;
	}

	public void setCorreoAnzen(String correoAnzen) {
		this.correoAnzen = correoAnzen;
	}

	@Column(name = "clave_anzen", length = 50)
	public String getClaveAnzen() {
		return this.claveAnzen;
	}

	public void setClaveAnzen(String claveAnzen) {
		this.claveAnzen = claveAnzen;
	}

	@Column(name = "notificaciones_anzen")
	public Boolean getNotificacionesAnzen() {
		return this.notificacionesAnzen;
	}

	public void setNotificacionesAnzen(Boolean notificacionesAnzen) {
		this.notificacionesAnzen = notificacionesAnzen;
	}

}
