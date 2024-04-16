public class Carte {
    protected String types;
    protected int cout;
    //CONSTRUCTEUR PAR DEFAUT
    public Carte(){
        this.types = "Inconnue";
        this.cout = 0;
    }
    //CONSTRUCTEUR AVEC PARAMETRES
    public Carte(int cout, String types){
        this.types = types;
        this.cout = cout;
    }
    //GETTERS
    public int getCout() {
        return cout;
    }
    public String getTypes(){return types;}
    //SETTERS
    public void setCout(int cout) {
        this.cout = cout;
    }
    public void setTypes(String types) {
        this.types = types;
    }
}
