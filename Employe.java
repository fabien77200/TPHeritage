package domaine;

import java.util.Collection;

/**
 * @author Fabien
 */

public class Employe implements IPersonnel {

	protected int id;
	protected String prenom;
	protected String nom;

	/**
	 * 
	 * @param id
	 * @param prenom
	 * @param nom
	 */

	// Constructeur
	public Employe(int id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}

	// surcharge constructeur.
	public Employe(int id, String nom) {
		this.id = id;
		this.prenom = "PrenomInconnu";
		this.nom = nom;
	}

	public Employe(int id) {
		this.id = id;
		this.prenom = "PrenomInconnu";
		this.nom = "NomInconnu";
	}

	// méthodes
	public void demanderFormationTheme(String theme) {
		System.out.println(prenom + " " + nom + " demande une formation sur : \"" + theme + "\".");
	}
	
	public void demanderFormationDate(DemandeFormation df){
		System.out.println(getNom()+" à poser en "+df.getDateDemandeFormation()+" des dates de formation : début = "+df.getDateDebutFormation()+" Fin = "+df.getDateFinFormation()+".");
	}
	

	public void etreCopainAvec(Employe e) {
		System.out.println(nom + " deviens compain avec " + e.nom);
	}

	public void faireUnCommentaire(Employe e) {
		System.out.println(nom + " dis: \"je veux plus de temps de jeu\" à " + e.getPrenom() + " " + e.getNom());
	}

	@Override
	public String toString() {
		return "Employe n°" + id + ", nom=" + nom + ".";
	}

	@Override
	public Collection<DemandeFormation> consulterFormation() {
		System.out.println("consulter la formation de "+prenom+" "+nom+".");
		return null;
	}

	// getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
