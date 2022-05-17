package be.technifutur.starwars;

public class Vaisseau {
    public String nom;
    public int nbMissille;


    public void tirer(){
        //int nbMissile = 3;
        if (this.nbMissille>0) {
            System.out.println("PAN");
            this.nbMissille--;
        }
            else{
                System.out.println("POUF");
            }

        }
    }

