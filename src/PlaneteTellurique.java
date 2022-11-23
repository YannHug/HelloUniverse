public class PlaneteTellurique extends Planete implements Habitable {

    Vaisseau[][] vaisseauAccostes;
    int totalVisiteurs;

    PlaneteTellurique(String nomPlanete, int tailleBaie) {

        super(nomPlanete);
        this.vaisseauAccostes = new Vaisseau[2][tailleBaie];
    }

    public void accueillirVaisseaux(Vaisseau... nouveauxVaisseaux) {

        for (Vaisseau nouveauxVaisseau : nouveauxVaisseaux) {

            int indexZone = switch (nouveauxVaisseau.type) {
                case CARGO, VAISSEAUMONDE -> 1;
                default -> 0;
            };

            if (nouveauxVaisseau instanceof VaisseauDeGuerre) {
                if (!nouveauxVaisseau.armesDesactivees) {
                    ((VaisseauDeGuerre) nouveauxVaisseau).desactiverArmes();
                }
            }

            totalVisiteurs += nouveauxVaisseau.nbPassagers;

            for (int index = 0; index < vaisseauAccostes[indexZone].length; index++) {
                if (vaisseauAccostes[indexZone][index] == null) {
                    vaisseauAccostes[indexZone][index] = nouveauxVaisseau;
                    System.out.println(
                            "A la baie numéro " + indexZone + "," + index +
                                    " se trouve le vaisseau de type " + nouveauxVaisseau.type
                    );
                    break;
                }
            }
        }
    }

    public boolean restePlaceDisponible(Vaisseau vaisseau) {

        int indexZone = switch (vaisseau.type) {
            case CARGO, VAISSEAUMONDE -> 1;
            default -> 0;
        };

        for (int index = 0; index < vaisseauAccostes[indexZone].length; index++) {
            if (vaisseauAccostes[index] == null) {
                return true;
            }
        }
        return false;
    }

}
