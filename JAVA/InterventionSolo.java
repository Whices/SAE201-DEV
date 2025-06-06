public class InterventionSolo extends Intervention{
   
   public InterventionSolo(String heureDebut, String heureFin, String typeDanse, int nbDanseur, Professeur prof){
      super(heureDebut,heureFin,typeDanse,nbDanseur,prof);
   }

   @Override
   public String getType() {
      return "Intervention : individuelle";
   }
}
