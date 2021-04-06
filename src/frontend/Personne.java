package frontend;

import java.util.Scanner;

public class Personne {
	private String motDePasse;
	private String Id;
	 
	

	public Personne(String Id,String motDePasse){
		this.setId(Id);
		this.setMotDePasse(motDePasse);
		

	}
	public static boolean Sauthentifier(){
		 
		Scanner clavier=new Scanner(System.in);
        System.out.println("Saisir votre identifiant");
        String nomUser = clavier.nextLine();
        for(int i=0;i<100;i++){
        	if(nomUser.equals(Administrateur.listeUsers[0][i])) {
        		System.out.println("Entrez votre mot de passe");
        		String MDP =clavier.nextLine();
        		if(MDP.equals(Administrateur.listeUsers[1][i])) {
        			System.out.println("Vous etes connectés");
        	        clavier.close();
        			return true;
        		}
        		
        	}
        			
        		
        }
        clavier.close();
		return false;
		
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}

}
