package backend;
import java.util.Vector;
public class Racourci extends Element {
	Element cible;
	public Vector<Element> listeElements;
	public Racourci(Element element) {
		super(element.getNom());
		// TODO Auto-generated constructor stub
		this.cible = element;

	}
	@Override
	public void creer(Element racourci) {
		// TODO Auto-generated method stub
		for (Element element : listeElements) {

			if ((racourci.getNom()).equals(element.getNom()) && (element instanceof Racourci)) {
				System.out.println("Le fichier existe déja");
			}
			listeElements.add(racourci);
		}
	}
	@Override
	public int getTaille() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void modifier(Element racourci) {
		// TODO Auto-generated method stub
		for (Element element : listeElements) {
			if ((racourci.getNom()).equals(element.getNom()) && (element instanceof Racourci)) {
				element.setNom(racourci.getNom());
				System.out.println("Le fichier a été supprimé");
			}
		}
	}
	@Override
	public void supprimer() {
		// TODO Auto-generated method stub
		for (int i = 0; i < listeElements.size(); i++) {
			if ((this.getNom()).equals(listeElements.get(i).getNom()) && (listeElements.get(i) instanceof Racourci)) {
				listeElements.remove(i);
				System.out.println("Le fichier a été supprimé");
			}
		}
	}
}
