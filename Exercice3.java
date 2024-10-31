public class Exercice3 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int age = Integer.parseInt(args[0]);

            if (age >= 18) {
                System.out.println("Vous êtes majeur.");
            } else {
                System.out.println("Vous êtes mineur.");
            }
        } else {
            System.out.println("Veuillez entrer votre âge en argument.");
        }
    }
}