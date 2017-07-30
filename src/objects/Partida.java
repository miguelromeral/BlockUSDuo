
package objects;

import gui.Ventana;

/**
 *
 * @author Miguel
 */
public class Partida {
    public Tablero tablero;
    public Ventana ven;
    public Jugador jugadores[];
    public int turno;
    
    public Partida(Ventana v){
        ven = v;
        tablero = new Tablero(ven);
        jugadores = new Jugador[2];
        jugadores[0] = new Jugador(0);
        jugadores[1] = new Jugador(1);
        jugadores[0].turno = true;
        turno = 0;
    }
    
    public void cambiarTurno(){
        if(turno == 0)
            turno = 1;
        else
            turno = 0;
        jugadores[0].cambiarTurno();
        jugadores[1].cambiarTurno();
    }
}
