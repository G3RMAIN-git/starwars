package be.technifutur.starwars;

public abstract class Sith extends Empire implements Force{

    public Sith(String nom){
        super(nom);
    }
    public void combattre(){
        System.out.println("Je combat comme un sith");
    }
    public void utiliseForce(){
        System.out.println("J'utilise le coté obscure de la force");
    }
}


