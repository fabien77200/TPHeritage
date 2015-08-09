package lanceur;

import java.util.Collection;
import java.util.ArrayList;
import domaine.DemandeFormation;
import domaine.Employe;
import domaine.Manager;
import domaine.ServicePaie;

/**
 * @author Fabien
 * 
 */

public class MainTest {

	public static void main(String[] args) {

		// TODO Delclarations
		Employe e1, e2, e3, m1;

		// TODO instanciations
		e1 = new Employe(12, "Mathieu", "Valbuena");
		e2 = new Employe(11, "Paul", "Pogba");
		e3 = new Employe(13, "Blaise", "Matuidi");
		m1 = new Manager(1, "Didier", "Deschamps");

		// TODO utilisation des instances de classes
		e1.demanderFormationTheme("l'utilisation du pied droit");
		e1.etreCopainAvec(e2);
		e3.faireUnCommentaire(m1);
		m1.faireUnCommentaire(e3);

		Manager m2 = new Manager(88, "Paul", "Pogba");
		e2 = m2;
		System.out.println(m2);
		m2.faireUnCommentaire(m1);

		m2.setNom("PogbaBallondOr");
		System.out.println(m2);

		m2.demanderFormationTheme("devenir pr�sident");

		DemandeFormation df1 = new DemandeFormation("Octobre", "Janvier", "Octobre");
		DemandeFormation df2 = new DemandeFormation("Octobre", "F�vrier", "Mars");

		ServicePaie sp = new ServicePaie();

		e1.demanderFormationDate(df1);
		sp.listerFormationPersonnel(e1);

		m1.demanderFormationTheme("gangner l'EURO 2016");
		m1.demanderFormationDate(df2);
		sp.listerFormationPersonnel(m1);

		// TODO deux listes de type Employe et Manager.
		Collection<Employe> listeEmployes = new ArrayList<>();
		listeEmployes.add(new Employe(101, "Zin�dine", "Zidane"));
		listeEmployes.add(new Employe(102, "Michel", "Platini"));
		listeEmployes.add(new Employe(103, "Bernard", "Diom�de"));
		listeEmployes.add(new Employe(104, "Bernard", "Lama"));
		listeEmployes.add(new Employe(105, "Lilian", "Thuram"));
		listeEmployes.add(new Employe(106, "Laurent", "Blanc"));

		Collection<Employe> listeManagers = new ArrayList<>();
		listeManagers.add(new Manager(107, "Aim�", "Jacquet"));
		listeManagers.add(new Manager(108, "Roger", "Lemerre"));
		listeManagers.add(new Manager(109, "Eric", "Cantona"));
		listeManagers.add(new Manager(110, "Raymond", "Domenech"));

		// TODO afficher les objets contenus dans les listes d'employ�s et de managers.
		afficherListe(listeEmployes);
		afficherListe(listeManagers);

	}

	// TODO m�thode static prenant en param�tre une liste dont le type peut �tre
	// soit Employe soit la classe qui en h�rite: Manager
	public static void afficherListe(Collection<? extends Employe> e) {
		for (Employe emp : e) {
			System.out.println(emp.toString());
		}
	}

}
