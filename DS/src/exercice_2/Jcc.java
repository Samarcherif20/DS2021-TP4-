package exercice_2;
import java.time.Year;
public class Jcc {
	private Film[]competition;

	private final  int nbfmax=30;
	private int nbf=0;
	public static int  annee = Year.now().getValue(); 

	 
	   
	

	public Jcc( int t, int annee) {
		
		
		if (t<nbfmax) { 
			this.competition=new Film[t];
			this.annee=annee;
			}
			
	}
	 public void ajouterFilm(Film f) {
	        if ( nbf< competition.length) {
	            competition[nbf] = f;
	            nbf++;
	        } else {					
	            System.out.println("la compétition est au complet");
	        }
	    }
	 public void listeFilmJcc() {
	        if (nbf == 0) {
	            System.out.println("la competition est vide");
	        } else {
	            for (int i = 0; i < nbf; i++) {
	                System.out.println(competition[i]);
	            }
	        }
	 }
	 public float totalVenteBilletsJCC(){
		        float t = 0;
		        for (int i = 0; i < nbf; i++) {
		            t += competition[i].totalVenteBillets();  
		        }
				return t;
		        
	 }
	 public static void main(String[]arg) {
		 Jcc j= new Jcc(2,2021);
		 Documentaire f1= new Documentaire("Le dernier refuge","Ousman","Mali",86," La guerre civile" );
		 Film f2 =new Film("Insurrection","Jilani Saadi,","Tunisie",105);
		 j.ajouterFilm(f1);
		 f1.setNb_place(30);
		 j.ajouterFilm(f2);
		 f2.setNb_place(45);
		 j.listeFilmJcc();
		 float tvb=j.totalVenteBilletsJCC();
		 System.out.println("total de ventes des billets pour jcc ="+tvb +" en "+ annee);
		 
		 
		 
		 
		 
		 
	 }
	

}
