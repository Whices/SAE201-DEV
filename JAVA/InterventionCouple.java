
public class InterventionCouple extends Intervention{

   public InterventionCouple(String heureDebut, String heureFin, String typeDanse, int nbDanseur) {
      super(heureDebut, heureFin, typeDanse, nbDanseur);
   }

   @Override
   public String typeInter() {
      return "Intervention : en couple";
   }
   
}
