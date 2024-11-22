import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestionUniversity implements University {
    private ArrayList<Etudiant> etudiants;

    public GestionUniversity() {
        this.etudiants = new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        etudiants.sort(Comparator.comparingInt(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        etudiants.sort(Comparator.comparing(Etudiant::getNom));
    }
}
