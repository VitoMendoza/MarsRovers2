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

    public void setX(int xx) {
        this.x = xx;
    }

    public void setY(int yy) {
        this.y = yy;
    }

    public void setOrientacion(Character direccion) {
        this.orientacion = direccion;
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
