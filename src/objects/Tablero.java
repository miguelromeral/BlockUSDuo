
package objects;

import gui.Ventana;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

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
                        celda[i][j].pintar(f.color);
                        ven.botones[i][j].setBackground(Ventana.getColorByNum(f.color));
                    }
                }
            }
        }
    }
    public void quitarFicha(int x, int y, Ficha f){
        if(x + f.x <= NUM_CELDAS && y + f.y <= NUM_CELDAS){
            for(int i=x; i<x+f.x; i++){
                for(int j=y; j<y+f.y; j++){
                    if(f.celda[i-x][j-y].color == f.color){
                        celda[i][j].pintar(-1);
                        ven.botones[i][j].setBackground(Ventana.getColorByNum(-1));
                    }
                }
            }
        }
    }
    
    //Indica si no hay fichas ya en el tablero en esa posición
    public boolean sePuedePoner(int x, int y, Ficha f){
        if(x + f.x <= NUM_CELDAS && y + f.y <= NUM_CELDAS){
            for(int i=x; i<x+f.x; i++){
                for(int j=y; j<y+f.y; j++){
                    if(f.celda[i-x][j-y].color != -1){
                        if(celda[i][j].color != -1){
                            return false;
                        }else{
                            if(i > 0 && celda[i - 1][j].color == f.color ||
                                    i < NUM_CELDAS - 1 && celda[i + 1][j].color == f.color || 
                                    j > 0 && celda[i][j-1].color == f.color || 
                                    j < NUM_CELDAS - 1 && celda[i][j+1].color == f.color){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public boolean tocaEsquina(int x, int y, Ficha f){
        ArrayList<Celda> esquinas = new ArrayList<>();
        for(int i=0; i<f.x; i++){
            for(int j=0; j<f.y; j++){
                if(f.celda[i][j].esquina){
                    esquinas.add(new Celda(i, j));
                }
            }
        }
        if(esquinas.isEmpty()){
            return false;
        }
        ArrayList<Celda> esquinas_de_esquinas = new ArrayList<>();
        for(Celda cel : esquinas){
            if(cel.x + x> 0 && cel.y + y> 0){
                esquinas_de_esquinas.add(new Celda(cel.x +x - 1, cel.y+y - 1));
            }
            if(cel.x + x> 0 && cel.y + y < NUM_CELDAS-1){
                esquinas_de_esquinas.add(new Celda(cel.x+x - 1, cel.y+y + 1));
            }
            if(cel.x + x < NUM_CELDAS - 1 && cel.y  + y> 0){
                esquinas_de_esquinas.add(new Celda(cel.x + x+  1, cel.y+y - 1));
            }
            if(cel.x + x< NUM_CELDAS - 1 && cel.y + y< NUM_CELDAS - 1){
                esquinas_de_esquinas.add(new Celda(cel.x +x+ 1, cel.y+y + 1));
            }
        }
        //Todo bien hasta aquí
        
        
        int color = f.color;
        ponerFicha(x, y, f);
        ArrayList<Celda> celdas_filtradas = new ArrayList<>();
        for(Celda c : esquinas_de_esquinas){
            if(celda[c.x][c.y].color != f.color && (
                    c.x > 0 && celda[c.x - 1][c.y].color == f.color ||
                    c.x < NUM_CELDAS - 1 && celda[c.x + 1][c.y].color == f.color || 
                    c.y > 0 && celda[c.x][c.y-1].color == f.color || 
                    c.y < NUM_CELDAS - 1&& celda[c.x][c.y+1].color == f.color)){

            }else
                celdas_filtradas.add(c);
        }
       /* for(Celda c : celdas_filtradas){
            ven.botones[c.x][c.y].setBackground(Color.BLACK);
        }*/
        int coinc = 0;
        quitarFicha(x, y, f);
        for(Celda c : celdas_filtradas){
            if(celda[c.x][c.y].color == f.color){
                System.out.println("C: "+c.x+","+c.y);
                coinc++;
            }
        }
        return coinc > 0;
    }
    
}
