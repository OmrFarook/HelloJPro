package one.jpro.hellojpro;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Hello JPro application.
 *
 * @author Florian Kirmaier
 */
public class HelloJPro extends Application {

    @Override
   public void start(Stage primaryStage) {
        Pane root = new Pane();
        for (int i = 0; i < 8; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setX(250);
            rectangle.setY(200);
            rectangle.setWidth(70);
            rectangle.setHeight(200);
            rectangle.setFill(Color.color(Math.random(),Math.random(),Math.random()));
            rectangle.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            rectangle.setStrokeWidth(5);
            rectangle.setRotate(i * 360.0 / 8);
            root.getChildren().add(rectangle);
        }

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Application entry point.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
