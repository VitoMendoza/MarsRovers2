/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers2;

/**
 *
 * @author Vito
 */
public class MarsRovers2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test 1 
        Robot robot1 = new Robot(1, 2, 'N');          // Inicializa la posicion del robot1
        robot1.Proceso("LMLMLMLMM");                  // Comandos de exploracion del terreno
        System.out.println(robot1.ObtenerPosicion()); // Imprime la posicion actual del robot1
        
        // Test 2 
        Robot robot2 = new Robot(3, 3, 'E'); 
        robot2.Proceso("MMRMMRMRRM");
        System.out.println(robot2.ObtenerPosicion());
    }
    
}
