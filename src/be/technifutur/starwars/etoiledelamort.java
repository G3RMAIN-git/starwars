package be.technifutur.starwars;

public class etoiledelamort {

    public void attireVaisseau(VaisseauAncetre v){
        v.atterir();
        v.afficheCamp();
        v.decoller();

    }

    public void attireVaisseau(VaisseauEmpire e){
        e.atterir();
        e.afficheCamp();
        System.out.println("A ordres darklord");
    }

    public void attireVaisseau(VaisseauRebel r){
        r.atterir();
        r.afficheCamp();
        System.out.println("Al'aide obiwan");
        r.decoller();
    }

}
