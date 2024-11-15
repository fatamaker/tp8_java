public class Fiscalite {
    public static void main(String[] args) {
        
        Personne p1 = new Personne(1,"fatma","kerkeni");
        Personne p2 = new Personne(2,"manel","boulares");
        Personne p3 = new Personne(3,"farah","guelbi");

       
        Lotissement lotissement = new Lotissement(10);

        lotissement.ajouter(new ProprietePrivee(1,"Corniche",350,p1,4));
        lotissement.ajouter(new Villa(2,"Dar Chaabane",400,p2,6,true));
        lotissement.ajouter(new Appartement(3,"Hammamet",1200,p2,8,3));
        lotissement.ajouter(new ProprieteProfessionnelle(4, "Korba", 1000,p3,50, true));
        lotissement.ajouter(new ProprieteProfessionnelle(5,"Bir Bouragba", 2500, p1,400, false));


        System.out.println("Toutes les propriétés du lotissement:");
        lotissement.afficherProprietes();

        
        System.out.println("Nombre global de pièces: " + lotissement.getNbPieces());

        
        Propriete priveeMinImpots = null;
        for (int i = 0; i < lotissement.nombre; i++) {
            Propriete prop = lotissement.getProprieteByIndex(i);
            if (prop instanceof ProprietePrivee) {
                if (priveeMinImpots == null || prop.calculImpot() < priveeMinImpots.calculImpot()) {
                    priveeMinImpots = prop;
                }
            }
        }
        if (priveeMinImpots != null) {
            System.out.println("Propriété privée avec le moins d'impôts:");
            System.out.println("Propriétaire: " + priveeMinImpots.getProprietaire().getNom() +
                    ", Impôts: " + priveeMinImpots.calculImpot());
        }

        
        lotissement.supprimer(new Appartement(3,"Hammamet",1200,p2,8,3));
        System.out.println("Propriétés après suppression de l'appartement de Hammamet:");
        lotissement.afficherProprietes();
    

   

     
        Lotissement lt= new LotissementPrivee(10);

      
        lt.ajouter(new ProprietePrivee(1,"Corniche",350,p1,4));
        lt.ajouter(new Villa(2,"Dar Chaabane",400,p2,6,true));
        lt.ajouter(new Appartement(3,"Hammamet",1200,p2,8,3));

    
        System.out.println("Propriétés privées dans le lotissement:");
        lt.afficherProprietes();

       
        System.out.println("Nombre total de pièces des propriétés privées: " + lt.getNbPieces());

        
        ProprietePrivee proprieteParIndex = (ProprietePrivee) lt.getProprieteByIndex(1);
        System.out.println("Propriété privée à l'index 1 : " + proprieteParIndex);

       
        lt.supprimer(new Appartement(3,"Hammamet",1200,p2,8,3));
        System.out.println("Propriétés après suppression de l'appartement de Hammamet:");
        lt.afficherProprietes();


    }


} 