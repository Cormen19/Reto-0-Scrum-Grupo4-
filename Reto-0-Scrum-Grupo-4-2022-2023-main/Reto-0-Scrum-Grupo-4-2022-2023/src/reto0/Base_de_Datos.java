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
									+ "From aula;");
			System.out.println(rs);

			while(rs.next()) {	
				Calefaccion auxCalefaccion = new Calefaccion(rs.getInt("Id_Calefacion"),rs.getBoolean("Encendido"));
							}	
			s.close();
			rs.close();
			conn.close();
		
		}catch(SQLException sql) {
			System.out.println("Error al conectar a la base de datos ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
