public class InterventionSolo extends Intervention{
   
   public InterventionSolo(String heureDebut, String heureFin, String typeDanse, int nbDanseur){
      super(heureDebut,heureFin,typeDanse,nbDanseur);
   }

   @Override
   public String getType() {
      return "Intervention : individuelle";
   }
}
