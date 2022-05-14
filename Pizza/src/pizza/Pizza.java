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
    
    ArrayList<Ingredient> topping = new ArrayList<>();
   public static void main(String[] args) {
        // TODO code application logic here
        
      
    }
    
    public Pizza() {
    }
    
//    public String getInft(){
//        return "";
//    }

    public String getSize() {
        return size;
    }


    public ArrayList<Ingredient> getTopping() {
        return topping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTopping(int i,Ingredient Ingredients) {
        this.topping.add(i, Ingredients);
    }

}
