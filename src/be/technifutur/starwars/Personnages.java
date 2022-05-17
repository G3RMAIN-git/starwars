package be.technifutur.starwars;

public abstract class Personnages {

    private final String nom;
    public Personnages(String anom){ // constructeur pour le nom inmodifiable
        if(anom != null && anom.trim().length()>0)
            this.nom = anom;
    }

    public String getNom() {
        return nom;
    }

    public abstract  void afficheCamp();
    public abstract void combattre();
}
