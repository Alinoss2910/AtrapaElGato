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
                //Bucle para crear el tablero
                circulo = new Circulo();
                circulo.x = x;//Guarda la posicion X del circulo que esta poniendo
                circulo.y = y;//Guarda la posicion Y del circulo que esta poniendo
                circulo.gris(compGato, this, logica, panFin);//Llama a la funcion que pone en gris los circulos
                this.add(circulo, x, y);// Añade los circulos a la pantalla
            }
        }
    }
    
    ImageView imgGato;
    short posXGato = 5;
    short posYGato = 4;
    public void generarGato() {
        //Genera la imagen del gato
        Image gato = new Image(getClass().getResourceAsStream("/images/gato.png"));
        imgGato = new ImageView(gato);
        this.add(imgGato, posXGato, posYGato);
    }
    
    public void botonReiniciar(PantallaFinal panFin) {
        //Genera boton reiniciar
        Button reiniciar = new Button("Reiniciar");
        reiniciar.setOnMouseClicked((t) -> {
            //Borra el tablero entero
            while(this.getChildren().size() != 0) {
                for(int i = 0; i < this.getChildren().size(); i++ ) {
                    this.getChildren().remove(i);
                }
            }
            //Crea otra vez el tablero una vez borrado
            for(int x = 0; x<CELDASX; x++ ) {
                for(int y = 0; y<CELDASY; y++ ) {
                    circulo = new Circulo();
                    circulo.x = x;
                    circulo.y = y;
                    circulo.gris(compGato, this, logica, panFin);
                    this.add(circulo, x, y);
                }
        }
            //Reinicio de las variables
            compGato.posGX = 5;
            compGato.posGY = 4;
            compGato.abajo = 10 - compGato.posGY-2;
            compGato.derecha = 14 - compGato.posGX-2;
            compGato.izquierda = compGato.posGX;
            compGato.arriba = compGato.posGY;
            //Reinicia el array a su estado original
            for(int x=0; x<logica.tamXTablero; x++) {
                for(int y=0; y<logica.tamYTablero; y++) {
                    logica.circulos[x][y] = logica.AZUL;
                }
            }
            this.getChildren().remove(this.imgGato);// Borra el gato img
            this.add(imgGato, compGato.posGX, compGato.posGY);// Vuelve a ponerlo en la psicion inicial
            panFin.getChildren().remove(panFin.ganado);
            panFin.getChildren().remove(panFin.perdido);
        });
        panFin.getChildren().add(reiniciar);
    }
    
    public void botonSalir(Stage stage, PantallaFinal panFin) {
        //Boton para salir del juego
        Button salir = new Button("Salir");
        salir.setOnMouseClicked((t) -> {
            stage.close();
        });
        panFin.getChildren().add(salir);
    }
}
