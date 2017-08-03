/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import objects.Ficha;
import objects.Partida;
import objects.Tablero;

/**
 *
 * @author Miguel
 */
public class Ventana extends javax.swing.JFrame {

    public JButton botones[][]; 
    public Partida juego;
    public Ficha seleccionada[];
    //Indica si la partida va normal (1), si un jugador ha acabado (2) o si ninguno puede mover (3)
    public int vueltas;
    private JLabel labels[];
    
    public void iniciarBotones(){
        botones[0][0] = boton_0;
        botones[1][0] = boton_1;
        botones[2][0] = boton_2;
        botones[3][0] = boton_3;
        botones[4][0] = boton_4;
        botones[5][0] = boton_5;
        botones[6][0] = boton_6;
        botones[7][0] = boton_7;
        botones[8][0] = boton_8;
        botones[9][0] = boton_9;
        botones[10][0] = boton_10;
        botones[11][0] = boton_11;
        botones[12][0] = boton_12;
        botones[13][0] = boton_13;
        botones[0][1] = boton_14;
        botones[1][1] = boton_15;
        botones[2][1] = boton_16;
        botones[3][1] = boton_17;
        botones[4][1] = boton_18;
        botones[5][1] = boton_19;
        botones[6][1] = boton_20;
        botones[7][1] = boton_21;
        botones[8][1] = boton_22;
        botones[9][1] = boton_23;
        botones[10][1] = boton_24;
        botones[11][1] = boton_25;
        botones[12][1] = boton_26;
        botones[13][1] = boton_27;
        botones[0][2] = boton_28;
        botones[1][2] = boton_29;
        botones[2][2] = boton_30;
        botones[3][2] = boton_31;
        botones[4][2] = boton_32;
        botones[5][2] = boton_33;
        botones[6][2] = boton_34;
        botones[7][2] = boton_35;
        botones[8][2] = boton_36;
        botones[9][2] = boton_37;
        botones[10][2] = boton_38;
        botones[11][2] = boton_39;
        botones[12][2] = boton_40;
        botones[13][2] = boton_41;
        botones[0][3] = boton_42;
        botones[1][3] = boton_43;
        botones[2][3] = boton_44;
        botones[3][3] = boton_45;
        botones[4][3] = boton_46;
        botones[5][3] = boton_47;
        botones[6][3] = boton_48;
        botones[7][3] = boton_49;
        botones[8][3] = boton_50;
        botones[9][3] = boton_51;
        botones[10][3] = boton_52;
        botones[11][3] = boton_53;
        botones[12][3] = boton_54;
        botones[13][3] = boton_55;
        botones[0][4] = boton_56;
        botones[1][4] = boton_57;
        botones[2][4] = boton_58;
        botones[3][4] = boton_59;
        botones[4][4] = boton_60;
        botones[5][4] = boton_61;
        botones[6][4] = boton_62;
        botones[7][4] = boton_63;
        botones[8][4] = boton_64;
        botones[9][4] = boton_65;
        botones[10][4] = boton_66;
        botones[11][4] = boton_67;
        botones[12][4] = boton_68;
        botones[13][4] = boton_69;
        botones[0][5] = boton_70;
        botones[1][5] = boton_71;
        botones[2][5] = boton_72;
        botones[3][5] = boton_73;
        botones[4][5] = boton_74;
        botones[5][5] = boton_75;
        botones[6][5] = boton_76;
        botones[7][5] = boton_77;
        botones[8][5] = boton_78;
        botones[9][5] = boton_79;
        botones[10][5] = boton_80;
        botones[11][5] = boton_81;
        botones[12][5] = boton_82;
        botones[13][5] = boton_83;
        botones[0][6] = boton_84;
        botones[1][6] = boton_85;
        botones[2][6] = boton_86;
        botones[3][6] = boton_87;
        botones[4][6] = boton_88;
        botones[5][6] = boton_89;
        botones[6][6] = boton_90;
        botones[7][6] = boton_91;
        botones[8][6] = boton_92;
        botones[9][6] = boton_93;
        botones[10][6] = boton_94;
        botones[11][6] = boton_95;
        botones[12][6] = boton_96;
        botones[13][6] = boton_97;
        botones[0][7] = boton_98;
        botones[1][7] = boton_99;
        botones[2][7] = boton_100;
        botones[3][7] = boton_101;
        botones[4][7] = boton_102;
        botones[5][7] = boton_103;
        botones[6][7] = boton_104;
        botones[7][7] = boton_105;
        botones[8][7] = boton_106;
        botones[9][7] = boton_107;
        botones[10][7] = boton_108;
        botones[11][7] = boton_109;
        botones[12][7] = boton_110;
        botones[13][7] = boton_111;
        botones[0][8] = boton_112;
        botones[1][8] = boton_113;
        botones[2][8] = boton_114;
        botones[3][8] = boton_115;
        botones[4][8] = boton_116;
        botones[5][8] = boton_117;
        botones[6][8] = boton_118;
        botones[7][8] = boton_119;
        botones[8][8] = boton_120;
        botones[9][8] = boton_121;
        botones[10][8] = boton_122;
        botones[11][8] = boton_123;
        botones[12][8] = boton_124;
        botones[13][8] = boton_125;
        botones[0][9] = boton_126;
        botones[1][9] = boton_127;
        botones[2][9] = boton_128;
        botones[3][9] = boton_129;
        botones[4][9] = boton_130;
        botones[5][9] = boton_131;
        botones[6][9] = boton_132;
        botones[7][9] = boton_133;
        botones[8][9] = boton_134;
        botones[9][9] = boton_135;
        botones[10][9] = boton_136;
        botones[11][9] = boton_137;
        botones[12][9] = boton_138;
        botones[13][9] = boton_139;
        botones[0][10] = boton_140;
        botones[1][10] = boton_141;
        botones[2][10] = boton_142;
        botones[3][10] = boton_143;
        botones[4][10] = boton_144;
        botones[5][10] = boton_145;
        botones[6][10] = boton_146;
        botones[7][10] = boton_147;
        botones[8][10] = boton_148;
        botones[9][10] = boton_149;
        botones[10][10] = boton_150;
        botones[11][10] = boton_151;
        botones[12][10] = boton_152;
        botones[13][10] = boton_153;
        botones[0][11] = boton_154;
        botones[1][11] = boton_155;
        botones[2][11] = boton_156;
        botones[3][11] = boton_157;
        botones[4][11] = boton_158;
        botones[5][11] = boton_159;
        botones[6][11] = boton_160;
        botones[7][11] = boton_161;
        botones[8][11] = boton_162;
        botones[9][11] = boton_163;
        botones[10][11] = boton_164;
        botones[11][11] = boton_165;
        botones[12][11] = boton_166;
        botones[13][11] = boton_167;
        botones[0][12] = boton_168;
        botones[1][12] = boton_169;
        botones[2][12] = boton_170;
        botones[3][12] = boton_171;
        botones[4][12] = boton_172;
        botones[5][12] = boton_173;
        botones[6][12] = boton_174;
        botones[7][12] = boton_175;
        botones[8][12] = boton_176;
        botones[9][12] = boton_177;
        botones[10][12] = boton_178;
        botones[11][12] = boton_179;
        botones[12][12] = boton_180;
        botones[13][12] = boton_181;
        botones[0][13] = boton_182;
        botones[1][13] = boton_183;
        botones[2][13] = boton_184;
        botones[3][13] = boton_185;
        botones[4][13] = boton_186;
        botones[5][13] = boton_187;
        botones[6][13] = boton_188;
        botones[7][13] = boton_189;
        botones[8][13] = boton_190;
        botones[9][13] = boton_191;
        botones[10][13] = boton_192;
        botones[11][13] = boton_193;
        botones[12][13] = boton_194;
        botones[13][13] = boton_195;

    }
    
    public void iniciarLabels(){
        labels = new JLabel[2*Tablero.NUM_CELDAS + 1];
        labels[0] = lxy;
        labels[1] = ly0;
        labels[2] = ly1;
        labels[3] = ly2;
        labels[4] = ly3;
        labels[5] = ly4;
        labels[6] = ly5;
        labels[7] = ly6;
        labels[8] = ly7;
        labels[9] = ly8;
        labels[10] = ly9;
        labels[11] = ly10;
        labels[12] = ly11;
        labels[13] = ly12;
        labels[14] = ly13;
        labels[15] = lx0;
        labels[16] = lx1;
        labels[17] = lx2;
        labels[18] = lx3;
        labels[19] = lx4;
        labels[20] = lx5;
        labels[21] = lx6;
        labels[22] = lx7;
        labels[23] = lx8;
        labels[24] = lx9;
        labels[25] = lx10;
        labels[26] = lx11;
        labels[27] = lx12;
        labels[28] = lx13;
    }
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        juego = new Partida(this);
        vueltas = 1;
        seleccionada = new Ficha[2];
        seleccionada[0] = null;
        seleccionada[1] = null;
        botones = new JButton[Tablero.NUM_CELDAS][Tablero.NUM_CELDAS];
        iniciarBotones();
        iniciarLabels();
        pTablero.setLayout(new GridLayout(Tablero.NUM_CELDAS+1,Tablero.NUM_CELDAS+1));
        
        for(int i=0; i<=Tablero.NUM_CELDAS; i++){
            pTablero.add(labels[i]);
        }
        for(int i=0; i<Tablero.NUM_CELDAS; i++){
            pTablero.add(labels[Tablero.NUM_CELDAS+1+i]);
            for(int j=0; j<Tablero.NUM_CELDAS; j++){
                botones[i][j].setBackground(getColorByNum(-1));
                pTablero.add(botones[i][j]);
            }
        }
        botones[9][4].setBackground(getColorByNum(2));
        botones[4][9].setBackground(getColorByNum(3));
        
       ponerFichasRestantesJugador(0);
       ponerFichasRestantesJugador(1);
       
        restantesJ1.setText("Te quedan "+juego.jugadores[0].restantes()+" bloques.");
        restantesJ2.setText("Te quedan "+juego.jugadores[1].restantes()+" bloques.");
        
