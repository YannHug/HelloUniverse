public class PlaneteTellurique extends Planete implements Habitable {

    Vaisseau[] vaisseauAccoste;
    int totalVisiteurs;

    PlaneteTellurique(String nomPlanete, int tailleBaie) {

        super(nomPlanete);
        this.vaisseauAccoste = new Vaisseau[tailleBaie];
    }

    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau) {

        if (nouveauVaisseau instanceof VaisseauDeGuerre) {
            if (!nouveauVaisseau.armesDesactivees) {
                ((VaisseauDeGuerre) nouveauVaisseau).desactiverArmes();
            }
        }

        for (int index = 0; index < vaisseauAccoste.length; index++) {
            if (vaisseauAccoste[index] == null) {
                vaisseauAccoste[index] = nouveauVaisseau;
                break;
            }
        }

        return nouveauVaisseau;
    }

    public boolean restePlaceDisponible() {
        for (Vaisseau vaisseau : vaisseauAccoste) {
            if (vaisseau == null) {
                return true;
            }
        }
        return false;
    }

}
