
package objects;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Jugador {
    public int color;
    public boolean turno;
    public ArrayList<Ficha> fichas;
    
    public Jugador(int color){
        this.color = color;
        fichas = Ficha.rellenarFichas(color);
    }
    
    public void cambiarTurno(){
        turno = !turno;
    }
    public void usarFicha(Ficha f){
        fichas.remove(f);
    }
}
