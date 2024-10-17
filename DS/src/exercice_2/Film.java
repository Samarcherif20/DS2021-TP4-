package exercice_2;
import java.util.Scanner;
public class Film {
	protected String titre;
	protected String réalisateur;
	protected String pays;
	protected int durée ;
	protected int nb_place;
	
	public int getNb_place() {
		return nb_place;
	}
	public void setNb_place(int nb_place) {
		this.nb_place = nb_place;
	}
	public String toString() {
		return ("Film =" + titre + ", de" + réalisateur + ", (" + pays +") "+"-" + durée+"min");
				
	}
	public Film(String titre, String r, String pays, int d) {
		
		this.titre = titre;
		this.réalisateur = r;
		this.pays = pays;
		this.durée = d;
		
		
	}
	public float totalVenteBillets() {
		Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nombre de places réservées pour  étudiants: ");
        int p_etd = sc.nextInt();
        while(p_etd > nb_place) {
        System.out.print("Entrez à nouveau le nombre de places réservées pour étudiants: ");
        p_etd = sc.nextInt();}
    
      
        int p_pub = nb_place - p_etd;
        float total = (p_etd * 2) + (p_pub * 3); 

        return total;
  
	

}}
