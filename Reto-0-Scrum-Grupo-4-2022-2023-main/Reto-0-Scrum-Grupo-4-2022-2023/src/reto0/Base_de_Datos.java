package reto0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;



public class Base_de_Datos {
	static Scanner teclado = new Scanner(System.in);
	final static String url = "jdbc:mysql://localhost:33060/reto0-scrum-grupo4";
	final static String Contra= "1234";
	
//	public static   ArrayList<Aula> aulas() throws ClassNotFoundException {
//		 ArrayList<Aula> aula = new ArrayList<Aula>();
//		 
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn = DriverManager.getConnection(url,"root",Contra);
//		
//			Statement s = conn.createStatement();
//			ResultSet rs = s.executeQuery("Select * "
//									+ "From aula;");
//			System.out.println(rs);
//
//			while(rs.next()) {	
//				Aula aux = new Aula();
//							}	
//			s.close();
//			rs.close();
//			conn.close();
//		
//		}catch(SQLException sql) {
//			System.out.println("Error al conectar a la base de datos ");
//		}
//		return null;
//		
//	}
	public static ArrayList<Calefaccion> cargarCalefacion(){
		 ArrayList<Calefaccion> calefaccion = new ArrayList<Calefaccion>();
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
		
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
	
	public static ArrayList<AlarmadeIncendios> cargarAlarmasdeIncendios(){
		 ArrayList<AlarmadeIncendios> alarmadeIncendios = new ArrayList<AlarmadeIncendios>();
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
		
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

	public static boolean registrarUsuario(String datos) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(url,"root",Contra);
			
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

	public static boolean usuarioValido(String nombre, String contrasenya) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
		
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

	public static boolean UsuarioExiste(String nombre, String apellido) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
		
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
	
	
	
	public static int consultar_Ultimo_Usuario(){
		int numero=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
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

	public static boolean CambioEstado(String string ,int indice, boolean b) {
		String query= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
		
			Statement s = conn.createStatement();
			if(string.equals("alarma")) {
				query=String.format("Update Alarma_de_incendios set Encendido = %b where Id_Alarma = '%d' ;",b,indice+1);
			}else if(string.equals("calefaccion")) {
				query=String.format("Update Calefaccion set Encendido = %b where Id_Calefaccion = '%d' ;",b,indice+1);
			}
			 
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
	

	public static void EncenderoApagarTodo(String string,boolean b) {
		String query = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root",Contra);
		
			Statement s = conn.createStatement();
			if(string.equals("alarma")) {
				query =String.format("Update Alarma_de_Incendios set Encendido = %b ;",b);
			}else if(string.equals("calefaccion")){
				query =String.format("Update Calefaccion set Encendido = %b ;",b);
			}
		
			s.executeUpdate(query);
			
			s.close();
			conn.close();
		
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
	}
}
