public class Planete {
    String nom;
    String matiere;
    long diametre;

    void revolution(int degresRevolution) {
        int nbTourRevolution = degresRevolution / 360;
        System.out.printf("%s a effectué %d tours complets autour de son étoile.\n", nom, nbTourRevolution);
    }

    void rotation(int degresRotation) {
        int nbTourRotation = degresRotation / 360;
        System.out.printf("%s a effectué %d tours complets autour de soi-même.\n", nom, nbTourRotation);
    }
}
