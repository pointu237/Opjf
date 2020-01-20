/**
 * Code du Projet : OPJF
 * Titre du Projet : :e jeu du pendu
 * Instructeur : Francois Dion
 * no Étudiant : 645-241108
 * Nom Étudiant : Nathan Lapointe
 */
package opjf;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Bonhomme
 * Classe pour le pendu / personnage Snowy le bonhomme de neige
 */
public class Bonhomme {
    
    private final String nom;
    private final ImageIcon[] images;
    
    public Bonhomme() {
        this.nom = "Snowy";
        this.images = getImages("Snowy", 8);
    }
 
    public String getNom() {
            return nom;
    }
    
    private static ImageIcon[] getImages(String nom, int imageCount) {
     ImageIcon[] images = new ImageIcon[imageCount];
     for (int i = 0; i < images.length; i++) {
         try {
             InputStream is = Bonhomme.class.getResourceAsStream("/opjf/ressources/" + i + ".png");
             images[i] = new ImageIcon(ImageIO.read(is));
         } 
         catch (IOException ex) {
             //Message erreurs exception a faire
         }
     }
     return images;
    }
    
    
    public ImageIcon[] getImageArray() {
        return Arrays.copyOf(images, images.length);
    }
     
     
}
