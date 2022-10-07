public class VaisseauDeGuerre extends Vaisseau {
    void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque) {
        if (this.armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        }
        System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes. \n", this.type, vaisseauCible.type, arme, dureeAttaque);
        vaisseauCible.resistanceDuBouclier = 0;
        vaisseauCible.blindage = vaisseauCible.blindage / 2;
    }

    void desactiverArmes() {
        this.armesDesactivees = true;
        System.out.printf("Désactivation des armes d'un vaisseau de type %s", this.type);
    }
}
