package reto0;

public class AlarmadeIncendios {
	private int idCal;
	private boolean encendido;
	public AlarmadeIncendios(int idCal,boolean encendido) {
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


