package be.technifutur.starwars;

public class Scenario3 {

    public static void main(String[] args) {

        //VaisseauAncetre va = new VaisseauAncetre("Wing");
        VaisseauEmpire ve = new VaisseauEmpire("Xwing");
        VaisseauRebel vr = new VaisseauRebel( "Millenium");

        ve.decoller();
        System.out.println(VaisseauAncetre.getNbrVol());
        ve.atterir();

        VaisseauAncetre va2 = ve;
        //VaisseauEmpire ve2 = va;
        ve.messageDarkvador("help");
        vr.messageR2D2("ou est c3pO ?");

    }
}
