public class Vaisseau {
    String type;
    int nbPassagers;
    int blindage;
    int resistanceDuBouclier;

    boolean armesDesactivees = false;

    public void activerBouclier() {
        System.out.printf("Activation du bouclier d'un vaisseau de type %s.\n", this.type);
    }

    public void desactiverBouclier() {
        System.out.printf("Désactivation du bouclier d'un vaisseau de type %s.\n", this.type);
    }
}
