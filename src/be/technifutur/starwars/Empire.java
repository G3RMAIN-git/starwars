package be.technifutur.starwars;

 public abstract class Empire extends Personnages {

     public Empire(String nompasse){
         super(nompasse);
     }

    public void AfficheCamp(){
        System.out.println("Je suis dans l'empire");
    }

}
