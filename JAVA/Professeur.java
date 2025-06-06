import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private String nom;
    private String prenom;
    private List<Intervention> listInter = new ArrayList<>();

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Professeur :" + nom + " " + prenom;
    }
    
    public void afficher(){
        System.out.println(this.toString());
    }

    public void addInter(Intervention inter){
        this.listInter.add(inter);
    }

    public void delInter(Intervention inter){
        this.listInter.remove(inter);
    }
}
