public class HelloUniverse {

    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.hydrogene = 83;
        atmosphereUranus.helium = 15;
        atmosphereUranus.methane = 2.5f;

        uranus.atmosphere = atmosphereUranus;

        System.out.printf("L'atmosphère de Uranus est composée : \n A %.1f%% d'hydrogène. \n A %.1f%% d'hélium. \n A %.1f%% de méthane. \n", uranus.atmosphere.hydrogene, uranus.atmosphere.helium, uranus.atmosphere.methane);


    }

}
