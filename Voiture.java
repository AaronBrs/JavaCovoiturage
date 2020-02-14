public class Voiture{
    private int id,capacite;
    private String ville;
    public Voiture(int id, String ville, int capacite){
        this.id=id;
        this.ville=ville;
        this.capacite=capacite;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public int getId() {
        return this.id;
    }

    public String getVille() {
        return this.ville;
    }
}