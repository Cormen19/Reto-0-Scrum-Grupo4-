package reto0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


/*La funcion de esta clase sirve para realizar todas las consultas necesarias a la base de datos que va desde consultas para obtener los datos hasta 
 * modificaciones de el estado de las alarmas y calefaciones*/
public class Base_de_Datos {
	static Scanner teclado = new Scanner(System.in);
	final static String url = "jdbc:mysql://localhost:3306/reto0-scrum-grupo4";
	final static String Contra= "elorrieta";
	/*Recoge los datos de las calefacciones y las carga en memoria en un arraylist*/
	public static ArrayList<Calefaccion> cargarCalefacion(){
		 ArrayList<Calefaccion> calefaccion = new ArrayList<Calefaccion>();
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"admindam",Contra);
		
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * "
									+ "From calefaccion;");

			while(rs.next()) {	
				Calefaccion auxCalefaccion = new Calefaccion(rs.getInt("Id_Calefaccion"),rs.getBoolean("Encendido"));
				calefaccion.add(auxCalefaccion);
			}	
			s.close();
			rs.close();
			conn.close();
			
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return calefaccion;
		
	}
	/*Recoge los datos de las  alarmas y las carga en memoria en un arraylist*/
	public static ArrayList<AlarmadeIncendios> cargarAlarmasdeIncendios(){
		 ArrayList<AlarmadeIncendios> alarmadeIncendios = new ArrayList<AlarmadeIncendios>();
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"admindam",Contra);
		
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * "
									+ "From alarma_de_incendios;");

			while(rs.next()) {	
				AlarmadeIncendios auxAlarma = new AlarmadeIncendios(rs.getInt("Id_Alarma"),rs.getBoolean("Encendido"));
				alarmadeIncendios.add(auxAlarma);
							}	
			s.close();
			rs.close();
			conn.close();
			
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return alarmadeIncendios;
		
	}
	/*Esta funcion recibe una insert por parametro despues de haber validado y comprobado que el usuario no existe
	 * Y se guarda en la base de datos*/
	public static boolean registrarUsuario(String datos) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(url,"admindam",Contra);
			
				Statement s = conn.createStatement();
			
				s.executeUpdate(datos);
				
				s.close();
				
				conn.close();
			return true;
			}catch(SQLException sql) {
				System.out.println("Error al conectar a la base de datos ");
				return false;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}

	}
	/*Esta funcion sirve para el login 
	 * Verifica que el usuario este y coincida con la contrase??a 
	 * Si coinciden devulve true
	 * Sino devuelve false*/
	public static boolean usuarioValido(String nombre, String contrasenya) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"admindam",Contra);
		
			Statement s = conn.createStatement();
			String query=String.format("Select nombre,contrasena from usuario where nombre= '%s' and contrasena = '%s' ;",nombre,contrasenya);
			ResultSet rs = s.executeQuery(query);

			while(rs.next()) {	
			
				return true;
							}	
			s.close();
			rs.close();
			conn.close();
		
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	/*Verifica si en la base de datos hay algun usuario que tenga el mismo nombre y apellido que el que el de la persona que se intenta registrar si es asi
	 *devuelve true 
	 *Sino devuelve false*/
	public static boolean UsuarioExiste(String nombre, String apellido) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"admindam",Contra);
		
			Statement s = conn.createStatement();
			String query=String.format("Select nombre,contrasena from usuario where nombre= '%s' and apellido = '%s' ;",nombre,apellido);
			ResultSet rs = s.executeQuery(query);

			while(rs.next()) {	
			
				return true;
							}	
			s.close();
			rs.close();
			conn.close();
		
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return false;

	}
	
	
	/*Busca en la base de datos el ultimo usuario registro y devuelve ese numero +1 para pa creacion de otro usuario*/
	public static int consultar_Ultimo_Usuario(){
		int numero=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"admindam",Contra);
			Statement s = conn.createStatement();
			String query = ("Select max(Id_Usuario) "
							+ "From usuario ;");
			ResultSet rs = s.executeQuery(query);
			rs.next();
			try {
				numero=rs.getInt("max(Id_Usuario)");
			}catch(Exception e) {
				System.out.println("No hay Usuarios en la base de datos");
			}
			numero++;
			return numero;
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos");
		}catch(ClassNotFoundException e) {
			System.out.println("Error al conectar a la base de datos");
		}
		return numero;
	}

	/*Esta funcion sirve para  cambiar el estado de uno de los elementos de la base de datos
	 * Recibe un string que es el nombre del objeto al que se le va a cambiar el estado , el numero de registro que sea y true o false
	 * Y se guarda el cambio en la base de datos*/
	public static boolean CambioEstado(String query) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"admindam",Contra);
		
			Statement s = conn.createStatement();	 
			s.executeUpdate(query);
			
			s.close();
			conn.close();
		
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return false;
	}
	
}
