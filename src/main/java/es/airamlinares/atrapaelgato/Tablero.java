package es.airamlinares.atrapaelgato;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Airam
 */
public class Tablero extends GridPane {
    final int CELDASX = 14;
    final int CELDASY = 10;
    ComportamientoGato compGato = new ComportamientoGato();
    Logica logica = new Logica();
    
    public Tablero() {
        this.setHgap(6);
        this.setVgap(5);
        for(int x = 0; x<CELDASX; x++ ) {
            for(int y = 0; y<CELDASY; y++ ) {
                Circulo circulo = new Circulo();
                circulo.x = x;
                circulo.y = y;
                circulo.gris(compGato, this, logica);
                this.add(circulo, x, y);
            }
        }
    }
    
    ImageView imgGato;
    short posXGato = 5;
    short posYGato = 5;
    public void generarGato() {
        Image gato = new Image(getClass().getResourceAsStream("/images/gato.png"));
        imgGato = new ImageView(gato);
        this.add(imgGato, posXGato, posYGato);
    }
}
