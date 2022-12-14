package reto0;

public class Calefaccion {

	private int idCal;
	private boolean encendido;

	public Calefaccion(int idCal,boolean encendido) {
		this.idCal= idCal;
		this.encendido=encendido;
	}
	
	public int getIdCal() {
		return idCal;
		
	}
	

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
			this.encendido=encendido;
	}
	
	public void actualizarEstado() {
		Base_de_Datos.CambioEstado(this.toString());
	}
	
	public static void actualizarEstadoTodo(boolean encendido) {
		Base_de_Datos.CambioEstado(String.format("Update Calefaccion set Encendido = %b ;",encendido));
	}
	@Override
	public String toString() {
		return String.format("Update Calefaccion set Encendido = %b where Id_Calefaccion = '%d' ;",this.isEncendido(),this.getIdCal());
	}
}
