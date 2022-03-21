package es.airamlinares.atrapaelgato;

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
    
    public Logica() {
        //Crea el array
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
        //Muestra el array por consola
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(circulos[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
    public void ganarPartida(ComportamientoGato compGato, PantallaFinal panFin) {
        //Comprobacion de si has ganado la partida
        if(compGato.posGX<14 && compGato.posGY<10 && compGato.posGX>0 && compGato.posGY>0) {//Comprueba si esta dentro del tablero
            //Comprueba si tiene circulos grises en las 4 direcciones del gato si es así ganas
            if(circulos[compGato.posGX][compGato.posGY-1] == GRIS && circulos[compGato.posGX][compGato.posGY+1] == GRIS && circulos[compGato.posGX-1][compGato.posGY] == GRIS && circulos[compGato.posGX+1][compGato.posGY] == GRIS) {
                System.out.println("Has ganado");
                panFin.pantallaGanar();
                panFin.ganarVisible();
            }
        }
    }
    public void perderPartida(ComportamientoGato compGato, PantallaFinal panFin) {
        if(compGato.posGX == 0 || compGato.posGX == 13 || compGato.posGY == 0 || compGato.posGY == 9) {//Comprueba si el gato ha llegado a algun borde del tablero si es así pierdes
            System.out.println("Has perdido");
            panFin.pantallaPerder();
            panFin.perderVisible();
        }
    }
}
