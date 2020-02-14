import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.lang.Math;

public class Covoiturage{
    private ArrayList<Personne> personnes;
    private ArrayList<Voiture> voitures;
    public Covoiturage(ArrayList<Personne> personnes, ArrayList<Voiture> voitures){
        this.personnes= new ArrayList<>(personnes);
        this.voitures= new ArrayList<>(voitures);
    }
    public boolean villeDesservie(String ville){
        boolean trouve = false;
        for(Voiture voit : this.voitures){
            if(voit.getVille().equals(ville)){
                trouve=true;
            }
        }
        return trouve;
    }
    public int nbPersonnes(String ville){
        int res=0;
        for(Personne pers:this.personnes){
            if(pers.getVille().equals(ville)){
                res+=1;
            }
        }
        return res;
    }
    public boolean capaciteSuffisante(String ville){
        int capaVoit=0;
        int capaVille=0;
        for(Voiture voit : this.voitures){
            if(voit.getVille()==ville) {
                capaVoit += voit.getCapacite();
            }
        }
        for(Personne pers : this.personnes){
            if(pers.getVille()==ville){
                capaVille+=1;
            }
        }
        return capaVoit>capaVille;
    }
    public boolean villeEstDans(ArrayList<String> villes, String ville){
        boolean res = false;
        for(String ville1 : villes){
            if(ville1.equals(ville)){
                res = true;
            }
        }
        return res;
    }
    public HashSet<String> getVilles(){
        HashSet<String> lesVilles = new HashSet<>();
        for(Personne personne : this.personnes){
            lesVilles.add(personne.getVille());
        }
        for(Voiture voiture : this.voitures){
            lesVilles.add(voiture.getVille());
        }
        return lesVilles;
    }
    public boolean capaciteSuffisante(){
        boolean ok = true;
        for(String ville : getVilles()){
            if(!capaciteSuffisante())
                ok=false;
        }
        return ok;
    }
    public boolean estPossible(){return true;}
    //public ArrayList<Integer> attribution(){}
    public int getIdentifiant(String nomPersonne){return 1;}
    public void triePersonnes(){}
    public int getIdentifiantDichotomique(String nomPersonne){return 1;}
}