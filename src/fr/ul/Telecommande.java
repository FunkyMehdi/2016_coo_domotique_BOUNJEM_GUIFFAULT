package fr.ul;

import java.util.ArrayList;
import java.util.List;

public class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> hifis;

    public Telecommande (){
        this.lampes = new ArrayList<>();
        this.hifis = new ArrayList<>();
    }

    // LAMPE :
    public void ajouterLampe(Lampe lampe){
        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre();
    }

    public String toStringLampe(){
        String aff = "Etat des lampes : \n";
        for (int i=0; i<lampes.size(); i++){
            aff += this.lampes.get(i).toString();
        }
        return aff;
    }

    public List<Lampe> getLampes() {
        return lampes;
    }


   //HIFI :
    public void ajouterHifi(Hifi hifi){
        this.hifis.add(hifi);
    }

    public void activerHifi(int indiceHifi){
        this.hifis.get(indiceHifi).allumer();
    }

    public void desactiverHifi(int indiceHifi){
        this.hifis.get(indiceHifi).eteindre();
    }

    public String toStringHifi(){
        String aff = "";
        for (int i = 0; i<hifis.size(); i++){
            aff += this.hifis.get(i).toString();
        }
        return aff;
    }

    //HIFI et LAMPE:
    public void activertout (){
        for (int i=0; i<lampes.size(); i++){
            this.lampes.get(i).allumer();
            this.hifis.get(i).allumer();
        }
    }
}

