public class Planete {
    String nom;
    long diametre;
    String matiere;
    int totalVisiteurs = 0;

    int revolution(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
        return degres / 360;
    }

    int rotation(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
        return degres / 360;
    }

    void accueillirVaisseau(int nouveauxHumains) {
        totalVisiteurs += nouveauxHumains;
    }

    void accueillirVaisseau(String typeVaisseau) {
        if (typeVaisseau == "CHASSEUR") {
            totalVisiteurs += 3;
        } else if (typeVaisseau == "FREGATE") {
            totalVisiteurs += 12;
        } else if (typeVaisseau == "CROISEUR") {
            totalVisiteurs += 50;
        } else {
            System.out.println("Vaisseau Inconnu");
        }
    }
}
