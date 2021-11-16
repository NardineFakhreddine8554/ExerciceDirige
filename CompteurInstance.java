
/**
 * Write a description of class CompteurInstance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompteurInstance
{
    static int compteur;
    
 public  CompteurInstance(){
     compteur++;
    }
    
   public int getNbInstance(){
       return compteur;
    }
}
