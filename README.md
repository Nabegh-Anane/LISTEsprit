# Module : Conception par Objet et Programmation Java  
## Interfaces et Collections  

### Liste  

#### Classe `Etudiant`  
Un étudiant est caractérisé par un `id`, un `nom`, et un `prenom`. Cette classe possède :  
- **Constructeurs** :  
  - Un constructeur sans paramètres.  
  - Un constructeur avec paramètres pour initialiser tous les attributs.  
- **Méthodes** :  
  - Accesseurs et mutateurs :  
    - `getId()`, `setId(int id)`  
    - `getNom()`, `setNom(String nom)`  
    - `getPrenom()`, `setPrenom(String prenom)`  
  - Redéfinition de :  
    - La méthode `boolean equals(Object o)` pour tester l'égalité de deux étudiants selon leur `id`.  
    - La méthode `toString()` pour obtenir une représentation textuelle d'un étudiant.  

#### Programme `main`  
Un programme principal doit être écrit pour tester toutes les méthodes de la classe `Etudiant`.  

---

### Interface `University`  
```
public interface University {
    public void ajouterEtudiant(Etudiant e);
    public boolean rechercherEtudiant(Etudiant e);
    public boolean rechercherEtudiant(String nom);
    public void supprimerEtudiant(Etudiant e);
    public void displayEtudiants();
    public void trierEtudiantsParId();
    public void trierEtudiantsParNom();
}
```

---

### Classes `EspritVector` et `EspritArrayList`  
Ces classes doivent être créées pour implémenter l'interface `University`.  

#### Classe `GestionUniversity`  
La classe `GestionUniversity` doit :  
- Implémenter l'interface `University`.  
- Utiliser un `ArrayList` pour gérer la liste des étudiants.  
