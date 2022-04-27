package fr.ul;

import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;

    public Telecommande (){
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre();
    }

    public void activertout (){
        for (int i=0; i<lampes.size(); i++){
            this.lampes.get(i).allumer();
        }
    }

    public String toString (){
        String aff = "Etat des lampes : \n";
        for (int i=0; i<lampes.size(); i++){
            aff += this.lampes.get(i).toString();
        }
        return aff;
    }

    public List<Lampe> getLampes() {
        return lampes;
    }
}

