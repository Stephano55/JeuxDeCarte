 class Terrain extends Carte {
    private char couleur;
    //CONSTRUCTEUR
    public Terrain(int cout, String type, char couleur){
        super(cout, type);
        this.couleur = couleur;
    }
     public char getCouleur(){return couleur;}
     public void setCouleur(char coul){this.couleur = coul;}
 }
