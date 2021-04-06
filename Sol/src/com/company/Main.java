package com.company;

import com.company.Ingredient;
import com.company.Plat;



public class Main {

    public static void main(String[] args) {
        Plat monPlat = new Plat("choucroute");
        monPlat.ajoutIngredient(new Ingredient("choucroute","cuit" , 500, "gramme"));
        monPlat.ajoutIngredient(new Ingredient("saucisses","entieres_et_cuites" , 2, "cardinalité"));
        monPlat.ajoutIngredient(new Ingredient("lard","cuit_et_entier" , 150, "gramme"));
    }
}
