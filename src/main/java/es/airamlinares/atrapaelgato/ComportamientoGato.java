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
    byte posGY = 4;
    int dir;
    int abajo = 10 - posGY-2;
    int derecha = 14 - posGX-2;
    int izquierda = posGX;
    int arriba = posGY;
    Random random = new Random();
    
    public void movGato(Tablero tablero, Logica logica, Circulo circulo) {
        if(posGX<14 && posGY<10 && posGX>0 && posGY>0) {//Comprueba si esta dentro del tablero
            System.out.println("esta dentro del tablero" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
            if(izquierda <= arriba && izquierda <= abajo && izquierda <= derecha) {//Comprueba si la direccion mas cercana al borde es la izquierda
                System.out.println("izquierda");
                //Comprueba si hay en la misma linea o pegado al gato un circulo gris si lo hay cambia de direccion
                if(circulo.x < posGX && circulo.y == posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                    if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
                }else if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
            }else if(arriba <= izquierda && arriba <= abajo && arriba <= derecha) {//Comprueba si la direccion mas cercana al borde es la Arriba
                System.out.println("arriba");
                //Comprueba si hay en la misma linea o pegado al gato un circulo gris si lo hay cambia de direccion
                if(circulo.x == posGX && circulo.y < posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                    if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
                }else if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
            }else if(abajo <= izquierda && abajo <= arriba && abajo <= derecha) {//Comprueba si la direccion mas cercana al borde es la abajo
                System.out.println("abajo");
                //Comprueba si hay en la misma linea o pegado al gato un circulo gris si lo hay cambia de direccion
                if(circulo.x == posGX && circulo.y > posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                    if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
                }else if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
            }else if(derecha <= izquierda && derecha <= arriba && derecha <= abajo) {//Comprueba si la direccion mas cercana al borde es la derecha
                System.out.println("derecha");
                //Comprueba si hay en la misma linea o pegado al gato un circulo gris si lo hay cambia de direccion
                if(circulo.x < posGX && circulo.y == posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                    if(logica.circulos[posGX+1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX++;
                        derecha--;
                        izquierda++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }
                }else if(logica.circulos[posGX][posGY-1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY--;
                        arriba--;
                        abajo++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX][posGY+1] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGY++;
                        abajo--;
                        arriba++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    }else if(logica.circulos[posGX-1][posGY] == AZUL) {// Comprueba si se puede mover a esa posicion
                        logica.circulos[posGX][posGY] = AZUL;
                        posGX--;
                        izquierda--;
                        derecha++;
                        tablero.getChildren().remove(tablero.imgGato);
                        tablero.add(tablero.imgGato, posGX, posGY);
                        System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    } 
            }
        }    
        logica.circulos[posGX][posGY] = GATO;
        System.out.println("posGX:" + posGX +" "+"posGY:" + posGY);
        logica.mostrarTableroConsola();
    }
}
