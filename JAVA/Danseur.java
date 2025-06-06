import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Danseur {
   private String nom;
   private String prenom;
   private int age;
   private int id_danseur = 0;
   private static int indice = 0;
   private HashMap<InterventionCouple, Danseur> Partenaire = new HashMap<InterventionCouple, Danseur>();
   private List<InterventionSolo> soloInter = new ArrayList<>(); 
   private List<String> typeDanse = new ArrayList<>();
   
//_____________________________________


   public Danseur(String nom,String prenom,int age){
      this.nom = nom;
      this.prenom = prenom;
      this.age = age;
      this.id_danseur = indice;
      indice++;
   }

   @Override
   public String toString() {
      return "Danseur [nom=" + nom + ", prenom=" + prenom + ", age=" 
      + age + ", id_danseur=" + id_danseur + "]";
   }

   public void afficher(){
      System.out.println(this);
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getNom() {
      return nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public int getAge() {
      return age;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Danseur other = (Danseur) obj;
      if (nom == null) {
         if (other.nom != null)
            return false;
      } else if (!nom.equals(other.nom))
         return false;
      if (prenom == null) {
         if (other.prenom != null)
            return false;
      } else if (!prenom.equals(other.prenom))
         return false;
      if (age != other.age)
         return false;
      if (id_danseur != other.id_danseur)
         return false;
      return true;
   }

   public Danseur getPartenaire(InterventionCouple inter){
      return Partenaire.get(inter);
   }

   public void addInterCouple(InterventionCouple inter, Danseur partenaire){
      Partenaire.put(inter, partenaire);
   }

   public void delInterCouple(InterventionCouple inter){
      Partenaire.remove(inter);
   }

   public void addInterSolo(InterventionSolo inter){
      soloInter.add(inter);
   }

   public void delInterSolo(InterventionSolo inter){
      soloInter.remove(inter);
   }

   public void addTypeDanse(String typedanse){
      typeDanse.add(typedanse);
   }

   public void delTypeDanse(String typedanse){
      typeDanse.remove(typedanse);
   }

}
