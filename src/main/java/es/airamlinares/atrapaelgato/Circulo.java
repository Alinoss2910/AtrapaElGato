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
        //Parametros del circulo 20 de radio y color Azul Claro
        this.setRadius(20);
        this.setFill(Color.LIGHTBLUE);
    }
    public void gris(ComportamientoGato compGato, Tablero tablero, Logica logica, PantallaFinal panFin) {
        this.setOnMousePressed((MouseEvent mouseEvent) -> {
            // Cambia el color del circulo cuando clickas en un circulo
            this.setFill(Color.GREY);
            logica.circulos[x][y] = logica.GRIS;// Pone en el array el circulo marcado
            compGato.movGato(tablero, logica, this); // Llama al movGato para que se mueva
            //Comprueba cada vez que haces click si ganas o pierdes
            logica.ganarPartida(compGato, panFin);
            logica.perderPartida(compGato, panFin);
        });
    }
}
