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
public class ThinPan extends Pan{

    public ThinPan() {
        this.small_capacity = 5;
        this.medum_capacity =10;
        this.larg_capacity = 15;
    }

    public ThinPan(int calories) {
        super(calories);
    }

    @Override
    String getInfo() {
        return "";
    }
    
}
