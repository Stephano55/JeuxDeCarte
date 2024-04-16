 class Creature extends Carte {
    private String nom;
    private int nbrPtsDegats;// nombre de points de dégâts
     private int nbrPtsVie; // nombre de points de vie
     public Creature(int cout, String types, String nom, int nbrPtsDegats, int nbrPtsVie){
         super(cout, types);
         this.nom = nom;
         this.nbrPtsDegats = nbrPtsDegats;
         this.nbrPtsVie = nbrPtsVie;
         System.out.println(this.types);
     }

     public String getNom() {
         return nom;
     }
     public int getNbrPtsDegats() {
         return nbrPtsDegats;
     }
     public int getNbrPtsVie() {
         return nbrPtsVie;
     }

     public void setNom(String nom) {
         this.nom = nom;
     }
     public void setNbrPtsDegats(int nbrPtsDegats) {
         this.nbrPtsDegats = nbrPtsDegats;
     }
     public void setNbrPtsVie(int nbrPtsVie) {
         this.nbrPtsVie = nbrPtsVie;
     }
 }
