package be.technifutur.starwars;

public class Soldat extends Rebelle  {
    public Soldat(String NomDuSoldat){
        super(NomDuSoldat);
    }



    @Override
    public void combattre() {
        System.out.println("je combat comme un soldat");
    }

}
