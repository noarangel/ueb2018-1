package com.anzen.entities;
// Generated 27/05/2018 10:52:29 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RolUsuario generated by hbm2java
 */
@Entity
@Table(name = "rol_usuario", catalog = "anzenjsf")
public class RolUsuario implements java.io.Serializable {

	private int id;
	private String tipoRol;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public RolUsuario() {
	}

	public RolUsuario(int id) {
		this.id = id;
	}

	public RolUsuario(int id, String tipoRol, Set<Usuario> usuarios) {
		this.id = id;
		this.tipoRol = tipoRol;
		this.usuarios = usuarios;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "tipo_rol", length = 50)
	public String getTipoRol() {
		return this.tipoRol;
	}

	public void setTipoRol(String tipoRol) {
		this.tipoRol = tipoRol;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rolUsuario")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}