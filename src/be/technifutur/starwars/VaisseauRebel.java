package be.technifutur.starwars;

public class VaisseauRebel extends VaisseauAncetre {

    public VaisseauRebel(String anom){
        super(anom);


    }

    @Override
    public void afficheCamp() {
        System.out.println("je suis un rebel");
    }

    public void messageR2D2(String message){
        System.out.println("bip bip");
    }


}
