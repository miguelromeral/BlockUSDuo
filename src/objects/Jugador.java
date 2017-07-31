
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
    
    public int restantes(){
        int rest = 0;
        for(Ficha f : fichas){
            for(int i=0; i<f.x; i++){
                for(int j=0; j<f.y; j++){
                    if(f.celda[i][j].color != -1){
                        rest++;
                    }
                }
            }
        }
        return rest;
    }
}
