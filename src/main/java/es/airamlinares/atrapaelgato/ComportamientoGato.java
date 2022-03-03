package es.airamlinares.atrapaelgato;

import static es.airamlinares.atrapaelgato.Logica.AZUL;
import static es.airamlinares.atrapaelgato.Logica.GATO;
import java.util.Random;

/**
 *
 * @author Airam
 */
public class ComportamientoGato {
    byte posGX = 5;
    byte posGY = 5;
    byte sPosGX = 5;
    byte sPosGY = 5;
    boolean movConseguido = false;
    int dir;
    
    public void movGato(Tablero tablero, Logica logica) {
        movConseguido = false;
        Random random = new Random();
        while(movConseguido == false) {
            dir = random.nextInt(4);
            System.out.println(dir);
            if(posGX<=14 && posGY<=10 && posGX>0 && posGY>0) {
                switch (dir) {
                    case 0:
                        if(logica.circulos[posGX][posGY-1] == AZUL) {
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGY--;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                        break;
                    case 1:
                        if(logica.circulos[posGX][posGY+1] == AZUL) {
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGY++;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                        break;
                    case 2:
                        if(logica.circulos[posGX+1][posGY] == AZUL) {
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGX++;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                        break;
                    case 3:
                        if(logica.circulos[posGX-1][posGY] == AZUL) {
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGX--;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                        break;
                }
                logica.circulos[posGX][posGY] = GATO;
                System.out.println("posGX: " + posGX +" "+"posGY: " + posGY);
                logica.mostrarTableroConsola();
                logica.ganarPartida(this);
                logica.perderPartida(this);
            }
        }
    }
}
