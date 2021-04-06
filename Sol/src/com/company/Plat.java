package com.company;

import java.util.ArrayList;

public class Plat {
    String nom_plat;
    ArrayList<Ingredient> listeIngredient;
    private String choucroute;

    public Plat(String n) {
        this.nom_plat = n;
        this.listeIngredient = new ArrayList<Ingredient>();
    }

    String getName() {
        return this.nom_plat;
    }

    ArrayList<Ingredient> getIngredients() {
        return this.listeIngredient;
    }

    public void ajoutIngredient(Ingredient ing) {
        this.listeIngredient.add(ing);
    }

}
