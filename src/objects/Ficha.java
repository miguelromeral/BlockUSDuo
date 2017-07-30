
package objects;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Ficha {
    //Columnas y filas respectivamente.
    // X = 3, Y = 2
    // [][]    --> (0,0)(1,0)(2,0)
    //   [][]  --> (0,1)(1,1)(2,1)`
    public int x, y;
    public int color;
    public Celda celda[][];
    public static int NUM_FICHAS = 21;
    
    public Ficha(int color){
        this.color = color;
    }
    
    public static Ficha fichaPorID(int tipo_ficha, int color){
        Ficha f = new Ficha(color);
        switch(tipo_ficha){
                    /*
            Ficha 0
            
            []
            */
            case 0: f.x = 1;
                    f.y = 1;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            []
            */
            case 1: f.x = 1;
                    f.y = 2;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            []
            []
            */
            case 2: f.x = 1;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            [][]
            */
            case 3: f.x = 2;
                    f.y = 2;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            []
            []
            []
            */
            case 4: f.x = 1;
                    f.y = 4;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[0][3].pintar(color);
                    return f;
                    /*
            Ficha 0
            
              []
              []
            [][]
            */
            case 5: f.x = 2;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            [][]
            []
            */
            case 6: f.x = 2;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    return f;
            /*
            Ficha 0
            
            [][]
            [][]
            */
            case 7: f.x = 2;
                    f.y = 2;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[1][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            [][]
              [][]
            */
            case 8: f.x = 3;
                    f.y = 2;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[2][1].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            []
            []
            []
            []
            */
            case 9: f.x = 1;
                    f.y = 5;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[0][3].pintar(color);
                    f.celda[0][4].pintar(color);
                    return f;
                    /*
            Ficha 0
            
              []
              []
              []
            [][]
            */
            case 10: f.x = 2;
                    f.y = 4;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[1][2].pintar(color);
                    f.celda[0][3].pintar(color);
                    f.celda[1][3].pintar(color);
                    return f;
                    /*
            Ficha 0
            
              []
              []
            [][]
            []
            */
            case 11: f.x = 2;
                    f.y = 4;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    f.celda[0][3].pintar(color);
                    return f;
                    /*
            Ficha 0
            
              []
            [][]
            [][]
            */
            case 12: f.x = 2;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            [][]
              []
            [][]
            */
            case 13: f.x = 2;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            [][]
            []
            []
            */
            case 14: f.x = 2;
                    f.y = 4;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[0][3].pintar(color);
                    return f;
                    /*
            Ficha 0
            
              []
              []
            [][][]
            */
            case 15: f.x = 3;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    f.celda[2][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            []
            [][][]
            */
            case 16: f.x = 3;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    f.celda[2][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            [][]
              [][]
                []
            */
            case 17: f.x = 3;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[1][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[2][1].pintar(color);
                    f.celda[2][2].pintar(color);
                    return f;/*
            Ficha 1
              [][]
              []
            [][]
            */
            case 18: f.x = 3;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[2][0].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[0][2].pintar(color);
                    f.celda[1][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
            []
            [][][]
              []
            */
            case 19: f.x = 3;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[0][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[2][1].pintar(color);
                    f.celda[1][2].pintar(color);
                    return f;
                    /*
            Ficha 0
            
              []
            [][][]
              []
            */
            case 20: f.x = 3;
                    f.y = 3;
                    f.celda = new Celda[f.x][f.y];
                    for(int i=0; i<f.x; i++){
                        for(int j=0; j<f.y; j++){
                            f.celda[i][j] = new Celda();
                        }
                    }
                    f.celda[1][0].pintar(color);
                    f.celda[0][1].pintar(color);
                    f.celda[1][1].pintar(color);
                    f.celda[2][1].pintar(color);
                    f.celda[1][2].pintar(color);
                    return f;
            default: return null;
        }
    }
    
    @Override
    public String toString(){
        String res = "Color: "+color+".\n";
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(celda[i][j].color != -1)
                    res += "[]";
                else
                    res += "  ";
            }
            res+="\n";
        }
        return res; 
    }
    
    public static ArrayList<Ficha> rellenarFichas(int color){
        ArrayList<Ficha> nuevas = new ArrayList<>();
        for(int i=0; i<NUM_FICHAS; i++){
            nuevas.add(Ficha.fichaPorID(i, color));
        }
        return nuevas;
    }
        
    //Gira una ficha:
    // [][]    -->   [][]
    //   []    -->   []
    //   [][]  --> [][]
    public void voltear(){
        Celda aux;
        int mit_x = (int) x / 2;
        for(int i=0; i<mit_x; i++){
            for(int j=0; j<y; j++){
                aux = celda[i][j];
                celda[i][j] = celda[x-1-i][j];
                celda[x-1-i][j] = aux;
            }
        }

    }
    
    public void girar_horario(){
        /*int aux = x;
        x = y;
        y = aux;*/
        //...
    }
}
