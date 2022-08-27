public class Planete {
    String nom;
    int diametre;
    String matiere;

    void revolution(String nom) {
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile.\n", nom);
    }

    void rotation(String nom) {
        System.out.printf("Je suis la planète %s et je tourne sur moi-même.\n", nom);
    }
}