package backend;

import java.util.Vector;



	
	public class Dossier extends  Element {
        private String nom;
        public Vector<Element> listeElements = new Vector<Element>();


    public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

	public Dossier(String nom) {
            super(nom);
            
        }

        public void afficherElement () {
            for (Element element : listeElements)
                {System.out.println(element);}

        }

        public void creer(Element dossier) {
     
	        	for (Element element: listeElements){ 		
	   			if((dossier.getNom()).equals(element.getNom())&&(element instanceof Dossier)) {
	    				System.out.println("Le dossier existe déja");}
	    			listeElements.add(dossier);
	    	        
	        	}
        }

        public int getTaille () {
            int taille = 0;
            for (Element element : listeElements) {
                taille += element.getTaille();
            }
            return taille;
        }

        public void modifier (Element dossier) {
        	for (Element element: listeElements) {
    			if((dossier.getNom()).equals(element.getNom())&&(element instanceof Dossier)) {
    				element.setNom(dossier.getNom());
    				System.out.println("Le fichier a été supprimé");}
    				
    			}
        }

        public void supprimer () {
        	for (int i =0; i<listeElements.size();i++) {
    			if((this.getNom()).equals(listeElements.get(i).getNom())&&(listeElements.get(i) instanceof Dossier)) {
    				listeElements.remove(i);
    				System.out.println("Le fichier a été supprimé");}
    			}	
        }

		
		
		
		

	
    }



