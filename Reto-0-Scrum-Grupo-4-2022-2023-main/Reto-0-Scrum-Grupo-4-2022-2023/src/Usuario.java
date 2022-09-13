
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Usuario {

	
	private String usuario;

	private String contraseña;

	private String nombre;
	
	private String apellidos;
	

	private Permisos funcion;

	
	public Usuario() {
		this.usuario = "";
		this.contraseña = "";
		this.nombre = "";
		this.apellidos = "";
		this.funcion = funcion.EMPLEADO;
	}


	public Usuario(String usuario, String contraseña, String nombre, String apellidos,
			Permisos funcion) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
		this.funcion = funcion;
	}


	public String getLogin() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getIzena() {
		return nombre;
	}

	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getApellidos() {
		return apellidos;
	}

	
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Permisos getFuntzioa() {
		return funcion;
	}

	public void setfuncion(Permisos funcion) {
		this.funcion = funcion;
	}

	@Override
	public String toString() {
		return usuario + ";" + contraseña + ";" + nombre + ";" + apellidos + ";" + funcion + "\n";
	}

	
	public boolean login() {
		File file = new File("datuak/erabiltzaileak.csv");
		try (Scanner sc = new Scanner(file)){
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(";");
				if (data[0].equals(usuario) && data[1].equals(contraseña)) {
					this.nombre = data[2];
					this.apellidos = data[3];
					;
					this.funcion = funcion.valueOf(data[4]);
					return true;
				} else if (data[0].equals(usuario) && !data[1].equals(contraseña)) {
					return false;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	/* Mirar como conectar esto con la base de datos usuarios*/
	public boolean registrarse() {
		if (usuario.equals("") || contraseña.equals("") || nombre.equals("") || apellidos.equals("")  || registrado()) {
			return false;
		}
		File file = new File("datuak/erabiltzaileak.csv");
		try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
			pw.print(this.toString());
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public boolean registrado(){
		File file = new File("datuak/erabiltzaileak.csv");
		if (!file.exists()) {
			return false;
		}
		try (Scanner sc = new Scanner(file)){
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] data = line.split(";");
				if (data[0].equals(usuario)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
}
