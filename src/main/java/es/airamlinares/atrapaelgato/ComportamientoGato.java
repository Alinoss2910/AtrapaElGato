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
    boolean movConseguido = false;
    int dir;
    int abajo = 10 - posGY-2;
    int derecha = 14 - posGX-2;
    int izquierda = posGX;
    int arriba = posGY;
    Random random = new Random();
    
    public void movGato(Tablero tablero, Logica logica, Circulo circulo) {
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
                if(posGX<14 && posGY<10 && posGX>0 && posGY>0) {
                    System.out.println("esta dentro del tablero" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                    if(izquierda <= arriba && izquierda <= abajo && izquierda <= derecha) {
                        System.out.println("izquierda");
                        if(circulo.x < posGX && circulo.y == posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                            if(logica.circulos[posGX-1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX--;
                                izquierda--;
                                derecha++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY+1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY++;
                                abajo--;
                                arriba++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                        }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY+1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY++;
                                abajo--;
                                arriba++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                    }else if(arriba <= izquierda && arriba <= abajo && arriba <= derecha) {
                        System.out.println("arriba");
                        if(circulo.x == posGX && circulo.y < posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                            if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX-1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX--;
                                izquierda--;
                                derecha++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX+1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX++;
                                derecha--;
                                izquierda++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY+1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY++;
                                abajo--;
                                arriba++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                        }else if(logica.circulos[posGX-1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX--;
                                izquierda--;
                                derecha++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX+1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX++;
                                derecha--;
                                izquierda++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                    }else if(abajo <= izquierda && abajo <= arriba && abajo <= derecha) {
                        System.out.println("abajo");
                        if(circulo.x == posGX && circulo.y > posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                            if(logica.circulos[posGX][posGY+1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY++;
                                abajo--;
                                arriba++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX-1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX--;
                                izquierda--;
                                derecha++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX+1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX++;
                                derecha--;
                                izquierda++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                        }else if(logica.circulos[posGX-1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX--;
                                izquierda--;
                                derecha++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("izquierda conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX+1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX++;
                                derecha--;
                                izquierda++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                    }else if(derecha <= izquierda && derecha <= arriba && derecha <= abajo) {
                        System.out.println("derecha");
                        if(circulo.x < posGX && circulo.y == posGY || logica.circulos[posGX+1][posGY] == logica.GRIS || logica.circulos[posGX-1][posGY] == logica.GRIS || logica.circulos[posGX][posGY+1] == logica.GRIS || logica.circulos[posGX][posGY-1] == logica.GRIS) {
                            if(logica.circulos[posGX+1][posGY] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGX++;
                                derecha--;
                                izquierda++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("derecha conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY+1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY++;
                                abajo--;
                                arriba++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }
                        }else if(logica.circulos[posGX][posGY-1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY--;
                                arriba--;
                                abajo++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("arriba conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            }else if(logica.circulos[posGX][posGY+1] == AZUL) {
                                movConseguido = true;
                                logica.circulos[posGX][posGY] = AZUL;
                                posGY++;
                                abajo--;
                                arriba++;
                                tablero.getChildren().remove(tablero.imgGato);
                                tablero.add(tablero.imgGato, posGX, posGY);
                                System.out.println("abajo conseguido" + " " + "abajo:" + abajo + " " + "derecha:" + derecha + " " + "arriba:" + arriba + " " + "izquierda:" + izquierda);
                            } 
                    }
                }    
                logica.circulos[posGX][posGY] = GATO;
                System.out.println("posGX:" + posGX +" "+"posGY:" + posGY);
                logica.mostrarTableroConsola();
            
    }
}
