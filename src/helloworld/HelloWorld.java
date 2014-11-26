/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 * This class demonstrates how to implement a basic HelloWorld class 
 * @author bill mittenzwey
 */
public class HelloWorld {

    /**
     * The entry point method for this class
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        if (args.length> 0 && args[0] instanceof String)
            System.out.println(args[0]);
        else
            System.out.println("Hello Default World!");
    }
    
}
