package com.manolito.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS", schema="PROYECTO")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAS", unique=true, nullable=false)
	private int das;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="APELLIDO")
	private String apellido;
	
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@Column(name="ROL", nullable=false)
	private String rol;
	
	@Column(name="PASSCAMBIADA", nullable=false)
	private String passcambiada="N";

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the das
	 */
	public int getDas() {
		return das;
	}

	/**
	 * @param das the das to set
	 */
	public void setDas(int das) {
		this.das = das;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rol
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * @return the passcambiada
	 */
	public String getPasscambiada() {
		return passcambiada;
	}

	/**
	 * @param passcambiada the passcambiada to set
	 */
	public void setPasscambiada(String passcambiada) {
		this.passcambiada = passcambiada;
	}


	
	

}
