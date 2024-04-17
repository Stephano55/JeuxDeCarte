 class Terrain extends Carte {
    private char couleur;
    //CONSTRUCTEUR
    public Terrain( char couleur){
        super("p",0);
        this.couleur = couleur;

    }
     public char getCouleur(){return couleur;}
     public void setCouleur(char coul){this.couleur = coul;}
     @Override
     public void afficher(){
        super.afficher();
        System.out.println("couleur= "+this.couleur);
     }
 }
