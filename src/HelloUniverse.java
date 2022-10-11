import java.util.Scanner;

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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers = 0;
        VaisseauDeGuerre fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 10;
        VaisseauDeGuerre croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 20;

        VaisseauCivil cargo = new VaisseauCivil("CARGO");
        cargo.nbPassagers = 50;
        VaisseauCivil vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 100;

        System.out.println("Choisir un type de vaisseau : ");
        Scanner typeVaisseau = new Scanner(System.in);
        String entreVaisseau = typeVaisseau.nextLine();

        Vaisseau choixVaisseau = null;
        switch (entreVaisseau) {
            case "CHASSEUR" -> choixVaisseau = chasseur;
            case "FREGATE" -> choixVaisseau = fregate;
            case "CROISEUR" -> choixVaisseau = croiseur;
            case "CARGO" -> choixVaisseau = cargo;
            case "VAISSEAU-MONDE" -> choixVaisseau = vaisseauMonde;
            default -> System.out.println("Ce type de vaisseau n'existe pas");
        }

        System.out.println("Choisir une planète tellurique : ");
        Scanner nomPlanete = new Scanner(System.in);
        String entrePlanete = nomPlanete.nextLine();

        PlaneteTellurique choixPlanete = null;
        switch (entrePlanete) {
            case "Mercure" -> choixPlanete = mercure;
            case "Venus" -> choixPlanete = venus;
            case "Terre" -> choixPlanete = terre;
            case "Mars" -> choixPlanete = mars;
            default -> System.out.println("Cette planète n'existe pas");
        }

        System.out.println("Choisir un tonnage de cargaison : ");
        Scanner poidsCargaison = new Scanner(System.in);
        int choixCargaison = poidsCargaison.nextInt();

        if (choixPlanete != null && choixVaisseau != null){
        choixPlanete.accueillirVaisseau(choixVaisseau);
        System.out.println(choixVaisseau.type + " a rejeté " + choixVaisseau.emporterCargaison(choixCargaison) +
                " tonnes de cargaison");
        } else {
            System.out.println("Le choix de planete et/ou de vaisseau n'est pas correct");
        }
    }
}