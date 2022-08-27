public class HelloUniverse {
    public static void main(String... args) {
        int nombrePlanetes = 8;
        String phrase = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(phrase + nombrePlanetes);
        nombrePlanetes++;
        phrase = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(phrase + nombrePlanetes);
    }
}