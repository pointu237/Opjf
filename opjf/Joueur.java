/**
 * Code du Projet : OPJF
 * Titre du Projet : :e jeu du pendu
 * Instructeur : Francois Dion
 * no Étudiant : 645-241108
 * Nom Étudiant : Nathan Lapointe
 */
package opjf;

/**
 * Joueur
 * Classe joueur du jeux pendu
 */
public class Joueur {
    
    private String nom;
    private double pointage;
    private boolean gagnant;
    
    public Joueur() {
        nom = "Invité";
        pointage = 0.0d;
        gagnant = false;
    }
    
    public Joueur(String n, double s) {
        nom = n;
        pointage = s;
        gagnant = false;
    }
    
    public String getNom() {
        return nom;
    }
    
    public double getScore() {
        return pointage;
    }
    
    public void setScore(double s) {
        pointage = s;
    }

    public void resetScore() {
        pointage = 0.0d;
    }
    
    public void setGagnat(boolean state) {
        gagnant = state;
    }
 
    @Override
    public String toString() {
        return "Joueur{"
                + "Nom = "     + nom
                + ", Pointage = "  + pointage
                + ", Gagnant = " + gagnant
                + '}';
    }
}
