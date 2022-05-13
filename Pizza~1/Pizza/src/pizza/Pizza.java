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
public class Pizza{

    /**
     * @param args the command line arguments
     */
    private String size;
//    private Dough dough;
    private String pan;
    private static final Mixer mixer= new Mixer();
//    ArrayList<Ingredient> Dough = new ArrayList<>();
    ArrayList<Ingredient> Topping = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        mixer.makeDough();
    }
    
    
    
//    public String getInft(){
//        return "";
//    }

    public Pizza(String size, String pan) {
        this.size = size;
        this.pan = pan;
    }

    public String getSize() {
        return size;
    }

    public String getPan() {
        return pan;
    }
//
//    public ArrayList<Ingredient> getDough() {
//        return Dough;
//    }

    public ArrayList<Ingredient> getTopping() {
        return Topping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

//    public void setDough(ArrayList<Ingredient> Dough) {
//        this.Dough = Dough;
//    }

    public void setTopping(ArrayList<Ingredient> Topping) {
        this.Topping = Topping;
    }


}
