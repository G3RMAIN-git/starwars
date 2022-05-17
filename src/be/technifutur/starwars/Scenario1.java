package be.technifutur.starwars;

public class Scenario1 {

    public static void main(String[] args){

        System.out.println("Il y à très longtemps dans une galaxie ...");
        Vaisseau v1 = null;
        Vaisseau v2 = new Vaisseau();
        Vaisseau v3 = v2;
       // int i;

        v1 = new Vaisseau();
        System.out.println(v1.nom);
        System.out.println(v1.nbMissille);
        //System.out.println(i); variable non initialisée

        v1.nom = "Millenium";
        v2.nom = "Xwing";
        v3.nom = "wing";

        System.out.println(v1.nom);
        System.out.println(v2.nom);
        System.out.println(v3.nom);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("--------------------");

        v1.nbMissille=2;
        v1.tirer();
        v2.tirer();



    }

}
