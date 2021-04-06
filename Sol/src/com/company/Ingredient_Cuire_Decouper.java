package com.company;

public class Ingredient_Cuire_Decouper extends Ingredient{
    int temperature;
    Ingredient_Cuire_Decouper(String n, String e, int q, String unite, int t) {
        super(n, e, q, unite);
        this.temperature = t;
    }
    void cuire(){
        this.etat = "cuit";
        this.temperature = 90;
    }
    void decouper(){

        this.etat = "découpé";
    }
}
