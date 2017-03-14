/* 
*
 * @author Maycon de Moraes
 * @date 07/03/2017
 */
package com.company;

public class HappyObject extends MoodyObject {
    
    public void laugh(){
        System.out.println("hahahahahahhahahaha");
    }
    
    @Override
    protected String getMood(){
        return "Feliz";
    }
 
}
