package es.airamlinares.atrapaelgato;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Airam
 */
public class PantallaFinal extends HBox {
    Text perdido;
    Text ganado;
    public void pantallaPerder() {
        //Mensaje de Has perido
        this.setAlignment(Pos.BOTTOM_LEFT);
        this.setSpacing(10);
        this.setLayoutX(200);
        perdido = new Text("Has perdido");
        perdido.setFont(Font.font(20));
        perdido.setFill(Color.BLACK);
    }
    
    public void pantallaGanar() {
        // Mesaje de Has ganado
        this.setAlignment(Pos.BOTTOM_LEFT);
        this.setSpacing(10);
        this.setLayoutX(200);
        ganado = new Text("Has ganado");
        ganado.setFont(Font.font(20));
        ganado.setFill(Color.BLACK);
    }
    
    public void ganarVisible() {
        //Añade a la pantalla el mensaje de ganado
        this.getChildren().add(ganado);
    }
    
    public void perderVisible() {
        //Añade a la pantalla el mensaje de perdido
        this.getChildren().add(perdido);
    }
}
