public interface University {
    void ajouterEtudiant(Etudiant e);
    boolean rechercherEtudiant(Etudiant e);
    boolean rechercherEtudiant(String nom);
    void supprimerEtudiant(Etudiant e);
    void displayEtudiants();
    void trierEtudiantsParId();
    void trierEtudiantsParNom();
}
