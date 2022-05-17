package be.technifutur.starwars;

public abstract class Rebelle extends Personnages {

    public Rebelle(String nompasse){
        super(nompasse);
    }

    public void AfficheCamp(){
        System.out.println("Je suis un rebelle");
    }
}
