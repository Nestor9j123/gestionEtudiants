/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionetablissement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionEtablissement {

    public static void main(String[] args) {
        // 1. Création des unités d'enseignement
        UniteEnseignement ue1 = new UniteEnseignement(new ArrayList<>());
        UniteEnseignement ue2 = new UniteEnseignement(new ArrayList<>());


            // 2. Création des étudiants
        Etudiant etudiant1 = new Etudiant(null, null, null, "kossi", "Yaovi", 1);
        Etudiant etudiant2 = new Etudiant(null, null, null, "Nestor", "vladmir", 2);
        Etudiant etudiant3 = new Etudiant(null, null, null, "Estelle", "Akouvi", 3);
        Etudiant etudiant4 = new Etudiant(null, null, null, "Natacha", "vladmir", 4);
        Etudiant etudiant5 = new Etudiant(null, null, null, "Bladine", "Yaovi", 1);

        // 3. Inscription des étudiants aux unités d'enseignement
        ue1.ajouterInscription(new InscriptionUE(etudiant1, ue1, 14.5f));
        ue1.ajouterInscription(new InscriptionUE(etudiant2, ue1, 19));
        ue1.ajouterInscription(new InscriptionUE(etudiant3, ue1, 18));
        ue1.ajouterInscription(new InscriptionUE(etudiant4, ue1, 19));
        ue1.ajouterInscription(new InscriptionUE(etudiant5, ue1, 20));


        ue2.ajouterInscription(new InscriptionUE(etudiant1, ue2, 18.0f));
        ue2.ajouterInscription(new InscriptionUE(etudiant2, ue2, 16.5f));
        ue2.ajouterInscription(new InscriptionUE(etudiant3, ue2, 3.0f));
        ue2.ajouterInscription(new InscriptionUE(etudiant4, ue2, 15.5f));
        ue2.ajouterInscription(new InscriptionUE(etudiant5, ue2, 13));


        // Ajoutez les autres inscriptions pour ue3, ue4, ue5, ue6 de la même manière

        // 4. Création des parcours
        List<Etudiant> etudiantsParcours1 = new ArrayList<>();
        etudiantsParcours1.add(etudiant1);
        etudiantsParcours1.add(etudiant2);
        etudiantsParcours1.add(etudiant3);
        etudiantsParcours1.add(etudiant4);
        etudiantsParcours1.add(etudiant5);
      

        Parcours parcours1 = new Parcours(etudiantsParcours1, null);

        List<Parcours> parcoursEtab1 = new ArrayList<>();
        parcoursEtab1.add(parcours1);

        // 5. Création des établissements
        Etablissement etab1 = new Etablissement(parcoursEtab1);
        List<Etablissement> etablissements = new ArrayList<>();
        etablissements.add(etab1);

        // 6. Afficher la liste des établissements et leurs parcours
System.out.println("Liste des etablissements et leurs parcours :");
        for (int i = 0; i < etablissements.size(); i++) {
            System.out.println("Etablissement " + (i + 1) + " :");
            List<Parcours> parcours = etablissements.get(i).getParcours();
            for (int j = 0; j < parcours.size(); j++) {
                System.out.println("  Parcours " + (j + 1) + " :");
                System.out.println("Etudiants du parcours " + (j + 1) + " :");
                parcours.get(j).afficherEtudiants();
            }
        }

        // 7. Calcul et affichage des moyennes par étudiant
        System.out.println("\nMoyennes des etudiants :");
        List<UniteEnseignement> listeUE = new ArrayList<>();
        listeUE.add(ue1);
        listeUE.add(ue2);
      

        // Afficher la moyenne totale des étudiants
        for (Etudiant etudiant : etudiantsParcours1) {
            System.out.println("Moyenne totale de " + etudiant.getNom() + ": " + etudiant.calculerMoyenneTotale(listeUE));
        }

        // 8. Tri des étudiants par ordre de mérite (basé sur la moyenne générale)
        System.out.println("\nListe des etudiants par ordre de merite (en fonction de leur moyenne generale) :");
        Collections.sort(etudiantsParcours1, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Double.compare(e2.calculerMoyenneTotale(listeUE), e1.calculerMoyenneTotale(listeUE));
            }
        });

        // Afficher la liste des étudiants triés par mérite
        for (Etudiant etudiant : etudiantsParcours1) {
            System.out.println("Nom : " + etudiant.getNom() + ", Prenom : " + etudiant.getPrenom() +
                    " - Moyenne generale : " + etudiant.calculerMoyenneTotale(listeUE));
        }

        // 9. Afficher les moyennes générales des unités d'enseignement
        System.out.println("\nMoyennes generales des unites d'enseignement :");
        System.out.println("Moyenne generale pour UE1: " + ue1.calculerMoyenneGenerale());
        System.out.println("Moyenne generale pour UE2: " + ue2.calculerMoyenneGenerale());

    }
}
