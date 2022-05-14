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
public class Dough{
//    private String size;
    int small_capacity;
    int medum_capacity;
    int larg_capacity;
    int amount_of_calories;
    int in_stock;
    ArrayList<Ingredient> Ingredients = new ArrayList<>();


    public int getAmount_of_calories() {
        return amount_of_calories;
    }

    public int getSmall_capacity() {
        return small_capacity;
    }

    public int getMedum_capacity() {
        return medum_capacity;
    }

    public int getLarg_capacity() {
        return larg_capacity;
    }

    public void setSmall_capacity(int small_capacity) {
        this.small_capacity = small_capacity;
    }

    public void setMedum_capacity(int medum_capacity) {
        this.medum_capacity = medum_capacity;
    }

    public void setLarg_capacity(int larg_capacity) {
        this.larg_capacity = larg_capacity;
    }

    public void setIngredients(ArrayList<Ingredient> Ingredients) {
        this.Ingredients = Ingredients;
    }

  
    public void setAmount_of_calories(int amount_of_calories) {
        this.amount_of_calories = amount_of_calories;
    }

     public Dough() {
        this.amount_of_calories = 0;
        this.small_capacity=5;
        this.medum_capacity=10;
        this.larg_capacity=15;
    }

    public ArrayList<Ingredient> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(int i,Ingredient Ingredients) {
        this.Ingredients.add(i, Ingredients);
    }

   public int getIn_stock() {
       return in_stock;
   }

  public void setIn_stock(int in_stock) {
       this.in_stock = in_stock;
   }
    
    
}

