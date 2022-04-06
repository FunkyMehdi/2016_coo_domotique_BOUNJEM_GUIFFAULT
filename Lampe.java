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

    public String toString (){
        String aff;
        aff = "nom de la lampe :" + this.nom + "\n";
        if (!this.allume){
            aff += "Off";
        } else{
            aff+= "On";
        }
        return aff;
    }

    public String getNom() {
        return nom;
    }

    public boolean isAllume() {
        return allume;
    }

    public void setAllume(boolean allume) {
        this.allume = allume;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
