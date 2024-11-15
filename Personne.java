public class Personne {
    public int cin ;
    public String nom ;
    public String prenom ;


    public Personne (int cin , String nom , String prenom){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
    }

    public int getcin () {
        return cin ;
    }
    public void setcin(int a) {
        this.cin = a;
    }

    
    public String getNom () {
        return nom ;
    }
    public void setnom(String a) {
        this.nom = a;
    }

     public String getprenom () {
        return prenom ;
    }
    public void setprenom(String a) {
        this.prenom = a;
    }


   @Override
    public String toString() {
        return  "nom :" + nom + "prenom :" + prenom + "cin :"+ cin ;
    }

}