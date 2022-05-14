///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package pizza;
//
///**
// *
// * @author Hala
// */
public class DeepDishPan extends Pan{

    /**
     *
     */
    public DeepDishPan() { 
        this.small_capacity = 15;
        this.medum_capacity =20;
        this.larg_capacity = 25;
    }

    public DeepDishPan(int calories) {
        super(calories);
    }
    
    @Override
     String getInfo(){
        return "";
    }
    
}
