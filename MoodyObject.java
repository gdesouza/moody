/* 
*
 * @author Maycon de Moraes
 * @date 07/03/2017
 */
package com.company;

public class MoodyObject {
    
    protected String getMood(){
        return "moody";
    }
    
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!");
    }
}
