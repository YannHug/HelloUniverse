public class HelloUniverse {

    public static void main(String... args) {
        Planete mercure = new Planete("Mercure");
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "tellurique";

        Planete venus = new Planete("Vénus");
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "tellurique";

        Planete terre = new Planete("Terre");
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "tellurique";

        Planete mars = new Planete("Mars");
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "tellurique";

        Planete jupiter = new Planete("Jupiter");
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "gazeuse";

        Planete saturne = new Planete("Saturne");
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "gazeuse";

        Planete uranus = new Planete("Uranus");
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "gazeuse";


        Planete neptune = new Planete("Neptune");
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "gazeuse";

        System.out.println("Le nombre de planètes découvertes est actuellement de " + Planete.nbPlanetesDecouvertes);

    }

}
