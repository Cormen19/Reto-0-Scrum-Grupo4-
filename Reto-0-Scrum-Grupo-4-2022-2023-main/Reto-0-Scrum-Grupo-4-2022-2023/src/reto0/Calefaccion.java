package reto0;

public class Calefaccion {

	private int idCal;
	private boolean encendido;
	public Calefaccion(int idCal,boolean encendido) {
	   this.encendido=encendido;
		this.idCal= 0;
		
	}
	
	public int getIdCal() {
		return idCal;
		
	}
	
	public void setIdCal(int idCal) {
		this.idCal=idCal;
	}
	
	public boolean getEncendido() {
		return encendido;
		
	}
	
	public void setEncendido(boolean encendido) {
		this.encendido=encendido;
	}
}
