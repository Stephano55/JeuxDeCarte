//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Terrain terrain = new Terrain('B');
        Creature creature = new Creature("Dragon", 5, 5, 3);
        Sortilege sortilege = new Sortilege("Eclair", "Inflige 3 points de dégâts à une cible", 2);

        // Création du jeu
        Jeu jeu = new Jeu();

        // Ajout des cartes au jeu
        jeu.piocher(terrain);
        jeu.piocher(creature);
        jeu.piocher(sortilege);

        // Affichage du jeu
        jeu.afficher();

        // Jouer une carte
        jeu.jouer();

        // Affichage du jeu après avoir joué une carte
        jeu.afficher();
    }
}