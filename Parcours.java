/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionetablissement;

import java.util.List;

/**
 *
 * @author DevNestor
 */
public class Parcours {
    private List<Etudiant>  etudaintsInscrits;
    private List<Etablissement> etablissemnt;
    
    public Parcours(List<Etudiant>  etudaintsInscrits,List<Etablissement> etablissemnt){
        this.etablissemnt = etablissemnt;
        this.etudaintsInscrits = etudaintsInscrits;
    }

    public List<Etudiant> getEtudaintsInscrits() {
        return etudaintsInscrits;
    }

    public void setEtudaintsInscrits(List<Etudiant> etudaintsInscrits) {
        this.etudaintsInscrits = etudaintsInscrits;
    }

    public List<Etablissement> getEtablissemnt() {
        return etablissemnt;
    }

    public void setEtablissemnt(List<Etablissement> etablissemnt) {
        this.etablissemnt = etablissemnt;
    }
    
    public void afficherEtudiants() {
    for (Etudiant etudiant : etudaintsInscrits) {
        etudiant.afficher(); // Appelle la méthode afficher() d'Etudiant
    }
}
    
    
    
}
