package es.airamlinares.atrapaelgato;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Airam
 */
public class Circulo extends Circle {
    ImageView imgGato;
    Pane paneRoot;
    int x;
    int y;
    
    public Circulo() {
        this.setRadius(20);
        this.setFill(Color.LIGHTBLUE);
    }
    public void gris(ComportamientoGato compGato, Tablero tablero, Logica logica, PantallaFinal panFin) {
        this.setOnMousePressed((MouseEvent mouseEvent) -> {
            // Cambia el color del circulo cuando clickas en un circulo
            this.setFill(Color.GREY);
            logica.circulos[x][y] = logica.GRIS;
            compGato.movGato(tablero, logica);
            logica.ganarPartida(compGato, panFin);
            logica.perderPartida(compGato, panFin);
        });
    }
}
