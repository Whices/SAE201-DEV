import java.util.ArrayList;

public class Professeur {
    private String nom;
    private String prenom;
    private ArrayList<Intervention> listInter = new ArrayList<>();

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

    public void ajouterInter(Intervention inter){
        this.listInter.add(inter);
    }

    public void enleverInter(Intervention inter){
        this.listInter.remove(inter);
    }
}
