/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers2;
import marsrovers2.Datos;

/**
 * Inicializa y controla los procesos del robot.
 *
 * @author Vito
 */
public class Robot {

    Datos datos = new Datos();

    public Robot(int xx, int yy, Character direccion) {

        switch (direccion) {
            case 'N':
                datos.setX(xx);
                datos.setY(yy);
                datos.setOrientacion('N');

                break;
            case 'E':
                datos.setX(xx);
                datos.setY(yy);
                datos.setOrientacion('E');
                break;
            case 'S':
                datos.setX(xx);
                datos.setY(yy);
                datos.setOrientacion('S');
                break;
            case 'W':
                datos.setX(xx);
                datos.setY(yy);
                datos.setOrientacion('W');
        }
    }

    public void Proceso(String comandos) {

        for (int idx = 0; idx < comandos.length(); idx++) {
            Procesar(comandos.charAt(idx));
        }
    }

    private void Procesar(Character comando) {
        if (comando.equals('L')) {
            switch (datos.getOrientacion()) {
                case 'N':
                    datos.setOrientacion('W');
                    break;
                case 'E':
                    datos.setOrientacion('N');
                    break;
                case 'S':
                    datos.setOrientacion('E');
                    break;
                case 'W':
                    datos.setOrientacion('S');
            }
        } else if (comando.equals('R')) {
            switch (datos.getOrientacion()) {
                case 'N':
                    datos.setOrientacion('E');
                    break;
                case 'E':
                    datos.setOrientacion('S');
                    break;
                case 'S':
                    datos.setOrientacion('W');
                    break;
                case 'W':
                    datos.setOrientacion('N');
            }
        } else if (comando.equals('M')) {
            switch (datos.getOrientacion()) {
                case 'N':
                    datos.setY(datos.getY() + 1);
                    break;
                case 'E':
                    datos.setX(datos.getX() + 1);
                    break;
                case 'S':
                    datos.setY(datos.getY() - 1);
                    break;
                case 'W':
                    datos.setX(datos.getX() - 1);
            }
        } else {
            throw new IllegalArgumentException(
                    "Error de comando");
        }
    }

    public String ObtenerPosicion() {
        return Integer.toString(datos.getX()) + " " + Integer.toString(datos.getY()) + " " + datos.getOrientacion();
    }

}
