public class ProprieteProfessionnelle extends Propriete {
    private int nbEmployes ;
    private boolean estEtatique ;

    public ProprieteProfessionnelle (int id,String adresse,double surface ,Personne responsable, int nbEmployes,boolean estEtatique){
        super(id,adresse,surface ,responsable);
        this.nbEmployes=nbEmployes;
        this.estEtatique=estEtatique;
    }

    @Override
    public String toString() {
        return  super.toString() +" nbEmployes : " + nbEmployes +" avecPiscine : " + (estEtatique ? "oui" : "non");
    }

   public double calculImpot() {
    if (!estEtatique){
        return(100*(surface/100))+(30*nbEmployes);
    }
    return 0;
    }


}
