package be.technifutur.starwars;

public class Scenario3 {

    public static void main(String[] args) {

        //VaisseauAncetre va = new VaisseauAncetre("Wing");
        VaisseauEmpire ve = new VaisseauEmpire("Xwing");
        VaisseauRebel vr = new VaisseauRebel( "Millenium");
        etoiledelamort etmort = new etoiledelamort();

        ve.decoller();
        System.out.println(VaisseauAncetre.getNbrVol());
        ve.atterir();

        VaisseauAncetre va2 = ve;
        //VaisseauEmpire ve2 = va;
        ve.messageDarkvador("help");
        vr.messageR2D2("ou est c3pO ?");
        ve.afficheCamp();
        vr.afficheCamp();
        va2.afficheCamp();
        System.out.println("---------Etoile de la mort----------");
        etmort.attireVaisseau(ve);
        System.out.println("---ve------");
        etmort.attireVaisseau(vr);
        System.out.println("-----vr-----");
        etmort.attireVaisseau(va2);
        System.out.println("-----va2-----");

    }
}
