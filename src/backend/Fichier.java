package backend;

import java.util.Vector;

public class Fichier extends Element {

	public int Taille;
	private String nom;
	public Vector<Element> listeElements;

	public  Fichier(String nom,int taille, Vector<Element> listElements){
        super( nom);
        this.Taille=taille;
        this.listeElements=listElements;
	}


	public void afficherElement(){
		 for (Element element: listeElements){
		        System.out.println(element);
		        }

	}

	public void creer(Element fichier){
		for (Element element: listeElements){
		
			if((fichier.getNom()).equals(element.getNom())&&(element instanceof Fichier)) {
				System.out.println("Le fichier existe déja");}
			listeElements.add(fichier);
	        
	        }
		
	}

	public int getTaille(){
		return Taille;
	}

	public void modifier(Element fichier){
		for (Element element: listeElements) {
			if((fichier.getNom()).equals(element.getNom())&&(element instanceof Fichier)) {
				element.setNom(fichier.getNom());
				System.out.println("Le fichier a été supprimé");}
				
			}
	}

	public void supprimer(){
		for (int i =0; i<listeElements.size();i++) {
			if((this.getNom()).equals(listeElements.get(i).getNom())&&(listeElements.get(i) instanceof Fichier)) {
				listeElements.remove(i);
				System.out.println("Le fichier a été supprimé");}
			}	
		}
	
	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	






}