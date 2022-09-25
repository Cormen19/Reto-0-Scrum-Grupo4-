package reto0;

public class AlarmadeIncendios{
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
		this.encendido=encendido;	
	}
	
	public void actualizarEstado() {
		Base_de_Datos.CambioEstado(this.toString());
	}
	public static void actualizarEstadoTodo(boolean encendido) {
		Base_de_Datos.CambioEstado(String.format("Update Alarma_de_incendios set Encendido = %b ;",encendido));
	}

	@Override
	public String toString() {
		return String.format("Update Alarma_de_incendios set Encendido = %b where Id_Alarma = '%d' ;",this.getEncendido(),this.getIdCal());
	}
}


