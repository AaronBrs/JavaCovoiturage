public class Personne{
    private int id;
    private String nom,ville;
    private boolean permis;
    public Personne(int id,String nom,String ville,boolean permis){
            this.id=id;
            this.nom=nom;
            this.ville=ville;
            this.permis=permis;
    }

    public boolean peutConduire(){
        return this.permis;
    }

    public String getVille(){
        return this.ville;
    }

    public int getId(){
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }
}