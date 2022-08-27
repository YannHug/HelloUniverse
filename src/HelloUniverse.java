public class HelloUniverse {
    public static void main(String... args) {

        String phraseIntroduction = "En %d, les planètes du système solaire étaient au nombre de : %d";
        short annee = 2005;
        int nbPlanete = 0;

        if (annee >= 1600 && annee <= 2020) {
            if (annee < 1700) {
                nbPlanete = 7;
            } else if (annee < 1800 || annee >= 2006) {
                nbPlanete = 8;
            } else {
                nbPlanete = 9;
            }
            System.out.printf(phraseIntroduction, annee, nbPlanete);
        } else {
            System.out.println("Le programme ne peut pas fournir de résultat pour l'année " + annee);
        }
    }
}