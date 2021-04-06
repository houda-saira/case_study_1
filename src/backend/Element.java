package backend;

import java.util.Vector;

public abstract class Element {
	private String nom;
	
    public Vector<Element> listeElements=new Vector<Element>();

    public Element(String nom) {
    	          this.setNom(nom);
    	          }

    public void afficherElement() {
        for (Element element: listeElements){
        System.out.println(element);
        }
}


   abstract public void creer(Element element);
 
    abstract public int getTaille();

    abstract public void modifier(Element element) ;

    abstract public void supprimer() ;




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}

}
