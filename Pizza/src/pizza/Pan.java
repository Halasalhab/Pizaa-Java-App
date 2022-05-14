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
public abstract class Pan {
    int calories; 
    String name;
    int small_capacity;
    int medum_capacity;
    int larg_capacity;
    public Pan(){
        this.small_capacity = 0;
        this.medum_capacity =0;
        this.larg_capacity = 0;
    };

        
    
    
    public Pan(int calories) {
        this.calories = calories;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
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

    public void setCalories(int calories) {
        this.calories = calories;
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
  abstract String getInfo();
}
