public class Main {
    public static void main(String[] args) {
        // Création de la gestion des étudiants
        GestionUniversity gestion = new GestionUniversity();

        // Création des étudiants
        Etudiant e1 = new Etudiant(1, "Ali", "Ahmed");
        Etudiant e2 = new Etudiant(2, "Zahra", "Khaled");
        Etudiant e3 = new Etudiant(3, "Mohamed", "Samir");

        // Ajout des étudiants
        gestion.ajouterEtudiant(e1);
        gestion.ajouterEtudiant(e2);
        gestion.ajouterEtudiant(e3);

        // Affichage des étudiants
        System.out.println("Liste des étudiants :");
        gestion.displayEtudiants();

        // Recherche par étudiant
        System.out.println("\nRecherche d'un étudiant (e1) : " + gestion.rechercherEtudiant(e1));

        // Recherche par nom
        System.out.println("Recherche d'un étudiant avec le nom 'Zahra' : " + gestion.rechercherEtudiant("Zahra"));

        // Suppression d'un étudiant
        System.out.println("\nSuppression de l'étudiant e2.");
        gestion.supprimerEtudiant(e2);

        // Affichage après suppression
        System.out.println("Liste des étudiants après suppression :");
        gestion.displayEtudiants();

        // Tri par ID
        System.out.println("\nTri des étudiants par ID :");
        gestion.trierEtudiantsParId();
        gestion.displayEtudiants();

        // Tri par Nom
        System.out.println("\nTri des étudiants par Nom :");
        gestion.trierEtudiantsParNom();
        gestion.displayEtudiants();
    }
}
