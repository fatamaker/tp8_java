public class Lotissement implements GestionPropriete {
    protected Propriete[] tabProp;
    protected int nombre; 

    
    public Lotissement(int capacite) {
        this.tabProp = new Propriete[capacite];
        this.nombre = 0;
    }

   
    @Override
    public void afficherProprietes() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i]);
        }
    }

  
    @Override
    public boolean ajouter(Propriete p) {
        if (nombre < tabProp.length) { 
            tabProp[nombre] = p;
            nombre++;
            return true;
        }
        return false; 
    }


    @Override
    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                tabProp[i] = tabProp[nombre- 1]; 
                tabProp[nombre - 1] = null;
                nombre--;
                return true;
            }
        }
        return false; 
    }

    
    public Propriete getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null; 
    }

   
    public int getNbPieces() {
        int totalPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee )
            totalPieces += ((ProprietePrivee) tabProp[i]).getNbPieces();
        }
        return totalPieces;
    }
}
