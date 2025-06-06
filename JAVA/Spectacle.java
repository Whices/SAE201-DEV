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

    public void addInter(Intervention inter) throws MonException {

        int debutInter = convertToMinutes(inter.getHeureDebut());
        int finInter = convertToMinutes(inter.getHeureFin());

        for (Intervention intervention : interventions) {
            int debutExist = convertToMinutes(intervention.getHeureDebut());
            int finExist = convertToMinutes(intervention.getHeureFin());

            if ((debutInter < finExist) && (finInter > debutExist)) {
                throw new MonException("Conflit d'horaires : une intervention se déroule déjà pendant cette période.");
            }

            if (intervention.equals(inter)) {
                throw new MonException("L'intervention existe déjà dans le spectacle");
            }
        }

        try {
            interventions.add(inter);
        } catch (Exception e) {
            System.out.println("Erreur : le paramètre donné n'est pas une intervention");
        }
    }


    private int convertToMinutes(String heure) throws MonException {
        try {
            String[] parts = heure.split("h");
            int heures = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            return heures * 60 + minutes;
        } catch (Exception e) {
            throw new MonException("Format d'heure invalide. Utilisez le format 'HHhMM' (ex : 18h30).");
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