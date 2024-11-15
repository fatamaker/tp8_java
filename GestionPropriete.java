public interface GestionPropriete {
    
    int MAX_PROPRIETES = 3;
    void afficherProprietes();
    boolean ajouter(Propriete p);
    boolean supprimer(Propriete p);
}
