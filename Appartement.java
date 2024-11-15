public class Appartement extends ProprietePrivee{
    public int numEtage ;

    public Appartement (int id,String adresse,double surface ,Personne responsable, int nbPieces,int numEtage){
        super(id,adresse,surface ,responsable,nbPieces);
        this.numEtage=numEtage;
    }
    @Override
    public String toString() {
        return  super.toString() +" numEtage :" + numEtage;
 
    }

}