package domaine;

/**
 * 
 * @author Fabien
 *
 */

public class Manager extends Employe{

	/**
	 * 
	 * @param id
	 * @param prenom
	 * @param nom
	 */
	
	//constructeur
	public Manager(int id, String prenom, String nom) {
		super(id, prenom, nom);
		System.out.println(prenom+" "+nom+" est un Manager");

	}
	//surcharge du constructeur
	public Manager(int id) {
		this(id,"PreomInconnu","NomInconnu");
		System.out.println(prenom+" "+nom+" est un Manager");
	}

	public Manager(int id, String nom) {
		this(id,"PrenomInconnu",nom);
		System.out.println(prenom+" "+nom+" est un Manager");
	}
	
	//redéfinitions de méthodes de la classe mère
	@Override
	public void faireUnCommentaire(Employe e) {
		System.out.println(getPrenom()+" "+getNom()+ " dis à "+e.getPrenom()+" "+e.getNom()+" : \" tu vas finir sur le banc si tu conitnues à jouer sans les autres\" ");
	}
	
	@Override
	public void demanderFormationTheme(String theme) {
		super.demanderFormationTheme(theme);
		System.out.println(getNom()+" est manager. La décision est validée");
	}
	
}
