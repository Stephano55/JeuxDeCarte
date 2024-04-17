public class Jeu {
    Carte carte[];
    int nbrCartes;
    public Jeu(){
        this.carte = new Carte[10];
        this.nbrCartes = 0;
    }
    public void piocher(Carte carte) {
        if (nbrCartes < 10) {
            carte[nbrCartes++] = carte;
            System.out.println("Carte ajoutée au jeu");
        } else {
            System.out.println("Le jeu est plein, impossible de piocher !");
        }
    }
    public void jouer() {
        if (nbrCartes > 0) {
            Carte carteAJouer = carte[0];
            if (carteAJouer != null) {
                carteAJouer.afficher();
                carte[0] = null;
                for (int i = 1; i < nbrCartes; i++) {
                    carte[i - 1] = carte[i];
                }
                carte[nbrCartes - 1] = null;
                nbrCartes--;
                System.out.println("Carte jouée !");
            }
        } else {
            System.out.println("Le jeu est vide, impossible de jouer !");
        }
    }

    public void afficher() {
        System.out.println("Cartes dans le jeu :");
        for (int i = 0; i < nbrCartes; i++) {
            System.out.println("Carte " + (i + 1) + ":");
            carte[i].afficher();
        }
    }
}
