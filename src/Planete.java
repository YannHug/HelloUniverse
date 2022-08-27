public class Planete {
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseau;
    int nbHumains;

    int revolution(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
        return degres / 360;
    }

    int rotation(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
        return degres / 360;
    }

    void accueillirVaisseau(Vaisseau vaisseau) {
        if (this.vaisseau == null) {
            System.out.println("Aucun vaisseau ne s'en va.\n");
        } else {
            System.out.printf("Un vaisseau de type %s doit s'en aller. \n", this.vaisseau.nom);
        }
        System.out.printf("Un vaisseau de type %s vient d'atterrir. Il transporte %d passagers \n", vaisseau.nom, vaisseau.nbPassagers);
        this.vaisseau = vaisseau;
        this.nbHumains += vaisseau.nbPassagers;
        System.out.printf("Le nombre d'humains ayant déjà séjourné sur %s est actuellement de %d \n", this.nom, this.nbHumains);
    }
}