public class Personne {
    private final String nom;
    private final int age;
    public Personne (String nom, int age )
    {
        this.nom=nom;
        this.age=age;
    }
    public void afficherInfos(){
        System.out.println("Nom : "+nom);
        System.out.println("Age : "+age);
    }
    
}


