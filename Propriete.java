abstract public class Propriete {
    protected int id ;
    protected Personne responsable ;
    protected String adresse ;
    protected double surface ; 
    
    public Propriete (int id,String adresse,double surface ,Personne responsable){
        this.id =id;
        this.adresse=adresse;
        this.surface=surface;
        this.responsable=responsable;

    }

    @Override
    public String toString() {
        return  "id : " + id  + ", adresse : " + adresse   + ", surface : "+ surface +" , responsable : "+responsable ;
    }

    public int getId() {
        return id;
    }

   
    public Personne getProprietaire() {
        return responsable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Propriete propriete = (Propriete) obj;
        return id == propriete.id;
    }



    abstract double calculImpot();

}