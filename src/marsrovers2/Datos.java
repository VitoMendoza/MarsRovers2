/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrovers2;

/**
 * Datos de ubicacion y orientacion del robot.
 * @author Vito
 */
public class Datos {

    private int x;
    private int y;
    private Character orientacion;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOrientacion(Character orientacion) {
        this.orientacion = orientacion;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Character getOrientacion() {
        return orientacion;
    }
}
