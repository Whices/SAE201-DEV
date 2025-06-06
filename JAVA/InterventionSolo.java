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

   public void addDanseur(Danseur danseur){
      Danseurs.add(danseur);
      danseur.addInterSolo(this);
   }
   public void delDanseur(Danseur danseur){
      Danseurs.remove(danseur);
      danseur.delInterSolo(this);
   }
}
