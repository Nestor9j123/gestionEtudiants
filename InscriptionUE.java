/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionetablissement;

/**
 *
 * @author DevNestor
 */
public class InscriptionUE {
    private Etudiant etudiant ;
    private UniteEnseignement unEnseignement;
    
    private float moyenne;
    
    
    //constructeur
    
    public InscriptionUE(Etudiant etudiant, UniteEnseignement unEnseignement, float moyenne){
        this.etudiant = etudiant;
        this.unEnseignement = unEnseignement;
        this.moyenne = moyenne;
    }
    public Etudiant getEtudiant(){
        return etudiant;
    }
    
    public void setEtudiant(Etudiant etudiant){
        this.etudiant= etudiant;
    }
    
    public UniteEnseignement getUnEnseignement(){
        return unEnseignement;
    }
    
    public void setUnEnseignement(UniteEnseignement unEnseignement){
        this.unEnseignement = unEnseignement;
    }
    
    public float getMoyenne(){
        return moyenne;
        
    }
    
    public void setMoyenne(float moyenne){
        this.moyenne= moyenne;
    }
    
    
}
