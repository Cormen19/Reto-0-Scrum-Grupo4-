package reto0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Usuario {

	private int idUsuari;
	
	private String nombre;
	
	private String apellido;
	
	public enum Permisos {
		/** Empleado */
		Profesor,
		/**Administrador */
		ADMINISTRADOR
	}
	private Permisos rol ;
	

	private String correo;
	
	private String contrasenya;


	
	
	public Usuario(int idUsuari, String nombre, String apellidos, Permisos rol, String correo, String contrasenya) {
		
		this.idUsuari = idUsuari;
		this.nombre = nombre;
		this.apellido = apellidos;
		this.rol = rol;
		this.correo = correo;
		this.contrasenya = contrasenya;
	}
	
	public Usuario(String nombre,String contrasenya) {
		this.nombre = nombre;
		this.contrasenya = contrasenya;
	}


	public int getIdUsuari() {
		return idUsuari;
		
	}


	public void setIdUsuari(int idUsuari) {
		this.idUsuari = idUsuari;
	}


	public Permisos getRol() {
		return rol;
	}


	public void setRol(Permisos rol) {
		this.rol = rol;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getContrasenya() {
		return contrasenya;
	}


	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}


	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getApellidos() {
		return apellido;
	}

	
	public void setApellidos(String apellidos) {
		this.apellido = apellidos;
	}

	public Permisos getFuncion() {
		return rol;
	}

	public void setFuncion(Permisos funcion) {
		this.rol = funcion;
		
	}

	

	
	@Override
	public String toString() {
		return "insert into usuario values("+String.valueOf(idUsuari)+",'"+this.nombre+"','"+this.apellido+"','"+String.valueOf(this.rol)+"','"+this.correo+"','"+this.contrasenya+"');";
	}


	public boolean login() {
		if(contrasenya.equals("") || nombre.equals("")) {
			return false;
		}
		
		return Base_de_Datos.usuarioValido(this.nombre,this.contrasenya);
	}

	/* Mirar como conectar esto con la base de datos usuarios
	 * Funciona*/
	public boolean registrarse() {
	
		if ( String.valueOf(rol).equals("")||correo.equals("")||contrasenya.equals("") || nombre.equals("") || apellido.equals("")  ) {
			return false;
		}
		
		
		return Base_de_Datos.registrarUsuario(this.toString());
	}

	
	public boolean registrado(){
		return Base_de_Datos.UsuarioExiste(this.nombre,this.apellido);
	}
}
