package reto0;


public class Usuario {

	private int Idusuari;
	
	private String nombre;
	
	private String apellido;
	
	public enum Permisos {
		Profesor,
		Alumno,
		Bedel,
		Seguridad
	}
	private Permisos rol ;
	

	private String correo;
	
	private String contrasenya;


	
	
	public Usuario(int Idusuari, String nombre, String apellidos, Permisos rol, String correo, String contrasenya) {
		
		this.Idusuari = Idusuari;
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
		return Idusuari;
		
	}


	public void setIdUsuari(int Idusuari) {
		this.Idusuari = Idusuari;
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
		return "insert into usuario values("+String.valueOf(Idusuari)+",'"+this.nombre+"','"+this.apellido+"','"+String.valueOf(this.rol)+"','"+this.correo+"','"+this.contrasenya+"');";
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