        labelTurnoJ1.setText("¡TU TURNO!");
        labelTurnoJ2.setText("");
        labelTurnoJ1.setForeground(getColorByNum(0));
        labelTurnoJ2.setForeground(getColorByNum(1));
        
    }
    
    public void accionBoton(int x, int y){
      //  System.out.println("Botón: ("+x+","+y+") --> "+juego.tablero.celda[x][y].x+","+juego.tablero.celda[x][y].y+
      //          " ("+juego.tablero.celda[x][y].color+")");
        
      
      //  juego.tablero.movimientoPosible(x, y, 1);
      Ficha sel = seleccionada[juego.turno];
        if(sel != null){
           // if(juego.total_turnos < 2 || juego.tablero.sePuedePonerPieza(juego.turno)){
                if(juego.tablero.cabeFicha(x,y,sel)){
                    if(juego.validoPrimerTurno(x, y, sel) || juego.tablero.tocaEsquina(x, y, sel)){
                        juego.tablero.ponerFicha(x, y, sel);
                        juego.jugadores[juego.turno].fichas.remove(sel);
                        seleccionada[juego.turno] = null;
                        if(juego.turno == 0){
                            limpiarPanel(pj1Seleccionada);
                            limpiarPanel(pj1TodasFichas);
                            ponerFichasRestantesJugador(0);
                            restantesJ1.setText("Te quedan "+juego.jugadores[0].restantes()+" bloques.");
                        } else {
                            limpiarPanel(pj2Seleccionada);
                            limpiarPanel(pj2TodasFichas);
                            ponerFichasRestantesJugador(1);
                            restantesJ2.setText("Te quedan "+juego.jugadores[1].restantes()+" bloques.");
                        }
                        pasarTurno();
                    }else{
                        switch(juego.total_turnos){
                            case 0: 
                                botones[9][4].setBackground(getColorByNum(2));
                                botones[4][9].setBackground(getColorByNum(3));
                                break;
                            case 1:
                                botones[4][9].setBackground(getColorByNum(3));
                                break;
                        }
                    }
                }
            /*}else{
                JOptionPane.showMessageDialog(this, "Al jugador "+(juego.turno+1)+" ya no "
                        + "le quedan movimientos.", "Fin de la partida de "+(juego.turno+1), JOptionPane.WARNING_MESSAGE);
                vueltas++;
                juego.cambiarTurno();
                if(juego.turno == 0){
                    labelTurnoJ1.setText("¡TU TURNO!");
                    labelTurnoJ2.setText("");
                }else{
                    labelTurnoJ2.setText("¡TU TURNO!");
                    labelTurnoJ1.setText("");
                }
                jLabel2.setText("¡Turno del jugador "+(juego.turno + 1)+"!");
            }*/
        }
    }
    
    public void ponerFichasRestantesJugador(int jugador){
        if(jugador == 0 || jugador == 1){
            for(Ficha f : juego.jugadores[jugador].fichas){
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(2,1));
                int n = (int) Math.sqrt((double) juego.jugadores[0].fichas.size());
                if(jugador == 0){
                    JButton boton = new JButton("Seleccionar");
                    boton.setVisible(true);
                    Action buttonAction = new AbstractAction() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            limpiarPanel(pj1Seleccionada);
                            pj1Seleccionada.add(printFicha(f));
                            seleccionada[0] = f;
                        }
                    };
                    boton.addActionListener(buttonAction);
                    panel.add(printFicha(f));
                    panel.add(boton);
                    pj1TodasFichas.add(panel);
                    pj1TodasFichas.setLayout(new GridLayout(n, n));
                }else{
                    JButton boton = new JButton("Seleccionar");
                    boton.setVisible(true);
                    Action buttonAction = new AbstractAction() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            limpiarPanel(pj2Seleccionada);
                            pj2Seleccionada.add(printFicha(f));
                            seleccionada[1] = f;
                        }
                    };
                    boton.addActionListener(buttonAction);
                    panel.add(printFicha(f));
                    panel.add(boton);
                    pj2TodasFichas.add(panel);
                    pj2TodasFichas.setLayout(new GridLayout(n, n));
                }
            }
        }
    }
    public void limpiarPanel(JPanel p){
        p.removeAll();
        p.revalidate();
        p.repaint();
    }
    public JPanel printFicha(Ficha f){
        JPanel panel = new JPanel();
        int max;
        if(f.y > f.x) max = f.y; else max = f.x;
        panel.setLayout(new GridLayout(max,max));
        JButton botones[][] = new JButton[max][max];
        for(int i=0; i<max; i++){
            for(int j=0; j<max; j++){
                botones[i][j] = new JButton();
                botones[i][j].setBackground(getColorByNum(-1));
                panel.add(botones[i][j]);
            }
        }
        for(int i=0; i<f.x; i++){
            for(int j=0; j<f.y; j++){
                if(f.celda[i][j].color != -1){
                    botones[i][j].setBackground(Ventana.getColorByNum(f.color));
                }
            }
        }
       panel.setVisible(true);
        return panel;
    }
   
    public static Color getColorByNum(int color){
        switch(color){
            case -1: return Color.WHITE;
            case 0: return Color.ORANGE;
            case 1: return new Color(123, 10, 133);
            case 2: return Color.YELLOW;
            case 3: return new Color(158, 71, 133);
            default: return Color.DARK_GRAY;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pTablero = new javax.swing.JPanel();
        lxy = new javax.swing.JLabel();
        ly0 = new javax.swing.JLabel();
        ly1 = new javax.swing.JLabel();
        ly2 = new javax.swing.JLabel();
        ly3 = new javax.swing.JLabel();
        ly4 = new javax.swing.JLabel();
        ly5 = new javax.swing.JLabel();
        ly6 = new javax.swing.JLabel();
        ly7 = new javax.swing.JLabel();
        ly8 = new javax.swing.JLabel();
        ly9 = new javax.swing.JLabel();
        ly10 = new javax.swing.JLabel();
        ly11 = new javax.swing.JLabel();
        ly12 = new javax.swing.JLabel();
        ly13 = new javax.swing.JLabel();
        lx0 = new javax.swing.JLabel();
        boton_0 = new javax.swing.JButton();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_7 = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_10 = new javax.swing.JButton();
        boton_11 = new javax.swing.JButton();
        boton_12 = new javax.swing.JButton();
        boton_13 = new javax.swing.JButton();
        lx1 = new javax.swing.JLabel();
        boton_14 = new javax.swing.JButton();
        boton_15 = new javax.swing.JButton();
        boton_16 = new javax.swing.JButton();
        boton_17 = new javax.swing.JButton();
        boton_18 = new javax.swing.JButton();
        boton_19 = new javax.swing.JButton();
        boton_20 = new javax.swing.JButton();
        boton_21 = new javax.swing.JButton();
        boton_22 = new javax.swing.JButton();
        boton_23 = new javax.swing.JButton();
        boton_24 = new javax.swing.JButton();
        boton_25 = new javax.swing.JButton();
        boton_26 = new javax.swing.JButton();
        boton_27 = new javax.swing.JButton();
        lx2 = new javax.swing.JLabel();
        boton_28 = new javax.swing.JButton();
        boton_29 = new javax.swing.JButton();
        boton_30 = new javax.swing.JButton();
        boton_31 = new javax.swing.JButton();
        boton_32 = new javax.swing.JButton();
        boton_33 = new javax.swing.JButton();
        boton_34 = new javax.swing.JButton();
        boton_35 = new javax.swing.JButton();
        boton_36 = new javax.swing.JButton();
        boton_37 = new javax.swing.JButton();
        boton_38 = new javax.swing.JButton();
        boton_39 = new javax.swing.JButton();
        boton_40 = new javax.swing.JButton();
        boton_41 = new javax.swing.JButton();
        lx3 = new javax.swing.JLabel();
        boton_42 = new javax.swing.JButton();
        boton_43 = new javax.swing.JButton();
        boton_44 = new javax.swing.JButton();
        boton_45 = new javax.swing.JButton();
        boton_46 = new javax.swing.JButton();
        boton_47 = new javax.swing.JButton();
        boton_48 = new javax.swing.JButton();
        boton_49 = new javax.swing.JButton();
        boton_50 = new javax.swing.JButton();
        boton_51 = new javax.swing.JButton();
        boton_52 = new javax.swing.JButton();
        boton_53 = new javax.swing.JButton();
        boton_54 = new javax.swing.JButton();
        boton_55 = new javax.swing.JButton();
        lx4 = new javax.swing.JLabel();
        boton_56 = new javax.swing.JButton();
        boton_57 = new javax.swing.JButton();
        boton_58 = new javax.swing.JButton();
        boton_59 = new javax.swing.JButton();
        boton_60 = new javax.swing.JButton();
        boton_61 = new javax.swing.JButton();
        boton_62 = new javax.swing.JButton();
        boton_63 = new javax.swing.JButton();
        boton_64 = new javax.swing.JButton();
        boton_65 = new javax.swing.JButton();
        boton_66 = new javax.swing.JButton();
        boton_67 = new javax.swing.JButton();
        boton_68 = new javax.swing.JButton();
        boton_69 = new javax.swing.JButton();
        lx5 = new javax.swing.JLabel();
        boton_70 = new javax.swing.JButton();
        boton_71 = new javax.swing.JButton();
        boton_72 = new javax.swing.JButton();
        boton_73 = new javax.swing.JButton();
        boton_74 = new javax.swing.JButton();
        boton_75 = new javax.swing.JButton();
        boton_76 = new javax.swing.JButton();
        boton_77 = new javax.swing.JButton();
        boton_78 = new javax.swing.JButton();
        boton_79 = new javax.swing.JButton();
        boton_80 = new javax.swing.JButton();
        boton_81 = new javax.swing.JButton();
        boton_82 = new javax.swing.JButton();
        boton_83 = new javax.swing.JButton();
        lx6 = new javax.swing.JLabel();
        boton_84 = new javax.swing.JButton();
        boton_85 = new javax.swing.JButton();
        boton_86 = new javax.swing.JButton();
        boton_87 = new javax.swing.JButton();
        boton_88 = new javax.swing.JButton();
        boton_89 = new javax.swing.JButton();
        boton_90 = new javax.swing.JButton();
        boton_91 = new javax.swing.JButton();
        boton_92 = new javax.swing.JButton();
        boton_93 = new javax.swing.JButton();
        boton_94 = new javax.swing.JButton();
        boton_95 = new javax.swing.JButton();
        boton_96 = new javax.swing.JButton();
        boton_97 = new javax.swing.JButton();
        lx7 = new javax.swing.JLabel();
        boton_98 = new javax.swing.JButton();
        boton_99 = new javax.swing.JButton();
        boton_100 = new javax.swing.JButton();
        boton_101 = new javax.swing.JButton();
        boton_102 = new javax.swing.JButton();
        boton_103 = new javax.swing.JButton();
        boton_104 = new javax.swing.JButton();
        boton_105 = new javax.swing.JButton();
        boton_106 = new javax.swing.JButton();
        boton_107 = new javax.swing.JButton();
        boton_108 = new javax.swing.JButton();
        boton_109 = new javax.swing.JButton();
        boton_110 = new javax.swing.JButton();
        boton_111 = new javax.swing.JButton();
        lx8 = new javax.swing.JLabel();
        boton_112 = new javax.swing.JButton();
        boton_113 = new javax.swing.JButton();
        boton_114 = new javax.swing.JButton();
        boton_115 = new javax.swing.JButton();
        boton_116 = new javax.swing.JButton();
        boton_117 = new javax.swing.JButton();
        boton_118 = new javax.swing.JButton();
        boton_119 = new javax.swing.JButton();
        boton_120 = new javax.swing.JButton();
        boton_121 = new javax.swing.JButton();
        boton_122 = new javax.swing.JButton();
        boton_123 = new javax.swing.JButton();
        boton_124 = new javax.swing.JButton();
        boton_125 = new javax.swing.JButton();
        lx9 = new javax.swing.JLabel();
        boton_126 = new javax.swing.JButton();
        boton_127 = new javax.swing.JButton();
        boton_128 = new javax.swing.JButton();
        boton_129 = new javax.swing.JButton();
        boton_130 = new javax.swing.JButton();
        boton_131 = new javax.swing.JButton();
        boton_132 = new javax.swing.JButton();
        boton_133 = new javax.swing.JButton();
        boton_134 = new javax.swing.JButton();
        boton_135 = new javax.swing.JButton();
        boton_136 = new javax.swing.JButton();
        boton_137 = new javax.swing.JButton();
        boton_138 = new javax.swing.JButton();
        boton_139 = new javax.swing.JButton();
        lx10 = new javax.swing.JLabel();
        boton_140 = new javax.swing.JButton();
        boton_141 = new javax.swing.JButton();
        boton_142 = new javax.swing.JButton();
        boton_143 = new javax.swing.JButton();
        boton_144 = new javax.swing.JButton();
        boton_145 = new javax.swing.JButton();
        boton_146 = new javax.swing.JButton();
        boton_147 = new javax.swing.JButton();
        boton_148 = new javax.swing.JButton();
        boton_149 = new javax.swing.JButton();
        boton_150 = new javax.swing.JButton();
        boton_151 = new javax.swing.JButton();
        boton_152 = new javax.swing.JButton();
        boton_153 = new javax.swing.JButton();
        lx11 = new javax.swing.JLabel();
        boton_154 = new javax.swing.JButton();
        boton_155 = new javax.swing.JButton();
        boton_156 = new javax.swing.JButton();
        boton_157 = new javax.swing.JButton();
        boton_158 = new javax.swing.JButton();
        boton_159 = new javax.swing.JButton();
        boton_160 = new javax.swing.JButton();
        boton_161 = new javax.swing.JButton();
        boton_162 = new javax.swing.JButton();
        boton_163 = new javax.swing.JButton();
        boton_164 = new javax.swing.JButton();
        boton_165 = new javax.swing.JButton();
        boton_166 = new javax.swing.JButton();
        boton_167 = new javax.swing.JButton();
        lx12 = new javax.swing.JLabel();
        boton_168 = new javax.swing.JButton();
        boton_169 = new javax.swing.JButton();
        boton_170 = new javax.swing.JButton();
        boton_171 = new javax.swing.JButton();
        boton_172 = new javax.swing.JButton();
        boton_173 = new javax.swing.JButton();
        boton_174 = new javax.swing.JButton();
        boton_175 = new javax.swing.JButton();
        boton_176 = new javax.swing.JButton();
        boton_177 = new javax.swing.JButton();
        boton_178 = new javax.swing.JButton();
        boton_179 = new javax.swing.JButton();
        boton_180 = new javax.swing.JButton();
        boton_181 = new javax.swing.JButton();
        lx13 = new javax.swing.JLabel();
        boton_182 = new javax.swing.JButton();
        boton_183 = new javax.swing.JButton();
        boton_184 = new javax.swing.JButton();
        boton_185 = new javax.swing.JButton();
        boton_186 = new javax.swing.JButton();
        boton_187 = new javax.swing.JButton();
        boton_188 = new javax.swing.JButton();
        boton_189 = new javax.swing.JButton();
        boton_190 = new javax.swing.JButton();
        boton_191 = new javax.swing.JButton();
        boton_192 = new javax.swing.JButton();
        boton_193 = new javax.swing.JButton();
        boton_194 = new javax.swing.JButton();
        boton_195 = new javax.swing.JButton();
        restantesJ2 = new javax.swing.JLabel();
        restantesJ1 = new javax.swing.JLabel();
        pj1TodasFichas = new javax.swing.JPanel();
        pj2TodasFichas = new javax.swing.JPanel();
        panelSeleccionadaJ0 = new javax.swing.JPanel();
        panelBotonesJ0 = new javax.swing.JPanel();
        bDarVuelta = new javax.swing.JButton();
        bDarVuelta2 = new javax.swing.JButton();
        bGirar = new javax.swing.JButton();
        pj1Seleccionada = new javax.swing.JPanel();
        panelSeleccionadaJ1 = new javax.swing.JPanel();
        panelBotones1 = new javax.swing.JPanel();
        bDarVuelta1 = new javax.swing.JButton();
        bDarVuelta3 = new javax.swing.JButton();
        bGirar1 = new javax.swing.JButton();
        pj2Seleccionada = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelTurnoJ2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelTurnoJ1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BlockUs Duo");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("BlockUs Duo");

        pTablero.setLayout(new java.awt.GridLayout(15, 15));

        lxy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lxy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lxy.setText("X\\Y");
        pTablero.add(lxy);

        ly0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly0.setText("0");
        pTablero.add(ly0);

        ly1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly1.setText("1");
        pTablero.add(ly1);

        ly2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly2.setText("2");
        pTablero.add(ly2);

        ly3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly3.setText("3");
        pTablero.add(ly3);

        ly4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly4.setText("4");
        pTablero.add(ly4);

        ly5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly5.setText("5");
        pTablero.add(ly5);

        ly6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly6.setText("6");
        pTablero.add(ly6);

        ly7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly7.setText("7");
        pTablero.add(ly7);

        ly8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly8.setText("8");
        pTablero.add(ly8);

        ly9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly9.setText("9");
        pTablero.add(ly9);

        ly10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly10.setText("10");
        pTablero.add(ly10);

        ly11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly11.setText("11");
        pTablero.add(ly11);

        ly12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly12.setText("12");
        pTablero.add(ly12);

        ly13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ly13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ly13.setText("13");
        pTablero.add(ly13);

        lx0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx0.setText("0");
        pTablero.add(lx0);

        boton_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_0ActionPerformed(evt);
            }
        });
        pTablero.add(boton_0);

        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });
        pTablero.add(boton_1);

        boton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_2ActionPerformed(evt);
            }
        });
        pTablero.add(boton_2);

        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });
        pTablero.add(boton_3);

        boton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_4ActionPerformed(evt);
            }
        });
        pTablero.add(boton_4);

        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });
        pTablero.add(boton_5);

        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });
        pTablero.add(boton_6);

        boton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_7ActionPerformed(evt);
            }
        });
        pTablero.add(boton_7);

        boton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_8ActionPerformed(evt);
            }
        });
        pTablero.add(boton_8);

        boton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_9ActionPerformed(evt);
            }
        });
        pTablero.add(boton_9);

        boton_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_10ActionPerformed(evt);
            }
        });
        pTablero.add(boton_10);

        boton_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_11ActionPerformed(evt);
            }
        });
        pTablero.add(boton_11);

        boton_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_12ActionPerformed(evt);
            }
        });
        pTablero.add(boton_12);

        boton_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_13ActionPerformed(evt);
            }
        });
        pTablero.add(boton_13);

        lx1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx1.setText("1");
        pTablero.add(lx1);

        boton_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_14ActionPerformed(evt);
            }
        });
        pTablero.add(boton_14);

        boton_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_15ActionPerformed(evt);
            }
        });
        pTablero.add(boton_15);

        boton_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_16ActionPerformed(evt);
            }
        });
        pTablero.add(boton_16);

        boton_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_17ActionPerformed(evt);
            }
        });
        pTablero.add(boton_17);

        boton_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_18ActionPerformed(evt);
            }
        });
        pTablero.add(boton_18);

        boton_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_19ActionPerformed(evt);
            }
        });
        pTablero.add(boton_19);

        boton_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_20ActionPerformed(evt);
            }
        });
        pTablero.add(boton_20);

        boton_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_21ActionPerformed(evt);
            }
        });
        pTablero.add(boton_21);

        boton_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_22ActionPerformed(evt);
            }
        });
        pTablero.add(boton_22);

        boton_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_23ActionPerformed(evt);
            }
        });
        pTablero.add(boton_23);

        boton_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_24ActionPerformed(evt);
            }
        });
        pTablero.add(boton_24);

        boton_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_25ActionPerformed(evt);
            }
        });
        pTablero.add(boton_25);

        boton_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_26ActionPerformed(evt);
            }
        });
        pTablero.add(boton_26);

        boton_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_27ActionPerformed(evt);
            }
        });
        pTablero.add(boton_27);

        lx2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx2.setText("2");
        pTablero.add(lx2);

        boton_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_28ActionPerformed(evt);
            }
        });
        pTablero.add(boton_28);

        boton_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_29ActionPerformed(evt);
            }
        });
        pTablero.add(boton_29);

        boton_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_30ActionPerformed(evt);
            }
        });
        pTablero.add(boton_30);

        boton_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_31ActionPerformed(evt);
            }
        });
        pTablero.add(boton_31);

        boton_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_32ActionPerformed(evt);
            }
        });
        pTablero.add(boton_32);

        boton_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_33ActionPerformed(evt);
            }
        });
        pTablero.add(boton_33);

        boton_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_34ActionPerformed(evt);
            }
        });
        pTablero.add(boton_34);

        boton_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_35ActionPerformed(evt);
            }
        });
        pTablero.add(boton_35);

        boton_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_36ActionPerformed(evt);
            }
        });
        pTablero.add(boton_36);

        boton_37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_37ActionPerformed(evt);
            }
        });
        pTablero.add(boton_37);

        boton_38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_38ActionPerformed(evt);
            }
        });
        pTablero.add(boton_38);

        boton_39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_39ActionPerformed(evt);
            }
        });
        pTablero.add(boton_39);

        boton_40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_40ActionPerformed(evt);
            }
        });
        pTablero.add(boton_40);

        boton_41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_41ActionPerformed(evt);
            }
        });
        pTablero.add(boton_41);

        lx3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx3.setText("3");
        pTablero.add(lx3);

        boton_42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_42ActionPerformed(evt);
            }
        });
        pTablero.add(boton_42);

        boton_43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_43ActionPerformed(evt);
            }
        });
        pTablero.add(boton_43);

        boton_44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_44ActionPerformed(evt);
            }
        });
        pTablero.add(boton_44);

        boton_45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_45ActionPerformed(evt);
            }
        });
        pTablero.add(boton_45);

        boton_46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_46ActionPerformed(evt);
            }
        });
        pTablero.add(boton_46);

        boton_47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_47ActionPerformed(evt);
            }
        });
        pTablero.add(boton_47);

        boton_48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_48ActionPerformed(evt);
            }
        });
        pTablero.add(boton_48);

        boton_49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_49ActionPerformed(evt);
            }
        });
        pTablero.add(boton_49);

        boton_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_50ActionPerformed(evt);
            }
        });
        pTablero.add(boton_50);

        boton_51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_51ActionPerformed(evt);
            }
        });
        pTablero.add(boton_51);

        boton_52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_52ActionPerformed(evt);
            }
        });
        pTablero.add(boton_52);

        boton_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_53ActionPerformed(evt);
            }
        });
        pTablero.add(boton_53);

        boton_54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_54ActionPerformed(evt);
            }
        });
        pTablero.add(boton_54);

        boton_55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_55ActionPerformed(evt);
            }
        });
        pTablero.add(boton_55);

        lx4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx4.setText("4");
        pTablero.add(lx4);

        boton_56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_56ActionPerformed(evt);
            }
        });
        pTablero.add(boton_56);

        boton_57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_57ActionPerformed(evt);
            }
        });
        pTablero.add(boton_57);

        boton_58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_58ActionPerformed(evt);
            }
        });
        pTablero.add(boton_58);

        boton_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_59ActionPerformed(evt);
            }
        });
        pTablero.add(boton_59);

        boton_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_60ActionPerformed(evt);
            }
        });
        pTablero.add(boton_60);

        boton_61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_61ActionPerformed(evt);
            }
        });
        pTablero.add(boton_61);

        boton_62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_62ActionPerformed(evt);
            }
        });
        pTablero.add(boton_62);

        boton_63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_63ActionPerformed(evt);
            }
        });
        pTablero.add(boton_63);

        boton_64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_64ActionPerformed(evt);
            }
        });
        pTablero.add(boton_64);

        boton_65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_65ActionPerformed(evt);
            }
        });
        pTablero.add(boton_65);

        boton_66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_66ActionPerformed(evt);
            }
        });
        pTablero.add(boton_66);

        boton_67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_67ActionPerformed(evt);
            }
        });
        pTablero.add(boton_67);

        boton_68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_68ActionPerformed(evt);
            }
        });
        pTablero.add(boton_68);

        boton_69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_69ActionPerformed(evt);
            }
        });
        pTablero.add(boton_69);

        lx5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx5.setText("5");
        pTablero.add(lx5);

        boton_70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_70ActionPerformed(evt);
            }
        });
        pTablero.add(boton_70);

        boton_71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_71ActionPerformed(evt);
            }
        });
        pTablero.add(boton_71);

        boton_72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_72ActionPerformed(evt);
            }
        });
        pTablero.add(boton_72);

        boton_73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_73ActionPerformed(evt);
            }
        });
        pTablero.add(boton_73);

        boton_74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_74ActionPerformed(evt);
            }
        });
        pTablero.add(boton_74);

        boton_75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_75ActionPerformed(evt);
            }
        });
        pTablero.add(boton_75);

        boton_76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_76ActionPerformed(evt);
            }
        });
        pTablero.add(boton_76);

        boton_77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_77ActionPerformed(evt);
            }
        });
        pTablero.add(boton_77);

        boton_78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_78ActionPerformed(evt);
            }
        });
        pTablero.add(boton_78);

        boton_79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_79ActionPerformed(evt);
            }
        });
        pTablero.add(boton_79);

        boton_80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_80ActionPerformed(evt);
            }
        });
        pTablero.add(boton_80);

        boton_81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_81ActionPerformed(evt);
            }
        });
        pTablero.add(boton_81);

        boton_82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_82ActionPerformed(evt);
            }
        });
        pTablero.add(boton_82);

        boton_83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_83ActionPerformed(evt);
            }
        });
        pTablero.add(boton_83);

        lx6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx6.setText("6");
        pTablero.add(lx6);

        boton_84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_84ActionPerformed(evt);
            }
        });
        pTablero.add(boton_84);

        boton_85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_85ActionPerformed(evt);
            }
        });
        pTablero.add(boton_85);

        boton_86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_86ActionPerformed(evt);
            }
        });
        pTablero.add(boton_86);

        boton_87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_87ActionPerformed(evt);
            }
        });
        pTablero.add(boton_87);

        boton_88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_88ActionPerformed(evt);
            }
        });
        pTablero.add(boton_88);

        boton_89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_89ActionPerformed(evt);
            }
        });
        pTablero.add(boton_89);

        boton_90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_90ActionPerformed(evt);
            }
        });
        pTablero.add(boton_90);

        boton_91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_91ActionPerformed(evt);
            }
        });
        pTablero.add(boton_91);

        boton_92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_92ActionPerformed(evt);
            }
        });
        pTablero.add(boton_92);

        boton_93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_93ActionPerformed(evt);
            }
        });
        pTablero.add(boton_93);

        boton_94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_94ActionPerformed(evt);
            }
        });
        pTablero.add(boton_94);

        boton_95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_95ActionPerformed(evt);
            }
        });
        pTablero.add(boton_95);

        boton_96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_96ActionPerformed(evt);
            }
        });
        pTablero.add(boton_96);

        boton_97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_97ActionPerformed(evt);
            }
        });
        pTablero.add(boton_97);

        lx7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx7.setText("7");
        pTablero.add(lx7);

        boton_98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_98ActionPerformed(evt);
            }
        });
        pTablero.add(boton_98);

        boton_99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_99ActionPerformed(evt);
            }
        });
        pTablero.add(boton_99);

        boton_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_100ActionPerformed(evt);
            }
        });
        pTablero.add(boton_100);

        boton_101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_101ActionPerformed(evt);
            }
        });
        pTablero.add(boton_101);

        boton_102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_102ActionPerformed(evt);
            }
        });
        pTablero.add(boton_102);

        boton_103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_103ActionPerformed(evt);
            }
        });
        pTablero.add(boton_103);

        boton_104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_104ActionPerformed(evt);
            }
        });
        pTablero.add(boton_104);

        boton_105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_105ActionPerformed(evt);
            }
        });
        pTablero.add(boton_105);

        boton_106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_106ActionPerformed(evt);
            }
        });
        pTablero.add(boton_106);

        boton_107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_107ActionPerformed(evt);
            }
        });
        pTablero.add(boton_107);

        boton_108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_108ActionPerformed(evt);
            }
        });
        pTablero.add(boton_108);

        boton_109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_109ActionPerformed(evt);
            }
        });
        pTablero.add(boton_109);

        boton_110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_110ActionPerformed(evt);
            }
        });
        pTablero.add(boton_110);

        boton_111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_111ActionPerformed(evt);
            }
        });
        pTablero.add(boton_111);

        lx8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx8.setText("8");
        pTablero.add(lx8);

        boton_112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_112ActionPerformed(evt);
            }
        });
        pTablero.add(boton_112);

        boton_113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_113ActionPerformed(evt);
            }
        });
        pTablero.add(boton_113);

        boton_114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_114ActionPerformed(evt);
            }
        });
        pTablero.add(boton_114);

        boton_115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_115ActionPerformed(evt);
            }
        });
        pTablero.add(boton_115);

        boton_116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_116ActionPerformed(evt);
            }
        });
        pTablero.add(boton_116);

        boton_117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_117ActionPerformed(evt);
            }
        });
        pTablero.add(boton_117);

        boton_118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_118ActionPerformed(evt);
            }
        });
        pTablero.add(boton_118);

        boton_119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_119ActionPerformed(evt);
            }
        });
        pTablero.add(boton_119);

        boton_120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_120ActionPerformed(evt);
            }
        });
        pTablero.add(boton_120);

        boton_121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_121ActionPerformed(evt);
            }
        });
        pTablero.add(boton_121);

        boton_122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_122ActionPerformed(evt);
            }
        });
        pTablero.add(boton_122);

        boton_123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_123ActionPerformed(evt);
            }
        });
        pTablero.add(boton_123);

        boton_124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_124ActionPerformed(evt);
            }
        });
        pTablero.add(boton_124);

        boton_125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_125ActionPerformed(evt);
            }
        });
        pTablero.add(boton_125);

        lx9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx9.setText("9");
        pTablero.add(lx9);

        boton_126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_126ActionPerformed(evt);
            }
        });
        pTablero.add(boton_126);

        boton_127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_127ActionPerformed(evt);
            }
        });
        pTablero.add(boton_127);

        boton_128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_128ActionPerformed(evt);
            }
        });
        pTablero.add(boton_128);

        boton_129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_129ActionPerformed(evt);
            }
        });
        pTablero.add(boton_129);

        boton_130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_130ActionPerformed(evt);
            }
        });
        pTablero.add(boton_130);

        boton_131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_131ActionPerformed(evt);
            }
        });
        pTablero.add(boton_131);

        boton_132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_132ActionPerformed(evt);
            }
        });
        pTablero.add(boton_132);

        boton_133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_133ActionPerformed(evt);
            }
        });
        pTablero.add(boton_133);

        boton_134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_134ActionPerformed(evt);
            }
        });
        pTablero.add(boton_134);

        boton_135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_135ActionPerformed(evt);
            }
        });
        pTablero.add(boton_135);

        boton_136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_136ActionPerformed(evt);
            }
        });
        pTablero.add(boton_136);

        boton_137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_137ActionPerformed(evt);
            }
        });
        pTablero.add(boton_137);

        boton_138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_138ActionPerformed(evt);
            }
        });
        pTablero.add(boton_138);

        boton_139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_139ActionPerformed(evt);
            }
        });
        pTablero.add(boton_139);

        lx10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx10.setText("10");
        pTablero.add(lx10);

        boton_140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_140ActionPerformed(evt);
            }
        });
        pTablero.add(boton_140);

        boton_141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_141ActionPerformed(evt);
            }
        });
        pTablero.add(boton_141);

        boton_142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_142ActionPerformed(evt);
            }
        });
        pTablero.add(boton_142);

        boton_143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_143ActionPerformed(evt);
            }
        });
        pTablero.add(boton_143);

        boton_144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_144ActionPerformed(evt);
            }
        });
        pTablero.add(boton_144);

        boton_145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_145ActionPerformed(evt);
            }
        });
        pTablero.add(boton_145);

        boton_146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_146ActionPerformed(evt);
            }
        });
        pTablero.add(boton_146);

        boton_147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_147ActionPerformed(evt);
            }
        });
        pTablero.add(boton_147);

        boton_148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_148ActionPerformed(evt);
            }
        });
        pTablero.add(boton_148);

        boton_149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_149ActionPerformed(evt);
            }
        });
        pTablero.add(boton_149);

        boton_150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_150ActionPerformed(evt);
            }
        });
        pTablero.add(boton_150);

        boton_151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_151ActionPerformed(evt);
            }
        });
        pTablero.add(boton_151);

        boton_152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_152ActionPerformed(evt);
            }
        });
        pTablero.add(boton_152);

        boton_153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_153ActionPerformed(evt);
            }
        });
        pTablero.add(boton_153);

        lx11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx11.setText("11");
        pTablero.add(lx11);

        boton_154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_154ActionPerformed(evt);
            }
        });
        pTablero.add(boton_154);

        boton_155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_155ActionPerformed(evt);
            }
        });
        pTablero.add(boton_155);

        boton_156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_156ActionPerformed(evt);
            }
        });
        pTablero.add(boton_156);

        boton_157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_157ActionPerformed(evt);
            }
        });
        pTablero.add(boton_157);

        boton_158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_158ActionPerformed(evt);
            }
        });
        pTablero.add(boton_158);

        boton_159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_159ActionPerformed(evt);
            }
        });
        pTablero.add(boton_159);

        boton_160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_160ActionPerformed(evt);
            }
        });
        pTablero.add(boton_160);

        boton_161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_161ActionPerformed(evt);
            }
        });
        pTablero.add(boton_161);

        boton_162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_162ActionPerformed(evt);
            }
        });
        pTablero.add(boton_162);

        boton_163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_163ActionPerformed(evt);
            }
        });
        pTablero.add(boton_163);

        boton_164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_164ActionPerformed(evt);
            }
        });
        pTablero.add(boton_164);

        boton_165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_165ActionPerformed(evt);
            }
        });
        pTablero.add(boton_165);

        boton_166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_166ActionPerformed(evt);
            }
        });
        pTablero.add(boton_166);

        boton_167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_167ActionPerformed(evt);
            }
        });
        pTablero.add(boton_167);

        lx12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx12.setText("12");
        pTablero.add(lx12);

        boton_168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_168ActionPerformed(evt);
            }
        });
        pTablero.add(boton_168);

        boton_169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_169ActionPerformed(evt);
            }
        });
        pTablero.add(boton_169);

        boton_170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_170ActionPerformed(evt);
            }
        });
        pTablero.add(boton_170);

        boton_171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_171ActionPerformed(evt);
            }
        });
        pTablero.add(boton_171);

        boton_172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_172ActionPerformed(evt);
            }
        });
        pTablero.add(boton_172);

        boton_173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_173ActionPerformed(evt);
            }
        });
        pTablero.add(boton_173);

        boton_174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_174ActionPerformed(evt);
            }
        });
        pTablero.add(boton_174);

        boton_175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_175ActionPerformed(evt);
            }
        });
        pTablero.add(boton_175);

        boton_176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_176ActionPerformed(evt);
            }
        });
        pTablero.add(boton_176);

        boton_177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_177ActionPerformed(evt);
            }
        });
        pTablero.add(boton_177);

        boton_178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_178ActionPerformed(evt);
            }
        });
        pTablero.add(boton_178);

        boton_179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_179ActionPerformed(evt);
            }
        });
        pTablero.add(boton_179);

        boton_180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_180ActionPerformed(evt);
            }
        });
        pTablero.add(boton_180);

        boton_181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_181ActionPerformed(evt);
            }
        });
        pTablero.add(boton_181);

        lx13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lx13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lx13.setText("13");
        pTablero.add(lx13);

        boton_182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_182ActionPerformed(evt);
            }
        });
        pTablero.add(boton_182);

        boton_183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_183ActionPerformed(evt);
            }
        });
        pTablero.add(boton_183);

        boton_184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_184ActionPerformed(evt);
            }
        });
        pTablero.add(boton_184);

        boton_185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_185ActionPerformed(evt);
            }
        });
        pTablero.add(boton_185);

        boton_186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_186ActionPerformed(evt);
            }
        });
        pTablero.add(boton_186);

        boton_187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_187ActionPerformed(evt);
            }
        });
        pTablero.add(boton_187);

        boton_188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_188ActionPerformed(evt);
            }
        });
        pTablero.add(boton_188);

        boton_189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_189ActionPerformed(evt);
            }
        });
        pTablero.add(boton_189);

        boton_190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_190ActionPerformed(evt);
            }
        });
        pTablero.add(boton_190);

        boton_191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_191ActionPerformed(evt);
            }
        });
        pTablero.add(boton_191);

        boton_192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_192ActionPerformed(evt);
            }
        });
        pTablero.add(boton_192);

        boton_193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_193ActionPerformed(evt);
            }
        });
        pTablero.add(boton_193);

        boton_194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_194ActionPerformed(evt);
            }
        });
        pTablero.add(boton_194);

        boton_195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_195ActionPerformed(evt);
            }
        });
        pTablero.add(boton_195);

        restantesJ2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        restantesJ2.setText("Y ------------------>");

        restantesJ1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        restantesJ1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        restantesJ1.setText("Y ------------------>");

        pj1TodasFichas.setLayout(new java.awt.GridLayout(3, 6));

        pj2TodasFichas.setLayout(new java.awt.GridLayout(3, 6));

        panelSeleccionadaJ0.setLayout(new java.awt.BorderLayout());

        panelBotonesJ0.setLayout(new java.awt.GridLayout(3, 1));

        bDarVuelta.setText("G. Vert.");
        bDarVuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarVueltaActionPerformed(evt);
            }
        });
        panelBotonesJ0.add(bDarVuelta);

        bDarVuelta2.setText("G. Horiz.");
        bDarVuelta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarVuelta2ActionPerformed(evt);
            }
        });
        panelBotonesJ0.add(bDarVuelta2);

        bGirar.setText("G. Horario");
        bGirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGirarActionPerformed(evt);
            }
        });
        panelBotonesJ0.add(bGirar);

        panelSeleccionadaJ0.add(panelBotonesJ0, java.awt.BorderLayout.LINE_START);

        pj1Seleccionada.setLayout(new java.awt.BorderLayout());
        panelSeleccionadaJ0.add(pj1Seleccionada, java.awt.BorderLayout.CENTER);

        panelSeleccionadaJ1.setLayout(new java.awt.BorderLayout());

        panelBotones1.setLayout(new java.awt.GridLayout(3, 1));

        bDarVuelta1.setText("G. Vert.");
        bDarVuelta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarVuelta1ActionPerformed(evt);
            }
        });
        panelBotones1.add(bDarVuelta1);

        bDarVuelta3.setText("G. Horiz.");
        bDarVuelta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDarVuelta3ActionPerformed(evt);
            }
        });
        panelBotones1.add(bDarVuelta3);

        bGirar1.setText("G. Horario");
        bGirar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGirar1ActionPerformed(evt);
            }
        });
        panelBotones1.add(bGirar1);

        panelSeleccionadaJ1.add(panelBotones1, java.awt.BorderLayout.LINE_END);

        pj2Seleccionada.setLayout(new java.awt.BorderLayout());
        panelSeleccionadaJ1.add(pj2Seleccionada, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        labelTurnoJ2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelTurnoJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTurnoJ2.setText("jLabel3");
        jPanel1.add(labelTurnoJ2);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        labelTurnoJ1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        labelTurnoJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTurnoJ1.setText("jLabel3");
        jPanel2.add(labelTurnoJ1);

        jButton1.setText("Pasar turno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finalizar partida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Posible...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelSeleccionadaJ0, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(restantesJ1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pj1TodasFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(40, 40, 40)
                                .addComponent(jButton3))
                            .addComponent(pTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelSeleccionadaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                            .addComponent(restantesJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pj2TodasFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restantesJ2)
                    .addComponent(restantesJ1)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelSeleccionadaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pj2TodasFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelSeleccionadaJ0, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pj1TodasFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void darVuelta(int turno){
            if(seleccionada[turno] != null){
            seleccionada[turno].voltear();
            if(turno == 0){
                limpiarPanel(pj1Seleccionada);
                pj1Seleccionada.add(printFicha(seleccionada[0]));
                limpiarPanel(pj1TodasFichas);
            }else{
                limpiarPanel(pj2Seleccionada);
                pj2Seleccionada.add(printFicha(seleccionada[1]));
                limpiarPanel(pj2TodasFichas);
            }
           ponerFichasRestantesJugador(turno);
        }
    }
    
    public void darVuelta2(int turno){
        if(seleccionada[turno] != null){
            seleccionada[turno].voltear2();
            if(turno == 0){
                limpiarPanel(pj1Seleccionada);
                pj1Seleccionada.add(printFicha(seleccionada[0]));
                limpiarPanel(pj1TodasFichas);
            }else{
                limpiarPanel(pj2Seleccionada);
                pj2Seleccionada.add(printFicha(seleccionada[1]));
                limpiarPanel(pj2TodasFichas);
            }
           ponerFichasRestantesJugador(turno);
        }
    }
    
    public void girar(int turno){
        if(seleccionada[turno] != null){
            seleccionada[turno].girar_horario();
            if(turno == 0){
                limpiarPanel(pj1Seleccionada);
                pj1Seleccionada.add(printFicha(seleccionada[0]));
                limpiarPanel(pj1TodasFichas);
            }else{
                limpiarPanel(pj2Seleccionada);
                pj2Seleccionada.add(printFicha(seleccionada[1]));
                limpiarPanel(pj2TodasFichas);
            }
           ponerFichasRestantesJugador(turno);
        }
    }
    
    public void pasarTurno(){
        juego.cambiarTurno();
       /* System.out.println("Se puede seguir poniendo ("+juego.turno+"): ");
        juego.sePuedenSeguirPoniendoFichas(juego.jugadores[juego.turno]);
      */  if(juego.turno == 0){
            labelTurnoJ1.setText("¡TU TURNO!");
            labelTurnoJ2.setText("");
        }else{
            labelTurnoJ2.setText("¡TU TURNO!");
            labelTurnoJ1.setText("");
        }
    }
    
    private void bDarVueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarVueltaActionPerformed
        darVuelta(0);
    }//GEN-LAST:event_bDarVueltaActionPerformed
    private void bGirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGirarActionPerformed
        girar(0);
    }//GEN-LAST:event_bGirarActionPerformed
    private void boton_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_0ActionPerformed
        accionBoton(0, 0);
    }//GEN-LAST:event_boton_0ActionPerformed

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
        accionBoton(1, 0);
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_2ActionPerformed
        accionBoton(2, 0);
    }//GEN-LAST:event_boton_2ActionPerformed

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
        accionBoton(3, 0);
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_4ActionPerformed
        accionBoton(4, 0);
    }//GEN-LAST:event_boton_4ActionPerformed

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
        accionBoton(5, 0);
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
        accionBoton(6, 0);
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_7ActionPerformed
        accionBoton(7, 0);
    }//GEN-LAST:event_boton_7ActionPerformed

    private void boton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_8ActionPerformed
        accionBoton(8, 0);
    }//GEN-LAST:event_boton_8ActionPerformed

    private void boton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_9ActionPerformed
        accionBoton(9, 0);
    }//GEN-LAST:event_boton_9ActionPerformed

    private void boton_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_10ActionPerformed
        accionBoton(10, 0);
    }//GEN-LAST:event_boton_10ActionPerformed

    private void boton_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_11ActionPerformed
        accionBoton(11, 0);
    }//GEN-LAST:event_boton_11ActionPerformed

    private void boton_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_12ActionPerformed
        accionBoton(12, 0);
    }//GEN-LAST:event_boton_12ActionPerformed

    private void boton_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_13ActionPerformed
        accionBoton(13, 0);
    }//GEN-LAST:event_boton_13ActionPerformed

    private void boton_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_14ActionPerformed
        accionBoton(0, 1);
    }//GEN-LAST:event_boton_14ActionPerformed

    private void boton_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_15ActionPerformed
        accionBoton(1, 1);
    }//GEN-LAST:event_boton_15ActionPerformed

    private void boton_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_16ActionPerformed
        accionBoton(2, 1);
    }//GEN-LAST:event_boton_16ActionPerformed

    private void boton_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_17ActionPerformed
        accionBoton(3, 1);
    }//GEN-LAST:event_boton_17ActionPerformed

    private void boton_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_18ActionPerformed
        accionBoton(4, 1);
    }//GEN-LAST:event_boton_18ActionPerformed

    private void boton_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_19ActionPerformed
        accionBoton(5, 1);
    }//GEN-LAST:event_boton_19ActionPerformed

    private void boton_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_20ActionPerformed
        accionBoton(6, 1);
    }//GEN-LAST:event_boton_20ActionPerformed

    private void boton_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_21ActionPerformed
        accionBoton(7, 1);
    }//GEN-LAST:event_boton_21ActionPerformed

    private void boton_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_22ActionPerformed
        accionBoton(8, 1);
    }//GEN-LAST:event_boton_22ActionPerformed

    private void boton_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_23ActionPerformed
        accionBoton(9, 1);
    }//GEN-LAST:event_boton_23ActionPerformed

    private void boton_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_24ActionPerformed
        accionBoton(10, 1);
    }//GEN-LAST:event_boton_24ActionPerformed

    private void boton_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_25ActionPerformed
        accionBoton(11, 1);
    }//GEN-LAST:event_boton_25ActionPerformed

    private void boton_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_26ActionPerformed
        accionBoton(12, 1);
    }//GEN-LAST:event_boton_26ActionPerformed

    private void boton_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_27ActionPerformed
        accionBoton(13, 1);
    }//GEN-LAST:event_boton_27ActionPerformed

    private void boton_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_28ActionPerformed
        accionBoton(0, 2);
    }//GEN-LAST:event_boton_28ActionPerformed

    private void boton_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_29ActionPerformed
        accionBoton(1, 2);
    }//GEN-LAST:event_boton_29ActionPerformed

    private void boton_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_30ActionPerformed
        accionBoton(2, 2);
    }//GEN-LAST:event_boton_30ActionPerformed

    private void boton_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_31ActionPerformed
        accionBoton(3, 2);
    }//GEN-LAST:event_boton_31ActionPerformed

    private void boton_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_32ActionPerformed
        accionBoton(4, 2);
    }//GEN-LAST:event_boton_32ActionPerformed

    private void boton_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_33ActionPerformed
        accionBoton(5, 2);
    }//GEN-LAST:event_boton_33ActionPerformed

    private void boton_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_34ActionPerformed
        accionBoton(6, 2);
    }//GEN-LAST:event_boton_34ActionPerformed

    private void boton_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_35ActionPerformed
        accionBoton(7, 2);
    }//GEN-LAST:event_boton_35ActionPerformed

    private void boton_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_36ActionPerformed
        accionBoton(8, 2);
    }//GEN-LAST:event_boton_36ActionPerformed

    private void boton_37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_37ActionPerformed
        accionBoton(9, 2);
    }//GEN-LAST:event_boton_37ActionPerformed

    private void boton_38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_38ActionPerformed
        accionBoton(10, 2);
    }//GEN-LAST:event_boton_38ActionPerformed

    private void boton_39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_39ActionPerformed
        accionBoton(11, 2);
    }//GEN-LAST:event_boton_39ActionPerformed

    private void boton_40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_40ActionPerformed
        accionBoton(12, 2);
    }//GEN-LAST:event_boton_40ActionPerformed

    private void boton_41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_41ActionPerformed
        accionBoton(13, 2);
    }//GEN-LAST:event_boton_41ActionPerformed

    private void boton_42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_42ActionPerformed
        accionBoton(0, 3);
    }//GEN-LAST:event_boton_42ActionPerformed

    private void boton_43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_43ActionPerformed
        accionBoton(1, 3);
    }//GEN-LAST:event_boton_43ActionPerformed

    private void boton_44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_44ActionPerformed
        accionBoton(2, 3);
    }//GEN-LAST:event_boton_44ActionPerformed

    private void boton_45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_45ActionPerformed
        accionBoton(3, 3);
    }//GEN-LAST:event_boton_45ActionPerformed

    private void boton_46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_46ActionPerformed
        accionBoton(4, 3);
    }//GEN-LAST:event_boton_46ActionPerformed

    private void boton_47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_47ActionPerformed
        accionBoton(5, 3);
    }//GEN-LAST:event_boton_47ActionPerformed

    private void boton_48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_48ActionPerformed
        accionBoton(6, 3);
    }//GEN-LAST:event_boton_48ActionPerformed

    private void boton_49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_49ActionPerformed
        accionBoton(7, 3);
    }//GEN-LAST:event_boton_49ActionPerformed

    private void boton_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_50ActionPerformed
        accionBoton(8, 3);
    }//GEN-LAST:event_boton_50ActionPerformed

    private void boton_51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_51ActionPerformed
        accionBoton(9, 3);
    }//GEN-LAST:event_boton_51ActionPerformed

    private void boton_52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_52ActionPerformed
        accionBoton(10, 3);
    }//GEN-LAST:event_boton_52ActionPerformed

    private void boton_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_53ActionPerformed
        accionBoton(11, 3);
    }//GEN-LAST:event_boton_53ActionPerformed

    private void boton_54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_54ActionPerformed
        accionBoton(12, 3);
    }//GEN-LAST:event_boton_54ActionPerformed

    private void boton_55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_55ActionPerformed
        accionBoton(13, 3);
    }//GEN-LAST:event_boton_55ActionPerformed

    private void boton_56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_56ActionPerformed
        accionBoton(0, 4);
    }//GEN-LAST:event_boton_56ActionPerformed

    private void boton_57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_57ActionPerformed
        accionBoton(1, 4);
    }//GEN-LAST:event_boton_57ActionPerformed

    private void boton_58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_58ActionPerformed
        accionBoton(2, 4);
    }//GEN-LAST:event_boton_58ActionPerformed

    private void boton_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_59ActionPerformed
        accionBoton(3, 4);
    }//GEN-LAST:event_boton_59ActionPerformed

    private void boton_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_60ActionPerformed
        accionBoton(4, 4);
    }//GEN-LAST:event_boton_60ActionPerformed

    private void boton_61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_61ActionPerformed
        accionBoton(5, 4);
    }//GEN-LAST:event_boton_61ActionPerformed

    private void boton_62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_62ActionPerformed
        accionBoton(6, 4);
    }//GEN-LAST:event_boton_62ActionPerformed

    private void boton_63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_63ActionPerformed
        accionBoton(7, 4);
    }//GEN-LAST:event_boton_63ActionPerformed

    private void boton_64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_64ActionPerformed
        accionBoton(8, 4);
    }//GEN-LAST:event_boton_64ActionPerformed

    private void boton_65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_65ActionPerformed
        accionBoton(9, 4);
    }//GEN-LAST:event_boton_65ActionPerformed

    private void boton_66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_66ActionPerformed
        accionBoton(10, 4);
    }//GEN-LAST:event_boton_66ActionPerformed

    private void boton_67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_67ActionPerformed
        accionBoton(11, 4);
    }//GEN-LAST:event_boton_67ActionPerformed

    private void boton_68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_68ActionPerformed
        accionBoton(12, 4);
    }//GEN-LAST:event_boton_68ActionPerformed

    private void boton_69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_69ActionPerformed
        accionBoton(13, 4);
    }//GEN-LAST:event_boton_69ActionPerformed

    private void boton_70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_70ActionPerformed
        accionBoton(0, 5);
    }//GEN-LAST:event_boton_70ActionPerformed

    private void boton_71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_71ActionPerformed
        accionBoton(1, 5);
    }//GEN-LAST:event_boton_71ActionPerformed

    private void boton_72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_72ActionPerformed
        accionBoton(2, 5);
    }//GEN-LAST:event_boton_72ActionPerformed

    private void boton_73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_73ActionPerformed
        accionBoton(3, 5);
    }//GEN-LAST:event_boton_73ActionPerformed

    private void boton_74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_74ActionPerformed
        accionBoton(4, 5);
    }//GEN-LAST:event_boton_74ActionPerformed

    private void boton_75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_75ActionPerformed
        accionBoton(5, 5);
    }//GEN-LAST:event_boton_75ActionPerformed

    private void boton_76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_76ActionPerformed
        accionBoton(6, 5);
    }//GEN-LAST:event_boton_76ActionPerformed

    private void boton_77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_77ActionPerformed
        accionBoton(7, 5);
    }//GEN-LAST:event_boton_77ActionPerformed

    private void boton_78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_78ActionPerformed
        accionBoton(8, 5);
    }//GEN-LAST:event_boton_78ActionPerformed

    private void boton_79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_79ActionPerformed
        accionBoton(9, 5);
    }//GEN-LAST:event_boton_79ActionPerformed

    private void boton_80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_80ActionPerformed
        accionBoton(10, 5);
    }//GEN-LAST:event_boton_80ActionPerformed

    private void boton_81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_81ActionPerformed
        accionBoton(11, 5);
    }//GEN-LAST:event_boton_81ActionPerformed

    private void boton_82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_82ActionPerformed
        accionBoton(12, 5);
    }//GEN-LAST:event_boton_82ActionPerformed

    private void boton_83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_83ActionPerformed
        accionBoton(13, 5);
    }//GEN-LAST:event_boton_83ActionPerformed

    private void boton_84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_84ActionPerformed
        accionBoton(0, 6);
    }//GEN-LAST:event_boton_84ActionPerformed

    private void boton_85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_85ActionPerformed
        accionBoton(1, 6);
    }//GEN-LAST:event_boton_85ActionPerformed

    private void boton_86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_86ActionPerformed
        accionBoton(2, 6);
    }//GEN-LAST:event_boton_86ActionPerformed

    private void boton_87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_87ActionPerformed
        accionBoton(3, 6);
    }//GEN-LAST:event_boton_87ActionPerformed

    private void boton_88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_88ActionPerformed
        accionBoton(4, 6);
    }//GEN-LAST:event_boton_88ActionPerformed

    private void boton_89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_89ActionPerformed
        accionBoton(5, 6);
    }//GEN-LAST:event_boton_89ActionPerformed

    private void boton_90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_90ActionPerformed
        accionBoton(6, 6);
    }//GEN-LAST:event_boton_90ActionPerformed

    private void boton_91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_91ActionPerformed
        accionBoton(7, 6);
    }//GEN-LAST:event_boton_91ActionPerformed

    private void boton_92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_92ActionPerformed
        accionBoton(8, 6);
    }//GEN-LAST:event_boton_92ActionPerformed

    private void boton_93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_93ActionPerformed
        accionBoton(9, 6);
    }//GEN-LAST:event_boton_93ActionPerformed

    private void boton_94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_94ActionPerformed
        accionBoton(10, 6);
    }//GEN-LAST:event_boton_94ActionPerformed

    private void boton_95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_95ActionPerformed
        accionBoton(11, 6);
    }//GEN-LAST:event_boton_95ActionPerformed

    private void boton_96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_96ActionPerformed
        accionBoton(12, 6);
    }//GEN-LAST:event_boton_96ActionPerformed

    private void boton_97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_97ActionPerformed
        accionBoton(13, 6);
    }//GEN-LAST:event_boton_97ActionPerformed

    private void boton_98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_98ActionPerformed
        accionBoton(0, 7);
    }//GEN-LAST:event_boton_98ActionPerformed

    private void boton_99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_99ActionPerformed
        accionBoton(1, 7);
    }//GEN-LAST:event_boton_99ActionPerformed

    private void boton_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_100ActionPerformed
        accionBoton(2, 7);
    }//GEN-LAST:event_boton_100ActionPerformed

    private void boton_101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_101ActionPerformed
        accionBoton(3, 7);
    }//GEN-LAST:event_boton_101ActionPerformed

    private void boton_102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_102ActionPerformed
        accionBoton(4, 7);
    }//GEN-LAST:event_boton_102ActionPerformed

    private void boton_103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_103ActionPerformed
        accionBoton(5, 7);
    }//GEN-LAST:event_boton_103ActionPerformed

    private void boton_104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_104ActionPerformed
        accionBoton(6, 7);
    }//GEN-LAST:event_boton_104ActionPerformed

    private void boton_105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_105ActionPerformed
        accionBoton(7, 7);
    }//GEN-LAST:event_boton_105ActionPerformed

    private void boton_106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_106ActionPerformed
        accionBoton(8, 7);
    }//GEN-LAST:event_boton_106ActionPerformed

    private void boton_107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_107ActionPerformed
        accionBoton(9, 7);
    }//GEN-LAST:event_boton_107ActionPerformed

    private void boton_108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_108ActionPerformed
        accionBoton(10, 7);
    }//GEN-LAST:event_boton_108ActionPerformed

    private void boton_109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_109ActionPerformed
        accionBoton(11, 7);
    }//GEN-LAST:event_boton_109ActionPerformed

    private void boton_110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_110ActionPerformed
        accionBoton(12, 7);
    }//GEN-LAST:event_boton_110ActionPerformed

    private void boton_111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_111ActionPerformed
        accionBoton(13, 7);
    }//GEN-LAST:event_boton_111ActionPerformed

    private void boton_112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_112ActionPerformed
        accionBoton(0, 8);
    }//GEN-LAST:event_boton_112ActionPerformed

    private void boton_113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_113ActionPerformed
        accionBoton(1, 8);
    }//GEN-LAST:event_boton_113ActionPerformed

    private void boton_114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_114ActionPerformed
        accionBoton(2, 8);
    }//GEN-LAST:event_boton_114ActionPerformed

    private void boton_115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_115ActionPerformed
        accionBoton(3, 8);
    }//GEN-LAST:event_boton_115ActionPerformed

    private void boton_116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_116ActionPerformed
        accionBoton(4, 8);
    }//GEN-LAST:event_boton_116ActionPerformed

    private void boton_117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_117ActionPerformed
        accionBoton(5, 8);
    }//GEN-LAST:event_boton_117ActionPerformed

    private void boton_118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_118ActionPerformed
        accionBoton(6, 8);
    }//GEN-LAST:event_boton_118ActionPerformed

    private void boton_119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_119ActionPerformed
        accionBoton(7, 8);
    }//GEN-LAST:event_boton_119ActionPerformed

    private void boton_120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_120ActionPerformed
        accionBoton(8, 8);
    }//GEN-LAST:event_boton_120ActionPerformed

    private void boton_121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_121ActionPerformed
        accionBoton(9, 8);
    }//GEN-LAST:event_boton_121ActionPerformed

    private void boton_122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_122ActionPerformed
        accionBoton(10, 8);
    }//GEN-LAST:event_boton_122ActionPerformed

    private void boton_123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_123ActionPerformed
        accionBoton(11, 8);
    }//GEN-LAST:event_boton_123ActionPerformed

    private void boton_124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_124ActionPerformed
        accionBoton(12, 8);
    }//GEN-LAST:event_boton_124ActionPerformed

    private void boton_125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_125ActionPerformed
        accionBoton(13, 8);
    }//GEN-LAST:event_boton_125ActionPerformed

    private void boton_126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_126ActionPerformed
        accionBoton(0, 9);
    }//GEN-LAST:event_boton_126ActionPerformed

    private void boton_127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_127ActionPerformed
        accionBoton(1, 9);
    }//GEN-LAST:event_boton_127ActionPerformed

    private void boton_128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_128ActionPerformed
        accionBoton(2, 9);
    }//GEN-LAST:event_boton_128ActionPerformed

    private void boton_129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_129ActionPerformed
        accionBoton(3, 9);
    }//GEN-LAST:event_boton_129ActionPerformed

    private void boton_130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_130ActionPerformed
        accionBoton(4, 9);
    }//GEN-LAST:event_boton_130ActionPerformed

    private void boton_131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_131ActionPerformed
        accionBoton(5, 9);
    }//GEN-LAST:event_boton_131ActionPerformed

    private void boton_132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_132ActionPerformed
        accionBoton(6, 9);
    }//GEN-LAST:event_boton_132ActionPerformed

    private void boton_133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_133ActionPerformed
        accionBoton(7, 9);
    }//GEN-LAST:event_boton_133ActionPerformed

    private void boton_134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_134ActionPerformed
        accionBoton(8, 9);
    }//GEN-LAST:event_boton_134ActionPerformed

    private void boton_135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_135ActionPerformed
        accionBoton(9, 9);
    }//GEN-LAST:event_boton_135ActionPerformed

    private void boton_136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_136ActionPerformed
        accionBoton(10, 9);
    }//GEN-LAST:event_boton_136ActionPerformed

    private void boton_137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_137ActionPerformed
        accionBoton(11, 9);
    }//GEN-LAST:event_boton_137ActionPerformed

    private void boton_138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_138ActionPerformed
        accionBoton(12, 9);
    }//GEN-LAST:event_boton_138ActionPerformed

    private void boton_139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_139ActionPerformed
        accionBoton(13, 9);
    }//GEN-LAST:event_boton_139ActionPerformed

    private void boton_140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_140ActionPerformed
        accionBoton(0, 10);
    }//GEN-LAST:event_boton_140ActionPerformed

    private void boton_141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_141ActionPerformed
        accionBoton(1, 10);
    }//GEN-LAST:event_boton_141ActionPerformed

    private void boton_142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_142ActionPerformed
        accionBoton(2, 10);
    }//GEN-LAST:event_boton_142ActionPerformed

    private void boton_143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_143ActionPerformed
        accionBoton(3, 10);
    }//GEN-LAST:event_boton_143ActionPerformed

    private void boton_144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_144ActionPerformed
        accionBoton(4, 10);
    }//GEN-LAST:event_boton_144ActionPerformed

    private void boton_145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_145ActionPerformed
        accionBoton(5, 10);
    }//GEN-LAST:event_boton_145ActionPerformed

    private void boton_146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_146ActionPerformed
        accionBoton(6, 10);
    }//GEN-LAST:event_boton_146ActionPerformed

    private void boton_147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_147ActionPerformed
        accionBoton(7, 10);
    }//GEN-LAST:event_boton_147ActionPerformed

    private void boton_148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_148ActionPerformed
        accionBoton(8, 10);
    }//GEN-LAST:event_boton_148ActionPerformed

    private void boton_149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_149ActionPerformed
        accionBoton(9, 10);
    }//GEN-LAST:event_boton_149ActionPerformed

    private void boton_150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_150ActionPerformed
        accionBoton(10, 10);
    }//GEN-LAST:event_boton_150ActionPerformed

    private void boton_151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_151ActionPerformed
        accionBoton(11, 10);
    }//GEN-LAST:event_boton_151ActionPerformed

    private void boton_152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_152ActionPerformed
        accionBoton(12, 10);
    }//GEN-LAST:event_boton_152ActionPerformed

    private void boton_153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_153ActionPerformed
        accionBoton(13, 10);
    }//GEN-LAST:event_boton_153ActionPerformed

    private void boton_154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_154ActionPerformed
        accionBoton(0, 11);
    }//GEN-LAST:event_boton_154ActionPerformed

    private void boton_155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_155ActionPerformed
        accionBoton(1, 11);
    }//GEN-LAST:event_boton_155ActionPerformed

    private void boton_156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_156ActionPerformed
        accionBoton(2, 11);
    }//GEN-LAST:event_boton_156ActionPerformed

    private void boton_157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_157ActionPerformed
        accionBoton(3, 11);
    }//GEN-LAST:event_boton_157ActionPerformed

    private void boton_158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_158ActionPerformed
        accionBoton(4, 11);
    }//GEN-LAST:event_boton_158ActionPerformed

    private void boton_159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_159ActionPerformed
        accionBoton(5, 11);
    }//GEN-LAST:event_boton_159ActionPerformed

    private void boton_160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_160ActionPerformed
        accionBoton(6, 11);
    }//GEN-LAST:event_boton_160ActionPerformed

    private void boton_161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_161ActionPerformed
        accionBoton(7, 11);
    }//GEN-LAST:event_boton_161ActionPerformed

    private void boton_162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_162ActionPerformed
        accionBoton(8, 11);
    }//GEN-LAST:event_boton_162ActionPerformed

    private void boton_163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_163ActionPerformed
        accionBoton(9, 11);
    }//GEN-LAST:event_boton_163ActionPerformed

    private void boton_164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_164ActionPerformed
        accionBoton(10, 11);
    }//GEN-LAST:event_boton_164ActionPerformed

    private void boton_165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_165ActionPerformed
        accionBoton(11, 11);
    }//GEN-LAST:event_boton_165ActionPerformed

    private void boton_166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_166ActionPerformed
        accionBoton(12, 11);
    }//GEN-LAST:event_boton_166ActionPerformed

    private void boton_167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_167ActionPerformed
        accionBoton(13, 11);
    }//GEN-LAST:event_boton_167ActionPerformed

    private void boton_168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_168ActionPerformed
        accionBoton(0, 12);
    }//GEN-LAST:event_boton_168ActionPerformed

    private void boton_169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_169ActionPerformed
        accionBoton(1, 12);
    }//GEN-LAST:event_boton_169ActionPerformed

    private void boton_170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_170ActionPerformed
        accionBoton(2, 12);
    }//GEN-LAST:event_boton_170ActionPerformed

    private void boton_171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_171ActionPerformed
        accionBoton(3, 12);
    }//GEN-LAST:event_boton_171ActionPerformed

    private void boton_172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_172ActionPerformed
        accionBoton(4, 12);
    }//GEN-LAST:event_boton_172ActionPerformed

    private void boton_173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_173ActionPerformed
        accionBoton(5, 12);
    }//GEN-LAST:event_boton_173ActionPerformed

    private void boton_174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_174ActionPerformed
        accionBoton(6, 12);
    }//GEN-LAST:event_boton_174ActionPerformed

    private void boton_175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_175ActionPerformed
        accionBoton(7, 12);
    }//GEN-LAST:event_boton_175ActionPerformed

    private void boton_176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_176ActionPerformed
        accionBoton(8, 12);
    }//GEN-LAST:event_boton_176ActionPerformed

    private void boton_177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_177ActionPerformed
        accionBoton(9, 12);
    }//GEN-LAST:event_boton_177ActionPerformed

    private void boton_178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_178ActionPerformed
        accionBoton(10, 12);
    }//GEN-LAST:event_boton_178ActionPerformed

    private void boton_179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_179ActionPerformed
        accionBoton(11, 12);
    }//GEN-LAST:event_boton_179ActionPerformed

    private void boton_180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_180ActionPerformed
        accionBoton(12, 12);
    }//GEN-LAST:event_boton_180ActionPerformed

    private void boton_181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_181ActionPerformed
        accionBoton(13, 12);
    }//GEN-LAST:event_boton_181ActionPerformed

    private void boton_182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_182ActionPerformed
        accionBoton(0, 13);
    }//GEN-LAST:event_boton_182ActionPerformed

    private void boton_183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_183ActionPerformed
        accionBoton(1, 13);
    }//GEN-LAST:event_boton_183ActionPerformed

    private void boton_184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_184ActionPerformed
        accionBoton(2, 13);
    }//GEN-LAST:event_boton_184ActionPerformed

    private void boton_185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_185ActionPerformed
        accionBoton(3, 13);
    }//GEN-LAST:event_boton_185ActionPerformed

    private void boton_186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_186ActionPerformed
        accionBoton(4, 13);
    }//GEN-LAST:event_boton_186ActionPerformed

    private void boton_187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_187ActionPerformed
        accionBoton(5, 13);
    }//GEN-LAST:event_boton_187ActionPerformed

    private void boton_188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_188ActionPerformed
        accionBoton(6, 13);
    }//GEN-LAST:event_boton_188ActionPerformed

    private void boton_189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_189ActionPerformed
        accionBoton(7, 13);
    }//GEN-LAST:event_boton_189ActionPerformed

    private void boton_190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_190ActionPerformed
        accionBoton(8, 13);
    }//GEN-LAST:event_boton_190ActionPerformed

    private void boton_191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_191ActionPerformed
        accionBoton(9, 13);
    }//GEN-LAST:event_boton_191ActionPerformed
    private void boton_192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_192ActionPerformed
        accionBoton(10, 13);
    }//GEN-LAST:event_boton_192ActionPerformed
    private void boton_193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_193ActionPerformed
        accionBoton(11, 13);
    }//GEN-LAST:event_boton_193ActionPerformed
    private void boton_194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_194ActionPerformed
        accionBoton(12, 13);
    }//GEN-LAST:event_boton_194ActionPerformed
    private void boton_195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_195ActionPerformed
        accionBoton(13, 13);
    }//GEN-LAST:event_boton_195ActionPerformed
    private void bDarVuelta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarVuelta1ActionPerformed
        darVuelta(1);
    }//GEN-LAST:event_bDarVuelta1ActionPerformed
    private void bGirar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGirar1ActionPerformed
        girar(1);
    }//GEN-LAST:event_bGirar1ActionPerformed
    private void bDarVuelta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarVuelta2ActionPerformed
        darVuelta2(0);
    }//GEN-LAST:event_bDarVuelta2ActionPerformed
    private void bDarVuelta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDarVuelta3ActionPerformed
        darVuelta2(1);
    }//GEN-LAST:event_bDarVuelta3ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pasarTurno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n = JOptionPane.showOptionDialog(this, "¿Estáis seguros de que queréis finalizar la partida?", 
                "Acabar partida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] {"Sí, acabar partida", "No, seguir jugando"}, "No, seguir jugando");
        if(n == 0){
            int j1 = juego.jugadores[0].restantes();
            int j2 = juego.jugadores[1].restantes();
            if(j1 < j2){
                JOptionPane.showMessageDialog(this, "El JUGADOR 1 gana por "+(j2-j1)+" casillas. ¡ENHORABUENA!",
                        "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }else{
                if(j2 < j1){
                    JOptionPane.showMessageDialog(this, "El JUGADOR 2 gana por "+(j1-j2)+" casillas. ¡ENHORABUENA!",
                        "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }else{
                    int n2 = JOptionPane.showOptionDialog(this, "La partida acabó en empate a "+j1+" casillas. ¿Queréis seguir jugando "
                            + "hasta que haya un ganador?", 
                    "Acabar partida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] {"Sí, seguir jugando", "No, acabar en empate"}, "Sí, seguir jugando");
                    if(n2 == 1){
                        System.exit(0);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        juego.sePuedenSeguirPoniendoFichas(juego.jugadores[juego.turno]);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDarVuelta;
    private javax.swing.JButton bDarVuelta1;
    private javax.swing.JButton bDarVuelta2;
    private javax.swing.JButton bDarVuelta3;
    private javax.swing.JButton bGirar;
    private javax.swing.JButton bGirar1;
    private javax.swing.JButton boton_0;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_10;
    private javax.swing.JButton boton_100;
    private javax.swing.JButton boton_101;
    private javax.swing.JButton boton_102;
    private javax.swing.JButton boton_103;
    private javax.swing.JButton boton_104;
    private javax.swing.JButton boton_105;
    private javax.swing.JButton boton_106;
    private javax.swing.JButton boton_107;
    private javax.swing.JButton boton_108;
    private javax.swing.JButton boton_109;
    private javax.swing.JButton boton_11;
    private javax.swing.JButton boton_110;
    private javax.swing.JButton boton_111;
    private javax.swing.JButton boton_112;
    private javax.swing.JButton boton_113;
    private javax.swing.JButton boton_114;
    private javax.swing.JButton boton_115;
    private javax.swing.JButton boton_116;
    private javax.swing.JButton boton_117;
    private javax.swing.JButton boton_118;
    private javax.swing.JButton boton_119;
    private javax.swing.JButton boton_12;
    private javax.swing.JButton boton_120;
    private javax.swing.JButton boton_121;
    private javax.swing.JButton boton_122;
    private javax.swing.JButton boton_123;
    private javax.swing.JButton boton_124;
    private javax.swing.JButton boton_125;
    private javax.swing.JButton boton_126;
    private javax.swing.JButton boton_127;
    private javax.swing.JButton boton_128;
    private javax.swing.JButton boton_129;
    private javax.swing.JButton boton_13;
    private javax.swing.JButton boton_130;
    private javax.swing.JButton boton_131;
    private javax.swing.JButton boton_132;
    private javax.swing.JButton boton_133;
    private javax.swing.JButton boton_134;
    private javax.swing.JButton boton_135;
    private javax.swing.JButton boton_136;
    private javax.swing.JButton boton_137;
    private javax.swing.JButton boton_138;
    private javax.swing.JButton boton_139;
    private javax.swing.JButton boton_14;
    private javax.swing.JButton boton_140;
    private javax.swing.JButton boton_141;
    private javax.swing.JButton boton_142;
    private javax.swing.JButton boton_143;
    private javax.swing.JButton boton_144;
    private javax.swing.JButton boton_145;
    private javax.swing.JButton boton_146;
    private javax.swing.JButton boton_147;
    private javax.swing.JButton boton_148;
    private javax.swing.JButton boton_149;
    private javax.swing.JButton boton_15;
    private javax.swing.JButton boton_150;
    private javax.swing.JButton boton_151;
    private javax.swing.JButton boton_152;
    private javax.swing.JButton boton_153;
    private javax.swing.JButton boton_154;
    private javax.swing.JButton boton_155;
    private javax.swing.JButton boton_156;
    private javax.swing.JButton boton_157;
    private javax.swing.JButton boton_158;
    private javax.swing.JButton boton_159;
    private javax.swing.JButton boton_16;
    private javax.swing.JButton boton_160;
    private javax.swing.JButton boton_161;
    private javax.swing.JButton boton_162;
    private javax.swing.JButton boton_163;
    private javax.swing.JButton boton_164;
    private javax.swing.JButton boton_165;
    private javax.swing.JButton boton_166;
    private javax.swing.JButton boton_167;
    private javax.swing.JButton boton_168;
    private javax.swing.JButton boton_169;
    private javax.swing.JButton boton_17;
    private javax.swing.JButton boton_170;
    private javax.swing.JButton boton_171;
    private javax.swing.JButton boton_172;
    private javax.swing.JButton boton_173;
    private javax.swing.JButton boton_174;
    private javax.swing.JButton boton_175;
    private javax.swing.JButton boton_176;
    private javax.swing.JButton boton_177;
    private javax.swing.JButton boton_178;
    private javax.swing.JButton boton_179;
    private javax.swing.JButton boton_18;
    private javax.swing.JButton boton_180;
    private javax.swing.JButton boton_181;
    private javax.swing.JButton boton_182;
    private javax.swing.JButton boton_183;
    private javax.swing.JButton boton_184;
    private javax.swing.JButton boton_185;
    private javax.swing.JButton boton_186;
    private javax.swing.JButton boton_187;
    private javax.swing.JButton boton_188;
    private javax.swing.JButton boton_189;
    private javax.swing.JButton boton_19;
    private javax.swing.JButton boton_190;
    private javax.swing.JButton boton_191;
    private javax.swing.JButton boton_192;
    private javax.swing.JButton boton_193;
    private javax.swing.JButton boton_194;
    private javax.swing.JButton boton_195;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_20;
    private javax.swing.JButton boton_21;
    private javax.swing.JButton boton_22;
    private javax.swing.JButton boton_23;
    private javax.swing.JButton boton_24;
    private javax.swing.JButton boton_25;
    private javax.swing.JButton boton_26;
    private javax.swing.JButton boton_27;
    private javax.swing.JButton boton_28;
    private javax.swing.JButton boton_29;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_30;
    private javax.swing.JButton boton_31;
    private javax.swing.JButton boton_32;
    private javax.swing.JButton boton_33;
    private javax.swing.JButton boton_34;
    private javax.swing.JButton boton_35;
    private javax.swing.JButton boton_36;
    private javax.swing.JButton boton_37;
    private javax.swing.JButton boton_38;
    private javax.swing.JButton boton_39;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_40;
    private javax.swing.JButton boton_41;
    private javax.swing.JButton boton_42;
    private javax.swing.JButton boton_43;
    private javax.swing.JButton boton_44;
    private javax.swing.JButton boton_45;
    private javax.swing.JButton boton_46;
    private javax.swing.JButton boton_47;
    private javax.swing.JButton boton_48;
    private javax.swing.JButton boton_49;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_50;
    private javax.swing.JButton boton_51;
    private javax.swing.JButton boton_52;
    private javax.swing.JButton boton_53;
    private javax.swing.JButton boton_54;
    private javax.swing.JButton boton_55;
    private javax.swing.JButton boton_56;
    private javax.swing.JButton boton_57;
    private javax.swing.JButton boton_58;
    private javax.swing.JButton boton_59;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_60;
    private javax.swing.JButton boton_61;
    private javax.swing.JButton boton_62;
    private javax.swing.JButton boton_63;
    private javax.swing.JButton boton_64;
    private javax.swing.JButton boton_65;
    private javax.swing.JButton boton_66;
    private javax.swing.JButton boton_67;
    private javax.swing.JButton boton_68;
    private javax.swing.JButton boton_69;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_70;
    private javax.swing.JButton boton_71;
    private javax.swing.JButton boton_72;
    private javax.swing.JButton boton_73;
    private javax.swing.JButton boton_74;
    private javax.swing.JButton boton_75;
    private javax.swing.JButton boton_76;
    private javax.swing.JButton boton_77;
    private javax.swing.JButton boton_78;
    private javax.swing.JButton boton_79;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_80;
    private javax.swing.JButton boton_81;
    private javax.swing.JButton boton_82;
    private javax.swing.JButton boton_83;
    private javax.swing.JButton boton_84;
    private javax.swing.JButton boton_85;
    private javax.swing.JButton boton_86;
    private javax.swing.JButton boton_87;
    private javax.swing.JButton boton_88;
    private javax.swing.JButton boton_89;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_90;
    private javax.swing.JButton boton_91;
    private javax.swing.JButton boton_92;
    private javax.swing.JButton boton_93;
    private javax.swing.JButton boton_94;
    private javax.swing.JButton boton_95;
    private javax.swing.JButton boton_96;
    private javax.swing.JButton boton_97;
    private javax.swing.JButton boton_98;
    private javax.swing.JButton boton_99;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTurnoJ1;
    private javax.swing.JLabel labelTurnoJ2;
    private javax.swing.JLabel lx0;
    private javax.swing.JLabel lx1;
    private javax.swing.JLabel lx10;
    private javax.swing.JLabel lx11;
    private javax.swing.JLabel lx12;
    private javax.swing.JLabel lx13;
    private javax.swing.JLabel lx2;
    private javax.swing.JLabel lx3;
    private javax.swing.JLabel lx4;
    private javax.swing.JLabel lx5;
    private javax.swing.JLabel lx6;
    private javax.swing.JLabel lx7;
    private javax.swing.JLabel lx8;
    private javax.swing.JLabel lx9;
    private javax.swing.JLabel lxy;
    private javax.swing.JLabel ly0;
    private javax.swing.JLabel ly1;
    private javax.swing.JLabel ly10;
    private javax.swing.JLabel ly11;
    private javax.swing.JLabel ly12;
    private javax.swing.JLabel ly13;
    private javax.swing.JLabel ly2;
    private javax.swing.JLabel ly3;
    private javax.swing.JLabel ly4;
    private javax.swing.JLabel ly5;
    private javax.swing.JLabel ly6;
    private javax.swing.JLabel ly7;
    private javax.swing.JLabel ly8;
    private javax.swing.JLabel ly9;
    private javax.swing.JPanel pTablero;
    private javax.swing.JPanel panelBotones1;
    private javax.swing.JPanel panelBotonesJ0;
    private javax.swing.JPanel panelSeleccionadaJ0;
    private javax.swing.JPanel panelSeleccionadaJ1;
    private javax.swing.JPanel pj1Seleccionada;
    private javax.swing.JPanel pj1TodasFichas;
    private javax.swing.JPanel pj2Seleccionada;
    private javax.swing.JPanel pj2TodasFichas;
    private javax.swing.JLabel restantesJ1;
    private javax.swing.JLabel restantesJ2;
    // End of variables declaration//GEN-END:variables
}
