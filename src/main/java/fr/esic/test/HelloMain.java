/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.test;

/**
 *
 * @author al-am
 */
public class HelloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello guys");
        Dog rex = new Dog(); 
        rex.crier();
        rex.jouer();
    }
    
}
