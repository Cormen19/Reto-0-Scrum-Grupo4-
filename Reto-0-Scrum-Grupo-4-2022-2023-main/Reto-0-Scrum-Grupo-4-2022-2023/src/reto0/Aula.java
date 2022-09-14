package reto0;

public class Aula {
	
	private int IdAula;
	private Calefaccion cal;
	
	public int getIdAula() {
		return IdAula;
	}
	public void setIdAula(int idAula) {
		IdAula = idAula;
	}
	public Calefaccion getCal() {
		return cal;
	}
	public void setCal(Calefaccion cal) {
		this.cal = cal;
	}
	
	@Override
	public String toString() {
		return "Aula [IdAula=" + IdAula + ", cal=" + cal + "]";
	} 
	
	
}


