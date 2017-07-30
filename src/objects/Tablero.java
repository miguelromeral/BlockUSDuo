
package objects;

import gui.Ventana;

/**
 *
 * @author Miguel
 */
public class Tablero {
    public static int NUM_CELDAS = 14;
    public Ventana ven;
    public Celda[][] celda;
    
    public Tablero(Ventana v){
        celda = new Celda[NUM_CELDAS][NUM_CELDAS];
        ven = v;
        //Podría eliminarse?
        for(int i=0; i<NUM_CELDAS; i++){
            for(int j=0; j<NUM_CELDAS; j++){
                celda[i][j] = new Celda(i, j);
            }
        }
    }
    
    public void ponerFicha(int x, int y, Ficha f){
        if(x + f.x <= NUM_CELDAS && y + f.y <= NUM_CELDAS){
            for(int i=x; i<x+f.x; i++){
                for(int j=y; j<y+f.y; j++){
                    if(f.celda[i-x][j-y].color != -1){
                        celda[j][i].pintar(f.color);
                        ven.botones[i][j].setBackground(Ventana.getColorByNum(f.color));
                    }
                }
            }
        }
    }
    
    public boolean sePuedePoner(int x, int y, Ficha f){
        if(x + f.x <= NUM_CELDAS && y + f.y <= NUM_CELDAS){
            System.out.println(f);
            for(int i=x; i<x+f.x; i++){
                for(int j=y; j<y+f.y; j++){
                    if(f.celda[i-x][j-y].color != -1){
                        if(celda[i][j].color != -1){
                            System.out.println("No se puede por ("+i+","+j+")");
                            return false;
                        }
                        System.out.println("Sí ("+i+","+j+")");
                    }
                }
            }
        }
        return true;
    }
}
