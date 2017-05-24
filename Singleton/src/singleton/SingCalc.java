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
public class SingCalc {
   
    private static final SingCalc c = new SingCalc();
   
    private SingCalc(){
       
    }
   
    static public  SingCalc getInstance(){
        return c;
    }
   
    public int sum(int a,int b){
        return a+b;
    }
   
}