/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author ARUL
 */
public class DuckSimulator {
    
    public static void main(String[] args) {
        
        Scanner pilih = new Scanner(System.in);
        
        System.out.println("pilih angka");
        System.out.println("1. Mallar Duck");
        System.out.println("2. Model Duck");
        System.out.println("3. Rubber Duck");
        System.out.println("4. Decoy Duck");
        System.out.println("5. Red Head Duck");
        
        int pilihan = pilih.nextInt();
        
        switch (pilihan) {
            case 1 -> {
                Duck duck_1 = new MallarDuck();
                duck_1.display();
                duck_1.performFly();
                duck_1.setFlyBehavior(new FlyWithWings());
                duck_1.performQuack();
                duck_1.setQuackBehavior(new Quack());
            }
            case 2 -> {
                Duck duck_2 = new ModelDuck();
                duck_2.display();
                duck_2.performFly();
                duck_2.setFlyBehavior(new FlyNoWay());
                duck_2.performQuack();
                duck_2.setQuackBehavior(new Quack());
            }
            case 3 -> {
                Duck duck_3 = new RubberDuck();
                duck_3.display();
                duck_3.performFly();
                duck_3.setFlyBehavior(new FlyNoWay());
                duck_3.performQuack();
                duck_3.setQuackBehavior(new Squeck());
            }
            case 4 -> {
                Duck duck_4 = new DecoyDuck();
                duck_4.display();
                duck_4.performFly();
                duck_4.setFlyBehavior(new FlyNoWay());
                duck_4.performQuack();
                duck_4.setQuackBehavior(new Quack());
            }
            case 5 -> {
                Duck duck_5 = new RedHeadDuck();
                duck_5.display();
                duck_5.performFly();
                duck_5.setFlyBehavior(new FlyWithWings());
                duck_5.performQuack();
                duck_5.setQuackBehavior(new Quack());
            }
            default -> System.out.println("milih yang bener");
        }
    }
   
}
