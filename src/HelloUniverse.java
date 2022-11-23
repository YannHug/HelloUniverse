import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre", 100);
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars", 5);
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 3;
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 35;
        croiseur.blindage = 851;
        croiseur.resistanceDuBouclier = 25;

        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 100;
        fregate.blindage = 542;
        fregate.resistanceDuBouclier = 50;

        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo.nbPassagers = 10000;
        cargo.blindage = 1520;
        cargo.resistanceDuBouclier = 20;

        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 10000;
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassagers = 4;
        chasseur2.blindage = 156;
        chasseur2.resistanceDuBouclier = 2;
        Vaisseau chasseur3 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur3.nbPassagers = 5;
        chasseur3.blindage = 156;
        chasseur3.resistanceDuBouclier = 2;
        Vaisseau cargo2 = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo2.nbPassagers = 10001;
        cargo2.blindage = 1520;
        cargo2.resistanceDuBouclier = 20;


        Galaxie systemeSolaire = new Galaxie();
        systemeSolaire.nom = "Systeme Solaire";
        systemeSolaire.planetes.add(mercure);
        systemeSolaire.planetes.add(venus);
        systemeSolaire.planetes.add(terre);
        systemeSolaire.planetes.add(mars);
        systemeSolaire.planetes.add(jupiter);
        systemeSolaire.planetes.add(saturne);
        systemeSolaire.planetes.add(uranus);
        systemeSolaire.planetes.add(neptune);


        Scanner sc = new Scanner(System.in);
        boolean recommencer = true;
        while (recommencer) {
            System.out.println("Quel vaisseau souhaitez vous manipuler​ : " + TypeVaisseau.CHASSEUR.name() + ", " + TypeVaisseau.FREGATE.name() + ", " + TypeVaisseau.CROISEUR.name() + ", " + TypeVaisseau.CARGO.name() + " ou " + TypeVaisseau.VAISSEAUMONDE.name() + " ?");
            String typeVaisseauString = sc.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(typeVaisseauString);
            Vaisseau vaisseauSelectionne = switch (typeVaisseau) {
                case CHASSEUR -> chasseur;
                case FREGATE -> fregate;
                case CROISEUR -> croiseur;
                case CARGO -> cargo;
                case VAISSEAUMONDE -> vaisseauMonde;
            };

            System.out.println("Sur quelle planète tellurique du systeme solaire voulez-vous vous poser : 1 à 4");
            int planeteSelectionnee = sc.nextInt();
            sc.nextLine();

            Planete p = systemeSolaire.planetes.get(planeteSelectionnee - 1);

            if (p instanceof PlaneteGazeuse) {
                System.out.println(" La planete selectionnée n'est pas une planete tellurique, recommencez");
                continue;
            }

            PlaneteTellurique planete = (PlaneteTellurique) p;

            System.out.println("Quel tonnage souhaitez-vous emporter ?");
            int tonnageSouhaite = sc.nextInt();

            if (planete.restePlaceDisponible(vaisseauSelectionne)) {
                planete.accueillirVaisseaux(vaisseauSelectionne);
                System.out.println("Le vaisseau a rejeté : " + vaisseauSelectionne.emporterCargaison(tonnageSouhaite) + " tonnes.");
            } else {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
            }

            sc.nextLine();
            System.out.println("Voulez-vous recommencer oui/non ?");

            recommencer = sc.nextLine().equals("oui");

        }
    }

}
