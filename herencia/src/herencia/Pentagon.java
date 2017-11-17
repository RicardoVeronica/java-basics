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
public class Pentagon extends Figure {
    public double apot, lado;
    
    public Pentagon(String name) {
        super(name);
        lado = 0;
        apot = 0;
    }
    
    public void getData() {
        Scanner entrance = new Scanner(System.in);
        System.out.println("Introduce el lado del pentagono: ");
        lado = entrance.nextDouble();
        System.out.println("Introduce la apotema del pentagono: ");
        apot = entrance.nextDouble();
    }
    
    public void calcPeri() {
        perimetro = 5 * lado;
    }
    
    public void calcArea() {
        area = perimetro * apot / 2;
    }
}







