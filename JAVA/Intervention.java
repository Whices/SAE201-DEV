
public abstract class Intervention {
    private int idInter;
    private String heureDebut;
    private String heureFin;
    private String typeDanse;
    private int nbDanseur;
    private static int compteur = 1;
    private Professeur responsable;

    public Intervention(String heureDebut, String heureFin, String typeDanse, int nbDanseur, Professeur prof) {
        this.idInter = compteur;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.typeDanse = typeDanse;
        this.nbDanseur = nbDanseur;
        this.responsable = prof;
        prof.addInter(this);
        compteur+=1;
        
    }

    public int getIdInter() {
        return idInter;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public String getTypeDanse() {
        return typeDanse;
    }

    public int getNbDanseur() {
        return nbDanseur;
    }

    public static int getCompteur() {
        return compteur;
    }

    public Professeur getResponsable() {
        return responsable;
    }

    public void setIdInter(int idInter) {
        this.idInter = idInter;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public void setTypeDanse(String typeDanse) {
        this.typeDanse = typeDanse;
    }

    public void setNbDanseur(int nbDanseur) {
        this.nbDanseur = nbDanseur;
    }

    public void setResponsable(Professeur prof) {
        this.responsable.delInter(this);
        this.responsable = prof;
        prof.addInter(this);
    }

    @Override
    public String toString() {
        return "Intervention : idInter : " + idInter + ", heureDebut : " + heureDebut + ", heureFin : " + heureFin
                + ", typeDanse : " + typeDanse + ", nbDanseur : " + nbDanseur;
    }

    public void afficher(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Intervention other = (Intervention) obj;
        if (idInter != other.idInter)
            return false;
        if (heureDebut == null) {
            if (other.heureDebut != null)
                return false;
        } else if (!heureDebut.equals(other.heureDebut))
            return false;
        if (heureFin == null) {
            if (other.heureFin != null)
                return false;
        } else if (!heureFin.equals(other.heureFin))
            return false;
        if (typeDanse == null) {
            if (other.typeDanse != null)
                return false;
        } else if (!typeDanse.equals(other.typeDanse))
            return false;
        if (nbDanseur != other.nbDanseur)
            return false;
        return true;
    }
    
    public abstract String getType();
}

