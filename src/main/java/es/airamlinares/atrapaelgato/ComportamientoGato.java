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
    boolean movConseguido = false;
    int dir;
    int abajo = 10 - posGY;
    int derecha = 14 - posGX;
    
    public void movGato(Tablero tablero, Logica logica) {
//        Random random = new Random();
//        if(logica.circulos[posGX][posGY-1] == AZUL || logica.circulos[posGX][posGY+1] == AZUL || logica.circulos[posGX-1][posGY] == AZUL || logica.circulos[posGX+1][posGY] == AZUL) {
//            movConseguido = false;
//        }
//        while(movConseguido == false) {
//            dir = random.nextInt(4);
//            System.out.println(dir);
//            if(posGX<14 && posGY<10 && posGX>0 && posGY>0) {
//                switch (dir) {
//                    case 0:
//                        if(logica.circulos[posGX][posGY-1] == AZUL) {
//                            movConseguido = true;
//                            logica.circulos[posGX][posGY] = AZUL;
//                            posGY--;
//                            tablero.getChildren().remove(tablero.imgGato);
//                            tablero.add(tablero.imgGato, posGX, posGY);
//                        }
//                        break;
//                    case 1:
//                        if(logica.circulos[posGX][posGY+1] == AZUL) {
//                            movConseguido = true;
//                            logica.circulos[posGX][posGY] = AZUL;
//                            posGY++;
//                            tablero.getChildren().remove(tablero.imgGato);
//                            tablero.add(tablero.imgGato, posGX, posGY);
//                        }
//                        break;
//                    case 2:
//                        if(logica.circulos[posGX+1][posGY] == AZUL) {
//                            movConseguido = true;
//                            logica.circulos[posGX][posGY] = AZUL;
//                            posGX++;
//                            tablero.getChildren().remove(tablero.imgGato);
//                            tablero.add(tablero.imgGato, posGX, posGY);
//                        }
//                        break;
//                    case 3:
//                        if(logica.circulos[posGX-1][posGY] == AZUL) {
//                            movConseguido = true;
//                            logica.circulos[posGX][posGY] = AZUL;
//                            posGX--;
//                            tablero.getChildren().remove(tablero.imgGato);
//                            tablero.add(tablero.imgGato, posGX, posGY);
//                        }
//                        break;
//                }
//                logica.circulos[posGX][posGY] = GATO;
//                System.out.println("posGX: " + posGX +" "+"posGY: " + posGY);
//                logica.mostrarTableroConsola();
//            }
//        }
            
//            while(movConseguido == false) {
                if(posGX<14 && posGY<10 && posGX>0 && posGY>0) {
                    System.out.println("esta dentro del tablero");
                    if(posGX < posGY && posGX < abajo && posGX < derecha) {
                        System.out.println("izquierda");
                        if(logica.circulos[posGX-1][posGY] == AZUL) {
                            System.out.println("izquierda conseguido");
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGX--;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                    }else if(posGY < posGX && posGY < abajo && posGY < derecha) {
                        System.out.println("arriba");
                        if(logica.circulos[posGX][posGY-1] == AZUL) {
                            System.out.println("arriba conseguido");
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGY--;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                    }else if(abajo < posGX && abajo < posGY && abajo < derecha) {
                        System.out.println("abajo");
                        if(logica.circulos[posGX][posGY+1] == AZUL) {
                            System.out.println("abajo conseguido");
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGY++;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                    }else if(derecha < posGX && derecha < posGY && derecha < abajo) {
                        System.out.println("derecha");
                        if(logica.circulos[posGX+1][posGY] == AZUL) {
                            System.out.println("derecha conseguido");
                            movConseguido = true;
                            logica.circulos[posGX][posGY] = AZUL;
                            posGX++;
                            tablero.getChildren().remove(tablero.imgGato);
                            tablero.add(tablero.imgGato, posGX, posGY);
                        }
                    } 
                }
                logica.circulos[posGX][posGY] = GATO;
                System.out.println("posGX: " + posGX +" "+"posGY: " + posGY);
                logica.mostrarTableroConsola();
//            }
    }
}
