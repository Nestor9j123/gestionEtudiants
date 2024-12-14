package com.mycompany.gestionetablissement;

import java.util.ArrayList;
import java.util.List;

public class UniteEnseignement {
    private List<InscriptionUE> inscriptions;

    public UniteEnseignement() {
        this.inscriptions = new ArrayList<>();
    }

    public UniteEnseignement(List<InscriptionUE> inscriptions) {
        this.inscriptions = inscriptions;
    }
    public void ajouterInscription(InscriptionUE inscription) {
        inscriptions.add(inscription);
    }

    public List<InscriptionUE> getInscriptions() {
        return inscriptions;
    }
    
    public void setInscriptios( List<InscriptionUE> inscriptions){
        this.inscriptions = inscriptions ;
    }

    public double calculerMoyenneGenerale() {
        double total = 0;
        for (InscriptionUE inscription : inscriptions) {
            total += inscription.getMoyenne();
        }
        return inscriptions.isEmpty() ? 0 : total / inscriptions.size();
    }
}
