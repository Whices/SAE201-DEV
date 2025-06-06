import java.util.ArrayList;
import java.util.List;

public class InterventionSolo extends Intervention{
   private List<Danseur> Danseurs = new ArrayList<>(); 

   public InterventionSolo(String heureDebut, String heureFin, String typeDanse, int nbDanseur, Professeur prof){
      super(heureDebut,heureFin,typeDanse,nbDanseur, prof);
   }

   @Override
   public String getType() {
      return "Intervention : individuelle";
   }

   public void addDanseur(Danseur danseur) throws MonException {
      if (danseur == null) {
         throw new MonException("Le danseur ne peut pas être null.");
      }

      String danse = getTypeDanse();
      if (!danseur.getTypeDanse().contains(danse)) {
         throw new MonException(danseur.getPrenom() + " ne connaît pas le type de danse : " + danse);
      }

      if (Danseurs.contains(danseur)) {
         throw new MonException("Ce danseur participe déjà à cette intervention solo.");
      }

      Danseurs.add(danseur);
      danseur.addInterSolo(this);
   }

   public void delDanseur(Danseur danseur) throws MonException {
      if (danseur == null) {
         throw new MonException("Le danseur ne peut pas être null.");
      }

      if (!Danseurs.contains(danseur)) {
         throw new MonException("Ce danseur ne participe pas à cette intervention.");
      }

      Danseurs.remove(danseur);
      danseur.delInterSolo(this);
   }
}
