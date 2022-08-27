public class VaisseauDeGuerre extends Vaisseau {
    public void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque) {
        System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes. \n", this.type, vaisseauCible.type, arme, dureeAttaque);
        vaisseauCible.resistanceDuBouclier = 0;
        vaisseauCible.blindage = vaisseauCible.blindage / 2;
    }
}
