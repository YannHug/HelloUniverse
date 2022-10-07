public class HelloUniverse {

    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.nom = "Mercure";
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Vénus");
        venus.nom = "Venus";
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.nom = "Terre";
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.nom = "Mars";
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.nom = "Saturne";
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.nom = "Uranus";
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.nom = "Neptune";
        neptune.diametre = 49532;

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "CHASSEUR";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "VAISSEAU-MONDE";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();

        chasseur.attaque(vaisseauMonde, "lasers photoniques", 3);

        vaisseauMonde.desactiverBouclier();
        System.out.printf("Le bouclier du Vaisseau Monde peut resister %d minutes.\n", vaisseauMonde.resistanceDuBouclier);
        System.out.printf("Le blindage du Vaisseau Monde est de %d.\n", vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

    }

}
