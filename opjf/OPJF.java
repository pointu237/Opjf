/**
 * Code du Projet : OPJF
 * Titre du Projet : :le jeu du pendu
 * Instructeur : Francois Dion
 * no etudiant : 645-241108
 * Nom etudiant : Nathan Lapointe
 */
package opjf;

import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * OPJF
 * Logique / variable d'instance - jeu du pendu
 */
public class OPJF {

    public static String[] mesMots = {"production", "cabanon", "garage", "toujours", "premier", "jamais", "bonjour", "novembre", "programme"};
    //public static String[] mesMots = {"allo"};
    public static List<String> lettreIncorrect = new ArrayList<>();
    public static String mot = "";
    public static String motcache = "";
    public static int totalPartie = 0;
    public static int partieGagner = 0;
    public static String pourcentage = "";
    public static int score = 0;
    public static Pendu_UI gui = new Pendu_UI();
    public static login login = new login();
    public static int nombreRestant = 7;
    public static boolean jeuxGagner = false;
    public static Joueur leJoueur = null;
    public static Bonhomme monbonhomme = new Bonhomme();
    public static ImageIcon[] mesimages = monbonhomme.getImageArray(); 
    
    public static void main(String[] args) {
       initGame();
       login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       login.setVisible(true);
       //gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //gui.setVisible(true);
    }

    // Fonction d'initialisation de la partie
    public static void initGame(){
        jeuxGagner = false;
        mot = getMot();
        motcache = setMasque(mot);
        gui.motCourant.setText(motcache);
        nombreRestant = 7;
        gui.NombreRestant.setText(Integer.toString(nombreRestant));
        gui.ActeurPendu.setIcon(mesimages[7-nombreRestant]);
        gui.reinitgame();
    }
    
    // Fonction pour changé l'état du clavier activé = true / désactivé = false
    public static void clavierState(boolean state){
        Component[] composante = gui.clavierPanel.getComponents();
        for (Component composante1 : composante) {
            if (composante1 instanceof JButton) {
                JButton button = (JButton) composante1;
                button.setEnabled(state);
            }
        }   
    }
    
    // Fonction pour recupéré un nouveau mot / nouvelle partie
    public static String getMot(){
        clavierState(true);
        String mottemp = mesMots[(int) (Math.random() * mesMots.length)];
        return mottemp;
    }
    
    // Masqué le mot selectionnez pour la partie 
    public static String setMasque(String lemot) {
        String result = "";
        for(int i = 0; i< lemot.length(); i++) {
                result = result + "_ ";
        }
        return result;
    }
    
    // Fonction qui calcul le pourcentage de victoire et affiche le résultat sur le UI
    static void calculpourcentage(){
        double pourc = partieGagner * 100 / totalPartie;
        pourcentage = String.valueOf(pourc) + "%";
        gui.poucentageGager.setText(pourcentage);
    }
    
    // Calcul du score et affiche le résultat sur le UI
    static void updateScore(){
        score++;
        gui.Score.setText(Integer.toHexString(score));
    }
    
    // Trouve la lettre selectionnez dans le mot et effectué le traitement
    public static void getIndexDeSelection(String a){
        int index = mot.indexOf(a);
        char c = a.charAt(0);
        StringBuilder guessTrouver = new StringBuilder(motcache);
        if (index >= 0){
            while (index >= 0){
            guessTrouver.setCharAt(index+(1*index), c);
            index = mot.indexOf(a, index+1);
            updateScore();
            }
        }
        else {
            lettreIncorrect.add(a);
            nombreRestant--;
            gui.ActeurPendu.setIcon(mesimages[7-nombreRestant]); 
            if (nombreRestant == 0 && !jeuxGagner){
                JOptionPane.showMessageDialog(gui, "Vous avez perdu!!! le mot étais : " + mot);
                totalPartie++;
                gui.partieJouer.setText(Integer.toString(totalPartie));
                gui.poucentageGager.setText(pourcentage);
                calculpourcentage();
                clavierState(false);
            }
        }
        motcache = guessTrouver.toString();
        gui.motCourant.setText(motcache);
        gui.NombreRestant.setText(Integer.toString(nombreRestant));
        if (motcache.indexOf("_") == -1){
                JOptionPane.showMessageDialog(gui, "Vous avez gagnez!!! Bravo");    
                jeuxGagner = true;
                partieGagner ++;
                gui.partieGagner.setText(Integer.toString(partieGagner));
                totalPartie++;
                gui.partieJouer.setText(Integer.toString(totalPartie));
                calculpourcentage();
                clavierState(false);
                }
    }
}
