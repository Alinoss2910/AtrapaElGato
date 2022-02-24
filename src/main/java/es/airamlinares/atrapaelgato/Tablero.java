package es.airamlinares.atrapaelgato;

import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

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
                circulo.setCenterX(x);
                circulo.setCenterY(y);
                circulo.gris(compGato);
                this.add(circulo, x, y);
            }
        }
    }
    
    public void mostrarTableroConsola() {
        logica.mostrarTableroConsola();
        //compGato.generarGato(this);
        for(int i=0; i<=16;i++){
            Random random = new Random();
            int posX = random.nextInt(13);
            int posY = random.nextInt(9);
            System.out.println("posX: " + posX +" "+"posY: " + posY);
            logica.colocarGris(posX, posY);
            logica.movGato();
            logica.mostrarTableroConsola();
        }
    }
    
    ImageView imgGato;
    short posXGato = 55;
    short posYGato = 75;
    public void generarGato() {
        Image gato = new Image(getClass().getResourceAsStream("/images/gato.png"));
        imgGato = new ImageView(gato);
        this.add(imgGato, 5, 5);
    }
}
