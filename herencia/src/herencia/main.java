/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author setcain
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== E J E M P L O  P O O  ===");

        System.out.println("Creacion de un objeto triangulo.");

        // Instancia de objeto triangulo
        Triangule t1 = new Triangule("Triangulo");
        // Metodos de objeto triangulo
        t1.getData();
        t1.calcPeri();
        t1.calcArea();
        t1.showData();
        
        System.out.println("================================");
        
        System.out.println("Creacion de un objeto pentagono.");

        // Instancia de objeto pentagono
        Pentagon p1 = new Pentagon("Pentagono");
        // MEtodos de objeto pentagono
        p1.getData();
        p1.calcPeri();
        p1.calcArea();
        p1.showData();
    }
    
}
