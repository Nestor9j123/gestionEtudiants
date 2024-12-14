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
public class Etablissement {
    private List<Parcours> parcours;
    
    
    public Etablissement(List<Parcours> parcours){
        this.parcours = parcours;
    }

    public List<Parcours> getParcours() {
        return parcours;
    }

    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }
    
    
 }
