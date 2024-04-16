 class Terrain extends Carte {
    private char couleur;
    //CONSTRUCTEUR
    public Terrain(int cout, String type, char couleur){
        super(cout, type);
        this.cout = 0;
        this.couleur = couleur;
        System.out.println(this.types);
    }
     public char getCouleur(){return couleur;}
     public void setCouleur(char coul){this.couleur = coul;}
 }
