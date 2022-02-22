package es.airamlinares.atrapaelgato;

import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Airam
 */
public class ComportamientoGato {
    ImageView imgGato;
    short posXGato = 55;
    short posYGato = 75;
    public void generarGato(Pane paneRoot) {
        Image gato = new Image(getClass().getResourceAsStream("/images/gato.png"));
        imgGato = new ImageView(gato);
        imgGato.setLayoutX(posXGato);
        imgGato.setLayoutY(posYGato);
        paneRoot.getChildren().add(imgGato);
    }
    
    public void movGato() {
        Random random = new Random();
        int dir = random.nextInt(4);
        switch (dir) {
            case 0:
                posYGato-= 45;
                imgGato.setLayoutY(posYGato);
                break;
            case 1:
                posYGato+= 45;
                imgGato.setLayoutY(posYGato);
                break;
            case 2:
                posXGato+= 45;
                imgGato.setLayoutX(posXGato);
                break;
            case 3:
                posXGato-= 45;
                imgGato.setLayoutX(posXGato);
                break;
        }
    }
}
