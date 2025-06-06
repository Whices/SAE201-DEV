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

   public void addRelation(Danseur danseur1, Danseur danseur2) throws MonException {
      if (danseur1 == null || danseur2 == null) {
         throw new MonException("Les deux danseurs doivent être non null.");
      }
      if (danseur1.equals(danseur2)) {
         throw new MonException("Un danseur ne peut pas danser avec lui-même.");
      }

      String danse = getTypeDanse();
      if (!danseur1.getTypeDanse().contains(danse)) {
         throw new MonException(danseur1.getPrenom() + " ne connaît pas le type de danse : " + danse);
      }
      if (!danseur2.getTypeDanse().contains(danse)) {
         throw new MonException(danseur2.getPrenom() + " ne connaît pas le type de danse : " + danse);
      }

      if (Danseurs.containsKey(danseur1) || Danseurs.containsKey(danseur2) || Danseurs.containsValue(danseur1) || Danseurs.containsValue(danseur2)) {
         throw new MonException("L'un des danseurs est déjà assigné dans cette intervention.");
      }

      Danseurs.put(danseur1, danseur2);
      danseur1.addInterCouple(this, danseur2);
      danseur2.addInterCouple(this, danseur1);
   }

   public void delRelation(Danseur danseur1, Danseur danseur2) throws MonException {
      if (danseur1 == null || danseur2 == null) {
         throw new MonException("Les deux danseurs doivent être non null.");
      }

      if (!Danseurs.containsKey(danseur1) && !Danseurs.containsKey(danseur2)) {
         throw new MonException("Aucun des deux danseurs n'est présent dans cette intervention.");
      }

      Danseurs.remove(danseur1);
      Danseurs.remove(danseur2);

      danseur1.delInterCouple(this);
      danseur2.delInterCouple(this);
   }

   
}
