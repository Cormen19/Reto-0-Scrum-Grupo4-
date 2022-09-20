package reto0;

public class AlarmadeIncendios {
	private int idCal;
	private boolean encendido;
	public AlarmadeIncendios(int idCal,boolean encendido) {
	    this.encendido=encendido;
		this.idCal= idCal;
		
	}
	
	public int getIdCal() {
		return idCal;
		
	}
	
	
	public boolean getEncendido() {
		return encendido;
		
	}
	
	public void setEncendido(boolean encendido) {
		if(this.encendido!=encendido) {
			this.encendido=encendido;
			Base_de_Datos.CambioEstado(this.toString());
		}	
	}

	@Override
	public String toString() {
		return String.format("Update Alarma_de_incendios set Encendido = %b where Id_Alarma = '%d' ;",this.getEncendido(),this.getIdCal());
	}
}


