public class PlaneteTellurique extends Planete implements Habitable {

    Vaisseau vaisseauAccoste;
    int totalVisiteurs;

    PlaneteTellurique(String nomPlanete) {
        super(nomPlanete);
    }

    public Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau) {

        totalVisiteurs += nouveauVaisseau.nbPassagers;

        Vaisseau vaisseauPrecedent = vaisseauAccoste;

        vaisseauAccoste = nouveauVaisseau;

        return vaisseauPrecedent;

    }
}
