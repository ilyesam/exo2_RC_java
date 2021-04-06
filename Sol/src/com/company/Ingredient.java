package com.company;

public class Ingredient {
    String nom_aliment, etat;
    int quantite;
    String unite;
    public Ingredient(String n, String e, int q, String unite){
        this.nom_aliment = n;
        this.etat = e;
        this.quantite =q;
        this.unite = unite;
    }
    public boolean equals(Object objet){

       Ingredient objetIng = (Ingredient) objet;

           if (this.nom_aliment == objetIng.nom_aliment && this.etat == objetIng.etat) {
               return true;
           }else{
               return false;
           }
        }
    }


