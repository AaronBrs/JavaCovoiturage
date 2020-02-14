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
    public boolean villeEstDans(ArrayList<String> villes){return true;}
    //public HashSet<String> getVilles(){}
    public boolean capaciteSuffisante(){return true;}
    public boolean estPossible(){return true;}
    //public ArrayList<Integer> attribution(){}
    public int getIdentifiant(String nomPersonne){return 1;}
    public void triePersonnes(){}
    public int getIdentifiantDichotomique(String nomPersonne){return 1;}
}