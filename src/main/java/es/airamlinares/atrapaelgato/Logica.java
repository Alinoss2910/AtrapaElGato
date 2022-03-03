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
    
    public void ganarPartida(ComportamientoGato compGato, PantallaFinal panFin) {
        if(circulos[compGato.posGX][compGato.posGY-1] == GRIS && circulos[compGato.posGX][compGato.posGY+1] == GRIS && circulos[compGato.posGX-1][compGato.posGY] == GRIS && circulos[compGato.posGX+1][compGato.posGY] == GRIS) {
            compGato.movConseguido = true;
            panFin.pantallaGanar();
        }
    }
    public void perderPartida(ComportamientoGato compGato) {
        if(compGato.posGX == 0 || compGato.posGX == 14 || compGato.posGY == 0 || compGato.posGY == 10) {
            panFin.pantallaPerder();
        }
    }
}
