import java.util.HashMap;

public class InterventionCouple extends Intervention{
   private HashMap<Danseur, Danseur> Danseurs = new HashMap<Danseur, Danseur>();

   public InterventionCouple(String heureDebut, String heureFin, String typeDanse, int nbDanseur, Professeur prof) {
      super(heureDebut, heureFin, typeDanse, nbDanseur, prof);
   }

   @Override
   public String getType() {
      return "Intervention : en couple";
   }

   public void addRelation(Danseur danseur1, Danseur danseur2){
      Danseurs.put(danseur1, danseur2);
      danseur1.addInterCouple(this, danseur2);
      danseur2.addInterCouple(this, danseur1);
   }

   public void delRelation(Danseur danseur1, Danseur danseur2){
      Danseurs.remove(danseur1);
      Danseurs.remove(danseur2);
      danseur1.delInterCouple(this);
      danseur2.delInterCouple(this);
   }
   
}
