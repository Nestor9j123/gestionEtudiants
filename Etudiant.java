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
public class Etudiant {
    private String nom ;
    private String prenom;
    private int numCArte;
    private Ordinateur ordinateur;
    private Parcours parcoursChoisi;
    
    private List<UniteEnseignement> uniteEns;
    
    public Etudiant(Ordinateur ordinateur,Parcours parcoursChoisi,List<UniteEnseignement> uniteEns,String nom, String prenom,int numCArte){
    this.ordinateur = ordinateur;
    this.parcoursChoisi= parcoursChoisi;
    this.uniteEns = uniteEns;
    this.nom = nom;
    this.numCArte = numCArte;
    this.prenom = prenom;
    }
    
    public Ordinateur getOrdinateur(){
        return ordinateur;
    }
    
    public void setOrdinateur(Ordinateur ordinateur){
        this.ordinateur = ordinateur;
    }
    
    public Parcours getParcoursChoisi(){
        return parcoursChoisi;
    }
    
    public void setParcousChoisi( Parcours parcoursChoisi){
    this.parcoursChoisi = parcoursChoisi;
    }
    
    public  List<UniteEnseignement> getUniteEns( ){
        return uniteEns;
    }
    
    public void setUniteEns(List<UniteEnseignement> uniteEns){
     this.uniteEns= uniteEns;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumCArte() {
        return numCArte;
    }

    public void setNumCArte(int numCArte) {
        this.numCArte = numCArte;
    }
    
    public double calculerMoyenneDansUE(UniteEnseignement ue) {
    for (InscriptionUE inscription : ue.getInscriptions()) {
        if (inscription.getEtudiant().equals(this)) {
            return inscription.getMoyenne();
        }
    }
    return 0;
}

public double calculerMoyenneTotale(List<UniteEnseignement> ues) {
    double total = 0;
    int count = 0;
    for (UniteEnseignement ue : ues) {
        total += calculerMoyenneDansUE(ue);
        count++;
    }
    return count == 0 ? 0 : total / count;
}

public void afficher() {
    System.out.println("Nom : " + this.nom + ", Prenom : " + this.prenom);
}
    
}
