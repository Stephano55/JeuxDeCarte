class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(int cout, String types, String nom, String explication){
        super(cout, types);
        this.nom = nom;
        this.explication = explication;
        System.out.println(this.types);
    }

    public String getNom() {
        return nom;
    }
    public String getExplication() {
        return explication;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setExplication(String explication) {
        this.explication = explication;
    }
}
