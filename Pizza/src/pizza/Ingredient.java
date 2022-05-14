/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Hala
 */
public class Ingredient {

    String name;
    //weight per one tometo for ex
    int weight;
    //amount of calories per one tometo
    int amount_of_calories;
    int in_stock;

    

    public Ingredient(String name, int weight, int amount_of_calories, int in_stock) {
        this.name = name;
        this.weight = weight;
        this.amount_of_calories = amount_of_calories;
        this.in_stock = in_stock;
    }
 public Ingredient(String name, int weight, int amount_of_calories) {
        this.name = name;
        this.weight = weight;
        this.amount_of_calories = amount_of_calories;
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAmount_of_calories() {
        return amount_of_calories;
    }

    public int getIn_stock() {
        return in_stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAmount_of_calories(int amount_of_calories) {
        this.amount_of_calories = amount_of_calories;
    }

    public void setIn_stock(int in_stock) {
        this.in_stock = in_stock;
    }
    
    public String getInfo(){
        return "Name: "+ this.getName()+" weight: "+ this.getWeight()+ " Amount of calories: "+ this.getAmount_of_calories()+" In stock: "+ this.getIn_stock();
    }
}
