import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Spectacle {
    private String nom;
    private List<Intervention> interventions = new ArrayList<>();

    public Spectacle(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    /*public void letters(){
        for (Intervention inter : interventions) {
            
        }
    }*/

    public void addInter(Intervention inter) throws MonException{
        boolean ajouter = true;
        for (Intervention intervention : interventions) {
            if (intervention.equals(inter)){
                ajouter = false;
            }
            else if (((intervention.getHeureDebut().compareTo(inter.getHeureDebut()) < 0) && (intervention.getHeureFin().compareTo(inter.getHeureFin()) > 0)))
            {
                /* continuer a preparer cette erreur */
            }
        }
        if (ajouter){
            try {
                interventions.add(inter);
            } catch (Exception e) {
                System.out.println("erreur le paramètre donnée n'est pas une intervention");
            }
        }
        else{
            throw new MonException("l'intervention existe déjà dans le spectacle");
        }
    }

    public void delInter(Intervention inter) throws MonException{
        boolean supprimer = false;
        for (Intervention intervention : interventions) {
            if (intervention.equals(inter)){
                supprimer = true;
            }
        }
        if (supprimer){
            try {
                interventions.remove(inter);
            } catch (Exception e) {
                System.out.println("erreur le paramètre donnée n'est pas une intervention");
            }
        }
        else{
            throw new MonException("l'intervention n'existe pas dans le spectacle");
        }
    }
}