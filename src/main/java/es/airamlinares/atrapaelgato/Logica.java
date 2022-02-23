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
        int dir = random.nextInt(4);
        System.out.println(dir);
        if(posGX<=12 && posGY<=8 && posGX>0 && posGY>0) {
            switch (dir) {
                case 0:
                    posGY-= 1;
                    circulos[posGX][posGY+1] = AZUL;
                    break;
                case 1:
                    posGY+= 1;
                    circulos[posGX][posGY-1] = AZUL;
                    break;
                case 2:
                    posGX+= 1;
                    circulos[posGX-1][posGY] = AZUL;
                    break;
                case 3:
                    posGX-= 1;
                    circulos[posGX+1][posGY] = AZUL;
                    break;
            }
            circulos[posGX][posGY] = GATO;
            System.out.println("posGX: " + posGX +" "+"posGY: " + posGY);
        }
    }
}
