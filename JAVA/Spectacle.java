import java.lang.reflect.Array;
import java.util.ArrayList;

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

    public void addInter(Intervention inter){
        boolean ajouter = true;
        for (Intervention intervention : interventions) {
            if (intervention.equals(inter)){
                ajouter = false;
            }
            else if (((interventions.getHeureDebut() > inter.getHeureDebut()) && (interventions.getHeureDebut() < inter.getHeureFin())))
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

    public void delInter(Intervention inter){
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