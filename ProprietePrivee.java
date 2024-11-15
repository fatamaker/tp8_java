public class ProprietePrivee extends Propriete {
    public int nbPieces ;

    public ProprietePrivee (int id,String adresse,double surface ,Personne responsable, int nbPieces){
        super(id,adresse,surface ,responsable);
        this.nbPieces=nbPieces;
    }
      @Override
    public String toString() {
        return  super.toString() +" nbPieces :" + nbPieces ;
    }

    public double calculImpot() {
        return (50*(surface/100)) + (10*nbPieces); 
        
    }

     public int getNbPieces() {
        return nbPieces;
    }
  

}