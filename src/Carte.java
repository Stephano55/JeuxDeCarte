public class Carte {
    protected int types;
    protected String cout;
    //CONSTRUCTEUR PAR DEFAUT
    public Carte(){
        this.types = 0;
        this.cout = "Inconnue";
    }
    //CONSTRUCTEUR AVEC PARAMETRES
    public Carte(String cout, int types){
        this.types = types;
        this.cout = cout;
    }
    //GETTERS
    public String getCout() {
        return cout;
    }
    public int getTypes(){return types;}
    //SETTERS
    public void setCout(String cout) {
        this.cout = cout;
    }
    public void setTypes(int types) {
        this.types = types;
    }
    public void afficher(){
        System.out.println("type = "+types+"\ncout = "+cout);
    }
}
