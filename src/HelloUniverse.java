public class HelloUniverse {

    public static void main(String... args) {

        Planete mercure = new Planete();
        mercure.diametre = 4880;
        mercure.matiere = "tellurique";
        Planete venus = new Planete();
        venus.diametre = 12100;
        venus.matiere = "tellurique";
        Planete terre = new Planete();
        terre.diametre = 12756;
        terre.matiere = "tellurique";
        Planete mars = new Planete();
        mars.diametre = 6792;
        mars.matiere = "tellurique";
        Planete jupiter = new Planete();
        jupiter.diametre = 142984;
        jupiter.matiere = "gazeuse";
        Planete saturne = new Planete();
        saturne.diametre = 120536;
        saturne.matiere = "gazeuse";
        Planete uranus = new Planete();
        uranus.diametre = 51118;
        uranus.matiere = "gazeuse";
        Planete neptune = new Planete();
        neptune.diametre = 49532;
        neptune.matiere = "gazeuse";

        System.out.printf("Jupiter est une planète %s avec un diamètre de %d kilomètres.", jupiter.matiere, jupiter.diametre);

    }

}
