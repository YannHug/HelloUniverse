
public class Planete {
    String nom;
    int diametre;
    Atmosphere atmosphere;
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes;

    Planete(String nomPlanete) {
        this.nom = nomPlanete;
        nbPlanetesDecouvertes++;
    }

    static String expansion(double milliardsDAnneesLumiere) {
        if (milliardsDAnneesLumiere < 14) {
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

    int revolution(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
        return degres / 360;
    }

    int rotation(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
        return degres / 360;
    }

}
