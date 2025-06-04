
public class Professeur {
    private String nom;
    private String prenom;

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
}
