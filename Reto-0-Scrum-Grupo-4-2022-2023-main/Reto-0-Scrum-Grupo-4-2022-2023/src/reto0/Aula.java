package reto0;

public class Aula {

	private Calefaccion cal; 
	private boolean encendido;
	
	
	
	public Aula(boolean encendido) {
		this.encendido =encendido;
	}
	
	
	public boolean getEncendido() {
		return encendido;
		
	}
	
	public void setEncendido(boolean encendido) {
		this.encendido=encendido;
	}
	
	public Calefaccion getCal() {
		return cal;
	}
	
	public void setCal(Calefaccion cal) {
		this.cal=cal;
	}
	@Override
	public String toString() {
		return " [encendido= " + encendido +", cal=" + cal; 
	}
}


