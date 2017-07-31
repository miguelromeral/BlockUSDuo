
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
    public int total_turnos;
    
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
        total_turnos++;
        if(turno == 0)
            turno = 1;
        else
            turno = 0;
        jugadores[0].cambiarTurno();
        jugadores[1].cambiarTurno();
    }
    
    public boolean validoPrimerTurno(int x, int y, Ficha f){
        switch(total_turnos){
            case 0: 
                for(int i=0; i<f.x; i++){
                    for(int j=0; j<f.y; j++){
         //               System.out.println("Mirando ("+i+","+j+") --> ("+(i+x)+","+(j+y)+")");
                        if(i+x == 9 && j+y == 4 && f.celda[i][j].color != -1 && f.celda[i][j].esquina){
                            return true;
                        }
                    }
                }
                break;
            case 1:
                for(int i=0; i<f.x; i++){
                    for(int j=0; j<f.y; j++){
           //             System.out.println("Mirando ("+i+","+j+") --> ("+(i+x)+","+(j+y)+")");
                        if(i+x == 4 && j+y == 9 && f.celda[i][j].color != -1 && f.celda[i][j].esquina){
                            return true;
                        }
                    }
                }
                break;
            default: return false;
        }
        return false;
    }
}
