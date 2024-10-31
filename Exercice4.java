public class Exercice4 {
    public static void main(String[] args){
        if (args.length > 0){
        double celsius=Double.parseDouble(args[0]);
        double fahrenheit=(9.0/5)*celsius+ 32;
        System.out.println(celsius+" degrés Celsius équivalent à "+fahrenheit+" degrés Fahrenheit .");
        

    }
    else {
        System.out.println("Veuillez entrer un argument." );

    }
        
    }
    
}
