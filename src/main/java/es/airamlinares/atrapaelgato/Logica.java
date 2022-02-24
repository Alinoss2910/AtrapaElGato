package es.airamlinares.atrapaelgato;

import java.util.Random;

/**
 *
 * @author Airam
 */
public class Logica {
    char[][] circulos;
    short tamXTablero;
    short tamYTablero;
    static final char AZUL = '1';
    static final char GRIS = '2';
    static final char GATO = '3';
    int posGX = 7;
    int posGY = 5;
    int aPosGX = 7;
    int aPosGY = 5;
    int dir;
    
    public Logica() {
        tamXTablero = 14;
        tamYTablero = 10;
        circulos = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                circulos[x][y] = AZUL;
            }
        }
    }
    public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(circulos[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
    public void colocarGris(int posX, int posY) {
        circulos[posX][posY] = GRIS;
    }
//    public void gato(int posX, int posY) {
//        circulos[posX][posY] = GATO;
//    }
    public void movGato() {
        Random random = new Random();
        dir = random.nextInt(4);
        System.out.println(dir);
        if(posGX<=14 && posGY<=10 && posGX>0 && posGY>0) {
            switch (dir) {
                case 0:
                    if(circulos[posGX][posGY-1] == AZUL) {
                        aPosGY = posGY;
                        aPosGX = posGX;
                        circulos[posGX][posGY] = AZUL;
                        posGY--;
                    }else{
                       dir = random.nextInt(4); 
                    }
                    break;
                case 1:
                    if(circulos[posGX][posGY+1] == AZUL) {
                        aPosGY = posGY;
                        aPosGX = posGX;
                        circulos[posGX][posGY] = AZUL;
                        posGY++;
                    }else{
                       dir = random.nextInt(4); 
                    }
                    break;
                case 2:
                    if(circulos[posGX+1][posGY] == AZUL) {
                        aPosGX = posGX;
                        aPosGY = posGY;
                        circulos[posGX][posGY] = AZUL;
                        posGX++;
                    }else{
                       dir = random.nextInt(4); 
                    }
                    break;
                case 3:
                    if(circulos[posGX-1][posGY] == AZUL) {
                        aPosGX = posGX;
                        aPosGY = posGY;
                        circulos[posGX][posGY] = AZUL;
                        posGX--;
                    }else{
                       dir = random.nextInt(4); 
                    }
                    break;
            }
            circulos[posGX][posGY] = GATO;
            System.out.println("aposGX: " + aPosGX +" "+"aposGY: " + aPosGY);
            System.out.println("posGX: " + posGX +" "+"posGY: " + posGY);
        }
    }
}
