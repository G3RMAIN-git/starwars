package be.technifutur.starwars;

public class VaisseauSecurise {

    private  String nom;
    private int nbMissille;
    public boolean enlair = false;
    private static int nbrenvol = 0;

    public VaisseauSecurise(String anom){
        this.nom = anom;
    }


    public void decoller() {

        if (enlair) {
            System.out.println("Le vaisseau " + this.nom + " est déja en l'air et ne peut décoller a nouveau");
        } else {
            System.out.println("Le vaisseau " + this.nom + " à décollé");
            nbrenvol++;

            enlair = true;
        }


    }

    public static int getNbrVol() {
        //System.out.println(nbrenvol);
        return nbrenvol;
    }

    public void atterir() {

        if (enlair == false) {
            System.out.println("Le vaisseau " + this.nom + " est déja à terre et doit décoller avant d'atterir");
        } else {
            System.out.println("Le vaisseau " + this.nom + " à atteri");
            enlair = false;
            nbrenvol--;
        }


    }


    public boolean addMissile(int nbMissille) {
        boolean added = false;

        if (nbMissille > 0) {
            this.nbMissille++;
            added = true;
        }

        return added;
    }

    public boolean Remove(int nbMissille) {
        boolean removed = false;

        if (this.nbMissille < 0) {
            this.nbMissille = this.nbMissille - nbMissille;
            removed = true;
        }

        return removed;
    }

    /*public int getNbMissile(){

        return NbMissile;
    }*/
    public void tirer() {

        if (this.nbMissille > 0) {
            System.out.println("PAN");
            this.nbMissille--;
        } else {
            System.out.println("POUF");
        }


    }


}
