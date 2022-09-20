package reto0;
/*Esta clase sirve para darle logica al programa como estamos empezando aun no se utiliza */
public class Aula {


	private Calefaccion cal; 
	private AlarmadeIncendios alarma;
	private int idAula;
	
	public Aula(int idAula) {
		this.idAula =idAula;
	}
	
	
	public int getIdAula() {
		return idAula;
		
	}
	

	public Calefaccion getCal() {
		return cal;
	}
	public void setCal(Calefaccion cal) {
		this.cal = cal;
	}
	

	public AlarmadeIncendios getAlarma() {
		return alarma;
		
	}
	
	
	public void setAlarma(AlarmadeIncendios alarma) {
		this.alarma=alarma;
	}
	@Override
	public String toString() {
		return " [idAula= " + idAula +", cal=" + cal + ", alarma= " + alarma ; 
	}

}

