package exercice_2;

public class Documentaire extends Film {
	private String sujet;
	private float tarif=2;
	public Documentaire(String titre, String r, String pays, int d,String sujet) {
		super(titre, r, pays,d);

		this.sujet=sujet;
		
	}
	public String toString() {
		return (super.toString()+sujet);
		}
	public float totalVenteBillets() {
		
		return nb_place*tarif;
	}
	
	
	
	

}
