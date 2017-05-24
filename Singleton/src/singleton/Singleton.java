/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Adrián Matta
 */
public class Singleton {

   
    public static void main(String[] args) {
        
        
         SingCalc calc = SingCalc.getInstance();
        System.out.println(calc.sum(9, 12));
    }
    
}
