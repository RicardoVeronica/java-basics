/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author setcain
 */
public class Triangule extends Figure {
    public double a, b, c, h;
    
    public Triangule(String name) {
        super(name);
        a = 0;
        b = 0;
        c = 0;
        h = 0;
    }
    
    public void getData() {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Introduce el lado 'a' del triangulo: ");
        a = entrance.nextDouble();
        System.out.println("Introduce el lado 'b' (base) del triangulo: ");
        b = entrance.nextDouble();
        System.out.println("Introduce el lado 'c' del triangulo: ");
        c = entrance.nextDouble();
        System.out.println("Introduce la altura del triangulo: ");
        h = entrance.nextDouble();
    }
    
    public void calcPeri() {
        perimetro = a + b + c;
    }
    
    public void calcArea() {
        area = b * h / 2;
    }
}








