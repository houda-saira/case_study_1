package frontend;

import java.util.Scanner;

public class Administrateur extends Personne {

	public Administrateur(String nom, String motDePasse) {
		super(nom, motDePasse);
	}

	static String[][] listeUsers = new String[2][100];
	String[][] listeAdmins = new String[2][100];

	public void inscrireUtilisateur() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir le nombre des utilisateurs à inscrire");
		int max = clavier.nextInt();
		clavier.next();
		for (int i = 0; i < max; i++) {
			System.out.println("Saisir le nom d'utilisateur à inscrire");
			listeUsers[0][i] = clavier.nextLine();
			System.out.println("Saisir le mot de passe d'utilisateur à inscrire");
			listeUsers[1][i] = clavier.nextLine();
			System.out.println("l'inscription effectuée avec succés");
			// TODO ajouter le mecanisme de sauvegarde des utilisateurs....
		}
		clavier.close();


	}
}
