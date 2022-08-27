public class HelloUniverse {
    public static void main(String... args) {
        short anneeActuelle = 2002;

        if (anneeActuelle < 2006) {
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : 9", anneeActuelle);
        } else {
            System.out.printf("En %d, les planètes du système solaire étaient au nombre de : 8", anneeActuelle);
        }
    }
}