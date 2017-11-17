/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionavanzadasemana1;

/**
 *
 * @author setcain
 */
public class Figure {
    String name;
    double perimetro;
    double area;

    public Figure(String name) {
        this.name = name;
        perimetro = 0;
        area = 0;
    }
    
    public void showData() {
        System.out.println("Soy un: " + name);
        System.out.println("Mi perimetro es: " + perimetro);
        System.out.println("Mi área es: " + area);
    }
}
