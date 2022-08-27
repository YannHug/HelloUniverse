public class HelloUniverse {
    public static void main(String... args) {

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "tellurique";

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "tellurique";

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "tellurique";

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "tellurique";

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "gazeuse";

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "gazeuse";

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "gazeuse";

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "gazeuse";

        Planete planeteX = new Planete();

        neptune.revolution(-3542);
        mars.rotation(-684);
        venus.rotation(1250);

    }
}
