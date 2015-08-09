package domaine;

public class DemandeFormation {

	private String dateDemandeFormation;
	private String dateDebutFormation;
	private String dateFinFormation;
	private String etatValidation;

	public final static String ACCORD = "validée";
	public final static String REFUS = "rufusée";
	public final static String ATTENTE = "en attente";

	
	//constructeur
	public DemandeFormation(String dateDemandeFormation, String dateDebutFormation, String dateFinFormation,
			String etatValidation) {
		this.dateDemandeFormation = dateDemandeFormation;
		this.dateDebutFormation = dateDebutFormation;
		this.dateFinFormation = dateFinFormation;
		this.etatValidation = etatValidation;
	}
	//surcharge constructeur incluant la constante ATTENTE à la place de l'argument etatValidation.
	public DemandeFormation(String dateDemandeFormation, String dateDebutFormation, String dateFinFormation) {
		this(dateDemandeFormation, dateDebutFormation, dateFinFormation,ATTENTE);
	}

	//récupère les propriété d'un objet à la place de sa référence.
	@Override
	public String toString() {
		return "DemandeFormation [dateDemandeFormation=" + dateDemandeFormation + ", dateDebutFormation="
				+ dateDebutFormation + ", dateFinFormation=" + dateFinFormation + ", etatValidation=" + etatValidation
				+ "]";
	}

	public String getDateDemandeFormation() {
		return dateDemandeFormation;
	}

	public void setDateDemandeFormation(String dateDemandeFormation) {
		this.dateDemandeFormation = dateDemandeFormation;
	}

	public String getDateDebutFormation() {
		return dateDebutFormation;
	}

	public void setDateDebutFormation(String dateDebutFormation) {
		this.dateDebutFormation = dateDebutFormation;
	}

	public String getDateFinFormation() {
		return dateFinFormation;
	}

	public void setDateFinFormation(String dateFinFormation) {
		this.dateFinFormation = dateFinFormation;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

}
