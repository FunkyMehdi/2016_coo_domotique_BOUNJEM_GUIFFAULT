public class Lampe {
    private String nom;
    private boolean allume;

    public Lampe (String n){
        this.nom = n;
        this.allume = false;
    }

    public void allumer(){
        this.allume = true;
    }

    public void eteindre(){
        this.allume = false;
    }
}
