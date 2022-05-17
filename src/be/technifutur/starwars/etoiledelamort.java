package be.technifutur.starwars;

public class etoiledelamort {

    public void attireVaisseau(VaisseauAncetre v) {
        if (v instanceof VaisseauRebel) {
            attireVaisseau((VaisseauRebel) v);
        } else if (v instanceof VaisseauEmpire) {
            attireVaisseau((VaisseauEmpire) v);
        } else {
            v.atterir();
            v.afficheCamp();
            v.decoller();
        }


    }

    public void attireVaisseau(VaisseauEmpire e) {
        e.atterir();
        e.afficheCamp();
        System.out.println("A ordres darklord");
    }

    public void attireVaisseau(VaisseauRebel r) {
        r.atterir();
        r.afficheCamp();
        System.out.println("Al'aide obiwan");
        r.decoller();
    }

}
