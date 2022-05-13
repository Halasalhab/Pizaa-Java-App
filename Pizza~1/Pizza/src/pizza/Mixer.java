/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.ArrayList;
/**
 *
 * @author Hala
 */
public class Mixer {
    //the big dough each time the machine starts
    Dough dough= new Dough();
    ArrayList<Ingredient> Ingredients = new ArrayList<>();
    public void makeDough(){
     //adding the ingredient to the arraylist of the dough
     Ingredients.add(0,new Ingredient("flour",100 , 150));
     Ingredients.add(1,new Ingredient("salt",100 , 150));
     Ingredients.add(2,new Ingredient("yeast",100 , 150));
     Ingredients.add(3,new Ingredient("water",100 , 150));
     dough.setIngredients(Ingredients);
     
     //changing the stock value in KG
     dough.setIn_stock(100);
    }
    
}
