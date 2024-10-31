
public class Exercice2 {

    public static void main(String[] args) {
        if (args.length >= 2) {
            double nombre1 = Double.parseDouble(args[0]);
            double nombre2 = Double.parseDouble(args[1]);
            double somme = nombre1 + nombre2;
            System.out.println("La somme des deux nombres est : " + somme);
        } else {
            System.out.println("Veuillez entrer deux nombres en arguments.");
        }
    }
}
