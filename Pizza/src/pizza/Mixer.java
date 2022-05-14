///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package pizza;
//
//import java.util.ArrayList;
///**
// *
// * @author Hala
// */
public class Mixer {
    //the big dough each time the machine starts
    Dough dough= new Dough();

    public Mixer() {
    }
    
    public Dough makeDough(){
     //adding the ingredient to the arraylist of the dough
     dough.setIngredients(0,new Ingredient("flour",100 , 1500,50));
     dough.setIngredients(1,new Ingredient("salt",100 , 1500,50));
     dough.setIngredients(2,new Ingredient("yeast",100 , 1500,50));
     dough.setIngredients(3,new Ingredient("water",100 , 1500,50));
     
     //changing the stock value in KG
     dough.setIn_stock(100);
        //changing the calories
        dough.getIngredients().forEach((Ingredient) -> {
            dough.setAmount_of_calories(dough.getAmount_of_calories()+Ingredient.getAmount_of_calories());
        });
    
     return dough;
    }
    
    
}
