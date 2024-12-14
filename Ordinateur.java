/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionetablissement;

/**
 *
 * @author DevNestor
 */
public class Ordinateur {
   private  Etudiant proprietaire;
   public Ordinateur( Etudiant proprietaire){
       this.proprietaire = proprietaire;
   }
   
   public Etudiant getProprietaire(){
       return proprietaire;
   }
   
   public void setProprietaire( Etudiant proprietaire){
       this.proprietaire = proprietaire;
   }
}
