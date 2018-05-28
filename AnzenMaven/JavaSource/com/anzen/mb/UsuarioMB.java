package com.anzen.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.anzen.entities.RolUsuario;
import com.anzen.entities.Usuario;
import com.anzen.logic.RolControlador;
import com.anzen.logic.UsuarioControlador;

@SessionScoped
@ManagedBean (name = "usuarioMB")
public class UsuarioMB {

	//Atributos
	private String nombre, apellido, nombreC;
	private Usuario usuarioNuevo = new Usuario();
	private Usuario usuarioAModificar, usuarioAEliminar;
	private RolUsuario rol = new RolUsuario();
	private UsuarioControlador controlador = new UsuarioControlador();
	private RolControlador rolControlador = new RolControlador();
	private List<Usuario> listaUsuario;
	private List<RolUsuario> listaRoles;
	
	//Metodos
	
	//Instancia el usuario
	public String iniciarCreacionUsuario () {
		this.usuarioNuevo = new Usuario();
		return "";
	}
	
	//Crea un usuario
	public String crearUsuario() {
		//Asignar id
		this.usuarioNuevo.setIdAnzen(null);
		//Asignar nombre completo
		nombreC = nombre.concat(" " + apellido);
		this.usuarioNuevo.setNombreAnzen(nombreC);
		//Asignar un rol
		List<RolUsuario> roles = this.rolControlador.readRol();
		this.usuarioNuevo.setRolUsuario(roles.get(0));
		this.controlador.createUsuario(this.usuarioNuevo);
		return "";
	}
	
	//Modifica un Usuario
	public String actualizarUsuario() {
		this.controlador.updateUsuario(this.usuarioAModificar);
		return "";
	}
	
	//Elimina un usuario
	public String eliminarUsuario() {
		this.controlador.deleteUsuario(usuarioAEliminar);
		return "";
	}
	
	//Lista Usuarios
	public void consultarUsuario() {
		this.listaUsuario = this.controlador.readUsuarios();
	}
	
	//Getter's y Setter's
	public Usuario getUsuarioNuevo() {
		return usuarioNuevo;
	}

	public void setUsuarioNuevo(Usuario usuarioNuevo) {
		this.usuarioNuevo = usuarioNuevo;
	}

	public Usuario getUsuarioAModificar() {
		return usuarioAModificar;
	}

	public void setUsuarioAModificar(Usuario usuarioAModificar) {
		this.usuarioAModificar = usuarioAModificar;
	}

	public Usuario getUsuarioAEliminar() {
		return usuarioAEliminar;
	}

	public void setUsuarioAEliminar(Usuario usuarioAEliminar) {
		this.usuarioAEliminar = usuarioAEliminar;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	
	
	
}