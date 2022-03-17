package es.airamlinares.atrapaelgato;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Airam
 */
public class Tablero extends GridPane {
    final int CELDASX = 14;
    final int CELDASY = 10;
    ComportamientoGato compGato = new ComportamientoGato();
    Logica logica = new Logica();
    Circulo circulo;
    public Tablero(PantallaFinal panFin) {
        this.setHgap(6);
        this.setVgap(5);
        for(int x = 0; x<CELDASX; x++ ) {
            for(int y = 0; y<CELDASY; y++ ) {
                circulo = new Circulo();
                circulo.x = x;
                circulo.y = y;
                circulo.gris(compGato, this, logica, panFin);
                this.add(circulo, x, y);
            }
        }
    }
    
    ImageView imgGato;
    short posXGato = 5;
    short posYGato = 4;
    public void generarGato() {
        Image gato = new Image(getClass().getResourceAsStream("/images/gato.png"));
        imgGato = new ImageView(gato);
        this.add(imgGato, posXGato, posYGato);
    }
    
    public void botonReiniciar(PantallaFinal panFin) {
        Button reiniciar = new Button("Reiniciar");
        reiniciar.setOnMouseClicked((t) -> {
            while(this.getChildren().size() != 0) {
                for(int i = 0; i < this.getChildren().size(); i++ ) {
                    this.getChildren().remove(i);
                }
            }
            for(int x = 0; x<CELDASX; x++ ) {
                for(int y = 0; y<CELDASY; y++ ) {
                    circulo = new Circulo();
                    circulo.x = x;
                    circulo.y = y;
                    circulo.gris(compGato, this, logica, panFin);
                    this.add(circulo, x, y);
                }
        }
            compGato.posGX = 5;
            compGato.posGY = 4;
            compGato.abajo = 10 - compGato.posGY-2;
            compGato.derecha = 14 - compGato.posGX-2;
            compGato.izquierda = compGato.posGX;
            compGato.arriba = compGato.posGY;
            compGato.movConseguido = false;
            for(int x=0; x<logica.tamXTablero; x++) {
                for(int y=0; y<logica.tamYTablero; y++) {
                    logica.circulos[x][y] = logica.AZUL;
                }
            }
            this.getChildren().remove(this.imgGato);
            this.add(imgGato, compGato.posGX, compGato.posGY);
            panFin.getChildren().remove(panFin.ganado);
            panFin.getChildren().remove(panFin.perdido);
        });
        panFin.getChildren().add(reiniciar);
    }
    
    public void botonSalir(Stage stage, PantallaFinal panFin) {
        Button salir = new Button("Salir");
        salir.setOnMouseClicked((t) -> {
            stage.close();
        });
        panFin.getChildren().add(salir);
    }
}
