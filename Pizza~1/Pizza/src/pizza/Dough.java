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
public class Dough {
    private String size;
    private int in_stock;
    ArrayList<Ingredient> Ingredients = new ArrayList<>();

     public Dough() {
    }
    public Dough(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public ArrayList<Ingredient> getIngredients() {
        return Ingredients;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setIngredients(ArrayList<Ingredient> Ingredients) {
        this.Ingredients = Ingredients;
    }

    public Dough(int in_stock) {
        this.in_stock = in_stock;
    }

    public int getIn_stock() {
        return in_stock;
    }

    public void setIn_stock(int in_stock) {
        this.in_stock = in_stock;
    }
    
    
}

