import org.w3c.dom.ls.LSOutput;

public class VaisseauDeGuerre extends Vaisseau {
    VaisseauDeGuerre(TypeVaisseau type) {
        this.type = type;
        if (type == TypeVaisseau.CHASSEUR) {
            tonnageMax = 0;
        } else if (type == TypeVaisseau.FREGATE) {
            tonnageMax = 50;
        } else if (type == TypeVaisseau.CROISEUR) {
            tonnageMax = 100;
        }
    }

    void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque) {
        if (this.armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.printf("Un vaisseau de type %s attaque un vaisseau de type %s en utilisant l'arme %s pendant %d minutes. \n", this.type, vaisseauCible.type, arme, dureeAttaque);
            vaisseauCible.resistanceDuBouclier = 0;
            vaisseauCible.blindage = vaisseauCible.blindage / 2;
        }
    }

    void desactiverArmes() {
        this.armesDesactivees = true;
        System.out.printf("Désactivation des armes d'un vaisseau de type %s. \n", this.type);
    }

    public void activerBouclier() {
        this.desactiverArmes();
        super.activerBouclier();
    }

    @Override
    int emporterCargaison(int cargaison) {
        if (this.nbPassagers >= 12 && !this.type.equals("CHASSEUR")) {
            int tonnagePassagers = 2 * nbPassagers;
            int tonnageRestant = tonnageMax - tonnageActuel;
            int tonnageAConsider = (tonnagePassagers < tonnageRestant ? tonnagePassagers : tonnageRestant);
            if (cargaison > tonnageAConsider) {
                tonnageActuel = tonnageMax;
                return cargaison - tonnageAConsider;
            } else {
                tonnageActuel += cargaison;
                return 0;
            }
        }
        return cargaison;
    }
}
