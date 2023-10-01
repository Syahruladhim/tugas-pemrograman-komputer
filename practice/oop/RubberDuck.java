/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author ARUL
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        //quackBehavior = new Squack();
        quackBehavior = () -> System.out.println("Squack");
    }
    
    public RubberDuck (FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    
    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
    
}
