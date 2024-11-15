public class Villa extends ProprietePrivee{
    public boolean avecPiscine ;

    public Villa (int id,String adresse,double surface ,Personne responsable, int nbPieces,boolean avecPiscine){
        super(id,adresse,surface ,responsable,nbPieces);
        this.avecPiscine=avecPiscine;
    }

    @Override
    public String toString() {
        return  super.toString() +" avecPiscine : " + (avecPiscine ? "oui" : "non");
 
    }

  public double calculImpot() {
    return super.calculImpot() + (avecPiscine ? 200 : 0);
}


}