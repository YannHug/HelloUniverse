import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
        mercure.nom = "Mercure";
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Vénus", 0);
        venus.nom = "Venus";
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre", 10);
        terre.nom = "Terre";
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars", 3);
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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 0;
        VaisseauDeGuerre fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 10;
        VaisseauDeGuerre croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 20;

        VaisseauCivil cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo.nbPassagers = 50;
        VaisseauCivil vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 100;


        String recommencer;

        do {
            System.out.println("Choisir un type de vaisseau : ");
            Scanner selectionVaisseau = new Scanner(System.in);
            String entreVaisseau = selectionVaisseau.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(entreVaisseau);
            Vaisseau choixVaisseau = null;
            switch (typeVaisseau) {
                case CHASSEUR -> choixVaisseau = chasseur;
                case FREGATE -> choixVaisseau = fregate;
                case CROISEUR -> choixVaisseau = croiseur;
                case CARGO -> choixVaisseau = cargo;
                case VAISSEAUMONDE -> choixVaisseau = vaisseauMonde;
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

            if (!choixPlanete.restePlaceDisponible()) {
                System.out.println("Le vaisseau ne peut pas se poser sur la planete par manque de place dans la baie.");
            } else {
                if (choixPlanete != null && choixVaisseau != null) {
                    choixPlanete.accueillirVaisseau(choixVaisseau);
                    System.out.println(choixVaisseau.type + " a rejeté " + choixVaisseau.emporterCargaison(choixCargaison) +
                            " tonnes de cargaison");
                } else {
                    System.out.println("Le choix de planete et/ou de vaisseau n'est pas correct");
                }
            }

            System.out.println("Vouler vous recommencer ?");
            recommencer = selectionVaisseau.nextLine();

        } while (recommencer.equalsIgnoreCase("Oui"));


//        Atmosphere atmosphereUranus = new Atmosphere();
//        atmosphereUranus.tauxHydrogene = 83f;
//        atmosphereUranus.tauxHelium = 15f;
//        atmosphereUranus.tauxMethane = 2.5f;
//        atmosphereUranus.tauxAzote = 0.0f;
//        uranus.atmosphere = atmosphereUranus;
//
//        System.out.println("L'atmosphere d'Uranus est composée de :");
//        if (uranus.atmosphere.tauxHydrogene != null) {
//            System.out.println(uranus.atmosphere.tauxHydrogene + " % d'hydrogene");
//        }
//        if (uranus.atmosphere.tauxHelium != null) {
//            System.out.println(uranus.atmosphere.tauxHelium + " % d'helium");
//        }
//        if (uranus.atmosphere.tauxMethane != null) {
//            System.out.println(uranus.atmosphere.tauxMethane + " % de methane");
//        }
//        if (uranus.atmosphere.tauxAzote != null) {
//            System.out.println(uranus.atmosphere.tauxAzote + " % d'azote");
//        }
//        if (uranus.atmosphere.tauxArgon != null) {
//            System.out.println(uranus.atmosphere.tauxArgon + " % d'argon");
//        }
//        if (uranus.atmosphere.tauxDioxydeDeCarbone != null) {
//            System.out.println(uranus.atmosphere.tauxDioxydeDeCarbone + " % de dioxyde de carbone");
//        }
//        if (uranus.atmosphere.tauxSodium != null) {
//            System.out.println(uranus.atmosphere.tauxSodium + " % de sodium");
//        }

    }
}