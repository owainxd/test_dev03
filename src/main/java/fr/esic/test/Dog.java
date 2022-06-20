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
public class Dog implements Animal, Friend{

    @Override
    public void seDeplacer() {
        System.out.println("marche sur ses 4 pattes");
    }

    @Override
    public void crier() {
        System.out.println("wouf wouf wouf");   
    }

    @Override
    public void caliner() {
        System.out.println("calin");
    }

    @Override
    public void jouer() {
        System.out.println("va chercher!!! ");    }   
}
