package fr.ul;

import java.util.Objects;

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

    @Override
    public String toString (){
        String aff;
        aff = this.nom + ": ";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lampe lampe = (Lampe) o;
        return allume == lampe.allume && Objects.equals(nom, lampe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, allume);
    }
}
