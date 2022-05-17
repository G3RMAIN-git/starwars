package be.technifutur.starwars;

public class Scenario2 {

    public static void main(String[] args) {
        VaisseauSecurise v1 = new VaisseauSecurise("Millenium");
        VaisseauSecurise v2 = new VaisseauSecurise("Xwing");
        //v1.nom = "Millenium";
        //v2.nom = "Xwing";

        //v1.nbMissile = 5;

        v1.tirer();
        v1.addMissile(5);
        v1.tirer();
        v1.Remove(2);
        v1.tirer();

        v1.decoller();
        System.out.println(VaisseauSecurise.getNbrVol());
        v2.decoller();
        System.out.println(VaisseauSecurise.getNbrVol());

        v1.decoller();
        System.out.println(VaisseauSecurise.getNbrVol());

        v1.atterir();
        System.out.println(VaisseauSecurise.getNbrVol());
        v1.atterir();
        System.out.println(VaisseauSecurise.getNbrVol());
        v2.atterir();
        System.out.println(VaisseauSecurise.getNbrVol());


    }


}
