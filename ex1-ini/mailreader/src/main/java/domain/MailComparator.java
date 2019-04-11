package domain;

import java.util.Comparator;

/**
 * Comparateur de mails
 * 
 * Comme on désire afficher les mails les plus importants en premier, l'element le plus grand retourne une valeur négative
 *
 */
public class MailComparator implements Comparator<Mail> {
	
	public static final int MAIL_IDENTIQUES = 0;
	public static final int MAIL1_MOINDRE_IMPORTANCE = 1;
	public static final int MAIL2_MOINDRE_IMPORTANCE = -1;

	public int compare(Mail obj1, Mail obj2) {
		if (obj1 == null || obj2 == null) {
			return MAIL_IDENTIQUES; 
		}
		
		if (obj1.isImportant() != obj2.isImportant()) {
			if (obj1.isImportant() && !obj2.isImportant()) {
				return MAIL2_MOINDRE_IMPORTANCE;
			} else {
				return MAIL1_MOINDRE_IMPORTANCE;
			}
		}
		
		if (obj1.getStatut() != obj2.getStatut()) {
			if (obj1.getStatut().ordinal() - obj2.getStatut().ordinal() > 0) {
				return MAIL2_MOINDRE_IMPORTANCE;
			} else {
				return MAIL1_MOINDRE_IMPORTANCE;
			}
		}
		
		if (obj1.getSujet() != obj2.getSujet()) {
			if (obj1.getSujet() == null && obj2.getSujet() != null) {
				return MAIL1_MOINDRE_IMPORTANCE;
			} else {
				return MAIL2_MOINDRE_IMPORTANCE;
			}
		}
		
		if (obj1.getDate() != obj2.getDate()) {
			if (obj1.getDate() == null && obj2.getDate() != null) {
				return MAIL1_MOINDRE_IMPORTANCE;
			} else {
				return MAIL2_MOINDRE_IMPORTANCE;
			}
		}
		
		return obj2.getDate().compareTo(obj1.getDate());
	}
}
