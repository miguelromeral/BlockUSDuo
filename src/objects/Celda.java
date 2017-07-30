
package objects;

/**
 *
 * @author Miguel
 */
public class Celda {
    public int x, y;
    //Si color = -1, no ocupada.
    public int color;
    public boolean esquina;
    
    //Para las fichas...
    public Celda(){
        color = -1;
    }
    public Celda(int color){
        this.color = color;
    }
    //Para el tablero...
    public Celda(int x, int y){
        this.x = x;
        this.y = y;
        color = -1;
    }
    public void pintar(int color){
        this.color = color;
    }
    public void ponerEnTablero(int x, int y){
        this.x = x;
        this.y = y;
    }
}
